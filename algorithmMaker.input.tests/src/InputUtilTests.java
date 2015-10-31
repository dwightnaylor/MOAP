import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static algorithmMaker.util.InputUtil.*;

import java.util.Hashtable;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Argument;
import algorithmMaker.input.Property;

public class InputUtilTests {

	@SuppressWarnings("serial")
	@Test
	public void testRevar() {
		// Tests if a revar can switch out simple things
		assertEquals(parseProperty("a(y)"), revar(parseProperty("a(x)"), new Hashtable<Argument, Argument>() {
			{
				put(getVariable("x"), getVariable("y"));
			}
		}));
	}

	@Test
	public void testEquality() {
		assertNotEquals(QuickParser.parseProperty("a(x) & b(x)"), QuickParser.parseProperty("a(x)"));
		assertNotEquals(QuickParser.parseProperty("a(x) & b(x)"), QuickParser.parseProperty("b(x)"));
		assertNotEquals(QuickParser.parseProperty("a(x) & b(x)"), QuickParser.parseProperty("b(x) & a(x)"));
	}

	@Test
	public void testStupidCopy() {
		String[] props = { "a(a,a,a,a)", "forall(y st child(x,y) : lessThanEqual(y,z))" };
		for (String prop : props) {
			Property p = QuickParser.parseProperty(prop);
			assertEquals(p, stupidCopy(p));
		}
	}

	@Test
	public void testCanonicalize() {
		String[] originals = { "a(x) & a(x)", "a(x) & b(x) & c(x)" };
		String[] simplified = { "a(x)", "a(x) & b(x) & c(x)" };
		for (int i = 0; i < originals.length; i++) {
			Property originalProperty = QuickParser.parseProperty(originals[i]);
			// The simplified version goes here
			Property simplifiedProperty = canonicalize(originalProperty);

			if (!QuickParser.parseProperty(simplified[i]).equals(simplifiedProperty))
				System.err.println("\"" + originalProperty + "\" Should reduce to \"" + simplified[i]
						+ "\" but it instead reduced to \"" + simplifiedProperty + '"');

			assertEquals(simplifiedProperty.toString(), simplified[i]);
		}
	}
}
