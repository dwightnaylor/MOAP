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

		String[] sames = { "y st forall(x : blah(x): something(x))", "x st a(x,x)" };
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
		tasks.add(new String[] { "Given a,b; Find equal(plus(a,b),times(a,b))",
				"Given a,b; Find na,nb st equal(na,nb) & plus(a,b,na) & times(a,b,nb)" });
		tasks.add(new String[] { "Given x; Find y st test(y)", "Given x; Find y st test(y)" });
		tasks.add(new String[] { "Given list<int> x; Find y st test(y)",
				"Given x st forall(na : !child(x,na) | type_int(na)) & type_list(x); Find y st test(y)" });
		tasks.add(new String[] { "Given x; Find y st test(test1(y))", "Given x; Find y,na st test(na) & test1(y,na)" });
		tasks.add(new String[] { "Given x; Find y st equal(x+y,x-y)",
				"Given x; Find y,na,nb st equal(na,nb) & minus(x,y,nb) & plus(x,y,na)" });
		tasks.add(new String[] { "Given x; Find na st test(other(na))",
				"Given x; Find na,nb st other(na,nb) & test(nb)" });
		tasks.add(new String[] { "Given x; Find list<point> y st foo(bar(y))",
				"Given x; Find y,na st bar(y,na) & foo(na) & forall(nb : !child(y,nb) | type_point(nb)) & type_list(y)" });
		tasks.add(new String[] { "Given list<point> x st foo(bar(x)); Find y st blah(y)",
				"Given x,na st bar(x,na) & foo(na) & forall(nb : !child(x,nb) | type_point(nb)) & type_list(x); Find y st blah(y)" });
		tasks.add(new String[] { "Given x st forall(na : foo(na) -> bar(na)) ; Find y st first(second(x))",
				"Given x st forall(na : !foo(na) | bar(na)); Find y,nb st first(nb) & second(x,nb)" });
		tasks.add(new String[] {
				"Given list<point> x; Find a,b st child(x,a) & child(x,b) & forall(c,d : child(x,c) & child(x,d) -> lessThanEqual(distance(a,b),distance(c,d)))",
				"Given x st forall(na : !child(x,na) | type_point(na)) & type_list(x); Find a,b,na st child(x,a) & child(x,b) & distance(a,b,na) & forall(c,d,nb : !child(x,c) | !child(x,d) | lessThanEqual(na,nb) & distance(c,d,nb))" });
		tasks.add(new String[] {
				"Given array a; Find i st index(a,i) & forall(j : index(a,j) -> lessThanEqual(get(a,i),get(a,j)))",
				"Given a st type_array(a); Find i,na st forall(j,nb : !index(a,j) | lessThanEqual(na,nb) & get(a,j,nb)) & get(a,i,na) & index(a,i)" });
		tasks.add(new String[] {
				"Given list<int> x,int s; Find i,j st index(x,i) & index(x,j) & equal(plus(get(x,i),get(x,j)),s)",
				"Given x,s st forall(na : !child(x,na) | type_int(na)) & type_int(s) & type_list(x); Find i,j,nb,nc,na st equal(na,s) & get(x,i,nb) & get(x,j,nc) & index(x,i) & index(x,j) & plus(nb,nc,na)" });

		// Tests for no change...
		tasks.add(new String[] { "Given x,y st a(x,y) & equal(x,y);", "Given x,y st a(x,y) & equal(x,y);" });
		for (String[] task : tasks) {
			String simplifiedToString = ((KInput) SugarUtil.convertToKernel(QuickParser.parseInput(task[0])))
					.toString();

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
