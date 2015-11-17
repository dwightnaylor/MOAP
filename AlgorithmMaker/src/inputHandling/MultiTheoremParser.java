package inputHandling;

import static algorithmMaker.QuickParser.parseProperty;
import static algorithmMaker.util.InputUtil.BOUND;
import static algorithmMaker.util.InputUtil.EQUAL;
import static algorithmMaker.util.InputUtil.TEST;
import static algorithmMaker.util.InputUtil.UNBOUND;

import java.util.ArrayList;

import theorems.MultistageTheorem;

public class MultiTheoremParser {

	public static ArrayList<MultistageTheorem> parseFiles() {
		ArrayList<MultistageTheorem> ret = new ArrayList<MultistageTheorem>();
		addBruteForceFindTheorems(ret);
		addBruteForceTestTheorems(ret);
		addSimpleTestingTheorems(ret);
		addDeclarationTheorems(ret);
		return ret;
	}

	private static void addBruteForceFindTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> bruteForces = new ArrayList<String[]>();
		bruteForces.add(new String[] { UNBOUND + "(y) & enumerable(x)", "child(x,y)", "child(x,y)",
				"foreach child <y> of <x>" });
		bruteForces.add(new String[] { UNBOUND + "(y) & indexable(x)", "index(x,y)", "index(x,y)",
				"foreach index <y> of <x>" });
		for (String[] cur : bruteForces) {
			MultistageTheorem bruteForce = new MultistageTheorem(parseProperty(cur[0]), parseProperty(cur[1]),
					parseProperty(cur[2]), null, 10, "Brute force.", cur[3]);
			bruteForce.setNewGoalTask(TEST);
			ret.add(bruteForce);
		}
	}

	private static void addBruteForceTestTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> bruteForces = new ArrayList<String[]>();
		bruteForces.add(new String[] { "enumerable(x)", "child(x,y)", BOUND + "(ny) & child(x,ny)", EQUAL + "(y,ny)",
				"foreach child <ny> of <x>" });
		bruteForces.add(new String[] { "indexable(x)", "index(x,y)", BOUND + "(ny) & index(x,ny)", EQUAL + "(y,ny)",
				"foreach index <ny> of <x>" });
		for (String[] cur : bruteForces) {
			MultistageTheorem bruteForce = new MultistageTheorem(parseProperty(cur[0]), parseProperty(cur[1]),
					parseProperty(cur[2]), parseProperty(cur[3]), 10, "Brute force.", cur[4]);
			bruteForce.requireGoalTask(TEST);
			ret.add(bruteForce);
		}
	}

	private static void addSimpleTestingTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> tests = new ArrayList<String[]>();
		tests.add(new String[] { BOUND + "(x)", "even(x)", "if <x> % 2 == 0" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)", EQUAL + "(x,y)", "if <x> == <y>" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)&" + BOUND + "(z)", "plus(x,y,z)", "if <x> + <y> == <z>" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)", "lessThanEqual(x,y)", "if <x> <= <y>" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(i) & " + BOUND + "(xi)", "get(x,i,xi)",
				"if <x>.get(<i>) == <xi>" });
		for (String[] test : tests) {
			MultistageTheorem testing = new MultistageTheorem(parseProperty(test[0]), parseProperty(test[1]),
					parseProperty(test[1]), null, 1, "Simple test.", test[2]);
			testing.requireGoalTask(TEST);
			ret.add(testing);
			MultistageTheorem negatedTesting = new MultistageTheorem(parseProperty(test[0]), parseProperty("!"
					+ test[1]), parseProperty("!" + test[1]), null, 1, "Simple negated test.", invert(test[2]));
			negatedTesting.requireGoalTask(TEST);
			ret.add(negatedTesting);
		}
	}

	private static void addDeclarationTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> declarations = new ArrayList<String[]>();
		declarations.add(new String[] { BOUND + "(x)&" + BOUND + "(i) & " + UNBOUND + "(xi)", "get(x,i,xi)",
				BOUND + "(xi) & get(x,i,xi)", "<xi> = <x>.get(<i>)" });
		declarations.add(new String[] { BOUND + "(a)&" + BOUND + "(b) & " + UNBOUND + "(apb)", "plus(a,b,apb)",
				BOUND + "(apb) & plus(a,b,apb)", "<apb> = <a> + <b>" });
		for (String[] declaration : declarations) {
			MultistageTheorem declare = new MultistageTheorem(parseProperty(declaration[0]),
					parseProperty(declaration[1]), parseProperty(declaration[2]), null, 1, "Simple declaration.",
					declaration[3]);
			ret.add(declare);
		}
	}

	private static String invert(String compare) {
		String[][] pairs = { { " == ", " != " }, { " < ", " >= " }, { " > ", " <= " } };
		for (String[] pair : pairs) {
			if (compare.contains(pair[0]))
				return compare.replace(pair[0], pair[1]);
			if (compare.contains(pair[1]))
				return compare.replace(pair[1], pair[0]);
		}
		return "NEGATED(" + compare + ")";
	}
}
