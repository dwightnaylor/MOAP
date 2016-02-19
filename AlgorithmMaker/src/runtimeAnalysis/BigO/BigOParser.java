package runtimeAnalysis.BigO;

import algorithmMaker.QuickParser;
import algorithmMaker.input.*;

/**
 * Basic Helper class for parsing in math expressions and converting them to our internal polynomial representation.
 * 
 * @author Dwight Naylor
 */
public class BigOParser {
	public static Expression parseExpression(String string) {
		return convert(QuickParser.parseNumericalProperty(string));
	}

	private static Expression convert(NumericalProperty prop) {
		if (prop instanceof Addition) {
			Addition addition = (Addition) prop;
			Expression lhs = convert(((Addition) prop).getLeft());
			Expression rhs = convert(((Addition) prop).getRight());
			if (addition.getSymbol().equals("+"))
				return new AdditionExpression(lhs, rhs);
			if (addition.getSymbol().equals("-"))
				return new SubtractionExpression(lhs, rhs);

			throw new UnsupportedOperationException();
		} else if (prop instanceof Multiplication) {
			Multiplication multiplication = (Multiplication) prop;
			Expression lhs = convert(((Addition) prop).getLeft());
			Expression rhs = convert(((Addition) prop).getRight());
			if (multiplication.getSymbol().equals("*"))
				return new MultiplicationExpression(lhs, rhs);
			if (multiplication.getSymbol().equals("/"))
				return new DivisionExpression(lhs, rhs);

			throw new UnsupportedOperationException();
		} else if (prop instanceof algorithmMaker.input.Variable) {
			algorithmMaker.input.Variable var = (algorithmMaker.input.Variable) prop;
			return new Variable(var.getArg());
		} else if (prop instanceof Atomic) {
			Atomic atomic = (Atomic) prop;
			String function = atomic.getFunction();
			if (function.equals("log")) {
				return new Logarithm(new Constant(2), convert(atomic.getArgs().get(0)));
			}
			throw new UnsupportedOperationException(
					"Too lazy to add full atomic support. Add the others at your leisure.");
		}
		throw new UnsupportedOperationException("The numerical property \"" + prop.toString() + "\" is of type "
				+ prop.getClass() + ", which this method is not prepared to deal with yet.");
	}
}
