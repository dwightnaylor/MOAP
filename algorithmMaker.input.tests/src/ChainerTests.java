import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import inputHandling.*;
import kernelLanguage.*;
import solver.Chainer;
import theorems.MultistageTheorem;

public class ChainerTests {

	@Test
	public void testGetAllFulfillmentsOfLiteral() {
		Chainer chainer = new Chainer();
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty(LITERAL + "(x)")).size());
		chainer.chain(parseProperty("a(x)"), GIVEN);
		chainer.chain(parseProperty("a(y)"), GIVEN);
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty(LITERAL + "(x) & a(x)")).size());
	}

	@Test
	public void testGetAllFulfillmentsOf() {
		Chainer chainer = new Chainer();
		// *****Simple single variable tests*****
		chainer.chain(parseProperty("a(x)"), GIVEN);
		chainer.chain(parseProperty("a(y)"), GIVEN);
		chainer.chain(parseProperty("a(z)"), GIVEN);
		assertEquals(3, chainer.getAllFulfillmentsOf(parseProperty("a(x)")).size());
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty("a(x)"), Collections.singleton("x")).size());
		// *****Multiple variable tests*****
		chainer.chain(parseProperty("b(x,q)"), GIVEN);
		chainer.chain(parseProperty("b(y,q)"), GIVEN);
		chainer.chain(parseProperty("b(z,q)"), GIVEN);
		assertEquals(3, chainer.getAllFulfillmentsOf(parseProperty("b(x,q)")).size());
		assertEquals(3, chainer.getAllFulfillmentsOf(parseProperty("b(x,q)"), Collections.singleton("q")).size());
		assertEquals(1, chainer.getAllFulfillmentsOf(parseProperty("b(x,q)"), Collections.singleton("x")).size());
		// *****ANDing tests*****
		chainer.chain(parseProperty("c(x)"), GIVEN);
		chainer.chain(parseProperty("d(x)"), GIVEN);
		chainer.chain(parseProperty("c(y)"), GIVEN);
		chainer.chain(parseProperty("d(y)"), GIVEN);
		assertEquals(2, chainer.getAllFulfillmentsOf(parseProperty("c(q) & d(q)")).size());
		assertEquals(2, chainer.getAllFulfillmentsOf(parseProperty("d(q) & c(q)")).size());
		// *****Quantifier tests*****
		chainer.chain(parseProperty("forall(z st child(x,z) : child(y,z))"), GIVEN);
		chainer.chain(parseProperty("forall(q st child(x,q) : child(y,q))"), GIVEN);
		// Switch the q and y at the end to make it not a match
		chainer.chain(parseProperty("forall(q st child(x,q) : child(q,y))"), GIVEN);
		assertEquals(2, chainer.getAllFulfillmentsOf(parseProperty("forall(z st child(x,z) : child(y,z))")).size());
		// Try out some weird variable names (just in case)
		assertEquals(2, chainer
				.getAllFulfillmentsOf(parseProperty("forall(asdf st child(qwer,asdf) : child(rewq,asdf))")).size());
		// Try out an anded quantifier.
		assertEquals(4,
				chainer.getAllFulfillmentsOf(
						parseProperty("forall(z st child(x,z) : child(y,z)) & forall(q st child(x,q) : child(y,q))"))
				.size());
	}

	@Test
	public void testForFalsePositives() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("a(y)"), GIVEN);
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("b(x)")));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("c(x)")));
		assertTrue("No false positives", !basicChainer.hasProperty(parseProperty("c(y)")));
	}

	@Test
	public void testBasicChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("a(y)"), GIVEN);
		assertTrue("Chainer can accept assertions", basicChainer.hasProperty(parseProperty("a(y)")));
		assertTrue("Basic chaining works", basicChainer.hasProperty(parseProperty("b(y)")));
	}

	@Test
	public void testAndResultChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x)&c(x),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("a(x)"), GIVEN);
		assertTrue("Chainer can chain ANDed results", basicChainer.hasProperty(parseProperty("b(x)")));
		assertTrue("Chainer can chain ANDed results", basicChainer.hasProperty(parseProperty("c(x)")));
	}

	@Test
	public void testAndRequirementChainer() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)&b(x)->c(x),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("a(x)"), GIVEN);
		basicChainer.chain(parseProperty("b(x)"), GIVEN);
		assertTrue("Chainer can chain ANDed requirements", basicChainer.hasProperty(parseProperty("c(x)")));
	}

	@Test
	public void testMultipleChaining() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,\"GIVEN\""),
				parseTheorem("b(x)->c(x),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("a(y)"), GIVEN);
		assertTrue("Multiple chaining works", basicChainer.hasProperty(parseProperty("c(y)")));
	}

	@Test
	public void testMultivarChaining() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x,y)&b(y,z)->c(x,z),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("a(d,e)"), GIVEN);
		basicChainer.chain(parseProperty("b(e,f)"), GIVEN);
		assertTrue("Multiple variable chaining works", basicChainer.hasProperty(parseProperty("c(d,f)")));
	}

	@Test
	public void testForTypeChaining() {
		Chainer basicChainer = new Chainer(parseTheorem(TYPE_MARKER + "hashset(x)->something(x),0,\"GIVEN\""));
		basicChainer.chain(parseInput("Given hashset x; Find y st nothing(y)").given.property, GIVEN);
		assertTrue("Type properties are properly chained", basicChainer.hasProperty(parseProperty("something(x)")));
	}

	@Test
	public void testForMultipleTypeChaining() {
		Chainer basicChainer = new Chainer(parseTheorem(TYPE_MARKER + "hashset(x)->something(x),0,\"GIVEN\""));
		basicChainer.chain(parseInput("Given hashset x, hashset z; Find y st nothing(x,z,y)").given.property, GIVEN);
		assertTrue("Type properties are properly chained", basicChainer.hasProperty(parseProperty("something(x)")));
		assertTrue("Type properties are properly chained", basicChainer.hasProperty(parseProperty("something(z)")));
	}

	@Test
	public void testForMultistageMultipleOptions() {
		Chainer chainer = new Chainer(new MultistageTheorem(
				parseProperty(BOUND + "(y) & " + TYPE_MARKER + "hashset(x)"), parseProperty("child(x,y)"),
				parseProperty("child(x,y)"), null, r -> 0, "enumerable things", null));
		KInput input = parseInput("Given hashset x, hashset z; Find y st child(x,y)");
		chainer.addBoundVars(input.given.vars.toArray(new String[0]));
		chainer.chain(input.given.property, GIVEN);
		assertEquals(4, chainer.nextLevelTheorems.values().iterator().next().size());
	}

	@Test
	public void testMultistageChaining() {
		MultistageTheorem multiTheorem = new MultistageTheorem(parseProperty("enumerable(x)"),
				parseProperty("child(x,y)"), parseProperty("child(x,y)"), null, r -> 0, "enumerable things", null);
		Chainer stage1Chainer = new Chainer(multiTheorem);
		stage1Chainer.chain(parseProperty("enumerable(a)"), GIVEN);
		assertTrue("Stage 1 of multichaining works", stage1Chainer.nextLevelTheorems.size() == 1);
		Chainer stage2Chainer = new Chainer(false, multiTheorem);
		stage2Chainer.previousLevelTheorems = stage1Chainer.nextLevelTheorems;
		stage2Chainer.chain(parseProperty("child(a,b)"), GIVEN);
		assertTrue("Stage 2 of multichaining works", stage2Chainer.nextLevelTheorems.size() == 1);
	}

	@Test
	public void testBasicPrerequisites() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)->b(x),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("a(x)"), GIVEN);
		assertTrue("Fact recording works", basicChainer.getProperty(parseProperty("b(x)")).prerequisites.length == 1);
	}

	@Test
	public void testBoundVariableDetection() {
		Chainer basicChainer = new Chainer(parseTheorem(BOUND + "(x)&a(x)->b(x),0,\"GIVEN\""));
		basicChainer.addBoundVars("q");
		basicChainer.chain(parseProperty("a(q)"), GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("b(q)")));
	}

	@Test
	public void testMultipleOfSameAtomicRequirement() {
		Chainer basicChainer = new Chainer(parseTheorem("a(x)&a(y)->b(x,y),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("a(a)"), GIVEN);
		basicChainer.chain(parseProperty("a(b)"), GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("b(a,a)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(a,b)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(b,a)")));
		assertTrue(basicChainer.hasProperty(parseProperty("b(b,b)")));
	}

	@Test
	public void testBindingNormalMix() {
		Chainer basicChainer = new Chainer(parseTheorem(BOUND + "(x)&a(y)->b(x,y),0,\"GIVEN\""));
		basicChainer.addBoundVars("q");
		basicChainer.chain(parseProperty("a(w)"), GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("b(q,w)")));
	}

	@Test
	public void testEqualityChaining() {
		Chainer basicChainer = new Chainer();
		basicChainer.chain(parseProperty(EQUAL + "(x,y)"), GIVEN);
		basicChainer.chain(parseProperty(EQUAL + "(y,z)"), GIVEN);
		basicChainer.chain(parseProperty(EQUAL + "(z,a)"), GIVEN);
		basicChainer.chain(parseProperty(EQUAL + "(a,b)"), GIVEN);
		basicChainer.chain(parseProperty("a(x)"), GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("a(b)")));
	}

	@Test
	public void testNegationChaining() {
		Chainer basicChainer = new Chainer(parseTheorem("!a(x)->b(x),0,\"GIVEN\""));
		basicChainer.chain(parseProperty("!a(q)"), GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("b(q)")));
	}

	@Test
	public void testForBoundExclusion() {
		Chainer basicChainer = new Chainer(parseTheorem(BOUND + "(apb) & plus(a,b,apb)->something(apb)"));
		basicChainer.chain(parseProperty(BOUND + "(a)"), GIVEN);
		basicChainer.chain(parseProperty("plus(a,b,c)"), GIVEN);
		assertFalse(basicChainer.hasProperty(parseProperty("something(c)")));
	}

	@Test
	public void testForQuantifierPredicateImplications() {
		// Generally, this is a test of quantifiers being able to handle predicate implications
		KTheorem quantifierTheorem = parseTheorem("exists(na st a(x,na) : b(x,na))->c(x)");
		KTheorem simpleTheorem = parseTheorem("bb(x,na)->b(x,na)");
		// First case is no implication, just catch the quantifier as a requirement
		{
			Chainer basicChainer = new Chainer(quantifierTheorem, simpleTheorem);
			basicChainer.chain(parseProperty("exists(na st a(q,na) : b(q,na))"), GIVEN);
			assertTrue(basicChainer.hasProperty(parseProperty("c(q)")));
		}
		// Test for a stronger quantifier predicate being given.
		{
			Chainer basicChainer = new Chainer(quantifierTheorem, simpleTheorem);
			basicChainer.chain(parseProperty("exists(na st a(q,na) : bb(q,na))"), GIVEN);
			assertTrue(basicChainer.hasProperty(parseProperty("c(q)")));
		}
		// TODO: Test for a quantifier predicate implication being able to use theorems supplied after the predicate was
		// processed.
		// {
		// Chainer basicChainer = new Chainer(quantifierTheorem);
		// basicChainer.chain(parseProperty("exists(na st a(q,na) : bb(q,na))"), GIVEN);
		// basicChainer.chain(parseProperty("forall(q,w st bb(q,w) : b(q,w))"), GIVEN);
		// assertTrue(basicChainer.hasProperty(parseProperty("c(q)")));
		// }
	}

	@Test
	public void testForQuantifierAsTheorem() {
		{
			// One test for when the quantifier comes first
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x st aq(x) : bq(x))"), GIVEN);
			basicChainer.chain(parseProperty("aq(q)"), GIVEN);
			assertTrue(basicChainer.hasProperty(parseProperty("bq(q)")));
		}
		{
			// One test for when the quantifier comes second
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("aq(q)"), GIVEN);
			basicChainer.chain(parseProperty("forall(x st aq(x) : bq(x))"), GIVEN);
			assertTrue(basicChainer.hasProperty(parseProperty("bq(q)")));
		}
	}

	@Test
	public void testForQuantifierContrapositiveAsTheorem() {
		{
			// One test for when the quantifier comes first
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x st aq(x) : bq(x))"), GIVEN);
			basicChainer.chain(parseProperty("!bq(q)"), GIVEN);
			assertTrue(basicChainer.hasProperty(parseProperty("!aq(q)")));
		}
		{
			// One test for when the quantifier comes second
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("!bq(q)"), GIVEN);
			basicChainer.chain(parseProperty("forall(x st aq(x) : bq(x))"), GIVEN);
			assertTrue(basicChainer.hasProperty(parseProperty("!aq(q)")));
		}
	}

	@Test
	public void regressionTest3() {
//		ArrayList<KTheorem> theorems = TheoremParser.parseFiles();
//		theorems.addAll(MultiTheoremParser.getMultiTheorems());
		Chainer basicChainer = new Chainer();
		basicChainer.chain(
				parseProperty(
						"child(b,c) & forall(z st child(a,z) : child(b,z)) & forall(z st child(b,z) : child(a,z))"),
				GIVEN);

		assertTrue(basicChainer.hasProperty(parseProperty("child(a,c)")));
	}

	@Test
	public void regressionTest2() {
		ArrayList<KTheorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.getMultiTheorems());
		Chainer basicChainer = new Chainer(theorems.toArray(new KTheorem[0]));
		basicChainer.chain(parseProperty("forall(nb st child(a,nb) : child(na,nb))"), GIVEN);
		// No crash hopefully?
	}

	@Test
	public void regressionTest1() {
		Chainer basicChainer = new Chainer(parseTheorem("child(a,b)->exists(c st child(a,c) : equal(b,c)"),
				parseTheorem("exists(c st child(a,c) : equal(b,c)->child(a,b)"),
				parseTheorem("!child(a,b)->forall(c st child(a,c) : !equal(b,c)"),
				parseTheorem("forall(c st child(a,c) : !equal(b,c)->!child(a,b)"));
		basicChainer.chain(parseProperty("forall(z st child(a,z) : !equal(b,z))"), GIVEN);
		assertTrue(basicChainer.hasProperty(parseProperty("!child(a,b)")));
	}

	/**
	 * We want to make sure that when we accept a quantifier as a theorem, we do so specifically, not generally. Namely,
	 * if I say forall(x st a(x) : b(x,y)), then it only holds for the y I've given you, not an arbitrary y.
	 */
	@Test
	public void testForQuantifierAsTheoremMisfiring() {
		// Simple test first - see if a chaining accidentally uses unrelated variables
		{
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x st a(x) : b(x,y))"), GIVEN);
			basicChainer.chain(parseProperty("foo(y)"), GIVEN);
			basicChainer.chain(parseProperty("foo(z)"), GIVEN);
			basicChainer.chain(parseProperty("a(q)"), GIVEN);
			assertTrue(basicChainer.hasProperty(parseProperty("b(q,y)")));
			assertFalse(basicChainer.hasProperty(parseProperty("b(q,z)")));
		}
		// Test if the chaining can return the wrong predicate
		{
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x st child(a,x) : child(b,x))"), GIVEN);
			basicChainer.chain(parseProperty("child(a,q)"), GIVEN);
			assertTrue(basicChainer.hasProperty(parseProperty("child(b,q)")));
			assertFalse(basicChainer.hasProperty(parseProperty("child(c,q)")));
		}
		// Test if the chaining can use the wrong subject
		{
			Chainer basicChainer = new Chainer();
			basicChainer.chain(parseProperty("forall(x st child(a,x) : child(b,x))"), GIVEN);
			basicChainer.chain(parseProperty("child(d,q)"), GIVEN);
			assertFalse(basicChainer.hasProperty(parseProperty("child(b,q)")));
		}
	}

	@Test
	public void testQuantifierChainingAsResult() {
		Chainer basicChainer = new Chainer(parseTheorem("c(y)->forall(x st a(x,y) : b(x,y)),0,GIVEN"));
		basicChainer.chain(parseProperty("c(y)"), GIVEN);
		assertTrue(
				basicChainer.propertiesByStructure.containsKey(devar(parseProperty("forall(v st a(v,v) : b(v,v))"))));
	}
}
