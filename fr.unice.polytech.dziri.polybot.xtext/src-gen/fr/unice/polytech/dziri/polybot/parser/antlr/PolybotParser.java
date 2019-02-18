/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dziri.polybot.parser.antlr;

import com.google.inject.Inject;
import fr.unice.polytech.dziri.polybot.parser.antlr.internal.InternalPolybotParser;
import fr.unice.polytech.dziri.polybot.services.PolybotGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PolybotParser extends AbstractAntlrParser {

	@Inject
	private PolybotGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPolybotParser createParser(XtextTokenStream stream) {
		return new InternalPolybotParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Bot";
	}

	public PolybotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PolybotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}