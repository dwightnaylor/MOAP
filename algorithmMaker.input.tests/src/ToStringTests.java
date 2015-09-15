import static algorithmMaker.PropertyQuickParser.parse;
import static org.junit.Assert.*;

import org.junit.Test;

public class ToStringTests {

	@Test
	public void testToString() {
		String[] originals = { "a(x)", "a(x) & b(x)", "a(x) | b(x)", "forall(x st list(x) : list(x))" };
		for (String original : originals) {
			String parse = parse(original).toString();
			if (!original.equals(parse))
				System.err.println('"' + original + "\" has a broken toString(), yields \"" + parse + '"');

			assertEquals(original, parse);
		}
	}

}
