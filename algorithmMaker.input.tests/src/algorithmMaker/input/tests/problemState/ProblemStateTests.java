package algorithmMaker.input.tests.problemState;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.KTheorem;
import solver.*;
import theorems.MultistageTheorem;

public class ProblemStateTests {
	private static final String dummyProblem = "Given x st a(x); Find b(x)";

	@Test
	public void testConstructorSimplification() {
		ProblemState state = new ProblemState(
				KernelUtil.parseInput(
						"Given x,s st forall(na st child(x,na) : type_int(na)) & type_int(s) & type_list(x); Find i,j,na,nb,nc st equal(na,s) & get(x,i,nb) & get(x,j,nc) & index(x,i) & index(x,j)"),
				new KTheorem[0]);
		System.out.println(state.problem);
	}

	@Test
	public void testGetApproachCostBasic() {
		ProblemState headState = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		new ProblemGroup(null, null, null, headState);
		assertEquals(2, headState.getApproachCost());
	}

	@Test
	public void testGetApproachCostPair() {
		ProblemState state1 = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		ProblemState state2 = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		new ProblemGroup(null, new MultistageTheorem(null, null, null, null, r -> 2 * r[0] + 3 * r[1], "", null), null,
				state1, state2);
		assertEquals(10, state1.getApproachCost());
		assertEquals(10, state2.getApproachCost());
	}

	@Test
	public void testGetApproachCostNested() {
		ProblemState p1 = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		ProblemState p2 = new ProblemState(KernelUtil.parseInput(dummyProblem), new KTheorem[0]);
		new ProblemGroup(null, new MultistageTheorem(null, null, null, null, r -> 2 * r[0], "", null), null, p1);
		new ProblemGroup(p1, new MultistageTheorem(null, null, null, null, r -> 3 * r[0], "", null), null, p2);
		assertEquals(4, p1.getApproachCost());// 2 * 2 = 4
		assertEquals(12, p2.getApproachCost());// 2 * 6 = 12
	}
}
