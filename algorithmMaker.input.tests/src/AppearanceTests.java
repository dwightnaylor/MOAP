import static algorithmMaker.QuickParser.parseProperty;
import static algorithmMaker.QuickParser.parseTheorem;
import static org.junit.Assert.assertTrue;
import inputHandling.TransformUtil;

import org.junit.Test;

import solver.Chainer;

public class AppearanceTests {

	@Test
	public void testForSomething() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,GIVEN"));
		basicChainer.chain(parseProperty("a(y)"), TransformUtil.GIVEN);
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("b(x)")));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("c(x)")));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("c(y)")));
	}
}
