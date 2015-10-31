package algorithmMaker.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import algorithmMaker.QuickParser;
import algorithmMaker.input.ANDing;
import algorithmMaker.input.Argument;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.BooleanLiteral;
import algorithmMaker.input.Declaration;
import algorithmMaker.input.Input;
import algorithmMaker.input.Negation;
import algorithmMaker.input.ORing;
import algorithmMaker.input.Problem;
import algorithmMaker.input.Property;
import algorithmMaker.input.Quantifier;
import algorithmMaker.input.Type;
import algorithmMaker.input.Variable;
import algorithmMaker.input.impl.InputFactoryImpl;

/**
 * The class for basic operations on the ecore Input objects. Anything that does
 * a fundamental transform of the objects should instead go in
 * TransformUtil.java in the AlgorithMaker project.
 * 
 * @author Dwight Naylor
 */
public class InputUtil {

	public static final String CHILD_TYPE_MARKER = "child_type_";
	public static final String TYPE_MARKER = "type_";
	public static final String BOUND = "BOUND";
	public static final String UNBOUND = "UNBOUND";
	public static final String EQUAL = "equal";

	public static final String TEST = "Test";
	public static final String FIND = "Find";

	public static final Comparator<EObject> INPUT_COMPARATOR = new Comparator<EObject>() {
		@Override
		public int compare(EObject input1, EObject input2) {
			return input2.toString().compareTo(input1.toString());
		}
	};

	/**
	 * All of the types that should appear in the reduced kernel language. These
	 * are listed here to allow for easy switch-statement use over all of the
	 * kernel types. Just use a switch statement over the
	 * kernelType(object.getClass()) of your object.
	 */
	public static enum KernelType {
		Input, Problem, ORing, ANDing, Atomic, Quantifier, BooleanLiteral, Negation
	}

