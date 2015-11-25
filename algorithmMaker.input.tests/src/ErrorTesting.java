import static org.junit.Assert.*;

import org.junit.Test;

import algorithmMaker.QuickParser;

public class ErrorTesting {
	@Test
	public void testBasicErrors() {
		assertEquals(null, QuickParser.parseInput("Given x, Find y st a(y)"));
		assertEquals(null, QuickParser.parseInput("given x; Find y st a(y)"));
	}

	@Test
	public void testMultipleVariableDeclarationError() {
		assertEquals(null, QuickParser.parseInput("Given x,x; Find y st a(y)"));
	}

	@Test
	public void testGivenGoalCrossDeclarationError() {
		assertEquals(null, QuickParser.parseInput("Given x; Find x st a(x)"));
	}

	@Test
	public void testUndeclaredError() {
		assertEquals(null, QuickParser.parseInput("Given x; Find y st a(z)"));
		assertNotEquals(null, QuickParser.parseInput("Given x; Test a(x)"));
		assertNotEquals(null, QuickParser.parseInput("Given x; Test forall(y st a(y) : b(y))"));
	}

	@Test
	public void testIllegalNesting() {
		assertEquals(null, QuickParser.parseInput("Given x; Find y st a(b(z))"));
	}
}
