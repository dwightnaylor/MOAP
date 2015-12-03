package theorems.multiTheorems;

import pseudocoders.LineCoder;
import theorems.MultistageTheorem;

//TODO:DN: Should rethink direct return very carefully
public class DirectReturn extends MultistageTheorem {

	private static final String DESCRIPTION = "If there are no additional requirements for a variable, we can just return it.";
	public static final String VAR_NAME = "var";

	public DirectReturn() {
		super(null, null, null, 0, DESCRIPTION, new LineCoder("return would go here."));
	}
}
