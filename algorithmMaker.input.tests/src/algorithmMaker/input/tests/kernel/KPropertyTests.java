package algorithmMaker.input.tests.kernel;

import static org.junit.Assert.*;
import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;
import kernelLanguage.KAtomic;

import org.junit.Test;

public class KPropertyTests {
	@Test
	public void testEquality() {
		assertNotEquals(parseProperty("a(x) & b(x)"), parseProperty("a(x)"));
		assertNotEquals(parseProperty("a(x) & b(x)"), parseProperty("b(x)"));
		assertNotEquals(parseProperty("a(x) & b(x)"), parseProperty("b(x) & a(x)"));
	}

	@Test
	public void testWithout() {
		KAtomic a = atomic("a", "x");
		KAtomic b = atomic("b", "x");

		assertEquals(TRUE, a.without(a));
		assertEquals(TRUE, and(a, a).without(a));

		assertEquals(a, a.without(b));
		assertEquals(b, and(a, b).without(a));
	}

	@Test
	public void testToString() {
		assertEquals("Given x st nothing(x);", parseInput("Given x st nothing(x); Find TRUE").toString());
	}
}
