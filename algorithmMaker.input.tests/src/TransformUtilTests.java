import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import inputHandling.TransformUtil;

import java.util.HashSet;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.*;

public class TransformUtilTests {
	@Test
	public void testRemoveProperties() {
		// All of the nullified tests
		HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>();
		atomicsToRemove.add((Atomic) parseProperty("a(x)"));
		assertNull(TransformUtil.removeProperties(null, atomicsToRemove));
		assertNull(TransformUtil.removeProperties(parseProperty("a(x)"), atomicsToRemove));
		assertNull(TransformUtil.removeProperties(parseProperty("a(x) & a(x)"), atomicsToRemove));

		// Tests for no simplification
		String[] sames = { "child(x,z) & forall(y st child(x,y) : lessThanEqual(y,z))" };
		for (String same : sames) {
			Property prop = QuickParser.parseProperty(same);
			assertEquals(prop, TransformUtil.removeProperties(prop, new HashSet<Atomic>()));
		}
	}

	@Test
	public void testSimplifyInput() {
		// Tests for no simplification
		String[] sames = { "Given x st a(x); Find y st a(y)", "Given x st a(x); Find y st a(y)" };
		for (String same : sames) {
			Input prop = QuickParser.parseInput(same);
			assertEquals(prop, TransformUtil.removeProperties(prop, new HashSet<Atomic>()));
		}
	}
}
