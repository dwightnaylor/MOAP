/**
 */
package algorithmMaker.input.impl;

import algorithmMaker.input.Input;
import algorithmMaker.input.InputPackage;
import algorithmMaker.input.Problem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link algorithmMaker.input.impl.InputImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link algorithmMaker.input.impl.InputImpl#getGoal <em>Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input
{
  /**
   * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGiven()
   * @generated
   * @ordered
   */
  protected Problem given;

  /**
   * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoal()
   * @generated
   * @ordered
   */
  protected Problem goal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputImpl()
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
    return InputPackage.Literals.INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Problem getGiven()
  {
    return given;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGiven(Problem newGiven, NotificationChain msgs)
  {
    Problem oldGiven = given;
    given = newGiven;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputPackage.INPUT__GIVEN, oldGiven, newGiven);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGiven(Problem newGiven)
  {
    if (newGiven != given)
    {
      NotificationChain msgs = null;
      if (given != null)
        msgs = ((InternalEObject)given).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputPackage.INPUT__GIVEN, null, msgs);
      if (newGiven != null)
        msgs = ((InternalEObject)newGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputPackage.INPUT__GIVEN, null, msgs);
      msgs = basicSetGiven(newGiven, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.INPUT__GIVEN, newGiven, newGiven));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Problem getGoal()
  {
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoal(Problem newGoal, NotificationChain msgs)
  {
    Problem oldGoal = goal;
    goal = newGoal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputPackage.INPUT__GOAL, oldGoal, newGoal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoal(Problem newGoal)
  {
    if (newGoal != goal)
    {
      NotificationChain msgs = null;
      if (goal != null)
        msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputPackage.INPUT__GOAL, null, msgs);
      if (newGoal != null)
        msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputPackage.INPUT__GOAL, null, msgs);
      msgs = basicSetGoal(newGoal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.INPUT__GOAL, newGoal, newGoal));
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
      case InputPackage.INPUT__GIVEN:
        return basicSetGiven(null, msgs);
      case InputPackage.INPUT__GOAL:
        return basicSetGoal(null, msgs);
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
      case InputPackage.INPUT__GIVEN:
        return getGiven();
      case InputPackage.INPUT__GOAL:
        return getGoal();
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
      case InputPackage.INPUT__GIVEN:
        setGiven((Problem)newValue);
        return;
      case InputPackage.INPUT__GOAL:
        setGoal((Problem)newValue);
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
      case InputPackage.INPUT__GIVEN:
        setGiven((Problem)null);
        return;
      case InputPackage.INPUT__GOAL:
        setGoal((Problem)null);
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
      case InputPackage.INPUT__GIVEN:
        return given != null;
      case InputPackage.INPUT__GOAL:
        return goal != null;
    }
    return super.eIsSet(featureID);
  }



	public int hashCode() {
		int ret = getClass().hashCode();
		ret += given == null ? 0 :given.hashCode();
		ret += goal == null ? 0 :goal.hashCode();
		return ret;
	}

	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		InputImpl other = (InputImpl) obj;
		if (given == null && other.given != null || given != null && !given.equals(other.given)) return false;
		if (goal == null && other.goal != null || goal != null && !goal.equals(other.goal)) return false;
		return true;
	}

	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append("Given " + given + ", Find " + goal);
		return ret.toString();
	}


} //InputImpl