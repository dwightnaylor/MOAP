import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Hashtable;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Argument;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;

public class InputUtilTests {

	@SuppressWarnings("serial")
	@Test
	public void testRevar() {
		// Tests if a revar can switch out simple things
		assertEquals(parseProperty("a(y)"), InputUtil.revar(parseProperty("a(x)"), new Hashtable<Argument, Argument>() {
			{
				put(InputUtil.getVariable("x"), InputUtil.getVariable("y"));
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
		Property p = QuickParser.parseProperty("a(a,a,a,a)");
		assertEquals(p, InputUtil.stupidCopy(p));
	}
}
