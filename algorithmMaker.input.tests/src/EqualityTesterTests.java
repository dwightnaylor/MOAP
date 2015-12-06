import static algorithmMaker.util.KernelUtil.parseProperty;
import static bindings.equalityTesting.EqualityTester.*;
import static org.junit.Assert.*;

import java.util.*;

import kernelLanguage.*;

import org.junit.Test;

import bindings.Binding;
import bindings.equalityTesting.*;

public class EqualityTesterTests {

	// *************************getAppearance() tests************************

	@Test
	public void testGetAppearancesForBasicSingleAppearance() {
		KProperty original = parseProperty("a(x) & b(x)");
		Hashtable<Appearance, ArrayList<String>> appearances = getAppearances(original);
		AtomicAppearance a = new AtomicAppearance("a", 0, null);
		AtomicAppearance b = new AtomicAppearance("b", 0, null);

		assertEquals(2, appearances.size());
		assertTrue(appearances.containsKey(a));
		assertTrue(appearances.containsKey(b));
		assertEquals(1, appearances.get(a).size());
		assertEquals(1, appearances.get(b).size());
		assertTrue(appearances.get(a).contains("x"));
		assertTrue(appearances.get(b).contains("x"));
	}

	@Test
	public void testGetAppearancesForBasicMultipleVariableAppearance() {
		KProperty original = parseProperty("a(x) & b(y)");
		Hashtable<Appearance, ArrayList<String>> appearances = getAppearances(original);
		AtomicAppearance a = new AtomicAppearance("a", 0, null);
		AtomicAppearance b = new AtomicAppearance("b", 0, null);

		assertEquals(2, appearances.size());
		assertTrue(appearances.containsKey(a));
		assertTrue(appearances.containsKey(b));
		assertEquals(1, appearances.get(a).size());
		assertEquals(1, appearances.get(b).size());
		assertTrue(appearances.get(a).contains("x"));
		assertTrue(appearances.get(b).contains("y"));
	}

	@Test
	public void testGetAppearancesForBasicNegatedAppearance() {
		KProperty original = parseProperty("!a(x)");
		Hashtable<Appearance, ArrayList<String>> appearances = getAppearances(original);
		AtomicAppearance nota = new AtomicAppearance("a", 0, new NegatedAppearance(null));

		assertEquals(1, appearances.size());
		assertTrue(appearances.containsKey(nota));
		assertEquals(1, appearances.get(nota).size());
		assertTrue(appearances.get(nota).contains("x"));
	}

	@Test
	public void testGetAppearancesForBasicQuantifierAppearance() {
		KQuantifier original = (KQuantifier) parseProperty("forall(x st a(x) : b(x))");
		Hashtable<Appearance, ArrayList<String>> appearances = getAppearances(original);
		Appearance quantifierSubject = new AtomicAppearance("a", 0, new QuantifierAppearance(original, true, null));
		Appearance quantifierPredicate = new AtomicAppearance("b", 0, new QuantifierAppearance(original, false, null));

		assertEquals(2, appearances.size());
		assertTrue(appearances.containsKey(quantifierSubject));
		assertTrue(appearances.containsKey(quantifierPredicate));
		assertEquals(1, appearances.get(quantifierSubject).size());
		assertEquals(1, appearances.get(quantifierPredicate).size());
		assertTrue(appearances.get(quantifierSubject).contains("x"));
		assertTrue(appearances.get(quantifierPredicate).contains("x"));
	}

	// *************************getEquivalentBindings() tests************************

	@Test
	public void testGetEquivalentBindingsForBasicMatching() {
		KProperty original = parseProperty("a(x) & b(x)");
		KProperty toTest = parseProperty("a(y) & b(y)");
		List<Binding> equivalentBindings = getEquivalentBindings(original, toTest);
		assertEquals(1, equivalentBindings.size());
		assertEquals(Binding.singleton("x", "y").getArguments(), equivalentBindings.get(0).getArguments());
	}

	@Test
	public void testGetEquivalentBindingsForMultipleMatching() {
		KProperty original = parseProperty("a(q) & b(w) & b(e)");
		KProperty toTest = parseProperty("a(r) & b(t) & b(z)");
		List<Binding> equivalentBindings = getEquivalentBindings(original, toTest);
		assertEquals(2, equivalentBindings.size());
		assertTrue(equivalentBindings.contains(Binding.createBinding(new String[][] { { "q", "r" }, { "w", "t" },
				{ "e", "z" } })));
		assertTrue(equivalentBindings.contains(Binding.createBinding(new String[][] { { "q", "r" }, { "w", "z" },
				{ "e", "t" } })));
	}

	@Test
	public void testGetEquivalentBindingsForBasicQuantifierMatching() {
		KProperty original = parseProperty("forall(x st a(x,y) : b(x,y))");
		KProperty toTest = parseProperty("forall(t st a(t,z) : b(t,z))");
		List<Binding> equivalentBindings = getEquivalentBindings(original, toTest);
		assertEquals(1, equivalentBindings.size());
		assertEquals(Binding.createBinding(new String[][] { { "x", "t" }, { "y", "z" } }).getArguments(),
				equivalentBindings.get(0).getArguments());
	}

	@Test
	public void testGetEquivalentBindingsRejection() {
		KProperty original = parseProperty("a(x,y) & a(y,z)");
		KProperty toTest = parseProperty("a(q,w) & a(e,r)");
		List<Binding> equivalentBindings = getEquivalentBindings(original, toTest);
		assertEquals(0, equivalentBindings.size());
	}
}
