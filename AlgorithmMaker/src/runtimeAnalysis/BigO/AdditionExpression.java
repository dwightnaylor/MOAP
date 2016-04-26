package runtimeAnalysis.BigO;

public class AdditionExpression extends CompositeExpression {

	public AdditionExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return "(" + getLeft().toString() + " + " + getRight().toString() + ")";
	}
}
