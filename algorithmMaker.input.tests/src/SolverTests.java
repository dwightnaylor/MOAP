import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;
import static org.junit.Assert.*;
import static solver.ProblemSolver.getSubProblemForQuantifier;

import java.io.*;
import java.util.ArrayList;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.util.SugarUtil;
import kernelLanguage.*;
import solver.*;
import theorems.MultistageTheorem;

public class SolverTests {
	/**
	 * We want to test if the solver can realize that if child(a,x)->child(b,x), then finding a child of a is as good as
	 * finding a child of b.
	 */
	@Test
	public void testUsageOfGivenTheoremsInGoalChaining() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("foo(x,z)"),
				parseProperty("bar(x,z)"), parseProperty("bar(x,z)"), null, r -> 0, "foo implies bar", null);
		ProblemSolver solver = new ProblemSolver(
				parseInput("Given x,y,z st foo(x,z) & forall(q : bar(x,q) -> bar(y,q)); Find bar(y,z)"),
				multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given x,y,z st foo(x,z) & bar(x,z) & forall(q : bar(x,q) -> bar(y,q));"),
				solver.problemStates.peek().problem);
	}

	@Test
	public void testProblemStateChange() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("enumerable(x)"),
				parseProperty("child(x,y)"), parseProperty("child(x,y)"), null, r -> 0, "enumerable things", null);
		ProblemSolver solver = new ProblemSolver(
				parseInput("Given x st enumerable(x); Find y st child(x,y) & something(x)"), multistageTheorem);
		solver.branch();
		assertTrue("Basic multitheorems can generate a single new problem state.", solver.problemStates.size() == 1);
	}

	@Test
	public void testProblemResolution() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x,y)"),
				parseProperty("b(x,y)"), null, r -> 0, "test", null);
		ProblemSolver solver = new ProblemSolver(parseInput("Given x st a(x); Find y st b(x,y)"), multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given x,y st a(x) & b(x,y);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testSimpleContainmentCheck() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(
				parseProperty(TYPE_MARKER + "hashset(x) & " + BOUND + "(y)"), parseProperty("childFAKE(x,y)"),
				parseProperty("childFAKE(x,y)"), null, r -> 0, "test", null);
		ProblemSolver solver = new ProblemSolver(parseInput("Given hashset x,y; Find childFAKE(x,y)"),
				multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given hashset x,y st childFAKE(x,y);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testMultipleBranchingExclusion() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty("a(x)"), parseProperty("b(x)"),
				parseProperty("b(x)"), null, r -> 0, "test", null);
		ProblemSolver solver = new ProblemSolver(parseInput("Given x st a(x) & a(x); Find b(x)"), multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given x st a(x) & b(x);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testEqualityMultiTheorem() {
		MultistageTheorem multistageTheorem = new MultistageTheorem(parseProperty(BOUND + "(x) & " + BOUND + "(y)"),
				parseProperty("equal(x,y)"), parseProperty("equal(x,y)"), null, r -> 0, "test", null);
		ProblemSolver solver = new ProblemSolver(parseInput("Given x,y st a(x,y); Find equal(x,y)"), multistageTheorem);
		solver.branch();
		assertEquals(parseInput("Given x,y st a(x,y) & equal(x,y);"), solver.problemStates.peek().problem);
	}

	@Test
	public void testGetSubProblemForQuantifier() {
		KInput dummyProblem = parseInput("Given list x st blah(x); Find y st child(x,y)");
		assertEquals(parseInput("Given list x st blah(x); Find na st !b(na) & a(na)"),
				getSubProblemForQuantifier(dummyProblem, (KQuantifier) parseProperty("forall(x : a(x) -> b(x))")));
		assertEquals(parseInput("Given list x st blah(x); Find na st !a(na) | b(na)"),
				getSubProblemForQuantifier(dummyProblem, (KQuantifier) parseProperty("exists(x : a(x) -> b(x))")));
		assertEquals(parseInput("Given list x st blah(x); Find na st !a(x,na) | b(x,na)"),
				getSubProblemForQuantifier(dummyProblem, (KQuantifier) parseProperty("exists(z : a(x,z) -> b(x,z))")));
	}

	@Test
	public void testAgainstRegressionForPreviousSolves() {
		ArrayList<String[]> probsAndSols = getProblemsAndSolutions();
		for (String[] ps : probsAndSols) {
			// System.out.println(ps[0]);
			KInput input = (KInput) SugarUtil.convertToKernel(QuickParser.parseInput(ps[0]));
			ProblemState actualSolution = ProblemSolver.standardSolver(input).getSolution();
			if (actualSolution == null) {
				System.err.println("No solution for problem \"" + ps[0] + "\"");
			}
			assertNotNull(actualSolution);
			String actualCode = ProblemState.getOutputString(actualSolution.parentGroup, ps[0]);
			actualCode = cleanPseudocodeKLUDGE(actualCode);
			if (!ps[1].equals(actualCode)) {
				System.err.println("Wrong answer for problem \"" + ps[0] + "\"");
				System.err.println("Expected:");
				System.err.println(ps[1]);
				System.err.println("But was:");
				System.err.println(actualCode);
			}
			assertEquals(ps[1], actualCode);
		}
	}

	/**
	 * These are a bunch of super kludgey replacements that are made to get the pseudocode to output the same way every
	 * time. They're absolutely awful so try not to look at them. <br>
	 * <br>
	 * The eventual solution for these things should be to have the code output deterministically. This will involve
	 * hunting down any non-deterministic parts of the program and replacing them.
	 */
	private String cleanPseudocodeKLUDGE(String actualCode) {
		ArrayList<String[]> reps = new ArrayList<String[]>();
		reps.add(new String[] { "if nb == c", "if c == nb" });
		reps.add(new String[] { "if na == c", "if c == na" });
		reps.add(new String[] { "if na == d", "if d == na" });
		reps.add(new String[] { "if nb == d", "if d == nb" });
		reps.add(new String[] { "if na == y", "if y == na" });
		reps.add(new String[] { "if na == s", "if s == na" });
		reps.add(new String[] { "if nb == b", "if b == nb" });
		reps.add(new String[] { "if z == y", "if y == z" });
		for (String[] rep : reps) {
			actualCode = actualCode.replaceAll(rep[0], rep[1]);
		}
		return actualCode;
	}

	private ArrayList<String[]> getProblemsAndSolutions() {
		ArrayList<String[]> probsAndSols = new ArrayList<String[]>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("ProblemsAndSolutions")));
			String line;
			String[] curProb = new String[2];
			while ((line = br.readLine()) != null) {
				if (line.equals("-")) {
					curProb[1] = curProb[1].substring(1) + "\n";
					probsAndSols.add(curProb);
					curProb = new String[2];
					continue;
				}
				if (curProb[0] == null) {
					curProb[0] = line;
					curProb[1] = "";
					continue;
				}
				curProb[1] = curProb[1] + "\n" + line;
			}
			br.close();
		} catch (IOException e) {
		}
		return probsAndSols;
	}
}
