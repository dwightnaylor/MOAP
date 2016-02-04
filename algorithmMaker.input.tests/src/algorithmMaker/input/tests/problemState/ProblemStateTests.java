package algorithmMaker.input.tests.problemState;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.KTheorem;
import solver.*;

public class ProblemStateTests {
	private static final String dummyProblem = "Given x st a(x); Find b(x)";

	@Test
	public void testGetApproachCostBasic() {
		ProblemState headState = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		new ProblemGroup(null, null, null, headState);
		assertEquals(1, headState.getApproachCost());
	}

	@Test
	public void testGetApproachCostPair() {
		ProblemState state1 = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		ProblemState state2 = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		new ProblemGroup(null, null, null, state1, state2);
		assertEquals(1, state1.getApproachCost());
		assertEquals(2, state2.getApproachCost());
	}

	@Test
	public void testGetApproachCostNested() {
		ProblemState state1 = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		ProblemState state2 = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		new ProblemGroup(null, null, null, state1, state2);
		assertEquals(1, state1.getApproachCost());
		assertEquals(2, state2.getApproachCost());
	}
}
