package algorithmMaker.util;

import java.util.*;

import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.EObject;

import algorithmMaker.QuickParser;
import algorithmMaker.input.*;
import algorithmMaker.input.impl.InputFactoryImpl;

/**
 * The class for basic operations on the ecore Input objects. Anything that does a fundamental transform of the objects
 * should instead go in TransformUtil.java in the AlgorithMaker project.
 * 
 * @author Dwight Naylor
 */
public class InputUtil {

	public static final String CHILD_TYPE_MARKER = "child_type_";
	public static final String TYPE_MARKER = "type_";
	public static final String BOUND = "BOUND";
	public static final String UNBOUND = "UNBOUND";
	public static final String EQUAL = "equal";

	public static final String FORALL = "forall";
	public static final String EXISTS = "exists";

	public static final String ADDITION = "plus";
	public static final String SUBTRACTION = "minus";
	public static final String MULTIPLICATION = "times";
	public static final String DIVISION = "divide";

	public static final Comparator<EObject> INPUT_COMPARATOR = new Comparator<EObject>() {
		@Override
		public int compare(EObject input1, EObject input2) {
			return input1.toString().compareTo(input2.toString());
		}
	};

	/**
	 * All of the types that should appear in the reduced kernel language. These are listed here to allow for easy
	 * switch-statement use over all of the kernel types. Just use a switch statement over the
	 * kernelType(object.getClass()) of your object.<br>
	 * <br>
	 * These all seem to be subclasses of Property...
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

	@SuppressWarnings("unchecked")
	public static <P extends Property> P stupidCopy(P property) {
		// TODO:DN: Fix these three stupid methods and find a better way...
		return (P) QuickParser.parseProperty(property.toString());
	}

	public static Theorem stupidCopy(Theorem theorem) {
		return QuickParser.parseTheorem(theorem.toString());
	}

	public static HashSet<String> getDeclaredVars(EObject input) {
		HashSet<String> ret = new HashSet<String>();
		TreeIterator<EObject> contents = input.eAllContents();
		while (contents.hasNext()) {
			EObject next = contents.next();
			if (next instanceof Declaration)
				ret.add(((Declaration) next).getVarName());
		}
		return ret;
	}

	public static Problem stupidCopy(Problem problem) {
		if (problem.getVars() == null || problem.getVars().size() == 0) {
			Problem ret = InputFactoryImpl.eINSTANCE.createProblem();
			ret.setProperty(problem.getProperty() == null ? InputUtil.getBooleanLiteral(true)
					: stupidCopy(problem.getProperty()));
			return ret;
		}
		return QuickParser.parseProblem(problem.toString());
	}

	@SuppressWarnings("unchecked")
	public static <I extends Input> I stupidCopy(I input) {
		return (I) QuickParser.parseInput(input.toString(), false);
	}

	public static Property andTogether(Collection<? extends Property> properties) {
		List<? extends Property> propertyList = new ArrayList<Property>(properties);
		int index = propertyList.size() - 1;
		// Find the first non-null element starting from the end of the list
		Property rhs = null;
		while (rhs == null) {
			if (index == -1)
				return null;

			rhs = propertyList.get(index--);
		}
		for (; index >= 0; index--) {
			Property cur = propertyList.get(index);
			if (cur != null) {
				ANDing newRhs = InputFactoryImpl.eINSTANCE.createANDing();
				newRhs.setRight(rhs);
				newRhs.setLeft(InputUtil.stupidCopy(cur));
				rhs = newRhs;
			}
		}
		return rhs;
	}

	public static Property orTogether(List<Property> properties) {
		int index = properties.size() - 1;
		Property rhs = null;
		while (rhs == null) {
			if (index == -1)
				return null;

			rhs = properties.get(index--);
		}
		for (; index >= 0; index--) {
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

	public static Declaration getDeclaration(EObject property, String var) {
		EObject parent = property;
		while (parent != null) {
			if (parent instanceof Problem)
				for (Declaration declaration : ((Problem) parent).getVars())
					if (var.equals(declaration.getVarName()))
						return declaration;

			if (parent instanceof Input)
				for (Declaration declaration : ((Input) parent).getGiven().getVars())
					if (var.equals(declaration.getVarName()))
						return declaration;

			if (parent instanceof Quantifier)
				for (Declaration declaration : ((Quantifier) parent).getSubject().getVars())
					if (var.equals(declaration.getVarName()))
						return declaration;

			parent = parent.eContainer();
		}
		return null;
	}

	public static HashSet<String> getUsedVars(EObject object) {
		HashSet<String> ret = new HashSet<String>();
		for (EObject subObject : object.eContents()) {
			if (subObject instanceof Atomic)
				for (NumericalProperty prop : ((Atomic) subObject).getArgs())
					if (prop instanceof Variable)
						ret.add(((Variable) prop).getArg());

			if (subObject instanceof Declaration)
				ret.add(((Declaration) subObject).getVarName());
		}

		return ret;
	}

	public static List<String> convertToStrings(EList<? extends EObject> vars) {
		ArrayList<String> ret = new ArrayList<String>();
		for (EObject property : vars) {
			if (property instanceof Declaration)
				ret.add(((Declaration) property).getVarName());
			else if (property instanceof NumericalProperty)
				ret.add(((Variable) property).getArg());
		}
		return ret;
	}

	public static HashSet<String> getUnboundVariables(EObject property) {
		HashSet<String> unboundVars = new HashSet<String>();
		TreeIterator<EObject> contents = property.eAllContents();
		while (true) {
			// Iterate through everything, including the property itself
			if (property instanceof Variable) {
				String var = ((Variable) property).getArg();
				if (getDeclaration(property, var) == null)
					unboundVars.add(var);
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

	public static Atomic createAtomic(String function, String... args) {
		Atomic atomic = InputFactoryImpl.eINSTANCE.createAtomic();
		atomic.setFunction(function);
		for (String arg : args)
			atomic.getArgs().add(createVariable(arg));

		return atomic;
	}

	public static Variable createVariable(String name) {
		Variable ret = InputFactoryImpl.eINSTANCE.createVariable();
		ret.setArg(name);
		return ret;
	}

	/**
	 * Canonicalizes the given Property (makes a new version that is canonicalized) according to the rules at
	 * http://integral-table.com/downloads/logic.pdf. No changes are made to the original input.<br>
	 * <br>
	 * Rules not included:<br>
	 * Associative : grouping is eliminated during parsing
	 */
	public static Property canonicalize(Property toCanonicalize) {
		Property ret = toCanonicalize;
		do {
			toCanonicalize = ret;
			ret = getOneStepCanonizalized(toCanonicalize);
		} while (!ret.equals(toCanonicalize));
		return ret;
	}

