package inputHandling;

import static kernelLanguage.KernelFactory.*;
import static algorithmMaker.util.KernelUtil.parseProperty;

import java.util.ArrayList;

import algorithmMaker.util.*;
import kernelLanguage.KProperty;
import pseudocoders.LineCoder;
import theorems.MultistageTheorem;

public class MultiTheoremParser {

	public static ArrayList<MultistageTheorem> getMultiTheorems() {
		ArrayList<MultistageTheorem> ret = new ArrayList<MultistageTheorem>();
		addBruteForceFindTheorems(ret);
		addSimpleTestingTheorems(ret);
		addDeclarationTheorems(ret);
		addHardcodedAlgorithms(ret);
		return ret;
	}

	private static void addHardcodedAlgorithms(ArrayList<MultistageTheorem> ret) {
		ret.add(new MultistageTheorem(pc("type_undirected_graph(g)"),
				pc("exists(p : type_path(p) & contains(g,p) & cycle(p))"),
				pc("exists(p : type_path(p) & contains(g,p) & cycle(p))"), null, r -> /* O(numVerts(g)) */10 * r[0],
				"Hard coded solution for cycle in an undirected list",
				new LineCoder("<na> = new HashSet()", "bool <b> = false", "for each vertex <v> in <g>:",
						">if !<na>.contains(<v>)", ">>for each node <v1> in a BFS from <v>",
						">>>if <na>.contains(<v1>)", ">>>><b> = true", ">>><na>.add(<v1>)", "if <b> == true",
						">" + LineCoder.EXIT_STRING + "0")));
	}

	/**
	 * Lazy helper method. Parse and canonicalize.
	 */
	private static KProperty pc(String string) {
		return (KProperty) KernelUtil.canonicalizeOrder(parseProperty(string));
	}

	private static void addBruteForceFindTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> bruteForces = new ArrayList<String[]>();
		bruteForces.add(new String[] { UNBOUND + "(y) & enumerable(x)", "child(x,y)", "foreach child <y> of <x>" });
		bruteForces.add(new String[] { UNBOUND + "(y) & indexable(x)", "index(x,y)", "foreach index <y> of <x>" });
		for (String[] cur : bruteForces)
			ret.add(new MultistageTheorem(pc(cur[0]), pc(cur[1]), pc(cur[1]), null, r -> /* O(len(x)) */10 * r[0],
					"Brute force.", new LineCoder(cur[2], ">" + LineCoder.EXIT_STRING + "0")));
	}

	private static void addSimpleTestingTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> tests = new ArrayList<String[]>();
		tests.add(new String[] { BOUND + "(x)", "even(x)", "if <x> % 2 == 0" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)", EQUAL + "(x,y)", "if <x> == <y>" });
		tests.add(
				new String[] { BOUND + "(x)&" + BOUND + "(y)&" + BOUND + "(z)", "plus(x,y,z)", "if <x> + <y> == <z>" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)", "lessThanEqual(x,y)", "if <x> <= <y>" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)", "greaterThanEqual(x,y)", "if <x> >= <y>" });

		tests.add(new String[] { TYPE_MARKER + "hashset(x) & " + BOUND + "(y)", "child(x,y)", "if <x>.contains(<y>)" });
		for (String[] test : tests) {
			ret.add(new MultistageTheorem(pc(test[0]), pc(test[1]), pc(test[1]), null, r -> 1 + r[0], "Simple test.",
					new LineCoder(test[2], ">" + LineCoder.EXIT_STRING + "0")));
			ret.add(new MultistageTheorem(pc(test[0]), pc("!" + test[1]), pc("!" + test[1]), null, r -> 1 + r[0],
					"Simple negated test.", new LineCoder(invert(test[2]), ">" + LineCoder.EXIT_STRING + "0")));
		}
	}

	private static void addDeclarationTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> declarations = new ArrayList<String[]>();
		declarations.add(new String[] { BOUND + "(x) & " + BOUND + "(i) & " + UNBOUND + "(xi)",
				BOUND + "(xi) & get(x,i,xi)", "<xi> = <x>[<i>]" });
		declarations.add(new String[] { BOUND + "(a) & " + BOUND + "(b) & " + UNBOUND + "(apb)",
				BOUND + "(apb) & " + InputUtil.ADDITION + "(a,b,apb)", "<apb> = <a> + <b>" });
		declarations.add(new String[] { BOUND + "(a) & " + BOUND + "(b) & " + UNBOUND + "(apb)",
				BOUND + "(apb) & " + InputUtil.SUBTRACTION + "(a,b,apb)", "<apb> = <a> - <b>" });
		declarations.add(new String[] { BOUND + "(a) & " + BOUND + "(b) & " + UNBOUND + "(apb)",
				BOUND + "(apb) & " + InputUtil.MULTIPLICATION + "(a,b,apb)", "<apb> = <a> * <b>" });
		declarations.add(new String[] { BOUND + "(a) & " + BOUND + "(b) & " + UNBOUND + "(apb)",
				BOUND + "(apb) & " + InputUtil.DIVISION + "(a,b,apb)", "<apb> = <a> / <b>" });
		declarations
				.add(new String[] {
						BOUND + "(a) & " + BOUND + "(b) & " + UNBOUND + "(dab) & " + TYPE_MARKER + "point(a) & "
								+ TYPE_MARKER + "point(b)",
						BOUND + "(dab) & distance(a,b,dab)", "<dab> = distance(<a>,<b>)" });

		declarations.add(new String[] { BOUND + "(x) & type_priorityqueue(x)" + UNBOUND + "(y)",
				"child(x,y) & forall(z : child(x,z) -> lessThanEqual(y,z))", "<y> = <x>.poll()" });

		for (String[] declaration : declarations)
			ret.add(new MultistageTheorem(pc(declaration[0]), pc(declaration[1]), pc(declaration[1]), null,
					r -> 1 + r[0], "Simple declaration.", new LineCoder(declaration[2], LineCoder.EXIT_STRING + "0")));
	}

	// private static void addComplexDeclarationTheorems(ArrayList<MultistageTheorem> ret) {
	// ArrayList<String[]> declarations = new ArrayList<String[]>();
	// declarations.add(
	// new String[] { BOUND + "(x)" + TYPE_MARKER + "collection(x) & ", UNBOUND + "(nx)" + UNBOUND + "(nv)",
	// BOUND + "(nx) & " + TYPE_MARKER + "hashset(nx) & forall(nv : child(x,nv) -> child(nx,nv))",
	// "<xi> = <x>[<i>]" });
	//
	// for (String[] declaration : declarations)
	// ret.add(new MultistageTheorem(pc(declaration[0]), pc(declaration[1]),
	// pc(declaration[2]), null, 10, "Declare a hashset for later use with child()",
	// new LineCoder(false, declaration[3])));
	//
	// }

	private static String invert(String compare) {
		String[][] pairs = { { " == ", " != " }, { " < ", " >= " }, { " > ", " <= " } };
		for (String[] pair : pairs) {
			if (compare.contains(pair[0]))
				return compare.replace(pair[0], pair[1]);
			if (compare.contains(pair[1]))
				return compare.replace(pair[1], pair[0]);
		}
		return compare.replace("if ", "if !");
	}
}
