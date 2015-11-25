import static algorithmMaker.QuickParser.parseProperty;
import static algorithmMaker.util.InputUtil.canonicalize;
import static algorithmMaker.util.InputUtil.desugar;
import static algorithmMaker.util.InputUtil.devar;
import static algorithmMaker.util.InputUtil.revar;
import static algorithmMaker.util.InputUtil.stupidCopy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Hashtable;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Input;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;

public class InputUtilTests {

	@SuppressWarnings("serial")
	@Test
	public void testRevar() {
		// Tests if a revar can switch out simple things
		assertEquals(parseProperty("a(y)"), revar(parseProperty("a(x)"), new Hashtable<String, String>() {
			{
				put("x", "y");
			}
		}));
	}

	@Test
	public void testEquality() {
		assertNotEquals(QuickParser.parseProperty("a(x) & b(x)"), QuickParser.parseProperty("a(x)"));
		assertNotEquals(QuickParser.parseProperty("a(x) & b(x)"), QuickParser.parseProperty("b(x)"));
		assertNotEquals(QuickParser.parseProperty("a(x) & b(x)"), QuickParser.parseProperty("b(x) & a(x)"));
	}

	@Test
	public void testStupidCopy() {
		String[] props = { "a(a,a,a,a)", "forall(y st child(x,y) : lessThanEqual(y,z))" };
		for (String prop : props) {
			Property p = QuickParser.parseProperty(prop);
			assertEquals(p, stupidCopy(p));
		}
	}

	@Test
	public void testCanonicalize() {
		ArrayList<String[]> tasks = new ArrayList<String[]>();
		tasks.add(new String[] { "a(x) & a(x)", "a(x)" });
		tasks.add(new String[] { "a(x) | a(x)", "a(x)" });
		tasks.add(new String[] { "c(x) & b(x) & a(x)", "a(x) & b(x) & c(x)" });
		tasks.add(new String[] { "a(x) & FALSE", "FALSE" });
		tasks.add(new String[] { "!(a(x) & b(x))", "!a(x) | !b(x)" });
		tasks.add(new String[] { "!(a(x) | b(x))", "!a(x) & !b(x)" });
		tasks.add(new String[] { "(a(x) & !d(x)) & (b(x) & d(x)) | (c(x) & !c(x))", "FALSE" });
		tasks.add(new String[] { "!forall(x st a(x): b(x))", "exists(x st a(x) : !b(x))" });
		for (String[] task : tasks) {
			Property originalProperty = QuickParser.parseProperty(task[0]);
			// The simplified version goes here
			Property simplifiedProperty = canonicalize(originalProperty);

			if (!QuickParser.parseProperty(task[1]).equals(simplifiedProperty))
				System.err.println("\"" + originalProperty + "\" Should canonicalize to \"" + task[1]
						+ "\" but it instead canonicalized to \"" + simplifiedProperty + '"');

			assertEquals(simplifiedProperty.toString(), task[1]);
		}
	}

	@Test
	public void testDesugar() {
		ArrayList<String[]> tasks = new ArrayList<String[]>();
		tasks.add(new String[] { "Given x; Find y st test(y)", "Given x; Find y st test(y)" });
		tasks.add(new String[] { "Given list<int> x; Find y st test(y)",
				"Given x st type_list(x) & child_type_int(x); Find y st test(y)" });
		tasks.add(new String[] { "Given x; Find y st test(test1(y))",
				"Given x; Find y st {na st test(na) & test1(y,na)}" });
		for (String[] task : tasks) {
			Input original = QuickParser.parseInput(task[0]);
			String originalToString = original.toString();
			// The simplified version goes here
			desugar(original);
			String simplifiedToString = original.toString();

			if (!task[1].equals(simplifiedToString))
				System.err.println("\"" + originalToString + "\" Should desugar to \"" + task[1]
						+ "\" but it instead desugared to \"" + simplifiedToString + '"');

			assertEquals(simplifiedToString, task[1]);
		}
	}

	@Test
	public void testDevar() {
		assertEquals(InputUtil.createAtomic("a", "_"), devar(InputUtil.createAtomic("a", "x")));
	}
}
