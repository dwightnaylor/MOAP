package runtimeAnalysis;

public class MultiplicationMerger implements RuntimeMerger {

	private int multiplier;

	public MultiplicationMerger(int multiplier) {
		this.multiplier = multiplier;
	}

	@Override
	public int mergeRuntimes(int... runtimes) {
		return multiplier * runtimes[0];
	}

}
