package runtimeAnalysis.BigO;

public class Constant extends Expression {
	public double val;

	public Constant(double v) {
		val = v;
	}
	
	public Constant(int v) {
		val = v;
	}
	
	@Override
	public String toString() {
		if(val%1.0==0)
			return ((int)val)+"";
		else
			return val+"";
		//return (val % 1.0 == 0 ? (int) val : val) + "";
	}
}
