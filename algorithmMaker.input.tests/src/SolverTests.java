import static org.junit.Assert.*;

import org.junit.Test;

import algorithmMaker.QuickParser;
import solver.ProblemSolver;
import theorems.MultistageTheorem;

public class SolverTests {

	@Test
	public void testSolver() {
		ProblemSolver solver = new ProblemSolver(
				QuickParser.parseInput("Given x st enumerable(x), Find y st child(x,y) & something(x)"),
				new MultistageTheorem(QuickParser.parseProperty("enumerable(x)"),
						QuickParser.parseProperty("child(x,y)"), QuickParser.parseProperty("child(x,y)"), 0,
						"enumerable things"));
		solver.branch();
		fail("Not yet implemented");
	}

}
