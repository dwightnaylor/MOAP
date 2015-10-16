import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import inputHandling.TransformUtil;

import org.junit.Test;

import solver.ProblemSolver;
import theorems.MultistageTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.util.InputUtil;

public class SolverTests {
	@Test
	public void testProblemStateChange() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("enumerable(x)"),
				parseProperty("child(x,y)"), parseProperty("child(x,y)"), 0, "enumerable things", null);
		ProblemSolver solver = new ProblemSolver(
				QuickParser.parseInput("Given x st enumerable(x); Find y st child(x,y) & something(x)"),
				multistageTheorem);
		solver.branch();
		assertTrue("Basic multitheorems can generate a single new problem state.", solver.problemStates.size() == 1);
	}

	@Test
	public void testProblemResolution() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x)"),
				parseProperty("b(x)"), 0, "test", null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x st a(x); Find x st b(x)"),
				multistageTheorem);
		solver.branch();
		solver.branch();
		assertTrue(TransformUtil.isSolved(solver.problemStates.peek().problem.getGoal()));
	}

	@Test
	public void testMultipleBranchingExclusion() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x)"),
				parseProperty("b(x)"), 0, "test", null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x st a(x) & a(x); Find x st b(x)"),
				multistageTheorem);
		solver.branch();
		assertEquals(QuickParser.parseInput("Given x st b(x) & a(x); Find x st TRUE"),
				solver.problemStates.peek().problem);
	}

	@Test
	public void testEqualityMultiTheorem() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty(InputUtil.BOUND + "(x) & "
				+ InputUtil.BOUND + "(y)"), parseProperty("equal(x,y)"), parseProperty("equal(x,y)"), 0, "test", null);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x,y st a(x,y); Find x st equal(x,y)"),
				multistageTheorem);
		solver.branch();
		assertEquals(QuickParser.parseInput("Given x,y st equal(x,y) & a(x,y); Find x st TRUE"),
				solver.problemStates.peek().problem);
	}
	// @Test
	// public void testMultipleProblemStateChange() {
	// MultistageTheorem mst1 = new
	// MultistageTheorem(parseProperty("enumerable(x)"),
	// parseProperty("child(x,y)"), 0,
	// "enumerable things");
	// MultistageTheorem mst2 = new
	// MultistageTheorem(parseProperty("type_int(x)"), parseProperty("even(x)"),
	// 0,
	// "even numbers are testable");
	// ProblemSolver solver = new ProblemSolver(
	// QuickParser.parseInput("Given x st enumerable(x), Find y st child(x,y) & something(x)"),
	// mst1);
	// solver.branch();
	// assertTrue("Basic multitheorems can generate a single new problem state.",
	// solver.problemStates.size() == 1);
	// }
}
