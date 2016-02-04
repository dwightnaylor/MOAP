package runtimeAnalysis;

public class AdditionMerger implements RuntimeMerger {

	private int addend;

	public AdditionMerger(int addend) {
		this.addend = addend;
	}

	@Override
	public int mergeRuntimes(int... runtimes) {
		return addend + runtimes[0];
	}

}
