package bindings.equalityTesting;

public class AtomicAppearance extends Appearance {
	final String function;
	final int argumentNumber;

	public AtomicAppearance(String function, int argumentNumber, Appearance parentAppearance) {
		super(parentAppearance);
		this.function = function;
		this.argumentNumber = argumentNumber;
	}

	@Override
	public int compareToSameType(Appearance appearance) {
		AtomicAppearance other = (AtomicAppearance) appearance;
		int functionCompare = function.compareTo(other.function);
		if (functionCompare != 0)
			return functionCompare;

		return argumentNumber - other.argumentNumber;
	}

	@Override
	public int hashDeclaredData() {
		return function.hashCode() + argumentNumber;
	}
}
