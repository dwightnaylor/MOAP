import static algorithmMaker.QuickParser.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import kernelLanguage.KInput;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.util.SugarUtil;

public class SugarUtilTests {
	@Test
	public void testResugarForProblems() {
		assertEquals(parseProblem("int a st blah(a)"), SugarUtil.resugar(parseProblem("a st type_int(a) & blah(a)")));
		assertEquals(parseProblem("list<int> a st blah(a)"),
				SugarUtil.resugar(parseProblem("a st type_list(a) & child_type_int(a) & blah(a)")));

		String[] sames = { "y st forall(x st blah(x): something(x))", "x st a(x,x)" };
		for (String same : sames)
			assertEquals(parseProblem(same), SugarUtil.resugar(parseProblem(same)));
	}

	@Test
	public void testResugarForInputs() {
		assertEquals(parseInput("Given b st TRUE; Find even(b)", false),
				SugarUtil.resugar(parseInput("Given b st TRUE; Find even(b)")));
		assertEquals(parseInput("Given b,c st TRUE; Find equal(b,c) & equal(c,b)", false),
				SugarUtil.resugar(parseInput("Given b,c st TRUE; Find equal(b,c) & equal(c,b)")));
		assertEquals(parseInput("Given list x; Find y st blah(x,y)", false),
				SugarUtil.resugar(parseInput("Given list x; Find y st blah(x,y)")));
	}

	@Test
	public void testDesugar() {
		ArrayList<String[]> tasks = new ArrayList<String[]>();
		tasks.add(new String[] { "Given x; Find y st test(y)", "Given x; Find y st test(y)" });
		tasks.add(new String[] { "Given list<int> x; Find y st test(y)",
				"Given x st forall(na st child(x,na) : type_int(na)) & type_list(x); Find y st test(y)" });
		tasks.add(new String[] { "Given x; Find y st test(test1(y))", "Given x; Find y,na st test(na) & test1(y,na)" });
		tasks.add(new String[] { "Given x; Find y st equal(x+y,x-y)",
				"Given x; Find y,na,nb st equal(na,nb) & minus(x,y,nb) & plus(x,y,na)" });
		tasks.add(new String[] { "Given x; Find na st test(other(na))",
				"Given x; Find na,nb st other(na,nb) & test(nb)" });
		tasks.add(new String[] { "Given x; Find list<point> y st foo(bar(y))",
				"Given x; Find y,na st bar(y,na) & foo(na) & forall(nb st child(y,nb) : type_point(nb)) & type_list(y)" });
		tasks.add(new String[] { "Given list<point> x st foo(bar(x)); Find y st blah(y)",
				"Given x,na st bar(x,na) & foo(na) & forall(nb st child(x,nb) : type_point(nb)) & type_list(x); Find y st blah(y)" });
		tasks.add(new String[] { "Given x st forall(na st foo(na) : bar(na)) ; Find y st first(second(x))",
				"Given x,nb st forall(na st foo(na) : bar(na)) & second(x,nb); Find y st first(nb)" });
		tasks.add(new String[] {
				"Given list<point> x; Find a,b st child(x,a) & child(x,b) & forall(c,d st child(x,c) & child(x,d) : lessThanEqual(distance(a,b),distance(c,d)))",
				"Given x st forall(na st child(x,na) : type_point(na)) & type_list(x); Find a,b,na st child(x,a) & child(x,b) & distance(a,b,na) & forall(c,d,nb st child(x,c) & child(x,d) & distance(c,d,nb) : lessThanEqual(na,nb))" });
		for (String[] task : tasks) {
			KInput original = (KInput) SugarUtil.convertToKernel(QuickParser.parseInput(task[0]));
			String simplifiedToString = original.toString();

			if (!task[1].equals(simplifiedToString)) {
				System.err.println(task[0]);
				System.err.println("Should desugar to");
				System.err.println(task[1]);
				System.err.println("but it instead desugared to");
				System.err.println(simplifiedToString);
			}

			assertEquals(simplifiedToString, task[1]);
		}
	}
}
