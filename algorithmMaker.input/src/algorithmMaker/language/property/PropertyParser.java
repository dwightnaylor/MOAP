package algorithmMaker.language.property;

import algorithmMaker.parser.antlr.InputParser;

public class PropertyParser extends InputParser {
	@Override
	protected String getDefaultRuleName() {
		return "ORing";
	}
}
