package runtimeAnalysis;

public class ConstantMerger implements RuntimeMerger {

	private final int k;

	public ConstantMerger(int k) {
		this.k = k;
	}

	@Override
	public int mergeRuntimes(int... runtimes) {
		return k;
	}
}
