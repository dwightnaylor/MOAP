import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;
import static org.junit.Assert.*;
import static theorems.Fact.givenTheorem;

import java.util.*;

import org.junit.Test;

import kernelLanguage.*;
import solver.Chainer;
import theorems.*;

public class ChainerTests {

	@Test
	public void testGetAllFulfillmentsOfLiteral() {
		Chainer chainer = new Chainer();
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty(LITERAL + "(x)")).size());
		chainer.chain(parseProperty("a(x)"));
		chainer.chain(parseProperty("a(y)"));
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty(LITERAL + "(x) & a(x)")).size());
	}

	@Test
	public void testGetAllFulfillmentsOf() {
		Chainer chainer = new Chainer();
		// *****Simple single variable tests*****
		chainer.chain(parseProperty("a(x)"));
		chainer.chain(parseProperty("a(y)"));
		chainer.chain(parseProperty("a(z)"));
		assertEquals(3, chainer.getAllFulfillmentsOf(parseProperty("a(x)")).size());
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty("a(x)"), Collections.singleton("x")).size());
		// *****Multiple variable tests*****
		chainer.chain(parseProperty("b(x,q)"));
		chainer.chain(parseProperty("b(y,q)"));
		chainer.chain(parseProperty("b(z,q)"));
		assertEquals(3, chainer.getAllFulfillmentsOf(parseProperty("b(x,q)")).size());
		assertEquals(3, chainer.getAllFulfillmentsOf(parseProperty("b(x,q)"), Collections.singleton("q")).size());
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty("b(x,q)"), Collections.singleton("x")).size());
		// *****ANDing tests*****
		chainer.chain(parseProperty("c(x)"));
		chainer.chain(parseProperty("d(x)"));
		chainer.chain(parseProperty("c(y)"));
		chainer.chain(parseProperty("d(y)"));
		assertEquals(2, chainer.getAllFulfillmentsOf(parseProperty("c(q) & d(q)")).size());
		assertEquals(2, chainer.getAllFulfillmentsOf(parseProperty("d(q) & c(q)")).size());
		// *****Quantifier tests*****
		chainer.chain(parseProperty("forall(z : child(x,z) -> child(y,z))"));
		chainer.chain(parseProperty("forall(q : child(x,q) -> child(y,q))"));
		// Switch the q and y at the end to make it not a match
		chainer.chain(parseProperty("forall(q : child(x,q) -> child(q,y))"));
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty("forall(z : child(x,z) -> child(y,z))")).size());
		// Try out some weird variable names (just in case)
		assertEquals(1, chainer
				.getAllFulfillmentsOf(parseProperty("forall(asdf : child(qwer,asdf) -> child(rewq,asdf))")).size());
		// Try out an anded quantifier.
		assertEquals(1,
				chainer.getAllFulfillmentsOf(
						parseProperty("forall(z : child(x,z) -> child(y,z)) & forall(q : child(x,q) -> child(y,q))"))
				.size());
	}

	@Test
	public void testForFalsePositives() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x)->b(x)"));
		basicChainer.chain(parseProperty("a(y)"));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("b(x)")));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("c(x)")));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("c(y)")));
	}

	@Test
	public void testBasicChainer() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x)->b(x)"));
		basicChainer.chain(parseProperty("a(y)"));
		assertTrue("Chainer can accept assertions", basicChainer.hasProperty(parseProperty("a(y)")));
		assertTrue("Basic chaining works", basicChainer.hasProperty(parseProperty("b(y)")));
	}

	@Test
	public void testAndResultChainer() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x)->b(x)&c(x)"));
		basicChainer.chain(parseProperty("a(x)"));
		assertTrue("Chainer can chain ANDed results", basicChainer.hasProperty(parseProperty("b(x)")));
		assertTrue("Chainer can chain ANDed results", basicChainer.hasProperty(parseProperty("c(x)")));
	}

	@Test
	public void testAndRequirementChainer() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x)&b(x)->c(x)"));
		basicChainer.chain(parseProperty("a(x)"));
		basicChainer.chain(parseProperty("b(x)"));
		assertTrue("Chainer can chain ANDed requirements", basicChainer.hasProperty(parseProperty("c(x)")));
	}

	@Test
	public void testMultipleChaining() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x)->b(x)"), givenTheorem("b(x)->c(x)"));
		basicChainer.chain(parseProperty("a(y)"));
		assertTrue("Multiple chaining works", basicChainer.hasProperty(parseProperty("c(y)")));
	}

	@Test
	public void testMultivarChaining() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x,y)&b(y,z)->c(x,z)"));
		basicChainer.chain(parseProperty("a(d,e)"));
		basicChainer.chain(parseProperty("b(e,f)"));
		assertTrue("Multiple variable chaining works", basicChainer.hasProperty(parseProperty("c(d,f)")));
	}

	@Test
	public void testForTypeChaining() {
		Chainer basicChainer = new Chainer(givenTheorem(TYPE_MARKER + "hashset(x)->something(x)"));
		basicChainer.chain(parseInput("Given hashset x; Find y st nothing(y)").given.property);
		assertTrue("Type properties are properly chained", basicChainer.hasProperty(parseProperty("something(x)")));
	}

	@Test
	public void testForMultipleTypeChaining() {
		Chainer basicChainer = new Chainer(givenTheorem(TYPE_MARKER + "hashset(x)->something(x)"));
		basicChainer.chain(parseInput("Given hashset x, hashset z; Find y st nothing(x,z,y)").given.property);
		assertTrue("Type properties are properly chained", basicChainer.hasProperty(parseProperty("something(x)")));
		assertTrue("Type properties are properly chained", basicChainer.hasProperty(parseProperty("something(z)")));
	}

	@Test
	public void testBasicPrerequisites() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x)->b(x)"));
		basicChainer.chain(parseProperty("a(x)"));
		assertTrue(basicChainer.hasProperty(parseProperty("b(x)")));
		HashSet<Fact<? extends KProperty>> properties = basicChainer.getProperties(parseProperty("b(x)"));
		assertEquals(1, properties.size());
		assertEquals(2, properties.iterator().next().prerequisites.length);
	}

	@Test
	public void testBoundVariableDetection() {
		Chainer basicChainer = new Chainer(givenTheorem(BOUND + "(x) & a(x)->b(x)"));
		basicChainer.addBoundVars("q");
		basicChainer.chain(parseProperty("a(q)"));
		assertTrue(basicChainer.hasProperty(parseProperty("b(q)")));
	}

	@Test
	public void testOredANDingChaining() {
		{
			// First check and make sure we can derive the ANDing
			Chainer basicChainer = new Chainer(givenTheorem("(a(x) & b(x))|c(x)"));
			basicChainer.chain(parseProperty("!c(x)"));
			assertTrue(basicChainer.hasProperty(parseProperty("a(x)")));
			assertTrue(basicChainer.hasProperty(parseProperty("b(x)")));
		}
		{
			// Then check and make sure we can derive from the ANDing
			Chainer basicChainer = new Chainer(givenTheorem("(a(x) & b(x))|c(x)"));
			basicChainer.chain(parseProperty("!a(x)"));
			assertTrue(basicChainer.hasProperty(parseProperty("c(x)")));
		}
	}

	@Test
	public void testMultipleOfSameAtomicRequirement() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x)&a(y)->b(x,y)"));
		basicChainer.chain(parseProperty("a(a)"));
		basicChainer.chain(parseProperty("a(b)"));
		assertTrue(basicChainer.hasProperty(parseProperty("b(a,a)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(a,b)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(b,a)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(b,b)")));
	}

	@Test
	public void testBindingNormalMix() {
		Chainer basicChainer = new Chainer(givenTheorem(BOUND + "(x)&a(y)->b(x,y)"));
		basicChainer.addBoundVars("q");
		basicChainer.chain(parseProperty("a(w)"));
		assertTrue(basicChainer.hasProperty(parseProperty("b(q,w)")));
	}

	@Test
	public void testEqualityChaining() {
		Chainer basicChainer = new Chainer();
		basicChainer.chain(parseProperty(EQUAL + "(x,y)"));
		basicChainer.chain(parseProperty(EQUAL + "(y,z)"));
		basicChainer.chain(parseProperty(EQUAL + "(z,a)"));
		basicChainer.chain(parseProperty(EQUAL + "(a,b)"));
		basicChainer.chain(parseProperty("a(x)"));
		assertTrue(basicChainer.hasProperty(parseProperty("a(b)")));
	}

	@Test
	public void testNegationChaining() {
		Chainer basicChainer = new Chainer(givenTheorem("!a(x)->b(x)"));
		basicChainer.chain(parseProperty("!a(q)"));
		assertTrue(basicChainer.hasProperty(parseProperty("b(q)")));
	}

	@Test
	public void testForBoundExclusion() {
		Chainer basicChainer = new Chainer(givenTheorem(BOUND + "(apb) & plus(a,b,apb)->something(apb)"));
		basicChainer.chain(parseProperty(BOUND + "(a)"));
		basicChainer.chain(parseProperty("plus(a,b,c)"));
		assertFalse(basicChainer.hasProperty(parseProperty("something(c)")));
	}

	@Test
	public void testForQuantifierPredicateImplications() {
		// Generally, this is a test of quantifiers being able to handle predicate implications
		Fact<KQuantifier> quantifierTheorem = givenTheorem("exists(na : b(x,na))->c(x)");
		Fact<KQuantifier> simpleTheorem = givenTheorem("!bb(x,na)|b(x,na)");
		// First case is no implication, just catch the quantifier as a requirement
		{
			Chainer basicChainer = new Chainer(quantifierTheorem);
			basicChainer.chain(parseProperty("exists(na : b(q,na))"));
			assertTrue(basicChainer.hasProperty(parseProperty("c(q)")));
		}
		// Test for a stronger quantifier predicate being given.
		{
			Chainer basicChainer = new Chainer(quantifierTheorem, simpleTheorem);
			basicChainer.chain(parseProperty("exists(na : bb(q,na))"));
			assertTrue(basicChainer.hasProperty(parseProperty("c(q)")));
		}
		// TODO: Test for a quantifier predicate implication being able to use theorems supplied after the predicate was
		// processed.
		// {
		// Chainer basicChainer = new Chainer(quantifierTheorem);
		// basicChainer.chain(parseProperty("exists(na : a(q,na) -> bb(q,na))"));
		// basicChainer.chain(parseProperty("forall(q,w : bb(q,w) -> b(q,w))"));
		// assertTrue(basicChainer.hasProperty(parseProperty("c(q)")));
		// }
	}

	@Test
	public void testForQuantifierAsTheorem() {
		{
			// One test for when the quantifier comes first
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x : aq(x) -> bq(x))"));
			basicChainer.chain(parseProperty("aq(q)"));
			assertTrue(basicChainer.hasProperty(parseProperty("bq(q)")));
		}
		{
			// One test for when the quantifier comes second
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("aq(q)"));
			basicChainer.chain(parseProperty("forall(x : aq(x) -> bq(x))"));
			assertTrue(basicChainer.hasProperty(parseProperty("bq(q)")));
		}
	}

	@Test
	public void testForQuantifierContrapositiveAsTheorem() {
		{
			// One test for when the quantifier comes first
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x : aq(x) -> bq(x))"));
			basicChainer.chain(parseProperty("!bq(q)"));
			assertTrue(basicChainer.hasProperty(parseProperty("!aq(q)")));
		}
		{
			// One test for when the quantifier comes second
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("!bq(q)"));
			basicChainer.chain(parseProperty("forall(x : aq(x) -> bq(x))"));
			assertTrue(basicChainer.hasProperty(parseProperty("!aq(q)")));
		}
	}

	@Test
	public void regressionTest3() {
		Chainer basicChainer = new Chainer();
		basicChainer.chain(parseProperty("child(b,c) & forall(z : child(b,z) -> child(a,z))"));
		assertTrue(!basicChainer.hasProperty(parseProperty("child(a,z)")));
		assertTrue(basicChainer.hasProperty(parseProperty("child(a,c)")));
	}

	@Test
	public void testNegationInQuantifier() {
		Chainer basicChainer = new Chainer(givenTheorem("a(x)|b(x)"));
		basicChainer.chain(parseProperty("forall(x:!b(x))"));
		assertTrue(basicChainer.hasProperty(parseProperty("forall(x:a(x))")));
	}

	@Test
	public void testORChaining() {
		Chainer basicChainer = new Chainer();
		basicChainer.chain(parseProperty("a(x) | b(x)"));
		basicChainer.chain(parseProperty("!a(x)"));
		assertTrue(basicChainer.hasProperty(parseProperty("b(x)")));
	}

	@Test
	public void regressionTest2() {
		Chainer basicChainer = new Chainer();
		basicChainer.chain(parseProperty("forall(nb : child(a,nb) -> child(na,nb))"));
		// No crash hopefully?
	}

	@Test
	public void regressionTest1() {
		Chainer basicChainer = new Chainer(givenTheorem("child(a,b)->exists(c : child(a,c) -> equal(b,c))"),
				givenTheorem("exists(c : child(a,c) -> equal(b,c))->child(a,b)"),
				givenTheorem("!child(a,b)->forall(c : child(a,c) -> !equal(b,c))"),
				givenTheorem("forall(c : child(a,c) -> !equal(b,c))->!child(a,b)"));
		basicChainer.chain(parseProperty("forall(z : child(a,z) -> !equal(b,z))"));
		assertTrue(basicChainer.hasProperty(parseProperty("!child(a,b)")));
	}

	/**
	 * We want to make sure that when we accept a quantifier as a theorem, we do so specifically, not generally. Namely,
	 * if I say forall(x : a(x) -> b(x,y)), then it only holds for the y I've given you, not an arbitrary y.
	 */
	@Test
	public void testForQuantifierAsTheoremMisfiring() {
		// Simple test first - see if a chaining accidentally uses unrelated variables
		{
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x : a(x) -> b(x,y))"));
			basicChainer.chain(parseProperty("foo(y)"));
			basicChainer.chain(parseProperty("foo(z)"));
			basicChainer.chain(parseProperty("a(q)"));
			assertTrue(basicChainer.hasProperty(parseProperty("b(q,y)")));
			assertFalse(basicChainer.hasProperty(parseProperty("b(q,z)")));
		}
		// Test if the chaining can return the wrong predicate
		{
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x : child(a,x) -> child(b,x))"));
			basicChainer.chain(parseProperty("child(a,q)"));
			assertTrue(basicChainer.hasProperty(parseProperty("child(b,q)")));
			assertFalse(basicChainer.hasProperty(parseProperty("child(c,q)")));
		}
		// Test if the chaining can use the wrong subject
		{
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x : child(a,x) -> child(b,x))"));
			basicChainer.chain(parseProperty("child(d,q)"));
			assertFalse(basicChainer.hasProperty(parseProperty("child(b,q)")));
		}
	}

	@Test
	public void testQuantifierChainingAsResult() {
		Chainer basicChainer = new Chainer(givenTheorem("c(y)->forall(x : a(x)),0,GIVEN"));
		basicChainer.chain(parseProperty("c(y)"));
		assertTrue(basicChainer.hasPropertyDevarred(parseProperty("forall(v : a(v))")));
	}
}
