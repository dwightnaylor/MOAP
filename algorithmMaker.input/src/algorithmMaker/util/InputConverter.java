package algorithmMaker.util;

import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

public interface InputConverter extends Function<EObject, EObject> {
};