/**
 */
package algorithmMaker.input;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see algorithmMaker.input.InputFactory
 * @model kind="package"
 * @generated
 */
public interface InputPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "input";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Input";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "input";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InputPackage eINSTANCE = algorithmMaker.input.impl.InputPackageImpl.init();

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.InputImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getInput()
   * @generated
   */
  int INPUT = 0;

  /**
   * The feature id for the '<em><b>Given</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__GIVEN = 0;

  /**
   * The feature id for the '<em><b>Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__TASK = 1;

  /**
   * The feature id for the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__GOAL = 2;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__THEOREMS = 3;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.ProblemImpl <em>Problem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.ProblemImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getProblem()
   * @generated
   */
  int PROBLEM = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM__VARS = 1;

  /**
   * The number of structural features of the '<em>Problem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.DeclarationImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VAR_NAME = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.TypeImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Template Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TEMPLATE_TYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.PropertyImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 4;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.ProblemShellImpl <em>Problem Shell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.ProblemShellImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getProblemShell()
   * @generated
   */
  int PROBLEM_SHELL = 5;

  /**
   * The feature id for the '<em><b>Problem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_SHELL__PROBLEM = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Problem Shell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_SHELL_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.NegationImpl <em>Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.NegationImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getNegation()
   * @generated
   */
  int NEGATION = 6;

  /**
   * The feature id for the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__NEGATED = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.QuantifierImpl <em>Quantifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.QuantifierImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getQuantifier()
   * @generated
   */
  int QUANTIFIER = 7;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__QUANTIFIER = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__SUBJECT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__PREDICATE = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Quantifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.SugarAtomicImpl <em>Sugar Atomic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.SugarAtomicImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getSugarAtomic()
   * @generated
   */
  int SUGAR_ATOMIC = 8;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_ATOMIC__FUNCTION = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_ATOMIC__ARGS = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sugar Atomic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_ATOMIC_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.AtomicImpl <em>Atomic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.AtomicImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getAtomic()
   * @generated
   */
  int ATOMIC = 9;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__FUNCTION = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__ARGS = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atomic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.BooleanLiteralImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.TheoremImpl <em>Theorem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.TheoremImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getTheorem()
   * @generated
   */
  int THEOREM = 11;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__REQUIREMENT = 0;

  /**
   * The feature id for the '<em><b>Implication</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__IMPLICATION = 1;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__RESULT = 2;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__COST = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Pseudo Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__PSEUDO_CODE = 5;

  /**
   * The number of structural features of the '<em>Theorem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.SugarNumericalPropertyImpl <em>Sugar Numerical Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.SugarNumericalPropertyImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getSugarNumericalProperty()
   * @generated
   */
  int SUGAR_NUMERICAL_PROPERTY = 12;

  /**
   * The number of structural features of the '<em>Sugar Numerical Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.NumberLiteralImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.ORingImpl <em>ORing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.ORingImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getORing()
   * @generated
   */
  int ORING = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORING__LEFT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORING__RIGHT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ORing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORING_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.ANDingImpl <em>AN Ding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.ANDingImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getANDing()
   * @generated
   */
  int AN_DING = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AN_DING__LEFT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AN_DING__RIGHT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>AN Ding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AN_DING_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.SugarAdditionImpl <em>Sugar Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.SugarAdditionImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getSugarAddition()
   * @generated
   */
  int SUGAR_ADDITION = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_ADDITION__LEFT = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_ADDITION__SYMBOL = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_ADDITION__RIGHT = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sugar Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_ADDITION_FEATURE_COUNT = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.SugarMultiplicationImpl <em>Sugar Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.SugarMultiplicationImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getSugarMultiplication()
   * @generated
   */
  int SUGAR_MULTIPLICATION = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_MULTIPLICATION__LEFT = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_MULTIPLICATION__SYMBOL = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_MULTIPLICATION__RIGHT = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sugar Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUGAR_MULTIPLICATION_FEATURE_COUNT = SUGAR_NUMERICAL_PROPERTY_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see algorithmMaker.input.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Input#getGiven <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Given</em>'.
   * @see algorithmMaker.input.Input#getGiven()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Given();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Input#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task</em>'.
   * @see algorithmMaker.input.Input#getTask()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Task();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Input#getGoal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Goal</em>'.
   * @see algorithmMaker.input.Input#getGoal()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Goal();

  /**
   * Returns the meta object for the containment reference list '{@link algorithmMaker.input.Input#getTheorems <em>Theorems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Theorems</em>'.
   * @see algorithmMaker.input.Input#getTheorems()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Theorems();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Problem <em>Problem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Problem</em>'.
   * @see algorithmMaker.input.Problem
   * @generated
   */
  EClass getProblem();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Problem#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see algorithmMaker.input.Problem#getProperty()
   * @see #getProblem()
   * @generated
   */
  EReference getProblem_Property();

  /**
   * Returns the meta object for the containment reference list '{@link algorithmMaker.input.Problem#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see algorithmMaker.input.Problem#getVars()
   * @see #getProblem()
   * @generated
   */
  EReference getProblem_Vars();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see algorithmMaker.input.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see algorithmMaker.input.Declaration#getType()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Declaration#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see algorithmMaker.input.Declaration#getVarName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_VarName();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see algorithmMaker.input.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see algorithmMaker.input.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Type#getTemplateType <em>Template Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Type</em>'.
   * @see algorithmMaker.input.Type#getTemplateType()
   * @see #getType()
   * @generated
   */
  EReference getType_TemplateType();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see algorithmMaker.input.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.ProblemShell <em>Problem Shell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Problem Shell</em>'.
   * @see algorithmMaker.input.ProblemShell
   * @generated
   */
  EClass getProblemShell();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.ProblemShell#getProblem <em>Problem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Problem</em>'.
   * @see algorithmMaker.input.ProblemShell#getProblem()
   * @see #getProblemShell()
   * @generated
   */
  EReference getProblemShell_Problem();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Negation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation</em>'.
   * @see algorithmMaker.input.Negation
   * @generated
   */
  EClass getNegation();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Negation#getNegated <em>Negated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Negated</em>'.
   * @see algorithmMaker.input.Negation#getNegated()
   * @see #getNegation()
   * @generated
   */
  EReference getNegation_Negated();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Quantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantifier</em>'.
   * @see algorithmMaker.input.Quantifier
   * @generated
   */
  EClass getQuantifier();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Quantifier#getQuantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantifier</em>'.
   * @see algorithmMaker.input.Quantifier#getQuantifier()
   * @see #getQuantifier()
   * @generated
   */
  EAttribute getQuantifier_Quantifier();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Quantifier#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subject</em>'.
   * @see algorithmMaker.input.Quantifier#getSubject()
   * @see #getQuantifier()
   * @generated
   */
  EReference getQuantifier_Subject();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Quantifier#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see algorithmMaker.input.Quantifier#getPredicate()
   * @see #getQuantifier()
   * @generated
   */
  EReference getQuantifier_Predicate();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.SugarAtomic <em>Sugar Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sugar Atomic</em>'.
   * @see algorithmMaker.input.SugarAtomic
   * @generated
   */
  EClass getSugarAtomic();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.SugarAtomic#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see algorithmMaker.input.SugarAtomic#getFunction()
   * @see #getSugarAtomic()
   * @generated
   */
  EAttribute getSugarAtomic_Function();

  /**
   * Returns the meta object for the containment reference list '{@link algorithmMaker.input.SugarAtomic#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see algorithmMaker.input.SugarAtomic#getArgs()
   * @see #getSugarAtomic()
   * @generated
   */
  EReference getSugarAtomic_Args();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Atomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic</em>'.
   * @see algorithmMaker.input.Atomic
   * @generated
   */
  EClass getAtomic();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Atomic#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see algorithmMaker.input.Atomic#getFunction()
   * @see #getAtomic()
   * @generated
   */
  EAttribute getAtomic_Function();

  /**
   * Returns the meta object for the attribute list '{@link algorithmMaker.input.Atomic#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see algorithmMaker.input.Atomic#getArgs()
   * @see #getAtomic()
   * @generated
   */
  EAttribute getAtomic_Args();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see algorithmMaker.input.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see algorithmMaker.input.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.Theorem <em>Theorem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem</em>'.
   * @see algorithmMaker.input.Theorem
   * @generated
   */
  EClass getTheorem();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Theorem#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Requirement</em>'.
   * @see algorithmMaker.input.Theorem#getRequirement()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_Requirement();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Theorem#getImplication <em>Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implication</em>'.
   * @see algorithmMaker.input.Theorem#getImplication()
   * @see #getTheorem()
   * @generated
   */
  EAttribute getTheorem_Implication();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.Theorem#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see algorithmMaker.input.Theorem#getResult()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_Result();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Theorem#getCost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cost</em>'.
   * @see algorithmMaker.input.Theorem#getCost()
   * @see #getTheorem()
   * @generated
   */
  EAttribute getTheorem_Cost();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Theorem#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see algorithmMaker.input.Theorem#getDescription()
   * @see #getTheorem()
   * @generated
   */
  EAttribute getTheorem_Description();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.Theorem#getPseudoCode <em>Pseudo Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pseudo Code</em>'.
   * @see algorithmMaker.input.Theorem#getPseudoCode()
   * @see #getTheorem()
   * @generated
   */
  EAttribute getTheorem_PseudoCode();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.SugarNumericalProperty <em>Sugar Numerical Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sugar Numerical Property</em>'.
   * @see algorithmMaker.input.SugarNumericalProperty
   * @generated
   */
  EClass getSugarNumericalProperty();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see algorithmMaker.input.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see algorithmMaker.input.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.ORing <em>ORing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ORing</em>'.
   * @see algorithmMaker.input.ORing
   * @generated
   */
  EClass getORing();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.ORing#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see algorithmMaker.input.ORing#getLeft()
   * @see #getORing()
   * @generated
   */
  EReference getORing_Left();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.ORing#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see algorithmMaker.input.ORing#getRight()
   * @see #getORing()
   * @generated
   */
  EReference getORing_Right();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.ANDing <em>AN Ding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AN Ding</em>'.
   * @see algorithmMaker.input.ANDing
   * @generated
   */
  EClass getANDing();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.ANDing#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see algorithmMaker.input.ANDing#getLeft()
   * @see #getANDing()
   * @generated
   */
  EReference getANDing_Left();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.ANDing#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see algorithmMaker.input.ANDing#getRight()
   * @see #getANDing()
   * @generated
   */
  EReference getANDing_Right();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.SugarAddition <em>Sugar Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sugar Addition</em>'.
   * @see algorithmMaker.input.SugarAddition
   * @generated
   */
  EClass getSugarAddition();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.SugarAddition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see algorithmMaker.input.SugarAddition#getLeft()
   * @see #getSugarAddition()
   * @generated
   */
  EReference getSugarAddition_Left();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.SugarAddition#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see algorithmMaker.input.SugarAddition#getSymbol()
   * @see #getSugarAddition()
   * @generated
   */
  EAttribute getSugarAddition_Symbol();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.SugarAddition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see algorithmMaker.input.SugarAddition#getRight()
   * @see #getSugarAddition()
   * @generated
   */
  EReference getSugarAddition_Right();

  /**
   * Returns the meta object for class '{@link algorithmMaker.input.SugarMultiplication <em>Sugar Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sugar Multiplication</em>'.
   * @see algorithmMaker.input.SugarMultiplication
   * @generated
   */
  EClass getSugarMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.SugarMultiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see algorithmMaker.input.SugarMultiplication#getLeft()
   * @see #getSugarMultiplication()
   * @generated
   */
  EReference getSugarMultiplication_Left();

  /**
   * Returns the meta object for the attribute '{@link algorithmMaker.input.SugarMultiplication#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see algorithmMaker.input.SugarMultiplication#getSymbol()
   * @see #getSugarMultiplication()
   * @generated
   */
  EAttribute getSugarMultiplication_Symbol();

  /**
   * Returns the meta object for the containment reference '{@link algorithmMaker.input.SugarMultiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see algorithmMaker.input.SugarMultiplication#getRight()
   * @see #getSugarMultiplication()
   * @generated
   */
  EReference getSugarMultiplication_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InputFactory getInputFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.InputImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Given</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__GIVEN = eINSTANCE.getInput_Given();

    /**
     * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__TASK = eINSTANCE.getInput_Task();

    /**
     * The meta object literal for the '<em><b>Goal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__GOAL = eINSTANCE.getInput_Goal();

    /**
     * The meta object literal for the '<em><b>Theorems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__THEOREMS = eINSTANCE.getInput_Theorems();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.ProblemImpl <em>Problem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.ProblemImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getProblem()
     * @generated
     */
    EClass PROBLEM = eINSTANCE.getProblem();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBLEM__PROPERTY = eINSTANCE.getProblem_Property();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBLEM__VARS = eINSTANCE.getProblem_Vars();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.DeclarationImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__TYPE = eINSTANCE.getDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__VAR_NAME = eINSTANCE.getDeclaration_VarName();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.TypeImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Template Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TEMPLATE_TYPE = eINSTANCE.getType_TemplateType();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.PropertyImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.ProblemShellImpl <em>Problem Shell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.ProblemShellImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getProblemShell()
     * @generated
     */
    EClass PROBLEM_SHELL = eINSTANCE.getProblemShell();

    /**
     * The meta object literal for the '<em><b>Problem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBLEM_SHELL__PROBLEM = eINSTANCE.getProblemShell_Problem();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.NegationImpl <em>Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.NegationImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getNegation()
     * @generated
     */
    EClass NEGATION = eINSTANCE.getNegation();

    /**
     * The meta object literal for the '<em><b>Negated</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATION__NEGATED = eINSTANCE.getNegation_Negated();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.QuantifierImpl <em>Quantifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.QuantifierImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getQuantifier()
     * @generated
     */
    EClass QUANTIFIER = eINSTANCE.getQuantifier();

    /**
     * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIER__QUANTIFIER = eINSTANCE.getQuantifier_Quantifier();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIER__SUBJECT = eINSTANCE.getQuantifier_Subject();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIER__PREDICATE = eINSTANCE.getQuantifier_Predicate();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.SugarAtomicImpl <em>Sugar Atomic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.SugarAtomicImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getSugarAtomic()
     * @generated
     */
    EClass SUGAR_ATOMIC = eINSTANCE.getSugarAtomic();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUGAR_ATOMIC__FUNCTION = eINSTANCE.getSugarAtomic_Function();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUGAR_ATOMIC__ARGS = eINSTANCE.getSugarAtomic_Args();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.AtomicImpl <em>Atomic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.AtomicImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getAtomic()
     * @generated
     */
    EClass ATOMIC = eINSTANCE.getAtomic();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC__FUNCTION = eINSTANCE.getAtomic_Function();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC__ARGS = eINSTANCE.getAtomic_Args();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.BooleanLiteralImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.TheoremImpl <em>Theorem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.TheoremImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getTheorem()
     * @generated
     */
    EClass THEOREM = eINSTANCE.getTheorem();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__REQUIREMENT = eINSTANCE.getTheorem_Requirement();

    /**
     * The meta object literal for the '<em><b>Implication</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM__IMPLICATION = eINSTANCE.getTheorem_Implication();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__RESULT = eINSTANCE.getTheorem_Result();

    /**
     * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM__COST = eINSTANCE.getTheorem_Cost();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM__DESCRIPTION = eINSTANCE.getTheorem_Description();

    /**
     * The meta object literal for the '<em><b>Pseudo Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM__PSEUDO_CODE = eINSTANCE.getTheorem_PseudoCode();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.SugarNumericalPropertyImpl <em>Sugar Numerical Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.SugarNumericalPropertyImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getSugarNumericalProperty()
     * @generated
     */
    EClass SUGAR_NUMERICAL_PROPERTY = eINSTANCE.getSugarNumericalProperty();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.NumberLiteralImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.ORingImpl <em>ORing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.ORingImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getORing()
     * @generated
     */
    EClass ORING = eINSTANCE.getORing();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORING__LEFT = eINSTANCE.getORing_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORING__RIGHT = eINSTANCE.getORing_Right();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.ANDingImpl <em>AN Ding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.ANDingImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getANDing()
     * @generated
     */
    EClass AN_DING = eINSTANCE.getANDing();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AN_DING__LEFT = eINSTANCE.getANDing_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AN_DING__RIGHT = eINSTANCE.getANDing_Right();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.SugarAdditionImpl <em>Sugar Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.SugarAdditionImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getSugarAddition()
     * @generated
     */
    EClass SUGAR_ADDITION = eINSTANCE.getSugarAddition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUGAR_ADDITION__LEFT = eINSTANCE.getSugarAddition_Left();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUGAR_ADDITION__SYMBOL = eINSTANCE.getSugarAddition_Symbol();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUGAR_ADDITION__RIGHT = eINSTANCE.getSugarAddition_Right();

    /**
     * The meta object literal for the '{@link algorithmMaker.input.impl.SugarMultiplicationImpl <em>Sugar Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see algorithmMaker.input.impl.SugarMultiplicationImpl
     * @see algorithmMaker.input.impl.InputPackageImpl#getSugarMultiplication()
     * @generated
     */
    EClass SUGAR_MULTIPLICATION = eINSTANCE.getSugarMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUGAR_MULTIPLICATION__LEFT = eINSTANCE.getSugarMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUGAR_MULTIPLICATION__SYMBOL = eINSTANCE.getSugarMultiplication_Symbol();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUGAR_MULTIPLICATION__RIGHT = eINSTANCE.getSugarMultiplication_Right();

  }

} //InputPackage
