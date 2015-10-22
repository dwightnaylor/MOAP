package apihead;


public class Passer {
	private String resp;
	private String req;
	public Passer(String request) {
		this.req = request;
	}
	
	public String getResponse(){
		//this.resp = ProblemSolver.solveProblem(this.req);
		return this.resp;
	}
}