import java.util.ArrayList;
import java.util.Hashtable;

import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;

/**
 * Chains together facts using existing theorems to arrive at conclusions. Includes "costs" for each
 * theorem, which allow a priority-queue to determine when each theorem should be applied.
 * 
 * @author Dwight Naylor
 */
public class Chainer {
	/**
	 * Map from the method name to the list of theorems that may be looking for its use.
	 */
	Hashtable<String, ArrayList<Theorem>> theoremCatchers = new Hashtable<String, ArrayList<Theorem>>();
	/**
	 * Map from the variable name to the list of partially-completed theorems that may be waiting for it.
	 */
	Hashtable<Atomic, ArrayList<ArrayList<String>>> catchers = new Hashtable<Atomic, ArrayList<ArrayList<String>>>();

	ArrayList<Property> toChain = new ArrayList<Property>();

	ArrayList<Theorem> theorems = new ArrayList<Theorem>();

	public Chainer(ArrayList<Theorem> theorems) {
//		for (Theorem theorem : theorems) {
//			Property requirement = theorem.requirement;
//			if(requirement instanceof Atomic){
//				catchers.put(((Atomic) requirement).getFunction(), arg1)
//			}else if (requirement instanceof ANDing){
//				
//			}
//		}
	}
}
