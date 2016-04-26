package runtimeAnalysis.BigO;

public class Logarithm extends CompositeExpression {

	/**
	 * @param left  -> base
	 * @param right -> num i.e. log_base(num) = log(left, right)
	 */
	public Logarithm(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return "log(" + getLeft().toString() + ", " + getRight().toString() + ")";
	}

}
