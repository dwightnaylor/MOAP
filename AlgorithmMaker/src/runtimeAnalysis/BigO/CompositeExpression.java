package runtimeAnalysis.BigO;

public abstract class CompositeExpression extends Expression {
	private final Expression l;
	private final Expression r;
	
	public CompositeExpression(Expression left, Expression right) {
		l = left;
		r = right;
	}
	
	public Expression getLeft() {
		return l;
	}
	
	public Expression getRight() {
		return r;
	}
}
