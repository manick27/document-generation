/*
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.parser.antlr.internal.InternalGrammarParser;
import org.xtext.example.services.GrammarGrammarAccess;

public class GrammarParser extends AbstractAntlrParser {

	@Inject
	private GrammarGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGrammarParser createParser(XtextTokenStream stream) {
		return new InternalGrammarParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public GrammarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GrammarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
