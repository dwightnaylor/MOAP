import static org.junit.Assert.*;
import inputHandling.TransformUtil;

import java.util.HashSet;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Atomic;
import algorithmMaker.util.InputUtil;

public class TransformUtilTests {
	@Test
	public void testSimplify() {
		HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>();
		atomicsToRemove.add((Atomic) QuickParser.parseProperty("a(x)"));
		assertNull(TransformUtil.simplify(null, atomicsToRemove));
		assertNull(TransformUtil.simplify(QuickParser.parseProperty("a(x)"), atomicsToRemove));
		assertNull(TransformUtil.simplify(QuickParser.parseProperty("a(x) & a(x)"), atomicsToRemove));
	}

	@Test
	public void testSimplifyDuplicateRemoval() {
		HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>();
		assertEquals(TransformUtil.simplify(QuickParser.parseProperty("a(x) & a(x)"), atomicsToRemove),
				QuickParser.parseProperty("a(x)"));
	}

	@Test
	public void testSimplifyBoundRemoval() {
		assertEquals(TransformUtil.simplify(
				QuickParser.parseProperty(InputUtil.BOUND + "(x) & " + InputUtil.UNBOUND + "(x) & a(x)"),
				new HashSet<Atomic>()), QuickParser.parseProperty("a(x)"));
		// situation that was failing in practice
		assertEquals(TransformUtil.simplify(
				QuickParser.parseProblem("a st " + InputUtil.BOUND + "(a) & x(a)"),
				new HashSet<Atomic>()), QuickParser.parseProblem("a st x(a)"));
	}
}
