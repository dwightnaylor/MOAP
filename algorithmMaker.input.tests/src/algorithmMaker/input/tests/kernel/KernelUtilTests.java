package algorithmMaker.input.tests.kernel;

import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.atomic;
import static org.junit.Assert.assertEquals;

import java.util.*;

import kernelLanguage.KProperty;

import org.junit.Test;

import algorithmMaker.util.KernelUtil;
import bindings.Binding;

public class KernelUtilTests {

	@Test
	public void testRevar() {
		// Tests if a revar can switch out simple things
		assertEquals(parseProperty("a(y)"), revar(parseProperty("a(x)"), Binding.singleton("x", "y").getArguments()));
	}

	@Test
	public void testCanonicalize() {
		ArrayList<String[]> tasks = new ArrayList<String[]>();
		tasks.add(new String[] { "a(x) & a(x)", "a(x)" });
		// tasks.add(new String[] { "a(x) | a(x)", "a(x)" });
		tasks.add(new String[] { "c(x) & b(x) & a(x)", "a(x) & b(x) & c(x)" });
		tasks.add(new String[] { "a(x) & FALSE", "FALSE" });
		// tasks.add(new String[] { "!(a(x) & b(x))", "!a(x) | !b(x)" });
		// tasks.add(new String[] { "!(a(x) | b(x))", "!a(x) & !b(x)" });
		// tasks.add(new String[] { "(a(x) & !d(x)) & (b(x) & d(x)) | (c(x) & !c(x))", "FALSE" });
		tasks.add(new String[] { "!forall(x st a(x): b(x))", "exists(x st a(x) : !b(x))" });
		for (String[] task : tasks) {
			KProperty originalProperty = parseProperty(task[0]);
			// The simplified version goes here
			KProperty simplifiedProperty = (KProperty) canonicalize(originalProperty);

			if (!parseProperty(task[1]).equals(simplifiedProperty))
				System.err.println("\"" + originalProperty + "\" Should canonicalize to \"" + parseProperty(task[1])
						+ "\" but it instead canonicalized to \"" + simplifiedProperty + '"');

			assertEquals(simplifiedProperty.toString(), task[1]);
		}
	}

	@Test
	public void testDevar() {
		assertEquals(atomic("a", "_"), devar(atomic("a", "x")));
	}

	@Test
	public void testGetUndeclaredVars() {
		assertEquals(Collections.emptySet(),
				KernelUtil.getUndeclaredVars(parseInput("Given x st a(x); Find y st b(y)")));
		assertEquals(Collections.emptySet(),
				KernelUtil.getUndeclaredVars(parseInput("Given x st forall(na st a(na): b(na,x)); Find y st b(y)")));
	}
}
