package algorithmMaker.util;

import static kernelLanguage.KernelFactory.*;
import static algorithmMaker.util.InputUtil.*;

import java.util.*;
import java.util.stream.Collectors;

import kernelLanguage.*;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import algorithmMaker.QuickParser;
import algorithmMaker.input.*;
import algorithmMaker.input.impl.InputFactoryImpl;

/**
 * The class responsible for all of the "sugaring" and "desugaring" of input
 * 
 * @author Dwight Naylor
 */
public class SugarUtil {

	private static final Hashtable<EObject, KObject> kernelObjects = new Hashtable<EObject, KObject>();

	public static Input convertToInput(KInput input) {
		return QuickParser.parseInput(input.toString());
	}

	public static KObject convertToKernel(EObject object) {
		if (!kernelObjects.containsKey(object)) {
			switch (reducedType(object)) {
			case ANDing:
				kernelObjects.put(object, and((KProperty) convertToKernel(((ANDing) object).getLeft()),
						(KProperty) convertToKernel(((ANDing) object).getRight())));
				break;
			case Atomic:
				kernelObjects.put(object,
						atomic(((Atomic) object).getFunction(), convertToStrings(((Atomic) object).getArgs())));
				break;
			case BooleanLiteral:
				kernelObjects.put(object, bool(((BooleanLiteral) object).getValue().equals("TRUE")));
				break;
			case Input:
				Problem goal = ((Input) object).getGoal();
				kernelObjects.put(object,
						KernelUtil.withMinimumVariables(input((KProblem) convertToKernel(((Input) object).getGiven()),
								goal == null ? NULL_PROBLEM : (KProblem) convertToKernel(goal))));
				break;
			case Negation:
				kernelObjects.put(object, negate((KProperty) convertToKernel(((Negation) object).getNegated())));
				break;
			case Problem:
				Property property = ((Problem) object).getProperty();
				kernelObjects
						.put(object,
								problem(((Problem) object).getVars().stream().map(x -> x.getVarName())
										.collect(Collectors.toList()),
								property == null ? TRUE : (KProperty) convertToKernel(property)));
				break;
			case Quantifier:
				kernelObjects.put(object,
						quantifier(
								((Quantifier) object).getQuantifier().equals(FORALL) ? KQuantifier.Quantifier.forall
										: KQuantifier.Quantifier.exists,
								(KProblem) convertToKernel(((Quantifier) object).getSubject())));
				break;
			case ORing:
				kernelObjects.put(object, or((KProperty) convertToKernel(((ORing) object).getLeft()),
						(KProperty) convertToKernel(((ORing) object).getRight())));
				break;
			}
		}
		return kernelObjects.get(object);
	}

	private static Property getDesugaredTypeDeclaration(Type type, String varName, HashSet<String> usedVars) {
		Property ret = createAtomic(TYPE_MARKER + type.getName(), varName);
		if (type.getTemplateType() != null) {
			String newVar = getUnusedVar(usedVars);
			usedVars.add(newVar);
			ArrayList<Property> quantifierSubject = new ArrayList<Property>();
			quantifierSubject.add(getNegated(createAtomic("child", varName, newVar)));
			quantifierSubject.add(getDesugaredTypeDeclaration(type.getTemplateType(), newVar, usedVars));
			Quantifier quantifier = createQuantifier(FORALL,
					createProblem(Collections.singleton(newVar), orTogether(quantifierSubject)));
			usedVars.remove(newVar);
			ret = andTogether(Arrays.asList(new Property[] { ret, quantifier }));
		}
		return ret;
	}

