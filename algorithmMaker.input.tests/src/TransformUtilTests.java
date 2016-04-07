import static algorithmMaker.util.KernelUtil.parseInput;
import static org.junit.Assert.assertEquals;
import static inputHandling.TransformUtil.*;

import org.junit.Test;

import solver.Chainer;

public class TransformUtilTests {
	@Test
	public void testRemoveGivenFromGoal() {
		assertEquals(removeGivenFromGoal(parseInput("Given forall(x:a(x)); Find forall(x:a(x))"), new Chainer()),
				parseInput("Given forall(x:a(x));"));
	}
}
