package bindings.equalityTesting;

import java.util.*;

import algorithmMaker.input.*;
import algorithmMaker.util.InputUtil;
import bindings.Binding;

public class EqualityTester {
//	/**
//	 * Finds all the bindings from the original property to the new property
//	 * that will make the two equivalent.
//	 */
//	public static Enumeration<Binding> getEquivalentBindings(Property originalProperty, Property newProperty) {
//		// A map of all the lists of
//		Hashtable<ArrayList<String>, ArrayList<String>> variableProperties = new Hashtable<ArrayList<String>, ArrayList<String>>();
//	}
//
//	private void addAppearances(Property property, Hashtable<String, ArrayList<Appearance>> appearances) {
//		switch (InputUtil.kernelType(property)) {
//		case ANDing: {
//			for (Property subProperty : InputUtil.getANDed((ANDing) property)) {
//				addAppearances(subProperty, appearances, prefix);
//			}
//		}
//		case Atomic: {
//			Atomic atomic = (Atomic) property;
//			for (int i = 0; i < atomic.getArgs().size(); i++) {
//				Variable argument = (Variable) atomic.getArgs().get(i);
//				if (!appearances.containsKey(argument.getArg()))
//					appearances.put(argument.getArg(), new ArrayList<Appearance>());
//
//				appearances.get(argument.getArg()).add(new AtomicAppearance(atomic.getFunction(), i));
//			}
//		}
//		case Negation: {
//			addAppearances(((Negation) property).getNegated(), appearances, prefix + "!");
//		}
//		case Quantifier:
//			break;
//		case Problem:
//		case Input:
//		case ORing:
//			throw new UnsupportedOperationException();
//		case BooleanLiteral:
//		case ProblemShell:
//		default:
//			return;
//		}
//	}
}
