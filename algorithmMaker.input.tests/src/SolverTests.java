import static kernelLanguage.KernelFactory.*;
import static algorithmMaker.util.KernelUtil.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static solver.ProblemSolver.*;
import inputHandling.MultiTheoremParser;
import inputHandling.TheoremParser;

import java.util.ArrayList;

import kernelLanguage.*;

import org.junit.Test;

import solver.ProblemSolver;
import solver.ProblemState;
import theorems.MultistageTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.util.*;

public class SolverTests {
	@Test
	public void testProblemStateChange() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("enumerable(x)"),
				parseProperty("child(x,y)"), parseProperty("child(x,y)"), null, 0, "enumerable things", null);
		ProblemSolver solver = new ProblemSolver(
				parseInput("Given x st enumerable(x); Find y st child(x,y) & something(x)"), multistageTheorem);
		solver.branch();
		assertTrue("Basic multitheorems can generate a single new problem state.", solver.problemStates.size() == 1);
	}

	@Test
	public void testProblemResolution() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x,y)"),
				parseProperty("b(x,y)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(parseInput("Given x st a(x); Find y st b(x,y)"), multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given x,y st a(x) & b(x,y);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testSimpleContainmentCheck() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(
				parseProperty(TYPE_MARKER + "hashset(x) & " + BOUND + "(y)"), parseProperty("childFAKE(x,y)"),
				parseProperty("childFAKE(x,y)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(parseInput("Given hashset x,y; Find childFAKE(x,y)"),
				multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given hashset x,y st childFAKE(x,y);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testMultipleBranchingExclusion() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x)"),
				parseProperty("b(x)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(parseInput("Given x st a(x) & a(x); Find b(x)"), multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given x st a(x) & b(x);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testEqualityMultiTheorem() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(
				parseProperty(InputUtil.BOUND + "(x) & " + InputUtil.BOUND + "(y)"), parseProperty("equal(x,y)"),
				parseProperty("equal(x,y)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(parseInput("Given x,y st a(x,y); Find equal(x,y)"), multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given x,y st a(x,y) & equal(x,y);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testGetSubProblemForQuantifier() {
		assertEquals(parseInput("Given list x st blah(x); Find na st !b(na) & a(na)"),
				getSubProblemForQuantifier(parseInput("Given list x st blah(x); Find y st child(x,y)"),
						(KQuantifier) parseProperty("forall(x st a(x) : b(x))")));
		assertEquals(parseInput("Given list x st blah(x); Find na st a(na) & b(na)"),
				getSubProblemForQuantifier(parseInput("Given list x st blah(x); Find y st child(x,y)"),
						(KQuantifier) parseProperty("exists(x st a(x) : b(x))")));
		assertEquals(parseInput("Given list x st blah(x); Find na st a(x,na) & b(x,na)"),
				getSubProblemForQuantifier(parseInput("Given list x st blah(x); Find y st child(x,y)"),
						(KQuantifier) parseProperty("exists(z st a(x,z) : b(x,z))")));
	}

	@Test
	public void testAgainstRegressionForPreviousSolves() {
		ArrayList<KTheorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.getMultiTheorems());
		ArrayList<String[]> probsAndSols = new ArrayList<String[]>();
		probsAndSols.add(new String[] { "Given list<int> a; Find b st child(a,b) & even(b)", "foreach child b of a",
				"if b % 2 == 0", "return [b]" });
		probsAndSols.add(new String[] { "Given list<int> a,list<int> b; Find c st child(a,c) & child(b,c) & even(c)",
				"foreach child c of a", "if c % 2 == 0", "boolean na = true;", "foreach child nb of b", "na = false",
				"if na == false", "return [c]" });
		probsAndSols.add(new String[] { "Given int a, int b, int c; Find plus(c,b,a)", "if c + b == a" });
		probsAndSols.add(new String[] { "Given array x; Find y st index(x,y) & equal(get(x,y),y)",
				"foreach index y of x\n\tna = x[y]" });
		probsAndSols.add(new String[] { "Given list x; Find y,z st child(x,y) & child(x,z) & equal(y,z)",
				"foreach child y of x\n\tforeach child z of x" });
		probsAndSols.add(new String[] { "Given list a, list b; Find c st child(a,c) & !child(b,c)", "" });
		probsAndSols.add(
				new String[] { "Given list a, list b, list c; Find d st child(a,d) & child(b,d) & !child(c,d)", "" });
		probsAndSols.add(new String[] {
				"Given list a, hashset b, hashset c; Find d st child(a,d) & child(b,d) & !child(c,d)", "" });
		probsAndSols.add(new String[] { "Given a,b; Find s st plus(a,b,s)", "" });
		probsAndSols.add(
				new String[] { "Given hashset a, hashset b, hashset c; Find d st child(a,d) & child(b,d) & !child(c,d)",
						"foreach child d of a\n\t" });
		probsAndSols.add(new String[] {
				"Given array<number> A; Find y st child(A,y) & forall(z st child(A,z): lessThanEqual(z,y))", "" });
		probsAndSols.add(
				new String[] { "Given list<number> x, int s; Find a,b st child(x,a) & child(x,b) & equal(a+b,s)", "" });
		probsAndSols
				.add(new String[] { "Given list x; Find y st child(x,y) & forall(z st child(x,z) : lessThanEqual(y,z))",
						"y = null;", "foreach child z of x", "if y == null", "y = z", "if z > y", "y = z" });
		for (String[] ps : probsAndSols) {
			KInput input = (KInput) SugarUtil.convertToKernel(QuickParser.parseInput(ps[0]));
			ProblemState actualSolution = new ProblemSolver(input, theorems.toArray(new KTheorem[0])).getSolution();
			if (actualSolution == null) {
				System.err.println("No solution for problem \"" + ps[0] + "\"");
			}
			assertNotNull(actualSolution);
			String solutionString = ProblemState.getOutputString(actualSolution);
			boolean hasAllParts = true;
			for (int i = 1; i < ps.length; i++) {
				String part = ps[i];
				if (!solutionString.contains(part)) {
					System.err.println("Wrong solution for problem \"" + ps[0] + "\"");
					System.err.println("Expected solution to contain:");
					System.err.println(part + "\n");
					System.err.println("But was:");
					System.err.println(solutionString + "\n");
					hasAllParts = false;
					break;
				}
			}
			assertTrue(hasAllParts);
		}
	}
}
