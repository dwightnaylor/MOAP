import static algorithmMaker.QuickParser.parseProperty;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChainerTests {

	@Test
	public void testBasicChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parseProperty("a(x)"), parseProperty("b(x)")));
		basicChainer.chain(parseProperty("a(y)"));
		assertTrue("Chainer can accept assertions", basicChainer.appliedAtomics.get("a")
				.contains(parseProperty("a(y)")));
		assertTrue("Basic chaining works", basicChainer.appliedAtomics.get("b").contains(parseProperty("b(y)")));
	}

	@Test
	public void testAndResultChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parseProperty("a(x)"), parseProperty("b(x) & c(x)")));
		basicChainer.chain(parseProperty("a(x)"));
		assertTrue("Chainer can chain ANDed results",
				basicChainer.appliedAtomics.get("b").contains(parseProperty("b(x)")));
		assertTrue("Chainer can chain ANDed results",
				basicChainer.appliedAtomics.get("c").contains(parseProperty("c(x)")));
	}

	@Test
	public void testAndRequirementChainer() {
		Chainer basicChainer = new Chainer(new Theorem(parseProperty("a(x) & b(x)"), parseProperty("c(x)")));
		basicChainer.chain(parseProperty("a(x)"));
		basicChainer.chain(parseProperty("b(x)"));
		assertTrue("Chainer can chain ANDed requirements",
				basicChainer.appliedAtomics.get("c").contains(parseProperty("c(x)")));
	}

}
