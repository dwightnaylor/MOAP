package algorithmMaker.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import algorithmMaker.input.*;
import algorithmMaker.input.impl.InputFactoryImpl;

public class InputUtil {

	/**
	 * All of the types that should appear in the reduced kernel language
	 */
	public static enum InputType {
		Input, Problem, ORing, ANDing, Atomic, Quantifier
	}

	public static InputType type(EObject object) {
		if (object instanceof Input)
			return InputType.Input;
		else if (object instanceof Problem)
			return InputType.Problem;
		else if (object instanceof ORing)
			return InputType.ORing;
		else if (object instanceof ANDing)
			return InputType.ANDing;
		else if (object instanceof Atomic)
			return InputType.Atomic;
		else if (object instanceof Quantifier)
			return InputType.Quantifier;

		return null;
	}

	/**
	 * Creates a copy of the given property, but with all variables converted
	 * according to the given hashtable.
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
	 * Gets all of the non-grouping properties that are children of the given
	 * property. In other words, returns all of the ANDed or ORed children of
	 * the given property.
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

	public static Property andTogether(ArrayList<Property> properties) {
		if (properties.size() == 0)
			return null;

		Property rhs = properties.get(0);
		for (int i = 1; i < properties.size(); i++) {
			ANDing newRhs = InputFactoryImpl.eINSTANCE.createANDing();
			newRhs.setRight(rhs);
			newRhs.setLeft(properties.get(i));
			rhs = newRhs;
		}
		return rhs;
	}

	public static EObject getDeclaration(EObject property, String var) {
		EObject parent = property;
		while (parent != null) {
			if (parent instanceof Problem)
				for (String declaration : ((Problem) parent).getVars())
					if (var.equals(declaration))
						return parent;

			parent = parent.eContainer();
		}
		return null;
	}

	public static HashSet<String> getUnboundVariables(EObject property) {
		HashSet<String> unboundVars = new HashSet<String>();
		TreeIterator<EObject> contents = property.eAllContents();
		do {
			if (property instanceof Atomic)
				for (String var : ((Atomic) property).getArgs())
					if (getDeclaration(property, var) == null)
						unboundVars.add(var);

			property = contents.next();
		} while (contents.hasNext());

		return unboundVars;
	}
}
