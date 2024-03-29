/*
 * generated by Xtext 2.21.0
 */
package org.eclipse.acme.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.acme.ide.contentassist.antlr.internal.InternalACMECNlParser;
import org.eclipse.acme.services.ACMECNlGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ACMECNlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ACMECNlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ACMECNlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getConstrainedNaturalLanguageRulesAccess().getRulesAlternatives_0_0(), "rule__ConstrainedNaturalLanguageRules__RulesAlternatives_0_0");
			builder.put(grammarAccess.getScopedRulesAccess().getAlternatives_0(), "rule__ScopedRules__Alternatives_0");
			builder.put(grammarAccess.getScopedRulesAccess().getAlternatives_0_0_0(), "rule__ScopedRules__Alternatives_0_0_0");
			builder.put(grammarAccess.getScopedRulesAccess().getAlternatives_0_0_0_2_1(), "rule__ScopedRules__Alternatives_0_0_0_2_1");
			builder.put(grammarAccess.getScopedRulesAccess().getAlternatives_0_0_0_3_5(), "rule__ScopedRules__Alternatives_0_0_0_3_5");
			builder.put(grammarAccess.getScopedRulesAccess().getAlternatives_0_1_0(), "rule__ScopedRules__Alternatives_0_1_0");
			builder.put(grammarAccess.getMatchingRuleAccess().getAlternatives(), "rule__MatchingRule__Alternatives");
			builder.put(grammarAccess.getRuleAccess().getAlternatives(), "rule__Rule__Alternatives");
			builder.put(grammarAccess.getLogicalExpressionAccess().getAlternatives(), "rule__LogicalExpression__Alternatives");
			builder.put(grammarAccess.getLogicalExpressionAccess().getAlternatives_0_1(), "rule__LogicalExpression__Alternatives_0_1");
			builder.put(grammarAccess.getLogicalExpressionAccess().getAlternatives_0_1_0_1(), "rule__LogicalExpression__Alternatives_0_1_0_1");
			builder.put(grammarAccess.getLogicalExpressionAccess().getAlternatives_0_1_1_1(), "rule__LogicalExpression__Alternatives_0_1_1_1");
			builder.put(grammarAccess.getLogicalExpressionAccess().getAlternatives_0_1_5_1(), "rule__LogicalExpression__Alternatives_0_1_5_1");
			builder.put(grammarAccess.getLogicalExpressionAccess().getAlternatives_1_1(), "rule__LogicalExpression__Alternatives_1_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives(), "rule__ComparisonExpression__Alternatives");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1(), "rule__ComparisonExpression__Alternatives_1_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_2_1(), "rule__ComparisonExpression__Alternatives_1_1_2_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_3_1(), "rule__ComparisonExpression__Alternatives_1_1_3_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_4_1_0(), "rule__ComparisonExpression__Alternatives_1_1_4_1_0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_5_1_0(), "rule__ComparisonExpression__Alternatives_1_1_5_1_0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_6_1(), "rule__ComparisonExpression__Alternatives_1_1_6_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_6_1_0_0(), "rule__ComparisonExpression__Alternatives_1_1_6_1_0_0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_6_1_1_0(), "rule__ComparisonExpression__Alternatives_1_1_6_1_1_0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_7_1(), "rule__ComparisonExpression__Alternatives_1_1_7_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_7_1_0_0(), "rule__ComparisonExpression__Alternatives_1_1_7_1_0_0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_1_7_1_1_0(), "rule__ComparisonExpression__Alternatives_1_1_7_1_1_0");
			builder.put(grammarAccess.getBaseExpressionAccess().getAlternatives(), "rule__BaseExpression__Alternatives");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives(), "rule__DateExpression__Alternatives");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives_0_2_0(), "rule__DateExpression__Alternatives_0_2_0");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives_0_2_1(), "rule__DateExpression__Alternatives_0_2_1");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives_1_2_0(), "rule__DateExpression__Alternatives_1_2_0");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives_1_2_1(), "rule__DateExpression__Alternatives_1_2_1");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives_2_2_0(), "rule__DateExpression__Alternatives_2_2_0");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives_2_2_1(), "rule__DateExpression__Alternatives_2_2_1");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives_3_2_0(), "rule__DateExpression__Alternatives_3_2_0");
			builder.put(grammarAccess.getDateExpressionAccess().getAlternatives_3_2_1(), "rule__DateExpression__Alternatives_3_2_1");
			builder.put(grammarAccess.getNumericAggregationAccess().getAlternatives(), "rule__NumericAggregation__Alternatives");
			builder.put(grammarAccess.getNumericSummationAccess().getFeatureAlternatives_3_0(), "rule__NumericSummation__FeatureAlternatives_3_0");
			builder.put(grammarAccess.getNumericAverageAccess().getFeatureAlternatives_3_0(), "rule__NumericAverage__FeatureAlternatives_3_0");
			builder.put(grammarAccess.getNumericMaximumAccess().getFeatureAlternatives_3_0(), "rule__NumericMaximum__FeatureAlternatives_3_0");
			builder.put(grammarAccess.getNumericMinimumAccess().getFeatureAlternatives_3_0(), "rule__NumericMinimum__FeatureAlternatives_3_0");
			builder.put(grammarAccess.getValueContainmentAccess().getFeatureAlternatives_0_0(), "rule__ValueContainment__FeatureAlternatives_0_0");
			builder.put(grammarAccess.getUniquenessCheckAccess().getAlternatives_2_0(), "rule__UniquenessCheck__Alternatives_2_0");
			builder.put(grammarAccess.getTypeExpressionAccess().getAlternatives(), "rule__TypeExpression__Alternatives");
			builder.put(grammarAccess.getPrimitiveTypeExpressionAccess().getAlternatives_1(), "rule__PrimitiveTypeExpression__Alternatives_1");
			builder.put(grammarAccess.getPrimitiveTypeExpressionAccess().getAlternatives_1_2_2(), "rule__PrimitiveTypeExpression__Alternatives_1_2_2");
			builder.put(grammarAccess.getEnumTypeExpressionAccess().getAlternatives_1(), "rule__EnumTypeExpression__Alternatives_1");
			builder.put(grammarAccess.getEnumTypeExpressionAccess().getAlternatives_1_2_2(), "rule__EnumTypeExpression__Alternatives_1_2_2");
			builder.put(grammarAccess.getEnumValueAccess().getAlternatives(), "rule__EnumValue__Alternatives");
			builder.put(grammarAccess.getBooleanValueAccess().getAlternatives_1(), "rule__BooleanValue__Alternatives_1");
			builder.put(grammarAccess.getMetaDataAccess().getAlternatives(), "rule__MetaData__Alternatives");
			builder.put(grammarAccess.getExistanceValueAccess().getAlternatives_1(), "rule__ExistanceValue__Alternatives_1");
			builder.put(grammarAccess.getArithmeticOperationsAccess().getAlternatives(), "rule__ArithmeticOperations__Alternatives");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getAlternatives(), "rule__PrimitiveTypes__Alternatives");
			builder.put(grammarAccess.getConstrainedNaturalLanguageRulesAccess().getGroup(), "rule__ConstrainedNaturalLanguageRules__Group__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup(), "rule__ScopedRules__Group__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0(), "rule__ScopedRules__Group_0_0__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_0(), "rule__ScopedRules__Group_0_0_0_0__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_2(), "rule__ScopedRules__Group_0_0_0_2__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3(), "rule__ScopedRules__Group_0_0_0_3__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3_5_0(), "rule__ScopedRules__Group_0_0_0_3_5_0__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3_5_1(), "rule__ScopedRules__Group_0_0_0_3_5_1__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3_5_2(), "rule__ScopedRules__Group_0_0_0_3_5_2__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3_5_3(), "rule__ScopedRules__Group_0_0_0_3_5_3__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3_5_4(), "rule__ScopedRules__Group_0_0_0_3_5_4__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3_5_5(), "rule__ScopedRules__Group_0_0_0_3_5_5__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3_5_6(), "rule__ScopedRules__Group_0_0_0_3_5_6__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_0_0_3_5_7(), "rule__ScopedRules__Group_0_0_0_3_5_7__0");
			builder.put(grammarAccess.getScopedRulesAccess().getGroup_0_1(), "rule__ScopedRules__Group_0_1__0");
			builder.put(grammarAccess.getMatchScopedRuleAccess().getGroup(), "rule__MatchScopedRule__Group__0");
			builder.put(grammarAccess.getMatchingRuleAccess().getGroup_0(), "rule__MatchingRule__Group_0__0");
			builder.put(grammarAccess.getMatchingRuleAccess().getGroup_1(), "rule__MatchingRule__Group_1__0");
			builder.put(grammarAccess.getCNLRuleAccess().getGroup(), "rule__CNLRule__Group__0");
			builder.put(grammarAccess.getCNLRuleAccess().getGroup_0(), "rule__CNLRule__Group_0__0");
			builder.put(grammarAccess.getCNLRuleAccess().getGroup_2(), "rule__CNLRule__Group_2__0");
			builder.put(grammarAccess.getEOLExpressionRuleAccess().getGroup(), "rule__EOLExpressionRule__Group__0");
			builder.put(grammarAccess.getEOLExpressionRuleAccess().getGroup_0(), "rule__EOLExpressionRule__Group_0__0");
			builder.put(grammarAccess.getEOLExpressionRuleAccess().getGroup_4(), "rule__EOLExpressionRule__Group_4__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0(), "rule__LogicalExpression__Group_0__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0_1_0(), "rule__LogicalExpression__Group_0_1_0__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0_1_0_1_1(), "rule__LogicalExpression__Group_0_1_0_1_1__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0_1_1(), "rule__LogicalExpression__Group_0_1_1__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0_1_2(), "rule__LogicalExpression__Group_0_1_2__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0_1_3(), "rule__LogicalExpression__Group_0_1_3__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0_1_4(), "rule__LogicalExpression__Group_0_1_4__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0_1_5(), "rule__LogicalExpression__Group_0_1_5__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_0_1_5_1_1(), "rule__LogicalExpression__Group_0_1_5_1_1__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_1(), "rule__LogicalExpression__Group_1__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_2(), "rule__LogicalExpression__Group_2__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_0(), "rule__ComparisonExpression__Group_1_1_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_1(), "rule__ComparisonExpression__Group_1_1_1__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_2(), "rule__ComparisonExpression__Group_1_1_2__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_2_1_2(), "rule__ComparisonExpression__Group_1_1_2_1_2__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_3(), "rule__ComparisonExpression__Group_1_1_3__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_3_1_0(), "rule__ComparisonExpression__Group_1_1_3_1_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_3_1_1(), "rule__ComparisonExpression__Group_1_1_3_1_1__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_4(), "rule__ComparisonExpression__Group_1_1_4__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_4_1(), "rule__ComparisonExpression__Group_1_1_4_1__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_4_1_0_0(), "rule__ComparisonExpression__Group_1_1_4_1_0_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_5(), "rule__ComparisonExpression__Group_1_1_5__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_5_1(), "rule__ComparisonExpression__Group_1_1_5_1__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_5_1_0_0(), "rule__ComparisonExpression__Group_1_1_5_1_0_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_6(), "rule__ComparisonExpression__Group_1_1_6__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_6_1_0(), "rule__ComparisonExpression__Group_1_1_6_1_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_6_1_0_0_0(), "rule__ComparisonExpression__Group_1_1_6_1_0_0_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_6_1_1(), "rule__ComparisonExpression__Group_1_1_6_1_1__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_6_1_1_0_0(), "rule__ComparisonExpression__Group_1_1_6_1_1_0_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_7(), "rule__ComparisonExpression__Group_1_1_7__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_7_1_0(), "rule__ComparisonExpression__Group_1_1_7_1_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_7_1_0_0_0(), "rule__ComparisonExpression__Group_1_1_7_1_0_0_0__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_7_1_1(), "rule__ComparisonExpression__Group_1_1_7_1_1__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup_1_1_7_1_1_0_0(), "rule__ComparisonExpression__Group_1_1_7_1_1_0_0__0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getGroup(), "rule__ArithmeticExpression__Group__0");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getGroup_1(), "rule__ArithmeticExpression__Group_1__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_0(), "rule__DateExpression__Group_0__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_0_2(), "rule__DateExpression__Group_0_2__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_0_2_0_0(), "rule__DateExpression__Group_0_2_0_0__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_1(), "rule__DateExpression__Group_1__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_1_2(), "rule__DateExpression__Group_1_2__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_1_2_0_0(), "rule__DateExpression__Group_1_2_0_0__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_1_2_1_1(), "rule__DateExpression__Group_1_2_1_1__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_2(), "rule__DateExpression__Group_2__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_2_2(), "rule__DateExpression__Group_2_2__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_2_2_0_0(), "rule__DateExpression__Group_2_2_0_0__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_2_2_1_0(), "rule__DateExpression__Group_2_2_1_0__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_2_2_1_1(), "rule__DateExpression__Group_2_2_1_1__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_2_2_1_2(), "rule__DateExpression__Group_2_2_1_2__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_3(), "rule__DateExpression__Group_3__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_3_2(), "rule__DateExpression__Group_3_2__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_3_2_0_0(), "rule__DateExpression__Group_3_2_0_0__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_3_2_1_0(), "rule__DateExpression__Group_3_2_1_0__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_3_2_1_1(), "rule__DateExpression__Group_3_2_1_1__0");
			builder.put(grammarAccess.getDateExpressionAccess().getGroup_3_2_1_2(), "rule__DateExpression__Group_3_2_1_2__0");
			builder.put(grammarAccess.getNumericSummationAccess().getGroup(), "rule__NumericSummation__Group__0");
			builder.put(grammarAccess.getNumericAverageAccess().getGroup(), "rule__NumericAverage__Group__0");
			builder.put(grammarAccess.getNumericMaximumAccess().getGroup(), "rule__NumericMaximum__Group__0");
			builder.put(grammarAccess.getNumericMinimumAccess().getGroup(), "rule__NumericMinimum__Group__0");
			builder.put(grammarAccess.getValueContainmentAccess().getGroup(), "rule__ValueContainment__Group__0");
			builder.put(grammarAccess.getValueContainmentAccess().getGroup_1(), "rule__ValueContainment__Group_1__0");
			builder.put(grammarAccess.getValueContainmentAccess().getGroup_3(), "rule__ValueContainment__Group_3__0");
			builder.put(grammarAccess.getUniquenessCheckAccess().getGroup(), "rule__UniquenessCheck__Group__0");
			builder.put(grammarAccess.getUniquenessCheckAccess().getGroup_0(), "rule__UniquenessCheck__Group_0__0");
			builder.put(grammarAccess.getUniquenessCheckAccess().getGroup_2(), "rule__UniquenessCheck__Group_2__0");
			builder.put(grammarAccess.getFeatureValueAccess().getGroup(), "rule__FeatureValue__Group__0");
			builder.put(grammarAccess.getVariableFeatureValueAccess().getGroup(), "rule__VariableFeatureValue__Group__0");
			builder.put(grammarAccess.getUnscopedFeatureValueAccess().getGroup(), "rule__UnscopedFeatureValue__Group__0");
			builder.put(grammarAccess.getPrimitiveTypeExpressionAccess().getGroup(), "rule__PrimitiveTypeExpression__Group__0");
			builder.put(grammarAccess.getPrimitiveTypeExpressionAccess().getGroup_1_0(), "rule__PrimitiveTypeExpression__Group_1_0__0");
			builder.put(grammarAccess.getPrimitiveTypeExpressionAccess().getGroup_1_1(), "rule__PrimitiveTypeExpression__Group_1_1__0");
			builder.put(grammarAccess.getPrimitiveTypeExpressionAccess().getGroup_1_2(), "rule__PrimitiveTypeExpression__Group_1_2__0");
			builder.put(grammarAccess.getEnumTypeExpressionAccess().getGroup(), "rule__EnumTypeExpression__Group__0");
			builder.put(grammarAccess.getEnumTypeExpressionAccess().getGroup_1_0(), "rule__EnumTypeExpression__Group_1_0__0");
			builder.put(grammarAccess.getEnumTypeExpressionAccess().getGroup_1_1(), "rule__EnumTypeExpression__Group_1_1__0");
			builder.put(grammarAccess.getEnumTypeExpressionAccess().getGroup_1_2(), "rule__EnumTypeExpression__Group_1_2__0");
			builder.put(grammarAccess.getEnumValueAccess().getGroup_0(), "rule__EnumValue__Group_0__0");
			builder.put(grammarAccess.getEnumValueAccess().getGroup_1(), "rule__EnumValue__Group_1__0");
			builder.put(grammarAccess.getBooleanValueAccess().getGroup(), "rule__BooleanValue__Group__0");
			builder.put(grammarAccess.getTypesAccess().getGroup(), "rule__Types__Group__0");
			builder.put(grammarAccess.getTypesAccess().getGroup_2(), "rule__Types__Group_2__0");
			builder.put(grammarAccess.getEnumerationsAccess().getGroup(), "rule__Enumerations__Group__0");
			builder.put(grammarAccess.getEnumerationsAccess().getGroup_2(), "rule__Enumerations__Group_2__0");
			builder.put(grammarAccess.getTypeValueAccess().getGroup(), "rule__TypeValue__Group__0");
			builder.put(grammarAccess.getTypeValueAccess().getGroup_1(), "rule__TypeValue__Group_1__0");
			builder.put(grammarAccess.getTypeValueAccess().getGroup_1_1(), "rule__TypeValue__Group_1_1__0");
			builder.put(grammarAccess.getTypeValueAccess().getGroup_1_1_1(), "rule__TypeValue__Group_1_1_1__0");
			builder.put(grammarAccess.getEmptyValueAccess().getGroup(), "rule__EmptyValue__Group__0");
			builder.put(grammarAccess.getEmptyValueAccess().getGroup_1(), "rule__EmptyValue__Group_1__0");
			builder.put(grammarAccess.getExistanceValueAccess().getGroup(), "rule__ExistanceValue__Group__0");
			builder.put(grammarAccess.getExistanceValueAccess().getGroup_1_1(), "rule__ExistanceValue__Group_1_1__0");
			builder.put(grammarAccess.getConstrainedNaturalLanguageRulesAccess().getRulesAssignment_0(), "rule__ConstrainedNaturalLanguageRules__RulesAssignment_0");
			builder.put(grammarAccess.getConstrainedNaturalLanguageRulesAccess().getMetadataAssignment_1(), "rule__ConstrainedNaturalLanguageRules__MetadataAssignment_1");
			builder.put(grammarAccess.getScopedRulesAccess().getScopeAssignment_0_0_1(), "rule__ScopedRules__ScopeAssignment_0_0_1");
			builder.put(grammarAccess.getScopedRulesAccess().getScopeAssignment_0_1_1(), "rule__ScopedRules__ScopeAssignment_0_1_1");
			builder.put(grammarAccess.getScopedRulesAccess().getRulesAssignment_1(), "rule__ScopedRules__RulesAssignment_1");
			builder.put(grammarAccess.getMatchScopedRuleAccess().getMatchesAssignment_1(), "rule__MatchScopedRule__MatchesAssignment_1");
			builder.put(grammarAccess.getMatchScopedRuleAccess().getRuleAssignment_3(), "rule__MatchScopedRule__RuleAssignment_3");
			builder.put(grammarAccess.getMatchingRuleAccess().getVariableNameAssignment_0_0(), "rule__MatchingRule__VariableNameAssignment_0_0");
			builder.put(grammarAccess.getMatchingRuleAccess().getScopeAssignment_0_2(), "rule__MatchingRule__ScopeAssignment_0_2");
			builder.put(grammarAccess.getMatchingRuleAccess().getAstRootAssignment_0_4(), "rule__MatchingRule__AstRootAssignment_0_4");
			builder.put(grammarAccess.getMatchingRuleAccess().getScopeAssignment_1_3(), "rule__MatchingRule__ScopeAssignment_1_3");
			builder.put(grammarAccess.getMatchingRuleAccess().getAstRootAssignment_1_5(), "rule__MatchingRule__AstRootAssignment_1_5");
			builder.put(grammarAccess.getElementScopeAccess().getTypeAssignment(), "rule__ElementScope__TypeAssignment");
			builder.put(grammarAccess.getCNLRuleAccess().getNameAssignment_0_1(), "rule__CNLRule__NameAssignment_0_1");
			builder.put(grammarAccess.getCNLRuleAccess().getAstRootAssignment_1(), "rule__CNLRule__AstRootAssignment_1");
			builder.put(grammarAccess.getCNLRuleAccess().getMessageAssignment_2_2(), "rule__CNLRule__MessageAssignment_2_2");
			builder.put(grammarAccess.getEOLExpressionRuleAccess().getNameAssignment_0_1(), "rule__EOLExpressionRule__NameAssignment_0_1");
			builder.put(grammarAccess.getEOLExpressionRuleAccess().getCodeAssignment_2(), "rule__EOLExpressionRule__CodeAssignment_2");
			builder.put(grammarAccess.getEOLExpressionRuleAccess().getMessageAssignment_4_2(), "rule__EOLExpressionRule__MessageAssignment_4_2");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRhsAssignment_0_1_0_2(), "rule__LogicalExpression__RhsAssignment_0_1_0_2");
			builder.put(grammarAccess.getLogicalExpressionAccess().getLhsAssignment_0_1_1_2(), "rule__LogicalExpression__LhsAssignment_0_1_1_2");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRhsAssignment_0_1_2_2(), "rule__LogicalExpression__RhsAssignment_0_1_2_2");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRhsAssignment_0_1_3_2(), "rule__LogicalExpression__RhsAssignment_0_1_3_2");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRhsAssignment_0_1_4_2(), "rule__LogicalExpression__RhsAssignment_0_1_4_2");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRhsAssignment_0_1_5_2(), "rule__LogicalExpression__RhsAssignment_0_1_5_2");
			builder.put(grammarAccess.getLogicalExpressionAccess().getLhsAssignment_1_3(), "rule__LogicalExpression__LhsAssignment_1_3");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRhsAssignment_1_5(), "rule__LogicalExpression__RhsAssignment_1_5");
			builder.put(grammarAccess.getLogicalExpressionAccess().getLhsAssignment_2_2(), "rule__LogicalExpression__LhsAssignment_2_2");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRhsAssignment_2_4(), "rule__LogicalExpression__RhsAssignment_2_4");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1_0_1(), "rule__ComparisonExpression__RhsAssignment_1_1_0_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1_1_1(), "rule__ComparisonExpression__RhsAssignment_1_1_1_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1_2_2(), "rule__ComparisonExpression__RhsAssignment_1_1_2_2");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1_3_2(), "rule__ComparisonExpression__RhsAssignment_1_1_3_2");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1_4_2(), "rule__ComparisonExpression__RhsAssignment_1_1_4_2");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1_5_2(), "rule__ComparisonExpression__RhsAssignment_1_1_5_2");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1_6_2(), "rule__ComparisonExpression__RhsAssignment_1_1_6_2");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1_7_2(), "rule__ComparisonExpression__RhsAssignment_1_1_7_2");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getTypeAssignment_1_1(), "rule__ArithmeticExpression__TypeAssignment_1_1");
			builder.put(grammarAccess.getArithmeticExpressionAccess().getRhsAssignment_1_2(), "rule__ArithmeticExpression__RhsAssignment_1_2");
			builder.put(grammarAccess.getDateExpressionAccess().getLhsAssignment_0_1(), "rule__DateExpression__LhsAssignment_0_1");
			builder.put(grammarAccess.getDateExpressionAccess().getRhsAssignment_0_3(), "rule__DateExpression__RhsAssignment_0_3");
			builder.put(grammarAccess.getDateExpressionAccess().getLhsAssignment_1_1(), "rule__DateExpression__LhsAssignment_1_1");
			builder.put(grammarAccess.getDateExpressionAccess().getRhsAssignment_1_3(), "rule__DateExpression__RhsAssignment_1_3");
			builder.put(grammarAccess.getDateExpressionAccess().getLhsAssignment_2_1(), "rule__DateExpression__LhsAssignment_2_1");
			builder.put(grammarAccess.getDateExpressionAccess().getRhsAssignment_2_3(), "rule__DateExpression__RhsAssignment_2_3");
			builder.put(grammarAccess.getDateExpressionAccess().getLhsAssignment_3_1(), "rule__DateExpression__LhsAssignment_3_1");
			builder.put(grammarAccess.getDateExpressionAccess().getRhsAssignment_3_3(), "rule__DateExpression__RhsAssignment_3_3");
			builder.put(grammarAccess.getNumericSummationAccess().getFeatureAssignment_3(), "rule__NumericSummation__FeatureAssignment_3");
			builder.put(grammarAccess.getNumericAverageAccess().getFeatureAssignment_3(), "rule__NumericAverage__FeatureAssignment_3");
			builder.put(grammarAccess.getNumericMaximumAccess().getFeatureAssignment_3(), "rule__NumericMaximum__FeatureAssignment_3");
			builder.put(grammarAccess.getNumericMinimumAccess().getFeatureAssignment_3(), "rule__NumericMinimum__FeatureAssignment_3");
			builder.put(grammarAccess.getValueContainmentAccess().getFeatureAssignment_0(), "rule__ValueContainment__FeatureAssignment_0");
			builder.put(grammarAccess.getValueContainmentAccess().getCollectionAssignment_2(), "rule__ValueContainment__CollectionAssignment_2");
			builder.put(grammarAccess.getValueContainmentAccess().getCollectionAssignment_3_1(), "rule__ValueContainment__CollectionAssignment_3_1");
			builder.put(grammarAccess.getUniquenessCheckAccess().getFeaturesAssignment_1(), "rule__UniquenessCheck__FeaturesAssignment_1");
			builder.put(grammarAccess.getUniquenessCheckAccess().getFeaturesAssignment_2_1(), "rule__UniquenessCheck__FeaturesAssignment_2_1");
			builder.put(grammarAccess.getFeatureValueAccess().getFeatureAssignment_1(), "rule__FeatureValue__FeatureAssignment_1");
			builder.put(grammarAccess.getVariableFeatureValueAccess().getFeatureAssignment_0(), "rule__VariableFeatureValue__FeatureAssignment_0");
			builder.put(grammarAccess.getVariableFeatureValueAccess().getVariableNameAssignment_2(), "rule__VariableFeatureValue__VariableNameAssignment_2");
			builder.put(grammarAccess.getUnscopedFeatureValueAccess().getFeatureAssignment_0(), "rule__UnscopedFeatureValue__FeatureAssignment_0");
			builder.put(grammarAccess.getUnscopedFeatureValueAccess().getScopeAssignment_2(), "rule__UnscopedFeatureValue__ScopeAssignment_2");
			builder.put(grammarAccess.getPrimitiveTypeExpressionAccess().getFeatureAssignment_0(), "rule__PrimitiveTypeExpression__FeatureAssignment_0");
			builder.put(grammarAccess.getPrimitiveTypeExpressionAccess().getTypeAssignment_2(), "rule__PrimitiveTypeExpression__TypeAssignment_2");
			builder.put(grammarAccess.getEnumTypeExpressionAccess().getFeatureAssignment_0(), "rule__EnumTypeExpression__FeatureAssignment_0");
			builder.put(grammarAccess.getEnumTypeExpressionAccess().getTypeAssignment_2(), "rule__EnumTypeExpression__TypeAssignment_2");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getEnumValueAccess().getEnumerationAssignment_0_0(), "rule__EnumValue__EnumerationAssignment_0_0");
			builder.put(grammarAccess.getEnumValueAccess().getValueAssignment_0_2(), "rule__EnumValue__ValueAssignment_0_2");
			builder.put(grammarAccess.getEnumValueAccess().getEnumerationAssignment_1_1(), "rule__EnumValue__EnumerationAssignment_1_1");
			builder.put(grammarAccess.getEnumValueAccess().getValueAssignment_1_4(), "rule__EnumValue__ValueAssignment_1_4");
			builder.put(grammarAccess.getBooleanValueAccess().getValueAssignment_1_0(), "rule__BooleanValue__ValueAssignment_1_0");
			builder.put(grammarAccess.getIntegerValueAccess().getValueAssignment(), "rule__IntegerValue__ValueAssignment");
			builder.put(grammarAccess.getDecimalValueAccess().getValueAssignment(), "rule__DecimalValue__ValueAssignment");
			builder.put(grammarAccess.getDateValueAccess().getValueAssignment(), "rule__DateValue__ValueAssignment");
			builder.put(grammarAccess.getTypesAccess().getLegalValuesAssignment_1(), "rule__Types__LegalValuesAssignment_1");
			builder.put(grammarAccess.getTypesAccess().getLegalValuesAssignment_2_1(), "rule__Types__LegalValuesAssignment_2_1");
			builder.put(grammarAccess.getEnumerationsAccess().getLegalValuesAssignment_1(), "rule__Enumerations__LegalValuesAssignment_1");
			builder.put(grammarAccess.getEnumerationsAccess().getLegalValuesAssignment_2_1(), "rule__Enumerations__LegalValuesAssignment_2_1");
			builder.put(grammarAccess.getEnumAccess().getNameAssignment(), "rule__Enum__NameAssignment");
			builder.put(grammarAccess.getTypeValueAccess().getNameAssignment_0(), "rule__TypeValue__NameAssignment_0");
			builder.put(grammarAccess.getTypeValueAccess().getFeaturesAssignment_1_1_0(), "rule__TypeValue__FeaturesAssignment_1_1_0");
			builder.put(grammarAccess.getTypeValueAccess().getFeaturesAssignment_1_1_1_1(), "rule__TypeValue__FeaturesAssignment_1_1_1_1");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment(), "rule__Feature__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ACMECNlGrammarAccess grammarAccess;

	@Override
	protected InternalACMECNlParser createParser() {
		InternalACMECNlParser result = new InternalACMECNlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ACMECNlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ACMECNlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
