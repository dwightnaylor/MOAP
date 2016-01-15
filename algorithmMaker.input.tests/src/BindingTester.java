import static algorithmMaker.util.KernelUtil.parseProperty;
import static bindings.Binding.findBindingWithin;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import bindings.Binding;

public class BindingTester {

	@Test
	public void testFindBindingsWithinSimple() {
		ArrayList<Binding> test = findBindingWithin(parseProperty("a(x)"), parseProperty("a(y)"));
		assertEquals(1, test.size());
		assertEquals(Binding.singleton("x", "y"), test.get(0));
	}

	@Test
	public void testFindBindingsWithinMultiple() {
		ArrayList<Binding> test = findBindingWithin(parseProperty("a(x) & b(x,y) & c(y,z) & d(x,z)"),
				parseProperty("a(q) & b(q,w) & c(w,e) & d(q,e)"));
		assertEquals(1, test.size());
		assertEquals(Binding.createBinding(new String[][] { { "x", "q" }, { "y", "w" }, { "z", "e" } }), test.get(0));
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
