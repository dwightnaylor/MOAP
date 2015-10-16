import static org.junit.Assert.assertEquals;
import static algorithmMaker.QuickParser.parseProperty;
import static algorithmMaker.QuickParser.parseInput;

import org.junit.Test;

public class ToStringTests {

	@Test
	public void testToStringForProperties() {
		String[] originals = { "a(x)", "a(x) & b(x)", "a(x) | b(x)", "forall(x st list(x) : list(x))", "TRUE" };
		for (String original : originals) {
			String parse = parseProperty(original).toString();
			if (!original.equals(parse))
				System.err.println('"' + original + "\" has a broken toString(), yields \"" + parse + '"');

			assertEquals(original, parse);
		}
	}

	@Test
	public void testToStringForInputs() {
		String[] originals = { "Given x st a(x); Find y st a(y)" };
		for (String original : originals) {
			String parse = parseInput(original).toString();
			if (!original.equals(parse))
				System.err.println('"' + original + "\" has a broken toString(), yields \"" + parse + '"');

			assertEquals(original, parse);
		}
	}

}
