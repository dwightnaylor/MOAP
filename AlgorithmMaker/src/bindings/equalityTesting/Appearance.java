package bindings.equalityTesting;

public abstract class Appearance implements Comparable<Appearance> {

	private final Appearance parentAppearance;

	public Appearance(Appearance parentAppearance) {
		this.parentAppearance = parentAppearance;
	}

	public final boolean equals(Object o) {
		return compareTo((Appearance) o) == 0;
	}

	public final int hashCode() {
		return (parentAppearance == null ? 1 : parentAppearance.hashCode()) + hashDeclaredData();
	}

	public abstract int hashDeclaredData();

	public final int compareTo(Appearance other) {
		if (getClass() != other.getClass())
			return getClass().toString().compareTo(other.getClass().toString());

		if (parentAppearance == null && other.parentAppearance != null)
			return 1;

		if (parentAppearance != null && other.parentAppearance == null)
			return -1;

		if (parentAppearance != null && !parentAppearance.equals(other.parentAppearance))
			return parentAppearance.compareTo(other.parentAppearance);

		return compareToSameType(other);
	}

	public abstract int compareToSameType(Appearance other);

	public Appearance getParentAppearance() {
		return parentAppearance;
	}
}