	public static EObject desugar(EObject object) {
		return reduce(object, new InputConverter() {
			/**
			 * All of the atomics that have been "denested". These are atomics that were inside another atomic as an
			 * argument, that now have to be re-added into the problem as separate atomics.
			 */
			List<Atomic> denestedAtomics = new LinkedList<Atomic>();

			/**
			 * All of the variables that were declared in the context of a given atomic.
			 */
			Hashtable<Atomic, HashSet<String>> declaredVarsInContext = new Hashtable<Atomic, HashSet<String>>();

			@Override
			public EObject apply(EObject cur) {
				if (cur instanceof Atomic) {
					return desugarAtomic((Atomic) cur);
				} else if (cur instanceof Quantifier) {
					addDenestedAtomics(((Quantifier) cur).getSubject(), false);
				} else if (cur instanceof Input) {
					// Add any denested atomics that the input can claim.
					// NOTE: It is crucial that the goal denesting go first here. It makes sure that anything mentioned
					// in the goal will be declared there, rather than in the given.
					addDenestedAtomics(((Input) cur).getGoal(), true);
					addDenestedAtomics(((Input) cur).getGiven(), true);
				} else if (cur instanceof Problem) {
					desugarVariableDeclarations((Problem) cur);
				}
				return cur;
			}

			private void addDenestedAtomics(Problem problem, boolean includeUsedVars) {
				HashSet<String> oldVars = problem == null ? new HashSet<String>()
						: (includeUsedVars ? getUsedVars(problem) : getDeclaredVars(problem));
				ArrayList<Property> newParts = new ArrayList<Property>();
				if (problem != null)
					newParts.add(problem.getProperty());

				for (Iterator<Atomic> iterator = denestedAtomics.iterator(); iterator.hasNext();) {
					Atomic atomic = iterator.next();
					for (NumericalProperty argProperty : atomic.getArgs()) {
						if (oldVars.contains(((Variable) argProperty).getArg())) {
							iterator.remove();
							newParts.add(atomic);
							String newVar = ((Variable) atomic.getArgs().get(atomic.getArgs().size() - 1)).getArg();
							oldVars.add(newVar);
							problem.getVars().add(createDeclaration(newVar));
							break;
						}
					}
				}

				newParts.remove(null);
				newParts.remove(getBooleanLiteral(true));
				if (newParts.size() > 0) {
					problem.setProperty(canonicalize(andTogether(newParts)));
				}
			}

			private void desugarVariableDeclarations(Problem problem) {
				ArrayList<Property> declarationAtomics = new ArrayList<Property>();
				// Go through all the declarations and remove their type declaration.
				// Replace it with type declaration atomics.
				for (Declaration declaration : problem.getVars())
					if (declaration.getType() != null)
						declarationAtomics.add(getDesugaredTypeDeclaration(declaration.getType(),
								declaration.getVarName(), getDeclaredVars(problem)));

				if (declarationAtomics.size() > 0) {
					declarationAtomics.add(problem.getProperty());
					declarationAtomics.remove(null);
					declarationAtomics.remove(getBooleanLiteral(true));
					problem.setProperty(canonicalize(andTogether(declarationAtomics)));
				}
			}

			private EObject desugarAtomic(Atomic atomicToDesugar) {
				ArrayList<Atomic> newAtomics = new ArrayList<Atomic>();
				Hashtable<NumericalProperty, String> nestedArgs = new Hashtable<NumericalProperty, String>();
				HashSet<String> declaredVars = getDeclaredVars(object);
				denest(atomicToDesugar, declaredVars, nestedArgs, newAtomics, false);
				Atomic changedAtomic = newAtomics.get(newAtomics.size() - 1);
				if (newAtomics.size() > 1)
					for (int i = 0; i < newAtomics.size() - 1; i++) {
						Atomic atomic = newAtomics.get(i);
						if (!declaredVarsInContext.keySet().contains(atomic)) {
							denestedAtomics.add(atomic);
							declaredVarsInContext.put(atomic, new HashSet<String>());
						}
						declaredVarsInContext.get(atomic).addAll(declaredVars);
					}

				return changedAtomic;
			}

			/**
			 * Pulls out all of the atomics passed as arguments to the given property, or anything within it.
			 */
			private void denest(NumericalProperty property, HashSet<String> allVars,
					Hashtable<NumericalProperty, String> nestedArgs, ArrayList<Atomic> newAtomics, boolean nested) {
				// FIXME: DN: this should only happen with things that are confirmed equal.
				// We don't want, for example, equal(child(x),child(x)) to be convert to equal(na,na)
				if (nestedArgs.containsKey(property))
					return;

				if (property instanceof Variable) {
					nestedArgs.put(property, ((Variable) property).getArg());
					return;
				}

				String newArg = null;
				if (nested) {
					newArg = getUnusedVar(allVars);
					allVars.add(newArg);
					nestedArgs.put(property, newArg);
				}
				Atomic replacement;
				if (property instanceof Atomic) {
					replacement = createAtomic(((Atomic) property).getFunction());
					for (NumericalProperty argument : ((Atomic) property).getArgs()) {
						denest(argument, allVars, nestedArgs, newAtomics, true);
						replacement.getArgs().add(createVariable(nestedArgs.get(argument)));
					}
				} else if (property instanceof Addition) {
					Addition addition = (Addition) property;
					replacement = createAtomic(addition.getSymbol().equals("+") ? ADDITION : SUBTRACTION);
					denest(addition.getLeft(), allVars, nestedArgs, newAtomics, true);
					denest(addition.getRight(), allVars, nestedArgs, newAtomics, true);
					replacement.getArgs().add(createVariable(nestedArgs.get(addition.getLeft())));
					replacement.getArgs().add(createVariable(nestedArgs.get(addition.getRight())));
				} else if (property instanceof Multiplication) {
					Multiplication addition = (Multiplication) property;
					replacement = createAtomic(addition.getSymbol().equals("*") ? MULTIPLICATION : DIVISION);
					denest(addition.getLeft(), allVars, nestedArgs, newAtomics, true);
					denest(addition.getRight(), allVars, nestedArgs, newAtomics, true);
					replacement.getArgs().add(createVariable(nestedArgs.get(addition.getLeft())));
					replacement.getArgs().add(createVariable(nestedArgs.get(addition.getRight())));
				} else {
					throw new UnsupportedOperationException("Can't denest a " + property.getClass());
				}
				if (nested)
					replacement.getArgs().add(createVariable(newArg));

				newAtomics.add(replacement);
			}
		});
	}

