/*
 * generated by Xtext 2.21.0
 */
package org.eclipse.acme.ui.tests;

import com.google.inject.Injector;
import org.eclipse.acme.cnl.ui.internal.CnlActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ACMECNlUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CnlActivator.getInstance().getInjector("org.eclipse.acme.ACMECNl");
	}

}
