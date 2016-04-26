package runtimeAnalysis.BigO;

public class Power extends CompositeExpression{

	public Power(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		return getLeft().toString() + "^(" + getRight().toString() + ")";
	}
}
