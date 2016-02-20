package algorithmMaker.util.equalityTesting;

import algorithmMaker.util.equalityTesting.Appearance;

public class NegatedAppearance extends Appearance {

	public NegatedAppearance(Appearance parentAppearance) {
		super(parentAppearance);
	}

	@Override
	public int hashDeclaredData() {
		return 0;
	}

	@Override
	public int compareToSameType(Appearance other) {
		return 0;
	}
}
