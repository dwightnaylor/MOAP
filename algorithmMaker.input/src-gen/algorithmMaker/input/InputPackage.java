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
   * The feature id for the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__GOAL = 1;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__THEOREMS = 2;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Vars</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM__VARS = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM__PROPERTY = 1;

  /**
   * The number of structural features of the '<em>Problem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.PropertyImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.QuantifierImpl <em>Quantifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.QuantifierImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getQuantifier()
   * @generated
   */
  int QUANTIFIER = 3;

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
   * The meta object id for the '{@link algorithmMaker.input.impl.AtomicImpl <em>Atomic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.AtomicImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getAtomic()
   * @generated
   */
  int ATOMIC = 4;

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
   * The meta object id for the '{@link algorithmMaker.input.impl.TheoremImpl <em>Theorem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.TheoremImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getTheorem()
   * @generated
   */
  int THEOREM = 5;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__REQUIREMENT = 0;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__RESULT = 1;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__COST = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__DESCRIPTION = 3;

  /**
   * The number of structural features of the '<em>Theorem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link algorithmMaker.input.impl.ORingImpl <em>ORing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see algorithmMaker.input.impl.ORingImpl
   * @see algorithmMaker.input.impl.InputPackageImpl#getORing()
   * @generated
   */
  int ORING = 6;

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
  int AN_DING = 7;

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
   * Returns the meta object for the attribute list '{@link algorithmMaker.input.Problem#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vars</em>'.
   * @see algorithmMaker.input.Problem#getVars()
   * @see #getProblem()
   * @generated
   */
  EAttribute getProblem_Vars();

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
   * Returns the meta object for class '{@link algorithmMaker.input.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see algorithmMaker.input.Property
   * @generated
   */
  EClass getProperty();

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
     * The meta object literal for the '<em><b>Vars</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBLEM__VARS = eINSTANCE.getProblem_Vars();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBLEM__PROPERTY = eINSTANCE.getProblem_Property();

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

  }

} //InputPackage
