package runtimeAnalysis.BigO;

public class DivisionExpression extends CompositeExpression{

	public DivisionExpression(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String toString() {
		return "(" + getLeft().toString() + "/" + getRight().toString() + ")";
	}
}
