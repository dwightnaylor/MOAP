package inputHandling;

import static algorithmMaker.QuickParser.parseProperty;
import static algorithmMaker.util.InputUtil.BOUND;
import static algorithmMaker.util.InputUtil.EQUAL;
import static algorithmMaker.util.InputUtil.UNBOUND;

import java.util.ArrayList;

import pseudocoders.LineCoder;
import algorithmMaker.util.InputUtil;
import theorems.MultistageTheorem;

public class MultiTheoremParser {

	public static ArrayList<MultistageTheorem> parseFiles() {
		ArrayList<MultistageTheorem> ret = new ArrayList<MultistageTheorem>();
		addBruteForceFindTheorems(ret);
		addSimpleTestingTheorems(ret);
		addDeclarationTheorems(ret);
		return ret;
	}

	private static void addBruteForceFindTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> bruteForces = new ArrayList<String[]>();
		bruteForces.add(new String[] { UNBOUND + "(y) & enumerable(x)", "child(x,y)", "foreach child <y> of <x>" });
		bruteForces.add(new String[] { UNBOUND + "(y) & indexable(x)", "index(x,y)", "foreach index <y> of <x>" });
		for (String[] cur : bruteForces)
			ret.add(new MultistageTheorem(parseProperty(cur[0]), parseProperty(cur[1]), parseProperty(cur[1]), null,
					10, "Brute force.", new LineCoder(true, cur[2])));
	}

	private static void addSimpleTestingTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> tests = new ArrayList<String[]>();
		tests.add(new String[] { BOUND + "(x)", "even(x)", "if <x> % 2 == 0" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)", EQUAL + "(x,y)", "if <x> == <y>" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)&" + BOUND + "(z)", "plus(x,y,z)", "if <x> + <y> == <z>" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)", "lessThanEqual(x,y)", "if <x> <= <y>" });

		tests.add(new String[] { "set(x) & " + BOUND + "(y)", "child(x,y)", "if <x>.contains(<y>)" });
		for (String[] test : tests) {
			ret.add(new MultistageTheorem(parseProperty(test[0]), parseProperty(test[1]), parseProperty(test[1]), null,
					1, "Simple test.", new LineCoder(true, test[2])));
			ret.add(new MultistageTheorem(parseProperty(test[0]), parseProperty("!" + test[1]), parseProperty("!"
					+ test[1]), null, 1, "Simple negated test.", new LineCoder(true, invert(test[2]))));
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
		for (String[] declaration : declarations)
			ret.add(new MultistageTheorem(parseProperty(declaration[0]), parseProperty(declaration[1]),
					parseProperty(declaration[1]), null, 1, "Simple declaration.", new LineCoder(false, declaration[2])));
	}

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
