/*
* generated by Xtext
*/
package algorithmMaker.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import algorithmMaker.services.InputGrammarAccess;

public class InputParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private InputGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected algorithmMaker.parser.antlr.internal.InternalInputParser createParser(XtextTokenStream stream) {
		return new algorithmMaker.parser.antlr.internal.InternalInputParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Input";
	}
	
	public InputGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(InputGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
