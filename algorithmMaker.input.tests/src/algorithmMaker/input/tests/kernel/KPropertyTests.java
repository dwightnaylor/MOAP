package algorithmMaker.input.tests.kernel;

import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;
import static org.junit.Assert.*;

import org.junit.Test;

import kernelLanguage.KAtomic;

public class KPropertyTests {
	@Test
	public void testEquality() {
		assertNotEquals(parseProperty("a(x) & b(x)"), parseProperty("a(x)"));
		assertNotEquals(parseProperty("a(x) & b(x)"), parseProperty("b(x)"));
		assertNotEquals(parseProperty("a(x) & b(x)"), parseProperty("b(x) & a(x)"));
	}

	@Test
	public void testWithoutQuantifiers() {
		assertEquals(parseProperty("forall(x:a(x))"), parseProperty("forall(x:a(x))").without(parseProperty("b(x)")));
	}

	@Test
	public void testWithoutSimple() {
		KAtomic a = atomic("a", "x");
		KAtomic b = atomic("b", "x");
		KAtomic c = atomic("c", "x");

		assertEquals(TRUE, a.without(a));
		assertEquals(TRUE, and(a, a).without(a));

		assertEquals(a, a.without(b));
		assertEquals(b, and(a, b).without(a));

		assertEquals(and(a, b), and(a, b).without(c));
		assertEquals(or(a, b), or(a, b).without(c));
	}

	@Test
	public void testToString() {
		assertEquals("Given x st nothing(x);", parseInput("Given x st nothing(x); Find TRUE").toString());
	}
}
