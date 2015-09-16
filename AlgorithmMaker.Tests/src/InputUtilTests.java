import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Test;

import algorithmMaker.PropertyQuickParser;

public class InputUtilTests {

	@SuppressWarnings("serial")
	@Test
	public void testRevar() {
		// Tests if a revar can switch out simple things
		assertEquals(PropertyQuickParser.parse("a(y)"), InputUtil.revar(PropertyQuickParser.parse("a(x)"), new Hashtable<String, String>() {
			{
				put("x", "y");
			}
		}));
	}
}
