package bindings.equalityTesting;

public abstract class Appearance implements Comparable<Appearance> {

	public abstract boolean equals(Object o);

	public abstract int hashCode();
}
