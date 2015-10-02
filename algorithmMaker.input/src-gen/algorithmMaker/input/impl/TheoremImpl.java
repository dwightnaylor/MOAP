/**
 */
package algorithmMaker.input.impl;

import algorithmMaker.input.InputPackage;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theorem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.impl.TheoremImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link algorithmMaker.input.impl.TheoremImpl#getResult <em>Result</em>}</li>
 *   <li>{@link algorithmMaker.input.impl.TheoremImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link algorithmMaker.input.impl.TheoremImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TheoremImpl extends MinimalEObjectImpl.Container implements Theorem
{
  /**
   * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected Property requirement;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected Property result;

  /**
   * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected static final int COST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected int cost = COST_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TheoremImpl()
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
    return InputPackage.Literals.THEOREM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getRequirement()
  {
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequirement(Property newRequirement, NotificationChain msgs)
  {
    Property oldRequirement = requirement;
    requirement = newRequirement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputPackage.THEOREM__REQUIREMENT, oldRequirement, newRequirement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequirement(Property newRequirement)
  {
    if (newRequirement != requirement)
    {
      NotificationChain msgs = null;
      if (requirement != null)
        msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputPackage.THEOREM__REQUIREMENT, null, msgs);
      if (newRequirement != null)
        msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputPackage.THEOREM__REQUIREMENT, null, msgs);
      msgs = basicSetRequirement(newRequirement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.THEOREM__REQUIREMENT, newRequirement, newRequirement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(Property newResult, NotificationChain msgs)
  {
    Property oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputPackage.THEOREM__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(Property newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputPackage.THEOREM__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputPackage.THEOREM__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.THEOREM__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCost()
  {
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCost(int newCost)
  {
    int oldCost = cost;
    cost = newCost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.THEOREM__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.THEOREM__DESCRIPTION, oldDescription, description));
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
      case InputPackage.THEOREM__REQUIREMENT:
        return basicSetRequirement(null, msgs);
      case InputPackage.THEOREM__RESULT:
        return basicSetResult(null, msgs);
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
      case InputPackage.THEOREM__REQUIREMENT:
        return getRequirement();
      case InputPackage.THEOREM__RESULT:
        return getResult();
      case InputPackage.THEOREM__COST:
        return getCost();
      case InputPackage.THEOREM__DESCRIPTION:
        return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InputPackage.THEOREM__REQUIREMENT:
        setRequirement((Property)newValue);
        return;
      case InputPackage.THEOREM__RESULT:
        setResult((Property)newValue);
        return;
      case InputPackage.THEOREM__COST:
        setCost((Integer)newValue);
        return;
      case InputPackage.THEOREM__DESCRIPTION:
        setDescription((String)newValue);
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
      case InputPackage.THEOREM__REQUIREMENT:
        setRequirement((Property)null);
        return;
      case InputPackage.THEOREM__RESULT:
        setResult((Property)null);
        return;
      case InputPackage.THEOREM__COST:
        setCost(COST_EDEFAULT);
        return;
      case InputPackage.THEOREM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case InputPackage.THEOREM__REQUIREMENT:
        return requirement != null;
      case InputPackage.THEOREM__RESULT:
        return result != null;
      case InputPackage.THEOREM__COST:
        return cost != COST_EDEFAULT;
      case InputPackage.THEOREM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
    }
    return super.eIsSet(featureID);
  }

	public int hashCode() {
		int ret = getClass().hashCode();
		ret += requirement == null ? 0 :requirement.hashCode();
		ret += result == null ? 0 :result.hashCode();
			ret += cost;
		ret += description == null ? 0 :description.hashCode();
		return ret;
	}

	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		TheoremImpl other = (TheoremImpl) obj;
		if (requirement == null && other.requirement != null || requirement != null && !requirement.equals(other.requirement)) return false;
		if (result == null && other.result != null || result != null && !result.equals(other.result)) return false;
		if (cost != other.cost) return false;
		if (description == null && other.description != null || description != null && !description.equals(other.description)) return false;
		return true;
	}

	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append(requirement.toString() + ":-" + result.toString() + ',' + cost + ',' + description);
		return ret.toString();
	}


} //TheoremImpl