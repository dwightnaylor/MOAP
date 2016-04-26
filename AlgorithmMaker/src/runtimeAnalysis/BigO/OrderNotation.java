package runtimeAnalysis.BigO;

public abstract class OrderNotation {
	public Expression e;
	public abstract boolean evaluate();
	public abstract String printInOrder();
	public String toString(){
		return e.toString();
	}
	
}