	private static Property getOneStepCanonizalized(Property cur) {
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
			if (hashedANDed.isEmpty())
				return InputUtil.getBooleanLiteral(true);
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
			andedNoRepeats.replaceAll(x -> getOneStepCanonizalized(x));
			return InputUtil.andTogether(andedNoRepeats);
		}
		case ORing: {
			ORing oring = (ORing) cur;
			// RULE: Idempotent
			HashSet<Property> hashedORed = new HashSet<Property>(InputUtil.getORed(oring));
			// RULE: Identity
			hashedORed.remove(InputUtil.getBooleanLiteral(false));
			if (hashedORed.isEmpty())
				return InputUtil.getBooleanLiteral(false);
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
			oredNoRepeats.replaceAll(x -> getOneStepCanonizalized(x));
			return InputUtil.orTogether(oredNoRepeats);
		}
		case Negation: {
			Negation negation = (Negation) cur;
			// RULE: Double Negative
			Property negated = negation.getNegated();
			if (negated instanceof Negation)
				return getOneStepCanonizalized(((Negation) negated).getNegated());

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
			// RULE: Quantifier Negation Sinking
			if (negated instanceof Quantifier) {
				Quantifier ret = InputUtil.stupidCopy((Quantifier) negated);
				if (((Quantifier) negated).getQuantifier().equals(InputUtil.FORALL))
					ret.setQuantifier(InputUtil.EXISTS);
				else if (((Quantifier) negated).getQuantifier().equals(InputUtil.EXISTS))
					ret.setQuantifier(InputUtil.FORALL);

				ret.setPredicate(InputUtil.getNegated(ret.getPredicate()));
				return ret;
			}

			return InputUtil.stupidCopy(negation);
		}
		case Quantifier: {
			Quantifier quantifier = (Quantifier) cur;
			Property newSubject = getOneStepCanonizalized(quantifier.getSubject().getProperty());
			Property newPredicate = getOneStepCanonizalized(quantifier.getPredicate());
			// TODO (low): Deal with quantifier ordering (FA(E) vs E(FA))
			// TODO (low): Deal with quantifier splitting

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

	public static Property getNegated(Property x) {
		if (x instanceof Negation)
			return InputUtil.stupidCopy(((Negation) x).getNegated());

		Negation ret = InputFactoryImpl.eINSTANCE.createNegation();
		ret.setNegated(x);
		return ret;
	}

	public static BooleanLiteral getBooleanLiteral(boolean b) {
		BooleanLiteral ret = InputFactoryImpl.eINSTANCE.createBooleanLiteral();
		ret.setValue((b + "").toUpperCase());
		return ret;
	}

	public static EObject reduce(EObject cur, InputConverter reducer) {
		if (cur == null)
			return null;

		KernelType kernelType = InputUtil.kernelType(cur);
		// If we're not dealing with a kernel type, just pass it down and hope
		// everything turns out alright.
		if (kernelType == null) {
			return reducer.apply(InputUtil.stupidCopy((Property) cur));
		}
		switch (kernelType) {
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
			// We have to do the predicate first TODO: Why?
			EObject newResult = reduce(quantifier.getPredicate(), reducer);
			EObject newRequirement = reduce(quantifier.getSubject(), reducer);
			if (newRequirement == null || newResult == null)
				return null;

			Quantifier quantifierRet = InputUtil.stupidCopy((Quantifier) cur);
			quantifierRet.setSubject((Problem) newRequirement);
			quantifierRet.setPredicate((Property) newResult);
			return reducer.apply(quantifierRet);
		}
		case Problem: {
			Problem problemRet = InputUtil.stupidCopy((Problem) cur);
			Property reducedProperty = (Property) reduce(problemRet.getProperty(), reducer);
			problemRet.setProperty(reducedProperty == null ? InputUtil.getBooleanLiteral(true) : reducedProperty);
			return reducer.apply(problemRet);
		}
		case Input: {
			Input input = (Input) cur;
			// We have to do the goal first //TODO: Why?
			EObject newGoal = reduce(input.getGoal(), reducer);
			EObject newGiven = reduce(input.getGiven(), reducer);

			Input inputRet = InputUtil.stupidCopy(input);
			inputRet.setGiven((Problem) newGiven);
			inputRet.setGoal((Problem) newGoal);
			return reducer.apply(inputRet);
		}
		case Negation: {
			EObject negated = reduce(((Negation) cur).getNegated(), reducer);
			if (negated == null)
				return null;

			Negation ret = InputFactoryImpl.eINSTANCE.createNegation();
			ret.setNegated((Property) negated);
			return reducer.apply(ret);
		}
		case Atomic:
			return reducer.apply(InputUtil.stupidCopy((Atomic) cur));
		case BooleanLiteral:
			return reducer.apply(InputUtil.stupidCopy((BooleanLiteral) cur));
		default:
			throw new UnsupportedOperationException("Only kernel types can be passed to a reducer.");
		}
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

	public static ArrayList<Property> getTopLevelElements(Property property) {
		if (property instanceof ANDing)
			return getANDed((ANDing) property);
		else
			return new ArrayList<Property>(Collections.singleton(property));
	}

	public static Quantifier createQuantifier(String quantifier, Problem subject, Property predicate) {
		Quantifier ret = InputFactoryImpl.eINSTANCE.createQuantifier();
		ret.setQuantifier(quantifier);
		ret.setSubject(subject);
		ret.setPredicate(predicate);
		return ret;
	}

	public static Problem createProblem(Collection<String> args, Property property) {
		Problem ret = InputFactoryImpl.eINSTANCE.createProblem();
		for (String arg : args)
			ret.getVars().add(InputUtil.createDeclaration(arg));

		ret.setProperty(property);
		return ret;
	}

	public static String getUnusedVar(Set<String> usedVars) {
		for (char ret = 'a'; ret <= 'z'; ret++) {
			String retString = "n" + ret;
			if (!usedVars.contains(retString))
				return retString;
		}
		throw new RuntimeException("Ran out of new variable names.");
	}

	public static boolean isArithmetic(String string) {
		return getSymbol(string) != null;
	}

	public static String getSymbol(String function) {
		switch (function) {
		case ADDITION:
			return "+";
		case SUBTRACTION:
			return "-";
		case MULTIPLICATION:
			return "*";
		case DIVISION:
			return "/";
		}
		return null;
	}

	private static int uniqueVarID = 0;

	public static String getUniqueVariableIdentifier() {
		return "UNIQUEVAR" + uniqueVarID++;
	}
}
