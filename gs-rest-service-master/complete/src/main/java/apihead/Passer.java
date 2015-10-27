package apihead;

import solver.ProblemSolver;


public class Passer {
	private String resp;
	private String req;
	public Passer(String request) {
		this.req = request;
	}
	
	public String getResponse(){
		String[] args = new String[1];
		args[0] = this.req;
		this.resp = ProblemSolver.runWebSolver(args);
		return this.resp;
	}
}