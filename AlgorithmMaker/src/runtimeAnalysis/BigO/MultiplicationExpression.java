package runtimeAnalysis.BigO;

public class MultiplicationExpression extends CompositeExpression {

	public MultiplicationExpression(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		return "(" + getLeft().toString() + "*" + getRight().toString() + ")";
	}
}