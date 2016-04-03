package algorithmMaker.input.tests.kernel;

import static algorithmMaker.util.KernelUtil.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class KInputTests {
	@Test
	public void testWithMinimumVariables() {
		assertEquals(parseInput("Given x st a(x); Find y st b(x,y)"), parseInput("Given x st a(x); Find y st b(x,y)")
				.withMinimumVariables());
		assertEquals(parseInput("Given x st a(x); Find y st b(x,y)"), parseInput("Given x,z st a(x); Find y st b(x,y)")
				.withMinimumVariables());
		assertEquals(parseInput("Given x st a(x); Find y st b(x,y)"), parseInput("Given x st a(x); Find y,z st b(x,y)")
				.withMinimumVariables());
		assertEquals(parseInput("Given a st forall(na : a(a,na) -> b(na)); Find b st c(b)"),
				parseInput("Given a st forall(na : a(a,na) -> b(na)); Find b st c(b)").withMinimumVariables());
	}
}
