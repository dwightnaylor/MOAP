package display;

import inputHandling.TheoremParser;

import java.awt.*;

import javax.swing.JFrame;

import kernelLanguage.*;

import org.apache.commons.collections15.Transformer;

import solver.*;
import theorems.Fact;
import theorems.MultistageTheorem;
import edu.uci.ics.jung.algorithms.layout.*;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class Viewer {

	public static Graph<ProblemState, MultistageTheorem> generateGraph(ProblemSolver solver) {
		Graph<ProblemState, MultistageTheorem> graph = new DelegateForest<ProblemState, MultistageTheorem>();
		for (ProblemState problemState : solver.reachedProblems.values()) {
			graph.addVertex(problemState);
			if (problemState.rootTheorem != null) {
				graph.addEdge(problemState.rootTheorem.copy(), problemState.parentState, problemState);
			}
		}
		return graph;
	}

	public static void displaySolverResults(ProblemSolver solver) {
		Graph<ProblemState, MultistageTheorem> graph = generateGraph(solver);
		Layout<ProblemState, MultistageTheorem> layout = new CircleLayout<ProblemState, MultistageTheorem>(graph);

		// Figure 3: Changing the way edges and vertices are drawn.
		layout.setSize(new Dimension(300, 300));
		VisualizationViewer<ProblemState, MultistageTheorem> vv = new VisualizationViewer<ProblemState, MultistageTheorem>(
				layout);
		vv.setPreferredSize(new Dimension(350, 350));
		vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<ProblemState>() {
			@Override
			public String transform(ProblemState v) {
				return v.cost + " ::: " + v.toString().replace(";", ":::::");
			}
		});
		vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<MultistageTheorem>() {
			@Override
			public String transform(MultistageTheorem v) {
				return v.description;
			}
		});
		vv.getRenderContext().setVertexFillPaintTransformer(new Transformer<ProblemState, Paint>() {
			public Paint transform(ProblemState problem) {
				if (problem.problem.goal.solved())
					return Color.GREEN;

				return Color.RED;
			}
		});

		vv.setGraphLayout(new TreeLayout<ProblemState, MultistageTheorem>(
				(Forest<ProblemState, MultistageTheorem>) graph));

		// Create a graph mouse and add it to the visualization component
		DefaultModalGraphMouse<ProblemState, MultistageTheorem> gm = new DefaultModalGraphMouse<ProblemState, MultistageTheorem>();
		gm.setMode(DefaultModalGraphMouse.Mode.TRANSFORMING);
		vv.setGraphMouse(gm);
		JFrame frame = new JFrame("Problem");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(vv);
		frame.pack();
		frame.setVisible(true);
	}

	public static Graph<Fact<? extends KProperty>, TheoremWrapper> generateGraph(KProperty initial) {
		Graph<Fact<? extends KProperty>, TheoremWrapper> graph = new DelegateForest<Fact<? extends KProperty>, TheoremWrapper>();
		Chainer chainer = new Chainer(TheoremParser.parseFiles().toArray(new KTheorem[0]));
		chainer.chain(initial, KernelFactory.GIVEN);
		for (Fact<? extends KProperty> fact : chainer.properties.values()) {
			graph.addVertex(fact);
			for (Fact<? extends KProperty> prereq : fact.prerequisites) {
				graph.addEdge(new TheoremWrapper(fact.theorem), prereq, fact);
			}
		}
		return graph;
	}

	public static void displayFactTree(KProperty initial) {
		Graph<Fact<? extends KProperty>, TheoremWrapper> graph = generateGraph(initial);
		Layout<Fact<? extends KProperty>, TheoremWrapper> layout = new CircleLayout<Fact<? extends KProperty>, TheoremWrapper>(
				graph);

		// Figure 3: Changing the way edges and vertices are drawn.
		layout.setSize(new Dimension(300, 300));
		VisualizationViewer<Fact<? extends KProperty>, TheoremWrapper> vv = new VisualizationViewer<Fact<? extends KProperty>, TheoremWrapper>(
				layout);
		vv.setPreferredSize(new Dimension(350, 350));
		vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Fact<? extends KProperty>>() {
			@Override
			public String transform(Fact<? extends KProperty> fact) {
				return fact.property.toString();
			}
		});
		vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<TheoremWrapper>() {
			@Override
			public String transform(TheoremWrapper v) {
				return v.theorem.description;
			}
		});
		vv.getRenderContext().setVertexFillPaintTransformer(new Transformer<Fact<? extends KProperty>, Paint>() {
			public Paint transform(Fact<? extends KProperty> problem) {
				return Color.RED;
			}
		});

		vv.setGraphLayout(new TreeLayout<Fact<? extends KProperty>, TheoremWrapper>(
				(Forest<Fact<? extends KProperty>, TheoremWrapper>) graph));

		// Create a graph mouse and add it to the visualization component
		DefaultModalGraphMouse<ProblemState, MultistageTheorem> gm = new DefaultModalGraphMouse<ProblemState, MultistageTheorem>();
		gm.setMode(DefaultModalGraphMouse.Mode.TRANSFORMING);
		vv.setGraphMouse(gm);
		JFrame frame = new JFrame("Problem");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(vv);
		frame.pack();
		frame.setVisible(true);
	}
}

final class TheoremWrapper {
	KTheorem theorem;

	public TheoremWrapper(KTheorem theorem) {
		this.theorem = theorem;
	}
}