package algorithmMaker.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import algorithmMaker.input.ANDing;
import algorithmMaker.input.Argument;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.BooleanLiteral;
import algorithmMaker.input.Declaration;
import algorithmMaker.input.Input;
import algorithmMaker.input.ORing;
import algorithmMaker.input.Problem;
import algorithmMaker.input.Property;
import algorithmMaker.input.Quantifier;
import algorithmMaker.input.Type;
import algorithmMaker.input.Variable;
import algorithmMaker.input.impl.InputFactoryImpl;

public class InputUtil {

	public static final String BOUND = "BOUND";
	public static final String UNBOUND = "UNBOUND";
	public static final String EQUAL = "equal";

	public static final String TEST = "Test";
	public static final String FIND = "Find";

	/**
	 * All of the types that should appear in the reduced kernel language
	 */
	public static enum InputType {
		Input, Problem, ORing, ANDing, Atomic, Quantifier, BooleanLiteral
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
		else if (object instanceof BooleanLiteral)
			return InputType.BooleanLiteral;

		return null;
	}
	
	/**
	 * Sets the given problem to contain all the variables that appear within
	 * it.
	 */
	public static void compactVariables(Problem problem) {
		problem.getVars().clear();
		ArrayList<Declaration> declarations = new ArrayList<Declaration>();
		for (String var : InputUtil.getUnboundVariables(problem.getProperty()))
			declarations.add(createDeclaration(var));

		problem.getVars().addAll(declarations);
	}

	/**
	 * Creates a copy of the given property, but with all variables converted
	 * according to the given hashtable.
	 */
	public static Property revar(Property property, Hashtable<Argument, Argument> revars) {
		Property clone = (Property) new EcoreUtil.Copier().copy(property);
		TreeIterator<EObject> contents = clone.eAllContents();
		while (contents.hasNext()) {
			EObject cur = contents.next();
			if (cur instanceof Atomic)
				((Atomic) cur).getArgs().replaceAll(x -> revars.containsKey(x) ? EcoreUtil.copy(revars.get(x)) : x);
		}
		if (clone instanceof Atomic)
			((Atomic) clone).getArgs().replaceAll(x -> revars.containsKey(x) ? EcoreUtil.copy(revars.get(x)) : x);

		return clone;
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

	public static EObject getDeclaringObject(EObject property, String var) {
		EObject parent = property;
		while (parent != null) {
			if (parent instanceof Problem)
				for (Declaration declaration : ((Problem) parent).getVars())
					if (var.equals(declaration.getVarName()))
						return parent;

			parent = parent.eContainer();
		}
		return null;
	}

	public static HashSet<String> getUnboundVariables(EObject property) {
		HashSet<String> unboundVars = new HashSet<String>();
		TreeIterator<EObject> contents = property.eAllContents();
		while (true) {
			// Iterate through everything, including the property itself
			if (property instanceof Variable) {
				String arg = ((Variable) property).getArg();
				if (getDeclaringObject(property, arg) == null)
					unboundVars.add(arg);
			}

			if (contents.hasNext())
				property = contents.next();
			else
				break;
		}

		return unboundVars;
	}

	public static Declaration createDeclaration(String var) {
		Declaration ret = InputFactoryImpl.eINSTANCE.createDeclaration();
		ret.setVarName(var);
		return ret;
	}

	public static ArrayList<Property> getANDed(ANDing a) {
		ArrayList<Property> ret = new ArrayList<Property>();
		addANDed(a, ret);
		return ret;
	}

	public static void addANDed(ANDing a, ArrayList<Property> list) {
		if (a.getLeft() instanceof ANDing)
			addANDed((ANDing) a.getLeft(), list);
		else
			list.add(a.getLeft());

		if (a.getRight() instanceof ANDing)
			addANDed((ANDing) a.getRight(), list);
		else
			list.add(a.getRight());
	}

	public static ArrayList<Property> getORed(ORing a) {
		ArrayList<Property> ret = new ArrayList<Property>();
		addORed(a, ret);
		return ret;
	}

	public static void addORed(ORing a, ArrayList<Property> list) {
		if (a.getLeft() instanceof ORing)
			addORed((ORing) a.getLeft(), list);
		else
			list.add(a.getLeft());

		if (a.getRight() instanceof ORing)
			addORed((ORing) a.getRight(), list);
		else
			list.add(a.getRight());
	}

	public static Atomic getAtomic(String function, String... args) {
		Atomic atomic = InputFactoryImpl.eINSTANCE.createAtomic();
		atomic.setFunction(function);
		ArrayList<Argument> actualArgs = new ArrayList<Argument>();
		for (String arg : args)
			actualArgs.add(getVariable(arg));

		atomic.getArgs().addAll(actualArgs);
		return atomic;
	}

	public static Variable getVariable(String arg) {
		Variable var = InputFactoryImpl.eINSTANCE.createVariable();
		var.setArg(arg);
		return var;
	}

	// TODO:DN: We should check to make sure no theorems ever have bound or
	// unbound as results.
	public static boolean containsAtomic(Property property, String function) {
		TreeIterator<EObject> contents = property.eAllContents();
		while (contents.hasNext()) {
			EObject next = contents.next();
			if (next instanceof Atomic && ((Atomic) next).getFunction().equals(function))
				return true;
		}
		return false;
	}

	public static ArrayList<String> getBindings(Property property) {
		ArrayList<String> ret = new ArrayList<String>();
		if (property != null) {
			TreeIterator<EObject> contents = property.eAllContents();
			while (contents.hasNext()) {
				EObject next = contents.next();
				if (next instanceof Atomic && ((Atomic) next).getFunction().equals(InputUtil.BOUND))
					ret.add(((Variable) ((Atomic) next).getArgs().get(0)).getArg());
			}
		}
		return ret;
	}

	public static boolean isSpecial(String function) {
		return function.equals(BOUND) || function.equals(UNBOUND) || function.equals(EQUAL);
	}

	public static String[] getVarNames(Collection<Declaration> declarations) {
		return declarations.stream().map(x -> x.getVarName()).toArray(size -> new String[size]);
	}

	public static void desugar(Input input) {
		desugar(input.getGiven());
		desugar(input.getGoal());
	}

	public static void desugar(Problem problem) {
		ArrayList<Property> properties = new ArrayList<Property>();
		properties.add(problem.getProperty());
		for (Declaration declaration : problem.getVars()) {
			Type type = declaration.getType();
			if (type != null) {
				properties.add(InputUtil.getAtomic("type_" + type.getName(), declaration.getVarName()));
				if (type.getTemplateType() != null)
					properties
							.add(InputUtil.getAtomic("child_type_" + type.getTemplateType(), declaration.getVarName()));

				declaration.setType(null);
			}
		}
		problem.setProperty(InputUtil.andTogether(properties));
	}
}
