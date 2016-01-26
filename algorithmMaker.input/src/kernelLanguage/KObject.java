package kernelLanguage;

/**
 * The basic object of the kernel. Atomic, Quantifier, Inputs, Problems, ANDings, Negation, BooleanLiteral?
 * 
 * @author Dwight Naylor
 */
public abstract class KObject {
	private int hashcode = Integer.MAX_VALUE;
	private String toString;

	@Override
	public final int hashCode() {
		if (hashcode == Integer.MAX_VALUE)
			hashcode = calculateHashCode();

		return hashcode;
	}

	abstract int calculateHashCode();

	@Override
	public final String toString() {
		if (toString == null)
			toString = calculateToString();

		return toString;
	}

	abstract String calculateToString();

	/**
	 * A rough validation method used for debugging. Provides early catching of bad kernels. Currently only does the
	 * following:<br>
	 * Reports double-declared variables.
	 * 
	 */
	public abstract void validate();
}
