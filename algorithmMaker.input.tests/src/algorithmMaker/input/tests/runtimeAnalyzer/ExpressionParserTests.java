package algorithmMaker.input.tests.runtimeAnalyzer;

import static org.junit.Assert.*;
import static runtimeAnalysis.BigO.BigOParser.parse;

import java.util.ArrayList;

import org.junit.Test;

import runtimeAnalysis.BigO.*;

public class ExpressionParserTests {
	Expression var1 = new Variable("n");
	Expression var2 = new Variable("m");
	Expression int1 = new Constant(1);
	Expression int2 = new Constant(2);
	Expression doub1 = new Constant(1.0);
	Expression doub2 = new Constant(2.5);

	@Test
	public void testExpressionToStrings() {
		// 1) use assertequals
		// 2) think about making factory class
		// 3) rename test methods (toString() here)
		// 4) convert all tests to be a part of this list
		ArrayList<String> tests = new ArrayList<String>();
//		tests.add("1");
//		tests.add("2.5");
		tests.add("n");
		tests.add("m");
		tests.add("n + m");

		for (String test : tests) {
			if (!parse(test).equals(test)) {
				System.err.println(test);
				System.err.println("Should have parsed to");
				System.err.println(test);
				System.err.println("But it instead parsed to:");
				System.err.println(parse(test));
			}
			assertEquals(parse(test).toString(), test);
		}
	}

	@Test
	public void testVariableExpressions() {
		assertTrue("Variable failed to assert: " + var1.toString() + " = n", var1.toString().equals("n"));
		assertTrue("Variable failed to assert: " + var2.toString() + " = m", var2.toString().equals("m"));
	}

	@Test
	public void testSimpleAdditionExpressions() {
		Expression addExp1 = new AdditionExpression(var1, var2);
		Expression addExp2 = new AdditionExpression(int1, int2);
		Expression addExp3 = new AdditionExpression(doub1, doub2);
		Expression addExp4 = new AdditionExpression(var1, int1);
		Expression addExp5 = new AdditionExpression(int1, doub1);
		Expression addExp6 = new AdditionExpression(doub2, var2);
		assertTrue("Addition failed to assert: " + addExp1.toString() + " = (n + m)",
				addExp1.toString().equals("(n + m)"));
		assertTrue("Addition failed to assert: " + addExp2.toString() + " = (1 + 2)",
				addExp2.toString().equals("(1 + 2)"));
		assertTrue("Addition failed to assert: " + addExp3.toString() + " = (1 + 2.5)",
				addExp3.toString().equals("(1 + 2.5)"));
		assertTrue("Addition failed to assert: " + addExp4.toString() + " = (n + 1)",
				addExp4.toString().equals("(n + 1)"));
		assertTrue("Addition failed to assert: " + addExp5.toString() + " = (1 + 1)",
				addExp5.toString().equals("(1 + 1)"));
		assertTrue("Addition failed to assert: " + addExp6.toString() + " = (2.5 + m)",
				addExp6.toString().equals("(2.5 + m)"));
	}

	@Test
	public void testSimpleSubtractionExpressions() {
		Expression subExp1 = new SubtractionExpression(var1, var2);
		Expression subExp2 = new SubtractionExpression(int1, int2);
		Expression subExp3 = new SubtractionExpression(doub1, doub2);
		Expression subExp4 = new SubtractionExpression(var1, int1);
		Expression subExp5 = new SubtractionExpression(int1, doub1);
		Expression subExp6 = new SubtractionExpression(doub2, var2);
		assertTrue("Subtraction failed to assert: " + subExp1.toString() + " = (n - m)",
				subExp1.toString().equals("(n - m)"));
		assertTrue("Subtraction failed to assert: " + subExp2.toString() + " = (1 - 2)",
				subExp2.toString().equals("(1 - 2)"));
		assertTrue("Subtraction failed to assert: " + subExp3.toString() + " = (1 - 2.5)",
				subExp3.toString().equals("(1 - 2.5)"));
		assertTrue("Subtraction failed to assert: " + subExp4.toString() + " = (n - 1)",
				subExp4.toString().equals("(n - 1)"));
		assertTrue("Subtraction failed to assert: " + subExp5.toString() + " = (1 - 1)",
				subExp5.toString().equals("(1 - 1)"));
		assertTrue("Subtraction failed to assert: " + subExp6.toString() + " = (2.5 - m)",
				subExp6.toString().equals("(2.5 - m)"));
	}

	@Test
	public void testSimpleMultiplicationExpressions() {
		Expression multExp1 = new MultiplicationExpression(var1, var2);
		Expression multExp2 = new MultiplicationExpression(int1, int2);
		Expression multExp3 = new MultiplicationExpression(doub1, doub2);
		Expression multExp4 = new MultiplicationExpression(var1, int1);
		Expression multExp5 = new MultiplicationExpression(int1, doub1);
		Expression multExp6 = new MultiplicationExpression(doub2, var2);
		assertTrue("Multiplication failed to assert: " + multExp1.toString() + " = (n*m)",
				multExp1.toString().equals("(n*m)"));
		assertTrue("Multiplication failed to assert: " + multExp2.toString() + " = (1*2)",
				multExp2.toString().equals("(1*2)"));
		assertTrue("Multiplication failed to assert: " + multExp3.toString() + " = (1*2.5)",
				multExp3.toString().equals("(1*2.5)"));
		assertTrue("Multiplication failed to assert: " + multExp4.toString() + " = (n*1)",
				multExp4.toString().equals("(n*1)"));
		assertTrue("Multiplication failed to assert: " + multExp5.toString() + " = (1*1)",
				multExp5.toString().equals("(1*1)"));
		assertTrue("Multiplication failed to assert: " + multExp6.toString() + " = (2.5*m)",
				multExp6.toString().equals("(2.5*m)"));
	}

	@Test
	public void testSimpleDivisionExpressions() {
		Expression divExp1 = new DivisionExpression(var1, var2);
		Expression divExp2 = new DivisionExpression(int1, int2);
		Expression divExp3 = new DivisionExpression(doub1, doub2);
		Expression divExp4 = new DivisionExpression(var1, int1);
		Expression divExp5 = new DivisionExpression(int1, doub1);
		Expression divExp6 = new DivisionExpression(doub2, var2);
		assertTrue("Division failed to assert: " + divExp1.toString() + " = (n/m)", divExp1.toString().equals("(n/m)"));
		assertTrue("Division failed to assert: " + divExp2.toString() + " = (1/2)", divExp2.toString().equals("(1/2)"));
		assertTrue("Division failed to assert: " + divExp3.toString() + " = (1/2.5)",
				divExp3.toString().equals("(1/2.5)"));
		assertTrue("Division failed to assert: " + divExp4.toString() + " = (n/1)", divExp4.toString().equals("(n/1)"));
		assertTrue("Division failed to assert: " + divExp5.toString() + " = (1/1)", divExp5.toString().equals("(1/1)"));
		assertTrue("Division failed to assert: " + divExp6.toString() + " = (2.5/m)",
				divExp6.toString().equals("(2.5/m)"));
	}

}