	public static Input resugar(Input problem) {
		Input ret = InputFactoryImpl.eINSTANCE.createInput();
		ret.setGiven(resugar(problem.getGiven()));
		ret.setTask(problem.getTask());
		ret.setGoal(resugar(problem.getGoal()));

		if (ret.getGiven() != null) {
			Hashtable<String, Declaration> originalDeclarations = new Hashtable<String, Declaration>();
			for (Declaration declaration : ret.getGiven().getVars())
				originalDeclarations.put(declaration.getVarName(), declaration);

			if (ret.getGoal() != null)
				for (Declaration declaration : ret.getGoal().getVars())
					originalDeclarations.put(declaration.getVarName(), declaration);

			ret.getGiven().getVars().clear();
			if (ret.getGiven().getProperty() != null)
				for (String var : getUnboundVariables(ret.getGiven().getProperty()))
					ret.getGiven().getVars().add(originalDeclarations.containsKey(var) ? originalDeclarations.get(var)
							: createDeclaration(var));

			if (ret.getGoal() != null && ret.getGoal().getProperty() != null) {
				for (String var : getUnboundVariables(ret.getGoal().getProperty()))
					ret.getGiven().getVars().add(originalDeclarations.containsKey(var) ? originalDeclarations.get(var)
							: createDeclaration(var));

				ret.getGoal().getVars().clear();
				for (String var : getUnboundVariables(ret.getGoal().getProperty()))
					ret.getGoal().getVars().add(originalDeclarations.containsKey(var) ? originalDeclarations.get(var)
							: createDeclaration(var));
			}
		}
		return ret;
	}

