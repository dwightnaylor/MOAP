import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;

import java.util.Hashtable;

import org.junit.Test;

import algorithmMaker.util.InputUtil;

public class InputUtilTests {

	@SuppressWarnings("serial")
	@Test
	public void testRevar() {
		// Tests if a revar can switch out simple things
		assertEquals(parseProperty("a(y)"), InputUtil.revar(parseProperty("a(x)"), new Hashtable<String, String>() {
			{
				put("x", "y");
			}
		}));
	}
}
