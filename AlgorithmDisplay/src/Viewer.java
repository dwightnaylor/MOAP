import inputHandling.TransformUtil;

import java.awt.*;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import solver.ProblemSolver;
import solver.ProblemState;
import theorems.MultistageTheorem;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.Forest;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class Viewer {
	public static void main(String[] args) {
		ProblemSolverView sgv = new ProblemSolverView(
				ProblemSolver
						.runSolver("Given hashset a, hashset b, hashset c, hashset e; Find d st child(a,d) & child(b,d) & !child(c,d) & !child(e,d)"));
		// Layout<V, E>, VisualizationComponent<V,E>
		Layout<ProblemState, MultistageTheorem> layout = new CircleLayout<ProblemState, MultistageTheorem>(sgv.graph);
		// Figure 3: Changing the way edges and vertices are drawn.
		layout.setSize(new Dimension(300, 300));
		VisualizationViewer<ProblemState, MultistageTheorem> vv = new VisualizationViewer<ProblemState, MultistageTheorem>(
				layout);
		vv.setPreferredSize(new Dimension(350, 350));
		vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<ProblemState>() {
			@Override
			public String transform(ProblemState v) {
				return v.toString().replace(";", ":::::");
			}
		});
		vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<MultistageTheorem>() {
			@Override
			public String transform(MultistageTheorem v) {
				return v.getDescription();
			}
		});
		vv.getRenderContext().setVertexFillPaintTransformer(new Transformer<ProblemState, Paint>() {
			public Paint transform(ProblemState problem) {
				if (TransformUtil.isSolved(problem.problem.getGoal()))
					return Color.GREEN;

				return Color.RED;
			}
		});

		vv.setGraphLayout(new TreeLayout<ProblemState, MultistageTheorem>(
				(Forest<ProblemState, MultistageTheorem>) sgv.graph));

		// Create a graph mouse and add it to the visualization component
		DefaultModalGraphMouse<ProblemState, MultistageTheorem> gm = new DefaultModalGraphMouse<ProblemState, MultistageTheorem>();
		gm.setMode(DefaultModalGraphMouse.Mode.TRANSFORMING);
		vv.setGraphMouse(gm);
		JFrame frame = new JFrame("Interactive Graph View 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(vv);
		frame.pack();
		frame.setVisible(true);
	}
}
