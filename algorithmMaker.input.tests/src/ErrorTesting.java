import static org.junit.Assert.*;

import org.junit.*;

import algorithmMaker.QuickParser;

public class ErrorTesting {
	@Before
	public void turnOffErrorMessages() {
		QuickParser.printParsingErrors = false;
	}

	@After
	public void turnOnErrorMessages() {
		QuickParser.printParsingErrors = true;
	}

	@Test
	public void testBasicErrors() {
		assertEquals(null, QuickParser.parseInput("Given x, Find y st a(y)", false));
		assertEquals(null, QuickParser.parseInput("given x; Find y st a(y)", false));
	}

	@Test
	public void testMultipleVariableDeclarationError() {
		assertEquals(null, QuickParser.parseInput("Given x,x; Find y st a(y)", false));
	}

	@Test
	public void testGivenGoalCrossDeclarationError() {
		assertEquals(null, QuickParser.parseInput("Given x; Find x st a(x)", false));
	}

	@Test
	public void testUndeclaredError() {
		assertEquals(null, QuickParser.parseInput("Given x; Find y st a(z)", false));
		assertNotEquals(null, QuickParser.parseInput("Given x; Find a(x)", false));
		assertNotEquals(null, QuickParser.parseInput("Given x; Find forall(y : a(y) -> b(y))", false));
	}

	@Test
	public void testIllegalNesting() {
		assertEquals(null, QuickParser.parseInput("Given x; Find y st a(b(z))", false));
	}
}
