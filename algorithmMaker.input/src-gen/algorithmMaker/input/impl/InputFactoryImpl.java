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
      case InputPackage.PROPERTY: return createProperty();
      case InputPackage.QUANTIFIER: return createQuantifier();
      case InputPackage.ATOMIC: return createAtomic();
      case InputPackage.ORING: return createORing();
      case InputPackage.AN_DING: return createANDing();
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
