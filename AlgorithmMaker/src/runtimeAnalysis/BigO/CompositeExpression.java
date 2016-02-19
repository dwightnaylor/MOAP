package runtimeAnalysis.BigO;

public abstract class CompositeExpression extends Expression {
	public Expression l;
	public Expression r;
	
	public CompositeExpression(Expression left, Expression right) {
		l = left;
		r = right;
	}
}
