import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Input;
import algorithmMaker.input.Theorem;
import algorithmMaker.util.InputUtil;
import inputHandling.MultiTheoremParser;
import inputHandling.TheoremParser;
import inputHandling.TransformUtil;
import solver.ProblemSolver;
import solver.ProblemState;
import theorems.MultistageTheorem;

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
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x)"),
				parseProperty("b(x)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x st a(x); Find x st b(x)"),
				multistageTheorem);
		solver.branch();
		solver.branch();
		assertTrue(TransformUtil.isSolved(solver.problemStates.peek().problem.getGoal()));
	}

	@Test
	public void testMultipleBranchingExclusion() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x)"),
				parseProperty("b(x)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x st a(x) & a(x); Find x st b(x)"),
				multistageTheorem);
		solver.branch();
		assertEquals(QuickParser.parseInput("Given x st a(x) & b(x); Find x st TRUE"),
				solver.problemStates.peek().problem);
	}

	@Test
	public void testEqualityMultiTheorem() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(
				parseProperty(InputUtil.BOUND + "(x) & " + InputUtil.BOUND + "(y)"), parseProperty("equal(x,y)"),
				parseProperty("equal(x,y)"), null, 0, "test", null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x,y st a(x,y); Find x st equal(x,y)"),
				multistageTheorem);
		solver.branch();
		assertEquals(QuickParser.parseInput("Given x,y st a(x,y) & equal(x,y); Find x st TRUE"),
				solver.problemStates.peek().problem);
	}

	@Test
	public void testAgainstRegressionForPreviousSolves() {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		ArrayList<String[]> probsAndSols = new ArrayList<String[]>();
		probsAndSols.add(new String[] { "Given list<int>(a); Find b st child(a,b) & even(b)",
				"foreach child b of a\n\tif b % 2 == 0\n\t\t" });
		probsAndSols.add(new String[] { "Given list<int>(a),list<int>(b); Find c st child(a,c) & child(b,c) & even(c)",
				"foreach child c of b\n\tif c % 2 == 0\n\t\tforeach child na of a\n\t\t\tif c == na\n\t\t\t\t" });
		probsAndSols.add(new String[] { "Given int(a), int(b), int(c); Test(plus(c,b,a))", "if c + b == a\n\t" });
		for (String[] ps : probsAndSols) {
			Input input = QuickParser.parseInput(ps[0]);
			InputUtil.desugar(input);
			String actualSolution = ProblemState
					.getOutputString(new ProblemSolver(input, theorems.toArray(new Theorem[0])).getSolution());
			if (!ps[1].equals(actualSolution)) {
				System.err.println("Wrong solution for problem \"" + ps[0] + "\"");
				System.err.println("Expected:");
				System.err.println(ps[1] + "\n");
				System.err.println("But was:");
				System.err.println(actualSolution + "\n");
			}
			assertEquals(ps[1], actualSolution);
		}
	}
}
