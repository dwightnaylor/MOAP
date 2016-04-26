package algorithmMaker.input.tests.kernel;

import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import algorithmMaker.util.KernelUtil;
import bindings.Binding;
import kernelLanguage.*;

public class KernelUtilTests {
	@Test
	public void testWithMinimumVariables() {
		assertEquals(parseInput("Given x st a(x); Find y st b(x,y)"),
				withMinimumVariables(parseInput("Given x st a(x); Find y st b(x,y)")));
		assertEquals(parseInput("Given x st a(x); Find y st b(x,y)"),
				withMinimumVariables(parseInput("Given x,z st a(x); Find y st b(x,y)")));
		assertEquals(parseInput("Given x st a(x); Find y st b(x,y)"),
				withMinimumVariables(parseInput("Given x st a(x); Find y,z st b(x,y)")));
		assertEquals(parseInput("Given a st forall(na : a(a,na) -> b(na)); Find b st c(b)"),
				withMinimumVariables(parseInput("Given a st forall(na : a(a,na) -> b(na)); Find b st c(b)")));
		assertEquals(
				input(problem(and(universalQuantifier(problem(atomic("a", "x"), "x")), atomic("a", "na")), "na"),
						problem(TRUE)),
				withMinimumVariables(
						input(problem(and(universalQuantifier(problem(atomic("a", "x"), "x")), atomic("a", "x"))),
								problem(TRUE))));
		assertEquals(parseInput("Given x st a(x) & forall(na : a(na));"),
				withMinimumVariables(
						input(problem(and(atomic("a", "x"), universalQuantifier(problem(atomic("a", "x"), "x")))),
								problem(TRUE))));
	}

	@Test
	public void testCanonicalizeFullyOnProperties() {
		ArrayList<String[]> tasks = new ArrayList<String[]>();
		tasks.add(new String[] { "a(x)", "a(v0)" });
		tasks.add(new String[] { "a(x,y,a,z,x,z,y,x)", "a(v0,v1,v2,v3,v0,v3,v1,v0)" });
		tasks.add(new String[] { "a(x) & b(x)", "a(v0) & b(v0)" });
		tasks.add(new String[] { "b(x) & a(x)", "a(v0) & b(v0)" });
		tasks.add(new String[] { "b(x) & a(x) & a(y)", "a(v0) & a(v1) & b(v0)" });
		for (String[] task : tasks) {
			KProperty originalProperty = parseProperty(task[0]);
			// The simplified version goes here
			KProperty simplifiedProperty = (KProperty) canonicalizeFully(originalProperty);

			KProperty desiredProperty = parseProperty(task[1]);
			if (!desiredProperty.equals(simplifiedProperty))
				System.err.println("\"" + originalProperty + "\" Should canonicalize fully to \"" + desiredProperty
						+ "\" but it instead canonicalized to \"" + simplifiedProperty + '"');

			assertEquals(desiredProperty, simplifiedProperty);
		}
	}

	@Test
	public void testCanonicalizeFullyOnInputs() {
		// TODO:DN: Test with canonicalizers both here and in properties.
		ArrayList<String[]> tasks = new ArrayList<String[]>();
		tasks.add(new String[] { "Given x st a(x); Find y st b(x,y)", "Given v0 st a(v0); Find v1 st b(v0,v1)" });
		tasks.add(new String[] { "Given a,b,c st child(a,b) & child(b,c); Find d st child(c,d)",
				"Given v0,v1,v2 st child(v0,v1) & child(v1,v2); Find v3 st child(v2,v3)" });
		tasks.add(new String[] { "Given q,a,r st a(q) & child(q,a) & child(a,r); Find d st child(r,d)",
				"Given v0,v1,v2 st a(v0) & child(v0,v1) & child(v1,v2); Find v3 st child(v2,v3)" });
		tasks.add(new String[] { "Given list a, list b; Find c st child(a,c) | child(b,c)",
				"Given v1,v2 st type_list(v1) & type_list(v2); Find v0 st child(v1,v0) | child(v2,v0)" });
		for (String[] task : tasks) {
			KInput originalProperty = parseInput(task[0]);
			// The simplified version goes here
			KInput simplifiedProperty = (KInput) canonicalizeFully(originalProperty);

			KInput desiredInput = parseInput(task[1]);
			if (!desiredInput.equals(simplifiedProperty)) {
				System.err.println(originalProperty);
				System.err.println("Should canonicalize fully to");
				System.err.println(desiredInput);
				System.err.println("but it instead canonicalized to");
				System.err.println(simplifiedProperty);
			}

			assertEquals(desiredInput, simplifiedProperty);
		}
	}

