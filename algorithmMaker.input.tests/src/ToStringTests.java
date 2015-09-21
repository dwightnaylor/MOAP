import static org.junit.Assert.assertEquals;
import static algorithmMaker.QuickParser.parseProperty;

import org.junit.Test;

public class ToStringTests {

	@Test
	public void testToString() {
		String[] originals = { "a(x)", "a(x) & b(x)", "a(x) | b(x)", "forall(x st list(x) : list(x))" };
		for (String original : originals) {
			String parse = parseProperty(original).toString();
			if (!original.equals(parse))
				System.err.println('"' + original + "\" has a broken toString(), yields \"" + parse + '"');

			assertEquals(original, parse);
		}
	}

}
