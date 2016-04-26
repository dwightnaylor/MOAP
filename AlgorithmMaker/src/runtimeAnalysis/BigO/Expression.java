package runtimeAnalysis.BigO;

public abstract class Expression  implements Comparable<Expression>{
	public int priority;
	
	@Override
	public abstract String toString();
		
	/**
	 * @param e: expression to compare
	 * @return: true if equal and false otherwise
	 * 
	 * TODO: simplify expression because this only compares the strings
	 */
	@Override
	public boolean equals(Object e) {
		if(!(e instanceof Expression))
			return false;
		
		return toString().equals(e.toString());
	}
	
	@Override
	public int compareTo(Expression arg0) {
		// instanceof
		// TODO Auto-generated method stub
		return 0;
	}
}