	@Test
	public void testRevar() {
		// Tests if a revar can switch out simple things
		assertEquals(parseProperty("a(y)"), revar(parseProperty("a(x)"), Binding.singleton("x", "y").getArguments()));
	}

	@Test
	public void testCanonicalizeOrder() {
		ArrayList<String[]> tasks = new ArrayList<String[]>();
		tasks.add(new String[] { "a(x) & a(x)", "a(x)" });
		tasks.add(new String[] { "a(x) | a(x)", "a(x)" });
		tasks.add(new String[] { "c(x) & b(x) & a(x)", "a(x) & b(x) & c(x)" });
		tasks.add(new String[] { "a(x) & FALSE", "FALSE" });
		tasks.add(new String[] { "!(a(x) & b(x))", "!a(x) | !b(x)" });
		tasks.add(new String[] { "!(a(x) | b(x))", "!a(x) & !b(x)" });
		tasks.add(new String[] { "(a(x) & !d(x)) & (b(x) & d(x)) | (c(x) & !c(x))", "FALSE" });
		tasks.add(new String[] { "!forall(x : a(x))", "exists(x : !a(x))" });
		tasks.add(new String[] { "forall(x : a(x) -> b(x))", "forall(x : !a(x) | b(x))" });
		tasks.add(new String[] { "forall(x : a(x) & b(x) -> c(x))", "forall(x : !a(x) | !b(x) | c(x))" });
		// Regression test
		tasks.add(new String[] { "!forall(na : !b(x,na) & a(x,na))", "exists(na : !a(x,na)) | exists(na : b(x,na))" });
		// Unchanged things
		tasks.add(new String[] { "!a(x,na) | b(x,na)", "!a(x,na) | b(x,na)" });
		tasks.add(new String[] { "forall(x,y,z : a(x,y,z) -> a(x) & b(y) & c(z))",
				"forall(x,y,z : a(x,y,z) -> a(x) & b(y) & c(z))" });
		tasks.add(new String[] { "forall(x,y,z : a(x) & b(y) & c(z) -> a(x,y,z))",
				"forall(x,y,z : a(x) & b(y) & c(z) -> a(x,y,z))" });
		tasks.add(new String[] { "!(!child(a,c) & child(b,c) | !child(b,c) & child(a,c))",
				"(!child(a,c) | child(b,c)) & (!child(b,c) | child(a,c))" });
		for (String[] task : tasks) {
			KProperty originalProperty = parseProperty(task[0]);
			// The simplified version goes here
			KProperty simplifiedProperty = (KProperty) canonicalizeOrder(originalProperty);

			if (!parseProperty(task[1]).equals(simplifiedProperty)) {
				System.err.println(originalProperty);
				System.err.println("Should canonicalize to");
				System.err.println(parseProperty(task[1]));
				System.err.println("But it instead canonicalized to");
				System.err.println(simplifiedProperty);
			}

			assertEquals(parseProperty(task[1]), simplifiedProperty);
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
				KernelUtil.getUndeclaredVars(parseInput("Given x st forall(na : a(na) -> b(na,x)); Find y st b(y)")));
		assertEquals(Collections.emptySet(), KernelUtil.getUndeclaredVars(parseInput("Given x; Find a(x)")));
	}

	@Test
	public void testKQuantifierConstructor() {
		// Test and make sure it's not misfiring...
		parseProperty("forall(x st a(x) -> forall(y : b(y) -> c(x,y)))");
		boolean error = false;
		try {
			parseProperty("forall(x st a(x) -> forall(x : b(x) -> c(x)))");
		} catch (IllegalKernelException e) {
			error = true;
		}
		assertTrue(error || !KernelUtil.ERROR_ON_NESTED_VARS);
	}

	@Test
	public void testKInputConstructor() {
		// Test and make sure it's not misfiring...
		parseInput("Given x; Find y st forall(z : a(x,y,z) -> b(x,y,z))");
		boolean error = false;
		try {
			parseInput("Given x; Find y st forall(x : a(x,y,x) -> b(x,y,x))");
		} catch (IllegalKernelException e) {
			error = true;
		}
		assertTrue(error || !KernelUtil.ERROR_ON_NESTED_VARS);
	}

	@Test
	public void testKProblemConstructor() {
		// Test and make sure it's not misfiring...
		problem(parseProperty("forall(y : a(x,y) -> b(x,y))"), "x");
		boolean error = false;
		try {
			problem(parseProperty("forall(x : a(x,x) -> b(x,x))"), "x");
		} catch (IllegalKernelException e) {
			error = true;
		}
		assertTrue(error || !KernelUtil.ERROR_ON_NESTED_VARS);
	}
}
