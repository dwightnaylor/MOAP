import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import inputHandling.MultiTheoremParser;
import inputHandling.TheoremParser;

import java.util.ArrayList;

import org.junit.Test;

import solver.ProblemSolver;
import solver.ProblemState;
import theorems.MultistageTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.input.Input;
import algorithmMaker.input.Theorem;
import algorithmMaker.util.InputUtil;

public class SolverTests {
	@Test
	public void testProblemStateChange() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("enumerable(x)"),
				parseProperty("child(x,y)"), parseProperty("child(x,y)"), null, 0, "enumerable things", null);
		ProblemSolver solver = new ProblemSolver(
				QuickParser.parseInput("Given x st enumerable(x); Find y st child(x,y) & something(x)"),
				multistageTheorem);
		solver.branch();
		assertTrue("Basic multitheorems can generate a single new problem state.", solver.problemStates.size() == 1);
	}

	@Test
	public void testProblemResolution() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x,y)"),
				parseProperty("b(x,y)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x st a(x); Find y st b(x,y)"),
				multistageTheorem);
		solver.branch();
		assertEquals(QuickParser.parseInput("Given x,y st a(x) & b(x,y);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testMultipleBranchingExclusion() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x)"),
				parseProperty("b(x)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x st a(x) & a(x); Test b(x)"),
				multistageTheorem);
		solver.branch();
		assertEquals(QuickParser.parseInput("Given x st a(x) & b(x);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testEqualityMultiTheorem() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty(InputUtil.BOUND + "(x) & "
				+ InputUtil.BOUND + "(y)"), parseProperty("equal(x,y)"), parseProperty("equal(x,y)"), null, 0, "test",
				null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x,y st a(x,y); Test equal(x,y)"),
				multistageTheorem);
		solver.branch();
		assertEquals(QuickParser.parseInput("Given x,y st a(x,y) & equal(x,y);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testAgainstRegressionForPreviousSolves() {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		ArrayList<String[]> probsAndSols = new ArrayList<String[]>();
		// These are all the problem/solution pairs. If there is no solution or only part of a solution, the program
		// will only make sure the real solution matches up until whatever's given (no given means any solution works).
		probsAndSols.add(new String[] { "Given list<int> a; Find b st child(a,b) & even(b)",
				"foreach child b of a\n\tif b % 2 == 0\n\t\t" });
		probsAndSols.add(new String[] { "Given list<int> a,list<int> b; Find c st child(a,c) & child(b,c) & even(c)",
				"foreach child c of a\n\tif c % 2 == 0\n\t\tforeach child na of b\n\t\t\t" });
		probsAndSols.add(new String[] { "Given int a, int b, int c; Test(plus(c,b,a))", "if c + b == a\n\t" });
		probsAndSols.add(new String[] { "Given array x; Find y st index(x,y) & get(x,y,y)",
				"foreach index y of x\n\tif x.get(y) == y" });
		probsAndSols.add(new String[] { "Given list x; Find y,z st child(x,y) & child(x,z) & equal(y,z)",
				"foreach child y of x\n\tforeach child z of x" });
		probsAndSols.add(new String[] { "Given list a, list b; Find c st child(a,c) & !child(b,c)", "" });
		probsAndSols.add(new String[] {
				"Given list a, list b, list c; Find d st child(a,d) & child(b,d) & !child(c,d)", "" });
		probsAndSols.add(new String[] {
				"Given list a, hashset b, hashset c; Find d st child(a,d) & child(b,d) & !child(c,d)", "" });
		for (String[] ps : probsAndSols) {
			Input input = QuickParser.parseInput(ps[0]);
			InputUtil.desugar(input);
			String actualSolution = ProblemState.getOutputString(new ProblemSolver(input, theorems
					.toArray(new Theorem[0])).getSolution());
			if (actualSolution == null) {
				System.err.println("No solution for problem \"" + ps[0] + "\"");
				System.err.println("Expected a solution starting with :");
				System.err.println(ps[1] + "\n");
			}
			assertNotNull(actualSolution);
			String desiredAdjusted = ps[1].trim();
			String actualAdjusted = actualSolution.trim().substring(0,
					Math.min(actualSolution.trim().length(), desiredAdjusted.length()));
			if (!desiredAdjusted.equals(actualAdjusted)) {
				System.err.println("Wrong solution for problem \"" + ps[0] + "\"");
				System.err.println("Expected:");
				System.err.println(ps[1] + "\n");
				System.err.println("But was:");
				System.err.println(actualSolution + "\n");
			}
			assertEquals(desiredAdjusted, actualAdjusted);
		}
	}
}
