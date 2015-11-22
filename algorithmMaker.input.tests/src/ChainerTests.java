import static algorithmMaker.QuickParser.parseProperty;
import static algorithmMaker.QuickParser.parseTheorem;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.util.InputUtil;
import inputHandling.TransformUtil;
import solver.Chainer;
import theorems.MultistageTheorem;

public class ChainerTests {

	@Test
	public void testForFalsePositives() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(y)"), TransformUtil.GIVEN);
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("b(x)")));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("c(x)")));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("c(y)")));
	}

	@Test
	public void testBasicChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(y)"), TransformUtil.GIVEN);
		assertTrue("Chainer can accept assertions", basicChainer.hasProperty(parseProperty("a(y)")));
		assertTrue("Basic chaining works", basicChainer.hasProperty(parseProperty("b(y)")));
	}

	@Test
	public void testAndResultChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x)&c(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(x)"), TransformUtil.GIVEN);
		assertTrue("Chainer can chain ANDed results", basicChainer.hasProperty(parseProperty("b(x)")));
		assertTrue("Chainer can chain ANDed results", basicChainer.hasProperty(parseProperty("c(x)")));
	}

	@Test
	public void testAndRequirementChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)&b(x)->c(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(x)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty("b(x)"), TransformUtil.GIVEN);
		assertTrue("Chainer can chain ANDed requirements", basicChainer.hasProperty(parseProperty("c(x)")));
	}

	@Test
	public void testMultipleChaining() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,GIVEN"), parseTheorem("b(x)->c(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(y)"), TransformUtil.GIVEN);
		assertTrue("Multiple chaining works", basicChainer.hasProperty(parseProperty("c(y)")));
	}

	@Test
	public void testMultivarChaining() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x,y)&b(y,z)->c(x,z),0,GIVEN"));
		basicChainer.chain(parseProperty("a(d,e)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty("b(e,f)"), TransformUtil.GIVEN);
		assertTrue("Multiple variable chaining works", basicChainer.hasProperty(parseProperty("c(d,f)")));
	}

	@Test
	public void testMultistageChaining() {
		MultistageTheorem multiTheorem = new MultistageTheorem(QuickParser.parseProperty("enumerable(x)"),
				QuickParser.parseProperty("child(x,y)"), QuickParser.parseProperty("child(x,y)"), null, 0,
				"enumerable things", null);
		Chainer stage1Chainer = new Chainer(multiTheorem);
		stage1Chainer.chain(QuickParser.parseProperty("enumerable(a)"), TransformUtil.GIVEN);
		assertTrue("Stage 1 of multichaining works", stage1Chainer.nextLevelTheorems.size() == 1);
		Chainer stage2Chainer = new Chainer(false, multiTheorem);
		stage2Chainer.previousLevelTheorems = stage1Chainer.nextLevelTheorems;
		stage2Chainer.chain(QuickParser.parseProperty("child(a,b)"), TransformUtil.GIVEN);
		assertTrue("Stage 2 of multichaining works", stage2Chainer.nextLevelTheorems.size() == 1);
	}

	@Test
	public void testBasicPrerequisites() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,Test theorem"));
		basicChainer.chain(parseProperty("a(x)"), TransformUtil.GIVEN);
		assertTrue("Fact recording works", basicChainer.getProperty(parseProperty("b(x)")).prerequisites.length == 1);
	}

	@Test
	public void testBoundVariableDetection() {
		Chainer basicChainer = new Chainer(parseTheorem(InputUtil.BOUND + "(x)&a(x)->b(x),0,GIVEN"));
		basicChainer.addBoundVars("q");
		basicChainer.chain(parseProperty("a(q)"), TransformUtil.GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("b(q)")));
	}

	@Test
	public void testMultipleOfSameAtomicRequirement() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)&a(y)->b(x,y),0,GIVEN"));
		basicChainer.chain(parseProperty("a(a)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty("a(b)"), TransformUtil.GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("b(a,a)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(a,b)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(b,a)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(b,b)")));
	}

	@Test
	public void testBindingNormalMix() {
		Chainer basicChainer = new Chainer(parseTheorem(InputUtil.BOUND + "(x)&a(y)->b(x,y),0,GIVEN"));
		basicChainer.addBoundVars("q");
		basicChainer.chain(parseProperty("a(w)"), TransformUtil.GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("b(q,w)")));
	}

	@Test
	public void testEqualityChaining() {
		Chainer basicChainer = new Chainer();
		basicChainer.chain(parseProperty(InputUtil.EQUAL + "(x,y)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty(InputUtil.EQUAL + "(y,z)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty(InputUtil.EQUAL + "(z,a)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty(InputUtil.EQUAL + "(a,b)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty("a(x)"), TransformUtil.GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("a(b)")));
	}

	@Test
	public void testNegationChaining() {
		Chainer basicChainer = new Chainer(parseTheorem("!a(x)->b(x),0,GIVEN"));
		basicChainer.chain(parseProperty("!a(q)"), TransformUtil.GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("b(q)")));
	}

//	@Test
//	public void testQuantifierChaining() {
//		Chainer basicChainer = new Chainer(parseTheorem("forall(x st a(x,y) : b(x,y))->c(y),0,GIVEN"));
//		basicChainer.chain(parseProperty("forall(z st a(z,q) : b(z,q))"), TransformUtil.GIVEN);
//		assertTrue(basicChainer.hasProperty(parseProperty("c(q)")));
//	}
}
