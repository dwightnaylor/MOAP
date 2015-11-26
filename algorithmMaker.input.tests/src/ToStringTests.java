import static algorithmMaker.QuickParser.parseInput;
import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToStringTests {
	@Test
	public void testToStringForProperties() {
		String[] originals = { "a(x)", "a(x) & b(x)", "a(x) | b(x)", "forall(x st list(x) : list(x))", "TRUE",
				"forall(y st child(x,y) : less_than_equal(y,z))", "!a(x)", "!a(x) & !b(x)", "!(a(x) & b(x))",
				"a(x) & b(x) | c(x)", "a(x) & (b(x) | c(x))", "equal(b,c) & equal(c,b)" };
		for (String original : originals) {
			String parse = parseProperty(original).toString();
			if (!original.equals(parse))
				System.err.println('"' + original + "\" has a broken toString(), yields \"" + parse + '"');

			assertEquals(original, parse);
		}
	}

	@Test
	public void testToStringForInputs() {
		String[] originals = { "Given x st a(x); Find y st a(y)", "Given x st a(x); Find b(x)",
				"Given x,y st type_list(x) & child(x,y); Find even(y)",
				"Given list<int> x; Find z st child(x,z) & forall(y st child(x,y) : lessThanEqual(y,z))",
				"Given list<int> x; Find y st child(x,y) & even(y)" };
		for (String original : originals) {
			String parse = parseInput(original).toString();
			if (!original.equals(parse))
				System.err.println('"' + original + "\" has a broken toString(), yields \"" + parse + '"');

			assertEquals(original, parse);
		}
	}

}
