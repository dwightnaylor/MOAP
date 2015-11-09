package pseudocoders;

import theorems.MultistageTheorem;
import bindings.Binding;

public interface Pseudocoder {
	public void appendPseudocode(StringBuilder builder, int numTabs, Binding binding, MultistageTheorem childTheorem);
}
