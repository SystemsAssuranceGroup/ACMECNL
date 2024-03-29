/*
 * generated by Xtext 2.21.0
 */
package org.eclipse.acme.generator

import cnl.CnlPackage
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.acme.model.epsilon.ResourceFinder
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel
import org.eclipse.epsilon.eol.EolModule
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException
import org.eclipse.epsilon.eol.execute.context.Variable
import org.eclipse.epsilon.eol.types.EolPrimitiveType
import org.eclipse.epsilon.evl.EvlModule
import org.eclipse.epsilon.evl.dom.ConstraintContext
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.epsilon.emc.emf.EmfModel
import org.eclipse.epsilon.common.util.StringProperties
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ACMECNlGenerator extends AbstractGenerator {

	static String rootpath;
	static String modelpath;
	static InputStream mappingmm;
	static String mappingm;
	static InputStream migration;
	static java.net.URI cnl2evl;
	static String cnl2evlutilsvar;
	static java.net.URI cnl2evlutils;
	static String generated_evl;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		println("running generator...")

		var uri = resource.URI
		println("resource uri: " + uri)

		rootpath = uri.toString.replace(uri.lastSegment, "")

		println("rootpath " + rootpath)

		modelpath = rootpath + "data.model";

		println("modelpath " + modelpath)

		mappingmm = getClass().getClassLoader().getResourceAsStream("org/eclipse/acme/model/mapping.ecore")

		mappingm = rootpath + "mapping.model";

		println("mapping model path " + mappingm)

		migration = getClass().getClassLoader().getResourceAsStream("org/eclipse/acme/model/epsilon/migration.eol")

		// cnl2evl = getClass().getClassLoader().getResourceAsStream("mod/epsilon/evl_interpreter_generator.egl")
		// URI.createFileURI("file:///"+getClass().getClassLoader().getResource("mod/epsilon/evl_interpreter_generator.egl").path)
		cnl2evl = new ResourceFinder().findResource("evl_interpreter_generator.egl");

		cnl2evlutilsvar = "utilsEOLPath";

		cnl2evlutils = new ResourceFinder().findResource("utils.eol")

		var emfModel = new EmfModel

		var properties = new StringProperties
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, "http://auv.lre/1.0");
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelpath);
		properties.put(EmfModel.PROPERTY_NAME, "model");
		properties.put(EmfModel.PROPERTY_READONLOAD, "true");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, "false");

		emfModel.load(properties)

		// FIXME specifically using excel epsilon connector here -- extend to use appropriate parser
		var evlModule = generateEVLModule(resource)
		fsa.generateFile('/generated_validation.evl', generated_evl)

		println("generator executed")

	}

	public static class CnlTraceItem {

		private String constraintName;
		private Object targetObject;
		private String message;

		new(
			String name,
			Object target,
			String message
		) {
			this.constraintName = name;
			this.targetObject = target;
			this.message = message;
		}

	}

	/**
	 * Runs the EVL script generated by {@link #generateEVLModule()} and maps
	 * the results to CNLViolations.
	 * @return 
	 * 
	 * @throws EolRuntimeException
	 *             The EVL module failed to run.
	 */
	def List<CnlTraceItem> runEVLModule(EvlModule module, EmfModel model) throws EolRuntimeException {

		module.getContext().getModelRepository().addModel(model);
		module.execute();

		var traceItems = new ArrayList();
		for (UnsatisfiedConstraint unsc : module.getContext().unsatisfiedConstraints) {
			var name = unsc.getConstraint().getName
			var instance = unsc.getInstance
			var message = unsc.message
			traceItems.add(new CnlTraceItem(name, instance, message))
		}
		return traceItems
	}

	/**
	 * Transforms the CNL constraints into an in-memory EVL script, for execution.
	 */
	def EvlModule generateEVLModule(Resource cnlResource) throws Exception {

		// add the config metamodel and model (MAPPING)
		//mapping mm rs
		var rs = new ResourceSetImpl()
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		var mappingMMResource = rs.createResource(URI.createPlatformPluginURI("mappingmmresource", true));
		mappingMMResource.load(mappingmm, null)

		// TODO check that this is a package as this is very specific to current metamodel
		var mappingpackage = mappingMMResource.contents.get(0) as EPackage

		//mapping m rs
		var rs2 = new ResourceSetImpl()
		rs2.packageRegistry.put(mappingpackage.nsURI, mappingpackage)

		rs2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		rs2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		var uri = URI.createURI(ACMECNlGenerator.mappingm);
		var mappingResource = rs2.createResource(uri);
		mappingResource.load(null)

		println("mappingResource loaded: " + mappingMMResource.isLoaded)

		var mappingModel = new InMemoryEmfModel("mappingModel", mappingResource, Collections.singleton(mappingpackage));

		// migration of rules to back-end notation 
		var sourceModel = new InMemoryEmfModel("sourceModel", cnlResource, Collections.singleton(CnlPackage.eINSTANCE));
		sourceModel.aliases.add("sm");

		//target m rs
		var rs3 = new ResourceSetImpl()
		rs3.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		rs3.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		var xmiResource = rs3.createResource(URI.createURI("plainxmitargetmodelresource.xmi"));
		// xmiResource.save(null)		
		var targetModel = new InMemoryEmfModel("targetModel", xmiResource, Collections.singleton(CnlPackage.eINSTANCE));
		targetModel.aliases.add("tm");

		// println(targetModel.allContents)
		var eolModule = new EolModule()
		eolModule.context.modelRepository.addModel(sourceModel)
		eolModule.context.modelRepository.addModel(targetModel)
		eolModule.context.modelRepository.addModel(mappingModel)
		eolModule.context.nativeTypeDelegates.add(new ExtensionPointToolNativeTypeDelegate())

		//execute migration
		var String code = "";
		val BufferedReader br = new BufferedReader(new InputStreamReader(migration, "UTF-8"));
		for (var x = br.readLine(); x != null; x = br.readLine())
			code += x + "\n"

		eolModule.parse(code)
		if (!eolModule.getParseProblems().isEmpty()) {
			throw new EolRuntimeException("Parsing problems in the EOL code: " + eolModule.getParseProblems());
		}
		eolModule.execute

		// NB: due to our use of emf: copyall in the migration script, 
		// the epsilon cache is invalid, 
		// as the new elements are not actually added to the cache by epsilon (as new is not called)
		targetModel.clearCache

		println("cnl mapped")

		// use (transformed) rules alongside mapping model to create an executable EVL script using EGL
		var factory = new EglFileGeneratingTemplateFactory();
		var eglModule = new EglTemplateFactoryModuleAdapter(factory);

		// code = "";
		// val BufferedReader br2 = new BufferedReader(new InputStreamReader(cnl2evl, "UTF-8"));
		// for (var x = br2.readLine(); x != null; x = br2.readLine())
		// code += x+"\n"
		// println(code)
		eglModule.parse(cnl2evl);

		if (!eglModule.getParseProblems().isEmpty()) {
			throw new EolRuntimeException("Parsing problems in the EGL code: " + eglModule.getParseProblems());
		}

		var context = eglModule.getContext();
		targetModel.aliases.add("Model")
		context.getModelRepository().addModel(targetModel);
		mappingModel.aliases.add("mappingmodel")
		context.getModelRepository().addModel(mappingModel);

		// println(mappingModel.allContents)
		context.getFrameStack().putGlobal(
			new Variable(ACMECNlGenerator.cnl2evlutilsvar, ACMECNlGenerator.cnl2evlutils, EolPrimitiveType.String));
		generated_evl = eglModule.execute().toString;
		code = eglModule.execute().toString;
		context.dispose();
		context.getModelRepository().dispose();

		System.out.println("\n" + code);

		var evlModule = new EvlModule();
		evlModule.parse(code + "");
		if (!evlModule.getParseProblems().isEmpty()) {
			throw new EolRuntimeException("Parsing problems in the generated EVL code: " +
				evlModule.getParseProblems());
		}

		println("evl produced")

		// workaround for compatibility with 1.4.0 stable epsilon version (later
		// versions handle this properly)
		for (ConstraintContext c : evlModule.getConstraintContexts())
			c.setModule(evlModule);

		return evlModule;
	}
}
