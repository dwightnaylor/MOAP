import static algorithmMaker.util.KernelUtil.parseProperty;
import static bindings.Binding.findBindingWithin;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import bindings.Binding;

public class BindingTester {

	@Test
	public void testFindBindingsWithinSimple() {
		ArrayList<Binding> test1 = findBindingWithin(parseProperty("a(x)"), parseProperty("a(y)"));
		assertEquals(1, test1.size());
		assertEquals(Binding.singleton("x", "y"), test1.get(0));

		ArrayList<Binding> test2 = findBindingWithin(parseProperty("child(x,y)"), parseProperty("child(x,z)"));
		assertEquals(1, test2.size());
		assertEquals(Binding.createBinding(new String[][] { { "x", "x" }, { "y", "z" } }), test2.get(0));
	}

	@Test
	public void testFindBindingsWithinMultiple() {
		ArrayList<Binding> test = findBindingWithin(parseProperty("a(x) & b(x,y) & c(y,z) & d(x,z)"),
				parseProperty("a(q) & b(q,w) & c(w,e) & d(q,e)"));
		assertEquals(1, test.size());
		assertEquals(Binding.createBinding(new String[][] { { "x", "q" }, { "y", "w" }, { "z", "e" } }), test.get(0));
	}

	@Test
	public void testFindBindingsWithinCombinations() {
		ArrayList<Binding> bindings = findBindingWithin(parseProperty("a(x) & a(y)"), parseProperty("a(a) & a(b)"));
		assertEquals(2, bindings.size());
		assertTrue(bindings.contains(Binding.createBinding(new String[][] { { "x", "a" }, { "y", "b" } })));
		assertTrue(bindings.contains(Binding.createBinding(new String[][] { { "x", "b" }, { "y", "a" } })));
	}

	@Test
	public void testFindBindingsWithinFailures() {
		assertEquals(0, findBindingWithin(parseProperty("a(x,x)"), parseProperty("a(x,y)")).size());
		assertEquals(0, findBindingWithin(parseProperty("a(x,y) & b(y,x)"), parseProperty("a(x,y) & b(x,y)")).size());
		assertEquals(0, findBindingWithin(parseProperty("a(x,y) & b(y,x)"), parseProperty("a(x,y) & b(x,y)")).size());
		// Test for one-to-one failure
		assertEquals(0, findBindingWithin(parseProperty("a(x,x)"), parseProperty("a(a,b)")).size());
		assertEquals(0, findBindingWithin(parseProperty("a(x,y)"), parseProperty("a(a,a)")).size());
	}
}
