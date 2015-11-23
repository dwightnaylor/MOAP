import solver.ProblemSolver;
import solver.ProblemState;
import theorems.MultistageTheorem;
import theorems.multiTheorems.DirectReturn;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.graph.Graph;

public class ProblemSolverView {
	Graph<ProblemState, MultistageTheorem> graph;

	public ProblemSolverView(ProblemSolver solver) {
		graph = new DelegateForest<ProblemState, MultistageTheorem>();
		for (ProblemState problemState : solver.reachedProblems.values()) {
			if (!(problemState.rootTheorem instanceof DirectReturn)) {
				graph.addVertex(problemState);
				if (problemState.rootTheorem != null) {
					graph.addEdge(problemState.rootTheorem.copy(), problemState.parentState, problemState);
				}
			}
		}
		// Graph<Integer, String> g2 = new SparseMultigraph<Integer, String>();
		// g2.addVertex((Integer) 1);
		// g2.addVertex((Integer) 2);
		// g2.addVertex((Integer) 3);
		// g2.addEdge("Rhymes", 1, 3);
		// g2.addEdge("Edge-B", 2, 3, EdgeType.DIRECTED);
		// g2.addEdge("Edge-C", 3, 2, EdgeType.DIRECTED);
	}
}
