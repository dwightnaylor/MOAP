/**
 */
package algorithmMaker.input.impl;

import algorithmMaker.input.Atomic;
import algorithmMaker.input.InputPackage;
import algorithmMaker.input.NumericalProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.impl.AtomicImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link algorithmMaker.input.impl.AtomicImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicImpl extends PropertyImpl implements Atomic
{
  /**
   * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected String function = FUNCTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<NumericalProperty> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InputPackage.Literals.ATOMIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(String newFunction)
  {
    String oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.ATOMIC__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NumericalProperty> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<NumericalProperty>(NumericalProperty.class, this, InputPackage.ATOMIC__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case InputPackage.ATOMIC__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InputPackage.ATOMIC__FUNCTION:
        return getFunction();
      case InputPackage.ATOMIC__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InputPackage.ATOMIC__FUNCTION:
        setFunction((String)newValue);
        return;
      case InputPackage.ATOMIC__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends NumericalProperty>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InputPackage.ATOMIC__FUNCTION:
        setFunction(FUNCTION_EDEFAULT);
        return;
      case InputPackage.ATOMIC__ARGS:
        getArgs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InputPackage.ATOMIC__FUNCTION:
        return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
      case InputPackage.ATOMIC__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

	public int hashCode() {
		int ret = getClass().hashCode();
		ret += function == null ? 0 :function.hashCode();
		if (args != null) {
			for (Object obj : args) {
				ret += obj.hashCode();
			}
		}
		return ret;
	}

	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		return toString().equals(obj.toString());
	}

	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append(function);
		if (args != null && args.size() > 0){
			ret.append('(');
			for (NumericalProperty arg : args)
				ret.append(arg.toString() + ',');
			ret.setCharAt(ret.length() - 1, ')');
		}
		return ret.toString();
	}


} //AtomicImpl