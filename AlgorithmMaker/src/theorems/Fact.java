package theorems;

import kernelLanguage.*;

/**
 * @author dwight
 *
 * @param <T>
 *            Should be either an atomic...or???
 */
public class Fact<T> {
	public T property;
	public KTheorem theorem;
	public Fact<? extends KProperty>[] prerequisites;

	@SafeVarargs
	public Fact(T property, KTheorem theorem, Fact<? extends KProperty>... prerequisites) {
		this.property = property;
		this.theorem = theorem;
		this.prerequisites = prerequisites;
	}

	@Override
	public String toString() {
		return "Fact[" + property.toString() + "]";
	}

	@Override
	public int hashCode() {
		return property.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Fact && ((Fact<?>) obj).property == property;
	}
}
