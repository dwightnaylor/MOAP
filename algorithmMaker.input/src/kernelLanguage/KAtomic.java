package kernelLanguage;

import static kernelLanguage.KernelFactory.TRUE;

import java.util.*;

public class KAtomic extends KProperty {
	public final String function;
	public final List<String> args;

	KAtomic(String function, List<String> args) {
		this.function = function;
		this.args = args;
	}

	@Override
	int calculateHashCode() {
		int ret = function.hashCode();
		for (String arg : args)
			ret *= arg.hashCode();

		return ret;
	}

	@Override
	String calculateToString() {
		StringBuffer ret = new StringBuffer();
		ret.append(function);
		ret.append('(');
		for (int i = 0; i < args.size(); i++) {
			if (i > 0)
				ret.append(',');

			ret.append(args.get(i));
		}
		ret.append(')');
		return ret.toString();
	}

	@Override
	protected KProperty without(HashSet<KProperty> toRemove) {
		if (toRemove.contains(this))
			return TRUE;

		return this;
	}

	@Override
	public void validate() {
	}
}
