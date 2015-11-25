/**
 */
package algorithmMaker.input.impl;

import algorithmMaker.input.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputFactoryImpl extends EFactoryImpl implements InputFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InputFactory init()
  {
    try
    {
      InputFactory theInputFactory = (InputFactory)EPackage.Registry.INSTANCE.getEFactory(InputPackage.eNS_URI);
      if (theInputFactory != null)
      {
        return theInputFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InputFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case InputPackage.INPUT: return createInput();
      case InputPackage.PROBLEM: return createProblem();
      case InputPackage.DECLARATION: return createDeclaration();
      case InputPackage.TYPE: return createType();
      case InputPackage.PROPERTY: return createProperty();
      case InputPackage.PROBLEM_SHELL: return createProblemShell();
      case InputPackage.NEGATION: return createNegation();
      case InputPackage.QUANTIFIER: return createQuantifier();
      case InputPackage.SUGAR_ATOMIC: return createSugarAtomic();
      case InputPackage.ATOMIC: return createAtomic();
      case InputPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case InputPackage.THEOREM: return createTheorem();
      case InputPackage.SUGAR_NUMERICAL_PROPERTY: return createSugarNumericalProperty();
      case InputPackage.SUGAR_VARIABLE: return createSugarVariable();
      case InputPackage.NUMBER_LITERAL: return createNumberLiteral();
      case InputPackage.ORING: return createORing();
      case InputPackage.AN_DING: return createANDing();
      case InputPackage.SUGAR_ADDITION: return createSugarAddition();
      case InputPackage.SUGAR_MULTIPLICATION: return createSugarMultiplication();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Problem createProblem()
  {
    ProblemImpl problem = new ProblemImpl();
    return problem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProblemShell createProblemShell()
  {
    ProblemShellImpl problemShell = new ProblemShellImpl();
    return problemShell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier createQuantifier()
  {
    QuantifierImpl quantifier = new QuantifierImpl();
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SugarAtomic createSugarAtomic()
  {
    SugarAtomicImpl sugarAtomic = new SugarAtomicImpl();
    return sugarAtomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theorem createTheorem()
  {
    TheoremImpl theorem = new TheoremImpl();
    return theorem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SugarNumericalProperty createSugarNumericalProperty()
  {
    SugarNumericalPropertyImpl sugarNumericalProperty = new SugarNumericalPropertyImpl();
    return sugarNumericalProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SugarVariable createSugarVariable()
  {
    SugarVariableImpl sugarVariable = new SugarVariableImpl();
    return sugarVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ORing createORing()
  {
    ORingImpl oRing = new ORingImpl();
    return oRing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ANDing createANDing()
  {
    ANDingImpl anDing = new ANDingImpl();
    return anDing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SugarAddition createSugarAddition()
  {
    SugarAdditionImpl sugarAddition = new SugarAdditionImpl();
    return sugarAddition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SugarMultiplication createSugarMultiplication()
  {
    SugarMultiplicationImpl sugarMultiplication = new SugarMultiplicationImpl();
    return sugarMultiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputPackage getInputPackage()
  {
    return (InputPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InputPackage getPackage()
  {
    return InputPackage.eINSTANCE;
  }

} //InputFactoryImpl
