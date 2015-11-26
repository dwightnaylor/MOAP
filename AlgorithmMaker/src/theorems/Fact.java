package theorems;

import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;

/**
 * @author dwight
 *
 * @param <T>
 *            Should be either an atomic...or???
 */
public class Fact<T> {
	public T property;
	public Theorem theorem;
	public Fact<? extends Property>[] prerequisites;

	@SafeVarargs
	public Fact(T property, Theorem theorem, Fact<? extends Property>... prerequisites) {
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
		return obj instanceof Fact && ((Fact<?>) obj).property.equals(property);
	}
}
