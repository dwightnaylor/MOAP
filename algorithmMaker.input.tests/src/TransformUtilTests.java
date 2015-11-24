import static algorithmMaker.QuickParser.parseInput;
import static algorithmMaker.QuickParser.parseProblem;
import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashSet;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Input;
import algorithmMaker.input.Property;
import inputHandling.TransformUtil;

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

	@Test
	public void testMakePrettyForProblems() {
		assertEquals(parseProblem("int a st blah(a)"),
				TransformUtil.makePretty(parseProblem("a st type_int(a) & blah(a)")));
		assertEquals(parseProblem("list<int> a st blah(a)"),
				TransformUtil.makePretty(parseProblem("a st type_list(a) & child_type_int(a) & blah(a)")));

		String[] sames = { "y st forall(x st blah(x): something(x))", "x st a(x,x)" };
		for (String same : sames)
			assertEquals(parseProblem(same), TransformUtil.makePretty(parseProblem(same)));
	}

	@Test
	public void testMakePrettyForInputs() {
		String[] sames = { "Given b st TRUE; Test(even(b))", "Given b,c st TRUE; Test(equal(b,c) & equal(c,b))" };
		for (String same : sames)
			assertEquals(parseInput(same), TransformUtil.makePretty(parseInput(same)));
	}
}
