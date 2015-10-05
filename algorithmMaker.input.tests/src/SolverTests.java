import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertTrue;
import inputHandling.TransformUtil;

import org.junit.Test;

import solver.ProblemSolver;
import theorems.MultistageTheorem;
import algorithmMaker.QuickParser;

public class SolverTests {
	@Test
	public void testProblemStateChange() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("enumerable(x)"),
				parseProperty("child(x,y)"), 0, "enumerable things");
		ProblemSolver solver = new ProblemSolver(
				QuickParser.parseInput("Given x st enumerable(x), Find y st child(x,y) & something(x)"),
				multistageTheorem);
		solver.branch();
		assertTrue("Basic multitheorems can generate a single new problem state.", solver.problemStates.size() == 1);
	}

	@Test
	public void testProblemResolution() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x)"), 0,
				"test");
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput("Given x st a(x), Find x st b(x)"),
				multistageTheorem);
		// Testing for a crash with either the branching or the tostring()
		solver.branch();
		assertTrue(TransformUtil.isSolved(solver.problemStates.get(0).problem.getGoal()));
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
