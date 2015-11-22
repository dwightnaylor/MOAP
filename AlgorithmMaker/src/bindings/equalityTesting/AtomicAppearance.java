package bindings.equalityTesting;

public class AtomicAppearance extends Appearance {
	final String function;
	final int argumentNumber;

	public AtomicAppearance(String function, int argumentNumber) {
		this.function = function;
		this.argumentNumber = argumentNumber;
	}

	@Override
	public int compareTo(Appearance appearance) {
		if (getClass() != appearance.getClass()) {
			return getClass().toString().compareTo(appearance.getClass().toString());
		}
		AtomicAppearance other = (AtomicAppearance) appearance;
		int functionCompare = function.compareTo(other.function);
		if (functionCompare != 0)
			return functionCompare;

		return argumentNumber - other.argumentNumber;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof AtomicAppearance))
			return false;

		AtomicAppearance other = (AtomicAppearance) object;
		return function.equals(other.function) && argumentNumber == other.argumentNumber;
	}

	@Override
	public int hashCode() {
		return function.hashCode() + argumentNumber;
	}
}
