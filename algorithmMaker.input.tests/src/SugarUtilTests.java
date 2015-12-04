import static algorithmMaker.QuickParser.parseInput;
import static algorithmMaker.QuickParser.parseInputDirty;
import static algorithmMaker.QuickParser.parseProblem;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Input;
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
		assertEquals(parseInput("Given b st TRUE; Find even(b)"),
				SugarUtil.resugar(parseInputDirty("Given b st TRUE; Find even(b)")));
		assertEquals(parseInput("Given b,c st TRUE; Find equal(b,c) & equal(c,b)"),
				SugarUtil.resugar(parseInputDirty("Given b,c st TRUE; Find equal(b,c) & equal(c,b)")));
		assertEquals(parseInput("Given list x; Find y st blah(x,y)"),
				SugarUtil.resugar(parseInputDirty("Given list x; Find y st blah(x,y)")));
	}

	@Test
	public void testDesugar() {
		ArrayList<String[]> tasks = new ArrayList<String[]>();
		tasks.add(new String[] { "Given x; Find y st test(y)", "Given x; Find y st test(y)" });
		tasks.add(new String[] { "Given list<int> x; Find y st test(y)",
				"Given list<int> x st type_list(x) & forall(na st child(x,na) : type_int(na)); Find y st test(y)" });
		tasks.add(new String[] { "Given x; Find y st test(test1(y))", "Given x; Find y,na st test1(y,na) & test(na)" });
		tasks.add(new String[] { "Given x; Find y st equal(x+y,x-y)",
				"Given x; Find y,na,nb st plus(x,y,na) & minus(x,y,nb) & equal(na,nb)" });
		tasks.add(new String[] { "Given x; Find na st test(other(na))",
				"Given x; Find na,nb st other(na,nb) & test(nb)" });
		for (String[] task : tasks) {
			Input original = QuickParser.parseInputDirty(task[0]);
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
