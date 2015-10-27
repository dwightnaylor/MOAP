import static org.junit.Assert.*;
import static algorithmMaker.QuickParser.*;
import inputHandling.TransformUtil;

import java.util.HashSet;

import org.junit.Test;

import algorithmMaker.input.Atomic;
import algorithmMaker.util.InputUtil;

public class TransformUtilTests {
	@Test
	public void testSimplify() {
		HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>();
		atomicsToRemove.add((Atomic) parseProperty("a(x)"));
		assertNull(TransformUtil.simplify(null, atomicsToRemove));
		assertNull(TransformUtil.simplify(parseProperty("a(x)"), atomicsToRemove));
		assertNull(TransformUtil.simplify(parseProperty("a(x) & a(x)"), atomicsToRemove));
	}

	@Test
	public void testSimplifyDuplicateRemoval() {
		HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>();
		assertEquals(TransformUtil.simplify(parseProperty("a(x) & a(x)"), atomicsToRemove), parseProperty("a(x)"));
	}

	@Test
	public void testSimplifyBoundRemoval() {
		assertEquals(TransformUtil.simplify(
				parseProperty(InputUtil.BOUND + "(x) & " + InputUtil.UNBOUND + "(x) & a(x)"), new HashSet<Atomic>()),
				parseProperty("a(x)"));
		// situation that was failing in practice
		assertEquals(
				TransformUtil.simplify(parseProblem("a st " + InputUtil.BOUND + "(a) & x(a)"), new HashSet<Atomic>()),
				parseProblem("a st x(a)"));
	}

	@Test
	public void testMakePretty() {
		assertEquals(TransformUtil.makePretty(parseProblem("a st type_int(a) & blah(a)")),
				parseProblem("int a st blah(a)"));
		assertEquals(TransformUtil.makePretty(parseProblem("a st type_list(a) & child_type_int(a) & blah(a)")),
				parseProblem("list<int>(a) st blah(a)"));
	}
}
