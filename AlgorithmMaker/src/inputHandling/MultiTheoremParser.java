package inputHandling;

import static algorithmMaker.QuickParser.parseProperty;
import static algorithmMaker.util.InputUtil.BOUND;
import static algorithmMaker.util.InputUtil.EQUAL;
import static algorithmMaker.util.InputUtil.FIND;
import static algorithmMaker.util.InputUtil.TEST;
import static algorithmMaker.util.InputUtil.UNBOUND;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import theorems.MultistageTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.input.Property;

public class MultiTheoremParser {
	private static String[] inputFiles = { "multitheorems" };

	public static ArrayList<MultistageTheorem> parseFiles() {
		ArrayList<MultistageTheorem> ret = new ArrayList<MultistageTheorem>();
		try {
			for (String fileName : inputFiles) {
				BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
				String line;
				while ((line = br.readLine()) != null) {
					if (line.startsWith("//"))
						continue;

					String[] properties = line.split(";");
					Property givenReq = QuickParser.parseProperty(properties[0]);
					Property goalReq = QuickParser.parseProperty(properties[1]);
					Property givenResult = properties[2].trim().length() == 0 ? null
							: QuickParser.parseProperty(properties[2]);
					Property goalResult = properties[3].trim().length() == 0 ? null
							: QuickParser.parseProperty(properties[3]);
					int cost = Integer.parseInt(properties[4].trim());
					String description = properties[5].substring(properties[5].indexOf('"') + 1,
							properties[5].lastIndexOf('"'));
					String pseudocode = properties[6].substring(properties[6].indexOf('"') + 1,
							properties[6].lastIndexOf('"'));

					ret.add(new MultistageTheorem(givenReq, goalReq, givenResult, goalResult, cost, description,
							pseudocode));
				}

				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		addBruteForceFindTheorems(ret);
		addBruteForceTestTheorems(ret);
		addSimpleTestingTheorems(ret);
		return ret;
	}

	private static void addBruteForceFindTheorems(ArrayList<MultistageTheorem> ret) {
		MultistageTheorem bruteForce = new MultistageTheorem(parseProperty(UNBOUND + "(y) & enumerable(x)"),
				parseProperty("child(x,y)"), parseProperty("child(x,y)"), null, 10, "Brute force.",
				"foreach child <y> of <x>");
		bruteForce.requireGoalTask(FIND);
		bruteForce.setNewGoalTask(TEST);
		ret.add(bruteForce);
	}

	private static void addBruteForceTestTheorems(ArrayList<MultistageTheorem> ret) {
		ArrayList<String[]> bruteForces = new ArrayList<String[]>();
		bruteForces.add(new String[] { "enumerable(x)", "child(x,y)", BOUND + "(ny) & child(x,ny)", EQUAL + "(y,ny)",
				"foreach child <ny> of <x>" });
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
		tests.add(
				new String[] { BOUND + "(x)&" + BOUND + "(y)&" + BOUND + "(z)", "plus(x,y,z)", "if <x> + <y> == <z>" });
		tests.add(new String[] { BOUND + "(x)&" + BOUND + "(y)", "lessThanEqual(x,y)", "if <x> <= <y>" });
		for (String[] test : tests) {
			MultistageTheorem testing = new MultistageTheorem(parseProperty(test[0]), parseProperty(test[1]),
					parseProperty(test[1]), null, 1, "Simple test.", test[2]);
			testing.requireGoalTask(TEST);
			ret.add(testing);
			MultistageTheorem negatedTesting = new MultistageTheorem(parseProperty(test[0]),
					parseProperty("!" + test[1]), parseProperty("!" + test[1]), null, 1, "Simple negated test.",
					invert(test[2]));
			negatedTesting.requireGoalTask(TEST);
			ret.add(negatedTesting);
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
