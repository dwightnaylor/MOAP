import static algorithmMaker.QuickParser.parseProblem;
import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.*;

import java.util.HashSet;

import inputHandling.TransformUtil;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Input;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;

public class TransformUtilTests {
	@Test
	public void testSimplify() {
		// All of the nullified tests
		HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>();
		atomicsToRemove.add((Atomic) parseProperty("a(x)"));
		assertNull(TransformUtil.removeAtomics(null, atomicsToRemove));
		assertNull(TransformUtil.removeAtomics(parseProperty("a(x)"), atomicsToRemove));
		assertNull(TransformUtil.removeAtomics(parseProperty("a(x) & a(x)"), atomicsToRemove));

		// Tests for no simplification
		String[] sames = { "child(x,z) & forall(y st child(x,y) : lessThanEqual(y,z))" };
		for (String same : sames) {
			Property prop = QuickParser.parseProperty(same);
			assertEquals(prop, TransformUtil.removeAtomics(prop));
		}
	}

	@Test
	public void testSimplifyInput() {
		// Tests for no simplification
		String[] sames = { "Given x st a(x); Find y st a(y)", "Given x st a(x); Find y st a(y)" };
		for (String same : sames) {
			Input prop = QuickParser.parseInput(same);
			assertEquals(prop, TransformUtil.removeAtomics(prop));
		}
	}

	// TODO:DN: Put this back in when we have better simplification
	// @Test
	// public void testSimplifyDuplicateRemoval() {
	// HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>();
	// assertEquals(TransformUtil.simplify(parseProperty("a(x) & a(x)"),
	// atomicsToRemove), parseProperty("a(x)"));
	// }

	@Test
	public void testSimplifyBoundRemoval() {
		assertEquals(
				TransformUtil.removeAtomics(parseProperty(InputUtil.BOUND + "(x) & " + InputUtil.UNBOUND + "(x) & a(x)")),
				parseProperty("a(x)"));
		// situation that was failing in practice
		assertEquals(TransformUtil.removeAtomics(parseProblem("a st " + InputUtil.BOUND + "(a) & x(a)")),
				parseProblem("a st x(a)"));
	}

	@Test
	public void testMakePretty() {
		assertEquals(parseProblem("int(a) st blah(a)"),
				TransformUtil.makePretty(parseProblem("a st type_int(a) & blah(a)")));
		assertEquals(parseProblem("list<int>(a) st blah(a)"),
				TransformUtil.makePretty(parseProblem("a st type_list(a) & child_type_int(a) & blah(a)")));
	}
}
