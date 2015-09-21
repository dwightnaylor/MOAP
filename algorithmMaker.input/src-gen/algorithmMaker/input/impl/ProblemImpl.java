/**
 */
package algorithmMaker.input.impl;

import algorithmMaker.input.InputPackage;
import algorithmMaker.input.Problem;
import algorithmMaker.input.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.impl.ProblemImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link algorithmMaker.input.impl.ProblemImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProblemImpl extends MinimalEObjectImpl.Container implements Problem
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<String> vars;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProblemImpl()
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
    return InputPackage.Literals.PROBLEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVars()
  {
    if (vars == null)
    {
      vars = new EDataTypeEList<String>(String.class, this, InputPackage.PROBLEM__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs)
  {
    Property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputPackage.PROBLEM__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Property newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputPackage.PROBLEM__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputPackage.PROBLEM__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.PROBLEM__PROPERTY, newProperty, newProperty));
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
      case InputPackage.PROBLEM__PROPERTY:
        return basicSetProperty(null, msgs);
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
      case InputPackage.PROBLEM__VARS:
        return getVars();
      case InputPackage.PROBLEM__PROPERTY:
        return getProperty();
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
      case InputPackage.PROBLEM__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends String>)newValue);
        return;
      case InputPackage.PROBLEM__PROPERTY:
        setProperty((Property)newValue);
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
      case InputPackage.PROBLEM__VARS:
        getVars().clear();
        return;
      case InputPackage.PROBLEM__PROPERTY:
        setProperty((Property)null);
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
      case InputPackage.PROBLEM__VARS:
        return vars != null && !vars.isEmpty();
      case InputPackage.PROBLEM__PROPERTY:
        return property != null;
    }
    return super.eIsSet(featureID);
  }

	public int hashCode() {
		int ret = getClass().hashCode();
		if (vars != null) {
			for (Object obj : vars) {
				ret += obj.hashCode();
			}
		}
		ret += property == null ? 0 :property.hashCode();
		return ret;
	}

	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		ProblemImpl other = (ProblemImpl) obj;
		if (vars == null && other.vars != null || vars != null && !vars.equals(other.vars)) return false;
		if (property == null && other.property != null || property != null && !property.equals(other.property)) return false;
		return true;
	}

	public String toString() {
		StringBuffer ret = new StringBuffer();
				for (String var : vars)
					ret.append(var + ',');
				ret.deleteCharAt(ret.length() - 1);
				ret.append(" st " + property.toString());
		return ret.toString();
	}


} //ProblemImpl