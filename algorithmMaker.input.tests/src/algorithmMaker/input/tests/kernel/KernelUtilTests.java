package algorithmMaker.input.tests.kernel;

import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import algorithmMaker.util.KernelUtil;
import bindings.Binding;
import kernelLanguage.*;
import kernelLanguage.KQuantifier.Quantifier;

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
		// tasks.add(new String[] { "(a(x) & !d(x)) & (b(x) & d(x)) | (c(x) &
		// !c(x))", "FALSE" });
		tasks.add(new String[] { "!forall(x st a(x): b(x))", "exists(x st a(x) : !b(x))" });
		// Split a quantifier when it's two problems
		tasks.add(new String[] { "forall(x,y st a(x) & c(y): b(x) & d(y))",
				"forall(x st a(x): b(x)) & forall(y st c(y): d(y))" });
		tasks.add(new String[] { "forall(x st TRUE: a(x))", "a(x)" });
		tasks.add(new String[] { "forall(x st a(x):b(x))", "forall(x st a(x):b(x))" });
		// Unchanged things
		tasks.add(new String[] { "forall(x,y,z st a(x,y,z):a(x) & b(y) & c(z))",
				"forall(x,y,z st a(x,y,z):a(x) & b(y) & c(z))" });
		tasks.add(new String[] { "forall(x,y,z st a(x) & b(y) & c(z):a(x,y,z))",
				"forall(x,y,z st a(x) & b(y) & c(z):a(x,y,z))" });
		for (String[] task : tasks) {
			KProperty originalProperty = parseProperty(task[0]);
			// The simplified version goes here
			KProperty simplifiedProperty = (KProperty) canonicalizeOrder(originalProperty);

			if (!parseProperty(task[1]).equals(simplifiedProperty))
				System.err.println("\"" + originalProperty + "\" Should canonicalize to \"" + parseProperty(task[1])
						+ "\" but it instead canonicalized to \"" + simplifiedProperty + '"');

			assertEquals(simplifiedProperty, parseProperty(task[1]));
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

	@Test
	public void testKQuantifierConstructor() {
		// Test and make sure it's not misfiring...
		parseProperty("forall(x st a(x) : forall(y st b(y) : c(x,y)))");
		boolean error = false;
		try {
			parseProperty("forall(x st a(x) : forall(x st b(x) : c(x)))");
		} catch (IllegalKernelException e) {
			error = true;
		}
		assertTrue(error || !KernelUtil.ERROR_ON_NESTED_VARS);
	}

	@Test
	public void testKInputConstructor() {
		// Test and make sure it's not misfiring...
		parseInput("Given x; Find y st forall(z st a(x,y,z) : b(x,y,z))");
		boolean error = false;
		try {
			parseInput("Given x; Find y st forall(x st a(x,y,x) : b(x,y,x))");
		} catch (IllegalKernelException e) {
			error = true;
		}
		assertTrue(error || !KernelUtil.ERROR_ON_NESTED_VARS);
	}

	@Test
	public void testKProblemConstructor() {
		// Test and make sure it's not misfiring...
		problem(parseProperty("forall(y st a(x,y) : b(x,y))"), "x");
		boolean error = false;
		try {
			problem(parseProperty("forall(x st a(x,x) : b(x,x))"), "x");
		} catch (IllegalKernelException e) {
			error = true;
		}
		assertTrue(error || !KernelUtil.ERROR_ON_NESTED_VARS);
	}

	@Test
	public void testCleanDeclarationsNoChanges() {
		String[] sames = { "Given x st a(x); Find y st b(x,y)",
				"Given a st forall(b st x(a,b) : forall(c st x(a,b,c) : d(a,b,c))); Find b st forall(c st x(a,b,c) : d(a,b,c))" };
		for (String string : sames) {
			KInput object = parseInput(string);
			assertEquals(object, cleanDeclarations(object));
		}
	}

	@Test
	public void testCleanDeclarations() {
		ArrayList<KObject[]> tasks = new ArrayList<KObject[]>();
		tasks.add(new KObject[] {
				input(problem(quantifier(Quantifier.forall, problem(atomic("a", "x"), "x"), atomic("b", "x")), "x"),
						problem(TRUE)),
				input(problem(quantifier(Quantifier.forall, problem(atomic("a", "na"), "na"), atomic("b", "na")), "x"),
						problem(TRUE)) });
		for (KObject[] task : tasks) {
			KObject originalProperty = task[0];
			// The simplified version goes here
			KObject simplifiedProperty = cleanDeclarations(originalProperty);

			if (!task[1].equals(simplifiedProperty))
				System.err.println("\"" + originalProperty + "\" Should be cleaned to \"" + task[1]
						+ "\" but it instead cleaned  to \"" + simplifiedProperty + '"');

			assertEquals(simplifiedProperty, task[1]);
		}

	}
}