	public static Problem resugar(Problem problem) {
		if (problem == null)
			return null;
		// TODO:RESUGAR: Collapse arithmetic and renest atomics (PROPERLY, the
		// current way is AWFUL!)
		// TODO:RESUGAR: collapse quantifiers if possible (child_type...)
		Hashtable<String, String[]> replacements = new Hashtable<String, String[]>();
		TreeIterator<EObject> contents = (problem.eContainer() == null ? problem : problem.eContainer()).eAllContents();
		while (contents.hasNext()) {
			EObject cur = contents.next();
			if (cur instanceof Atomic && isArithmetic(((Atomic) cur).getFunction())) {
				Atomic atomic = (Atomic) cur;
				replacements
						.put(((Variable) atomic.getArgs().get(2)).getArg(),
								new String[] { ((Variable) atomic.getArgs().get(0)).getArg(),
										getSymbol(atomic.getFunction()),
										((Variable) atomic.getArgs().get(1)).getArg() });
			}
		}
		return (Problem) reduce(problem, new InputConverter() {

			private String breakDown(String arg, Hashtable<String, String[]> replacements) {
				if (!replacements.containsKey(arg))
					return arg;

				String[] rep = replacements.get(arg);
				return breakDown(rep[0], replacements) + rep[1] + breakDown(rep[2], replacements);
			}

			@Override
			public EObject apply(EObject cur) {
				if (cur instanceof Problem) {
					ArrayList<Property> topLevelProperties = getTopLevelElements(((Problem) cur).getProperty());
					for (int i = 0; i < topLevelProperties.size(); i++) {
						if (topLevelProperties.get(i) instanceof Quantifier) {
							Quantifier quantifier = (Quantifier) topLevelProperties.get(i);
							if (quantifier.getSubject().getVars().size() > 1)
								continue;

							Property property = quantifier.getSubject().getProperty();
							if (!(property instanceof ORing))
								continue;
							
							ArrayList<Property> ored = InputUtil.getORed((ORing) property);
							if (ored.size() != 2)
								continue;

							Negation negatedChildMarker = ored.get(0) instanceof Negation ? (Negation) ored.get(0)
									: (ored.get(1) instanceof Negation ? (Negation) ored.get(1) : null);

							Atomic typeMarker = ored.get(0) instanceof Atomic
									&& isTypeAtomic(((Atomic) ored.get(0)).getFunction())
											? (Atomic) ored.get(0)
											: ored.get(1) instanceof Atomic
													&& isTypeAtomic(((Atomic) ored.get(1)).getFunction())
															? (Atomic) ored.get(1) : null;

							if (negatedChildMarker == null || typeMarker == null
									|| !(negatedChildMarker.getNegated() instanceof Atomic
											&& ((Atomic) negatedChildMarker.getNegated()).getFunction()
													.equals("child")))
								continue;

							Atomic childMarker = (Atomic) negatedChildMarker.getNegated();

							if (!((Variable) childMarker.getArgs().get(1)).getArg()
									.equals(((Variable) typeMarker.getArgs().get(0)).getArg()))
								continue;

							Declaration declaration = getDeclaration(quantifier,
									((Variable) childMarker.getArgs().get(0)).getArg());
							if (declaration.getType() == null)
								declaration.setType(InputFactoryImpl.eINSTANCE.createType());

							if (declaration.getType().getTemplateType() == null)
								declaration.getType().setTemplateType(InputFactoryImpl.eINSTANCE.createType());

							declaration.getType().getTemplateType().setName(getDeclaredType(typeMarker.getFunction()));
							topLevelProperties.remove(i--);
						} else if (topLevelProperties.get(i) instanceof Atomic) {
							Atomic atomic = (Atomic) topLevelProperties.get(i);
							String function = atomic.getFunction();
							if (isTypeAtomic(function)) {
								Declaration declaration = getDeclaration(atomic,
										((Variable) atomic.getArgs().get(0)).getArg());
								if (declaration.getType() == null)
									declaration.setType(InputFactoryImpl.eINSTANCE.createType());

								declaration.getType().setName(getDeclaredType(function));
								topLevelProperties.remove(i--);
							} else if (isArithmetic(function)) {
								topLevelProperties.remove(i--);
							} else {
								boolean useAtomic = false;
								for (String arg : convertToStrings(atomic.getArgs()))
									if (replacements.containsKey(arg)) {
										useAtomic = true;
										break;
									}
								if (useAtomic) {
									Atomic newAtomic = InputFactoryImpl.eINSTANCE.createAtomic();
									for (String arg : convertToStrings(atomic.getArgs())) {
										newAtomic.getArgs()
												.add(QuickParser.parseNumericalProperty(breakDown(arg, replacements)));
									}
									newAtomic.setFunction(function);
									topLevelProperties.add(i, newAtomic);
								} else {
									topLevelProperties.add(i, stupidCopy(atomic));
								}
								topLevelProperties.remove(i + 1);
							}
						}
					}
					((Problem) cur).setProperty(andTogether(topLevelProperties));
				}
				return cur;
			}
		});
	}

	public static Input resugar(KInput input) {
		return resugar(convertToInput(input));
	}
}
