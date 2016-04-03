package display;

import java.awt.*;
import java.awt.geom.*;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.layout.*;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import inputHandling.TheoremParser;
import kernelLanguage.*;
import solver.*;
import theorems.Fact;

public class Viewer {

	private static Hashtable<Object, ProblemNode> problemNodes = new Hashtable<Object, ProblemNode>();

	public static Graph<ProblemNode, ProblemEdge> generateGraph(ProblemSolver solver, boolean solutionOnly) {
		Graph<ProblemNode, ProblemEdge> graph = new DelegateForest<ProblemNode, ProblemEdge>();
		addToGraph(graph, solver.initialProblem, solutionOnly);
		return graph;
	}

	private static void addToGraph(Graph<ProblemNode, ProblemEdge> graph, ProblemGroup group, boolean solutionOnly) {
		if (group.childStates.size() == 1)
			addToGraph(graph, group.childStates.get(0), solutionOnly);
		else {
			problemNodes.put(group, new ProblemNode(group));
			graph.addVertex(problemNodes.get(group));
			graph.addEdge(new ProblemEdge(group.rootTheorem), problemNodes.get(group.parentState),
					problemNodes.get(group));
			for (ProblemState state : group.childStates)
				addToGraph(graph, state, solutionOnly);
		}
	}

	private static void addToGraph(Graph<ProblemNode, ProblemEdge> graph, ProblemState state, boolean solutionOnly) {
		problemNodes.put(state, new ProblemNode(state));
		graph.addVertex(problemNodes.get(state));
		if (problemNodes.containsKey(state.parentGroup))
			graph.addEdge(new ProblemEdge(state.parentGroup.rootTheorem), problemNodes.get(state.parentGroup),
					problemNodes.get(state));
		else if (state.parentGroup.parentState != null)
			graph.addEdge(new ProblemEdge(state.parentGroup.rootTheorem),
					problemNodes.get(state.parentGroup.parentState), problemNodes.get(state));

		List<ProblemGroup> childGroups = state.childGroups;
		for (int i = 0; i < childGroups.size(); i++) {
			ProblemGroup group = childGroups.get(i);
			if (i == state.solutionIndex || !solutionOnly)
				addToGraph(graph, group, solutionOnly);
		}
	}

	public static void displaySolverResults(ProblemSolver solver, boolean solutionOnly) {
		Graph<ProblemNode, ProblemEdge> graph = generateGraph(solver, solutionOnly);
		Layout<ProblemNode, ProblemEdge> layout = new CircleLayout<ProblemNode, ProblemEdge>(graph);

		// Figure 3: Changing the way edges and vertices are drawn.
		layout.setSize(new Dimension(300, 300));
		VisualizationViewer<ProblemNode, ProblemEdge> vv = new VisualizationViewer<ProblemNode, ProblemEdge>(layout);
		vv.setPreferredSize(new Dimension(350, 350));
		vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<ProblemNode>() {
			@Override
			public String transform(ProblemNode v) {
				return v.getDisplayString();
			}
		});
		vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<ProblemEdge>() {
			@Override
			public String transform(ProblemEdge v) {
				return "";
			}
		});
		vv.getRenderContext().setEdgeDrawPaintTransformer(new Transformer<ProblemEdge, Paint>() {
			@Override
			public Paint transform(ProblemEdge edge) {
				return Color.DARK_GRAY;
			}
		});
		vv.getRenderContext().setVertexShapeTransformer(new Transformer<ProblemNode, Shape>() {
			@Override
			public Shape transform(ProblemNode node) {
				if (node.contents instanceof ProblemGroup) {
					AffineTransform at = new AffineTransform();
					at.rotate(Math.PI / 4.0);
					GeneralPath diamond = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
					diamond.append(new Rectangle2D.Double(-10, -10, 20, 20), true);
					diamond.transform(at);
					return diamond;
				}
				return new Ellipse2D.Double(-10, -10, 20, 20);
			}
		});
		vv.getRenderContext().setVertexFillPaintTransformer(new Transformer<ProblemNode, Paint>() {
			public Paint transform(ProblemNode problem) {
				if (problem.contents instanceof ProblemGroup)
					return Color.black;

				if (problem.contents instanceof ProblemState) {
					ProblemState state = (ProblemState) problem.contents;
					if (state.problem.goal.solved())
						return Color.GREEN;

					if (state.solutionIndex != -1)
						return Color.yellow;
				}

				return Color.RED;
			}
		});

		vv.setGraphLayout(new TreeLayout<ProblemNode, ProblemEdge>((Forest<ProblemNode, ProblemEdge>) graph));

		// Create a graph mouse and add it to the visualization component
		DefaultModalGraphMouse<ProblemNode, ProblemEdge> gm = new DefaultModalGraphMouse<ProblemNode, ProblemEdge>();
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
		Chainer chainer = new Chainer(TheoremParser.parseFiles().toArray(new Fact[0]));
		chainer.chain(initial);
		for (Fact<? extends KProperty> fact : chainer.properties.values()) {
			graph.addVertex(fact);
			for (Fact<? extends KProperty> prereq : fact.prerequisites) {
				graph.addEdge(new TheoremWrapper(fact), prereq, fact);
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
		DefaultModalGraphMouse<ProblemNode, ProblemEdge> gm = new DefaultModalGraphMouse<ProblemNode, ProblemEdge>();
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
	Fact<?> theorem;

	public TheoremWrapper(Fact<?> theorem) {
		this.theorem = theorem;
	}
}
