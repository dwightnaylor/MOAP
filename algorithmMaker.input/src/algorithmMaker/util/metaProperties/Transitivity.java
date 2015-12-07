package algorithmMaker.util.metaProperties;

import java.util.*;

public class Transitivity implements MetaProperty {

	private static final HashSet<String> properties = new HashSet<String>(
			Arrays.asList(new String[] { "lessThanEqual", "greaterThanEqual", "lessThan", "greaterThan", "equal" }));

	public Transitivity() {
	}
	
	@Override
	public boolean hasAtomic(String function) {
		return properties.contains(function);
	}

}
