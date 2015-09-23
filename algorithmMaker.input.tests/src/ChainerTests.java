import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import algorithmMaker.input.Atomic;

public class ChainerTests {

	@Test
	public void testBasicChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parseProperty("a(x)"), parseProperty("b(x)")));
		basicChainer.chain(parseProperty("a(y)"), Theorem.GIVEN);
		assertTrue("Chainer can accept assertions", basicChainer.hasAtomic((Atomic) parseProperty("a(y)")));
		assertTrue("Basic chaining works", basicChainer.hasAtomic((Atomic) parseProperty("b(y)")));
	}

	@Test
	public void testAndResultChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parseProperty("a(x)"), parseProperty("b(x) & c(x)")));
		basicChainer.chain(parseProperty("a(x)"), Theorem.GIVEN);
		assertTrue("Chainer can chain ANDed results", basicChainer.hasAtomic((Atomic) parseProperty("b(x)")));
		assertTrue("Chainer can chain ANDed results", basicChainer.hasAtomic((Atomic) parseProperty("c(x)")));
	}

	@Test
	public void testAndRequirementChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parseProperty("a(x) & b(x)"), parseProperty("c(x)")));
		basicChainer.chain(parseProperty("a(x)"), Theorem.GIVEN);
		basicChainer.chain(parseProperty("b(x)"), Theorem.GIVEN);
		assertTrue("Chainer can chain ANDed requirements", basicChainer.hasAtomic((Atomic) parseProperty("c(x)")));
	}

}
