package runtimeAnalysis.BigO;

public class Variable extends Expression{
	public String var;
	
	public Variable(String v) {
		var = v;
	}
	
	@Override
	public String toString() {
		return var;
	}
}
