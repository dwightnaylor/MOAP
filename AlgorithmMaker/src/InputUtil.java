import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import algorithmMaker.input.ANDing;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.ORing;
import algorithmMaker.input.Property;

public class InputUtil {

	/**
	 * Creates a copy of the given property, but with all variables converted according to the given hashtable.
	 */
	public static Property revar(Property property, Hashtable<String, String> revars) {
		Property clone = (Property) new EcoreUtil.Copier().copy(property);
		TreeIterator<EObject> contents = clone.eAllContents();
		while (contents.hasNext()) {
			EObject cur = contents.next();
			if (cur instanceof Atomic)
				((Atomic) cur).getArgs().replaceAll(x -> revars.containsKey(x) ? revars.get(x) : x);
		}
		if (clone instanceof Atomic)
			((Atomic) clone).getArgs().replaceAll(x -> revars.containsKey(x) ? revars.get(x) : x);

		return clone;
	}

	/**
	 * Gets all of the non-grouping properties that are children of the given property. In other words, returns all of the ANDed or ORed children of the given
	 * property.
	 */
	public static ArrayList<Property> getGrouped(Property property) {
		ArrayList<Property> ret = new ArrayList<Property>();
		TreeIterator<EObject> contents = property.eAllContents();
		while (contents.hasNext()) {
			EObject next = contents.next();
			if (!(next instanceof ANDing) && !(next instanceof ORing))
				ret.add((Atomic) next);
		}
		return ret;
	}
}