	public static KernelType kernelType(EObject object) {
		if (object instanceof Input)
			return KernelType.Input;
		else if (object instanceof Problem)
			return KernelType.Problem;
		else if (object instanceof ORing)
			return KernelType.ORing;
		else if (object instanceof ANDing)
			return KernelType.ANDing;
		else if (object instanceof Atomic)
			return KernelType.Atomic;
		else if (object instanceof Quantifier)
			return KernelType.Quantifier;
		else if (object instanceof BooleanLiteral)
			return KernelType.BooleanLiteral;
		else if (object instanceof Negation)
			return KernelType.Negation;

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
		Property clone = stupidCopy(property);
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

	@SuppressWarnings("unchecked")
	public static <P extends Property> P stupidCopy(P property) {
		// TODO:DN: Fix these three stupid methods and find a better way...
		return (P) QuickParser.parseProperty(property.toString());
	}

	@SuppressWarnings("unchecked")
	public static <P extends Problem> P stupidCopy(P problem) {
		return (P) QuickParser.parseProblem(problem.toString());
	}

	@SuppressWarnings("unchecked")
	public static <I extends Input> I stupidCopy(I input) {
		return (I) QuickParser.parseInput(input.toString());
	}

	public static Property andTogether(ArrayList<Property> properties) {
		if (properties.size() == 0)
			return null;

		int index = 0;
		Property rhs = null;
		while (rhs == null) {
			rhs = properties.get(index++);
		}
		for (; index < properties.size(); index++) {
			Property cur = properties.get(index);
			if (cur != null) {
				ANDing newRhs = InputFactoryImpl.eINSTANCE.createANDing();
				newRhs.setRight(rhs);
				newRhs.setLeft(cur);
				rhs = newRhs;
			}
		}
		return rhs;
	}

	public static Property orTogether(ArrayList<Property> properties) {
		if (properties.size() == 0)
			return null;

		int index = 0;
		Property rhs = null;
		while (rhs == null) {
			rhs = properties.get(index++);
		}
		for (; index < properties.size(); index++) {
			Property cur = properties.get(index);
			if (cur != null) {
				ORing newRhs = InputFactoryImpl.eINSTANCE.createORing();
				newRhs.setRight(rhs);
				newRhs.setLeft(cur);
				rhs = newRhs;
			}
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
		for (String arg : args)
			atomic.getArgs().add(getVariable(arg));

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

	/**
	 * Canonicalizes the given Property (makes a new version that is
	 * canonicalized) according to the rules at
	 * http://integral-table.com/downloads/logic.pdf. No changes are made to the
	 * original input.<br>
	 * <br>
	 * Rules not included:<br>
	 * Associative : grouping is eliminated during parsing
	 */
	public static Property canonicalize(Property cur) {
		if (cur == null)
			return null;

		// Rules added according to their listing at
		// http://integral-table.com/downloads/logic.pdf

		switch (InputUtil.kernelType(cur)) {
		case ANDing: {
			ANDing anding = (ANDing) cur;
			// RULE: Idempotent
			HashSet<Property> hashedANDed = new HashSet<Property>(InputUtil.getANDed(anding));

			// RULE: Identity
			hashedANDed.remove(InputUtil.getBooleanLiteral(true));
			// RULE: Universal Bound
			if (hashedANDed.contains(InputUtil.getBooleanLiteral(false)))
				return InputUtil.getBooleanLiteral(false);
			// RULE: Negation
			for (Property possibleNegation : hashedANDed)
				if (possibleNegation instanceof Negation
						&& hashedANDed.contains(((Negation) possibleNegation).getNegated()))
					return InputUtil.getBooleanLiteral(false);
			// RULE: Absorption
			for (Property possibleORing : hashedANDed)
				if (possibleORing instanceof ORing)
					for (Property ORed : getORed((ORing) possibleORing))
						if (hashedANDed.contains(ORed)) {
							hashedANDed.remove(possibleORing);
							break;
						}

			ArrayList<Property> andedNoRepeats = new ArrayList<Property>(hashedANDed);
			// RULE: Commutative
			Collections.sort(andedNoRepeats, INPUT_COMPARATOR);
			andedNoRepeats.replaceAll(x -> canonicalize(x));
			return InputUtil.andTogether(andedNoRepeats);
		}
		case ORing: {
			ORing oring = (ORing) cur;
			// RULE: Idempotent
			HashSet<Property> hashedORed = new HashSet<Property>(InputUtil.getORed(oring));
			// RULE: Identity
			hashedORed.remove(InputUtil.getBooleanLiteral(false));
			// RULE: Universal Bound
			if (hashedORed.contains(InputUtil.getBooleanLiteral(true)))
				return InputUtil.getBooleanLiteral(true);
			// RULE: Negation
			for (Property possibleNegation : hashedORed)
				if (possibleNegation instanceof Negation
						&& hashedORed.contains(((Negation) possibleNegation).getNegated()))
					return InputUtil.getBooleanLiteral(true);
			// RULE: Absorption
			for (Property possibleANDing : hashedORed)
				if (possibleANDing instanceof ANDing)
					for (Property ANDed : getANDed((ANDing) possibleANDing))
						if (hashedORed.contains(ANDed)) {
							hashedORed.remove(possibleANDing);
							break;
						}

			ArrayList<Property> oredNoRepeats = new ArrayList<Property>(hashedORed);
			// RULE: Commutative
			Collections.sort(oredNoRepeats, INPUT_COMPARATOR);
			oredNoRepeats.replaceAll(x -> canonicalize(x));
			return InputUtil.andTogether(oredNoRepeats);
		}
		case Negation: {
			Negation negation = (Negation) cur;
			// RULE: Double Negative
			Property negated = negation.getNegated();
			if (negated instanceof Negation)
				return canonicalize(((Negation) negated).getNegated());

			// RULE: Demorgan's Law (AND)
			if (negated instanceof ANDing) {
				ArrayList<Property> children = InputUtil.getANDed((ANDing) negated);
				children.replaceAll(x -> getNegated(InputUtil.stupidCopy(x)));
				return orTogether(children);
			}
			// RULE: Demorgan's Law (OR)
			if (negated instanceof ORing) {
				ArrayList<Property> children = InputUtil.getORed((ORing) negated);
				children.replaceAll(x -> getNegated(InputUtil.stupidCopy(x)));
				return andTogether(children);
			}

			return InputUtil.stupidCopy(negation);
		}
		case Quantifier: {
			Quantifier quantifier = (Quantifier) cur;
			Property newSubject = canonicalize(quantifier.getSubject().getProperty());
			Property newPredicate = canonicalize(quantifier.getPredicate());
			// TODO: Deal with quantifier canonicalization (negation...)

			Quantifier ret = (Quantifier) InputUtil.stupidCopy(cur);
			ret.getSubject().setProperty(newSubject);
			ret.setPredicate(newPredicate);
			return ret;
		}
		case BooleanLiteral:
		case Atomic:
		case Input:
		case Problem:
		default:
			return InputUtil.stupidCopy(cur);
		}
	}

	private static Negation getNegated(Property x) {
		Negation ret = InputFactoryImpl.eINSTANCE.createNegation();
		ret.setNegated(x);
		return ret;
	}

	private static BooleanLiteral getBooleanLiteral(boolean b) {
		BooleanLiteral ret = InputFactoryImpl.eINSTANCE.createBooleanLiteral();
		ret.setValue((b + "").toUpperCase());
		return ret;
	}

	public static EObject reduce(EObject cur, InputConverter reducer) {
		if (cur == null)
			return null;

		switch (InputUtil.kernelType(cur)) {
		case ANDing: {
			ANDing anding = ((ANDing) cur);
			EObject andLeft = reduce(anding.getLeft(), reducer);
			EObject andRight = reduce(anding.getRight(), reducer);
			if (andLeft != null && andRight != null) {
				ANDing andRet = InputFactoryImpl.eINSTANCE.createANDing();
				andRet.setLeft((Property) andLeft);
				andRet.setRight((Property) andRight);
				return reducer.apply(andRet);
			}
			if (andLeft != null)
				return andLeft;
			if (andRight != null)
				return andRight;

			return null;
		}
		case ORing: {
			ORing oring = ((ORing) cur);
			EObject orLeft = reduce(oring.getLeft(), reducer);
			EObject orRight = reduce(oring.getRight(), reducer);
			if (orLeft != null && orRight != null) {
				ORing orRet = InputFactoryImpl.eINSTANCE.createORing();
				orRet.setLeft((Property) orLeft);
				orRet.setRight((Property) orRight);
				return reducer.apply(orRet);
			}
			if (orLeft != null)
				return orLeft;
			if (orRight != null)
				return orRight;

			return null;
		}
		case Quantifier: {
			Quantifier quantifier = (Quantifier) cur;
			EObject newRequirement = reduce(quantifier.getSubject(), reducer);
			EObject newResult = reduce(quantifier.getPredicate(), reducer);
			if (newRequirement == null || newResult == null)
				return null;

			Quantifier quantifierRet = InputUtil.stupidCopy((Quantifier) cur);
			quantifierRet.setSubject((Problem) newRequirement);
			quantifierRet.setPredicate((Property) newResult);
			return reducer.apply(quantifierRet);
		}
		case Problem: {
			EObject property = reduce(((Problem) cur).getProperty(), reducer);

			Problem problemRet = InputUtil.stupidCopy((Problem) cur);
			problemRet.setProperty((Property) property);
			return reducer.apply(problemRet);
		}
		case Input: {
			Input input = (Input) cur;
			EObject newGiven = reduce(input.getGiven(), reducer);
			EObject newGoal = reduce(input.getGoal(), reducer);

			Input inputRet = InputUtil.stupidCopy(input);
			inputRet.setGiven((Problem) newGiven);
			inputRet.setGoal((Problem) newGoal);
			return reducer.apply(inputRet);
		}
		case Negation:
			EObject negated = reduce(((Negation) cur).getNegated(), reducer);
			if (negated == null)
				return null;

			Negation ret = InputFactoryImpl.eINSTANCE.createNegation();
			ret.setNegated((Property) negated);
			return ret;
		case Atomic:
			return reducer.apply(InputUtil.stupidCopy((Atomic) cur));
		case BooleanLiteral:
			return reducer.apply(InputUtil.stupidCopy((BooleanLiteral) cur));
		default:
			throw new UnsupportedOperationException("Only kernel types can be passed to a reducer.");
		}
	}

	public static Declaration findDeclarationFor(Variable variable) {
		EObject parent = variable;
		while (parent != null) {
			if (parent instanceof Problem)
				for (Declaration declaration : ((Problem) parent).getVars())
					if (declaration.getVarName().equals(variable.getArg()))
						return declaration;

			parent = parent.eContainer();
		}
		return null;
	}

	public static boolean isTypeAtomic(String function) {
		return function != null && function.startsWith(TYPE_MARKER);
	}

	public static boolean isChildTypeAtomic(String function) {
		return function != null && function.startsWith(CHILD_TYPE_MARKER);
	}

	public static String getDeclaredType(String function) {
		return function.substring(TYPE_MARKER.length());
	}

	public static String getDeclaredChildType(String function) {
		return function.substring(CHILD_TYPE_MARKER.length());
	}

	public static ArrayList<Property> getTopLevelAtomics(Property property) {
		if (property instanceof Atomic)
			return new ArrayList<Property>(Collections.singleton((Atomic) property));
		else if (property instanceof ANDing)
			return getANDed((ANDing) property);

		return new ArrayList<Property>();
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
				properties.add(InputUtil.getAtomic(InputUtil.TYPE_MARKER + type.getName(), declaration.getVarName()));
				if (type.getTemplateType() != null)
					properties.add(InputUtil.getAtomic(InputUtil.CHILD_TYPE_MARKER + type.getTemplateType(),
							declaration.getVarName()));

				declaration.setType(null);
			}
		}
		problem.setProperty(InputUtil.andTogether(properties));
	}
}
