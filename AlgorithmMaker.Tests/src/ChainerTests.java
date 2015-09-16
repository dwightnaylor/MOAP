import static algorithmMaker.PropertyQuickParser.parse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChainerTests {

	@Test
	public void testBasicChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parse("a(x)"), parse("b(x)")));
		basicChainer.chain(parse("a(y)"));
		assertTrue("Chainer can accept assertions", basicChainer.appliedAtomics.get("a").contains(parse("a(y)")));
		assertTrue("Basic chaining works", basicChainer.appliedAtomics.get("b").contains(parse("b(y)")));
	}

	@Test
	public void testAndResultChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parse("a(x)"), parse("b(x) & c(x)")));
		basicChainer.chain(parse("a(x)"));
		assertTrue("Chainer can chain ANDed results", basicChainer.appliedAtomics.get("b").contains(parse("b(x)")));
		assertTrue("Chainer can chain ANDed results", basicChainer.appliedAtomics.get("c").contains(parse("c(x)")));
	}

	@Test
	public void testAndRequirementChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parse("a(x) & b(x)"), parse("c(x)")));
		basicChainer.chain(parse("a(x)"));
		basicChainer.chain(parse("b(x)"));
		assertTrue("Chainer can chain ANDed requirements", basicChainer.appliedAtomics.get("c").contains(parse("c(x)")));
	}

}
