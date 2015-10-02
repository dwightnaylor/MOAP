import static algorithmMaker.QuickParser.parseProperty;
import static algorithmMaker.QuickParser.parseTheorem;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Atomic;
import inputHandling.TransformUtil;
import solver.Chainer;
import theorems.MultistageTheorem;

public class ChainerTests {

	@Test
	public void testForFalsePositives() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x):-b(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(y)"), TransformUtil.GIVEN);
		assertTrue("No false positives", !basicChainer.hasAtomic((Atomic) parseProperty("b(x)")));
		assertTrue("No false positives", !basicChainer.hasAtomic((Atomic) parseProperty("c(x)")));
		assertTrue("No false positives", !basicChainer.hasAtomic((Atomic) parseProperty("c(y)")));
	}

	@Test
	public void testBasicChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x):-b(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(y)"), TransformUtil.GIVEN);
		assertTrue("Chainer can accept assertions", basicChainer.hasAtomic((Atomic) parseProperty("a(y)")));
		assertTrue("Basic chaining works", basicChainer.hasAtomic((Atomic) parseProperty("b(y)")));
	}

	@Test
	public void testAndResultChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x):-b(x)&c(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(x)"), TransformUtil.GIVEN);
		assertTrue("Chainer can chain ANDed results", basicChainer.hasAtomic((Atomic) parseProperty("b(x)")));
		assertTrue("Chainer can chain ANDed results", basicChainer.hasAtomic((Atomic) parseProperty("c(x)")));
	}

	@Test
	public void testAndRequirementChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)&b(x):-c(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(x)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty("b(x)"), TransformUtil.GIVEN);
		assertTrue("Chainer can chain ANDed requirements", basicChainer.hasAtomic((Atomic) parseProperty("c(x)")));
	}

	@Test
	public void testMultipleChaining() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x):-b(x),0,GIVEN"), parseTheorem("b(x):-c(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(y)"), TransformUtil.GIVEN);
		assertTrue("Multiple chaining works", basicChainer.hasAtomic((Atomic) parseProperty("c(y)")));
	}

	@Test
	public void testMultivarChaining() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x,y)&b(y,z):-c(x,z),0,GIVEN"));
		basicChainer.chain(parseProperty("a(d,e)"), TransformUtil.GIVEN);
		basicChainer.chain(parseProperty("b(e,f)"), TransformUtil.GIVEN);
		assertTrue("Multiple variable chaining works", basicChainer.hasAtomic((Atomic) parseProperty("c(d,f)")));
	}

	@Test
	public void testMultistageChaining() {
		MultistageTheorem multiTheorem = new MultistageTheorem(QuickParser.parseProperty("enumerable(x)"),
				QuickParser.parseProperty("child(x,y)"), QuickParser.parseProperty("child(x,y)"), 0,
				"enumerable things");
		Chainer stage1Chainer = new Chainer(multiTheorem);
		stage1Chainer.chain(QuickParser.parseProperty("enumerable(a)"), TransformUtil.GIVEN);
		assertTrue("Stage 1 of multichaining works",stage1Chainer.nextLevelTheorems.size()==1);
		Chainer stage2Chainer = new Chainer(false,multiTheorem);
		stage2Chainer.previousLevelTheorems = stage1Chainer.nextLevelTheorems;
		stage2Chainer.chain(QuickParser.parseProperty("child(a,b)"), TransformUtil.GIVEN);
		assertTrue("Stage 2 of multichaining works",stage2Chainer.nextLevelTheorems.size()==1);
	}
}
