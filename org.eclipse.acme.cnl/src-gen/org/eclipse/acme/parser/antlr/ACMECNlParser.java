/*
 * generated by Xtext 2.21.0
 */
package org.eclipse.acme.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.acme.parser.antlr.internal.InternalACMECNlParser;
import org.eclipse.acme.services.ACMECNlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ACMECNlParser extends AbstractAntlrParser {

	@Inject
	private ACMECNlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalACMECNlParser createParser(XtextTokenStream stream) {
		return new InternalACMECNlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ConstrainedNaturalLanguageRules";
	}

	public ACMECNlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ACMECNlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
