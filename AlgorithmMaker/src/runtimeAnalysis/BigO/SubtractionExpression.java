package runtimeAnalysis.BigO;

public class SubtractionExpression extends CompositeExpression {

	public SubtractionExpression(Expression left, Expression right) {
		super(left, right);
	}
	
	

	@Override
	public String toString() {
		return "(" + getLeft().toString() + " - " + getRight().toString() + ")";
	}
}
