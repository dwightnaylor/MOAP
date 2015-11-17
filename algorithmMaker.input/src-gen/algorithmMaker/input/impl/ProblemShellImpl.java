/**
 */
package algorithmMaker.input.impl;

import algorithmMaker.input.InputPackage;
import algorithmMaker.input.Problem;
import algorithmMaker.input.ProblemShell;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.impl.ProblemShellImpl#getProblem <em>Problem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProblemShellImpl extends PropertyImpl implements ProblemShell
{
  /**
   * The cached value of the '{@link #getProblem() <em>Problem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProblem()
   * @generated
   * @ordered
   */
  protected Problem problem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProblemShellImpl()
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
    return InputPackage.Literals.PROBLEM_SHELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Problem getProblem()
  {
    return problem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProblem(Problem newProblem, NotificationChain msgs)
  {
    Problem oldProblem = problem;
    problem = newProblem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputPackage.PROBLEM_SHELL__PROBLEM, oldProblem, newProblem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProblem(Problem newProblem)
  {
    if (newProblem != problem)
    {
      NotificationChain msgs = null;
      if (problem != null)
        msgs = ((InternalEObject)problem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputPackage.PROBLEM_SHELL__PROBLEM, null, msgs);
      if (newProblem != null)
        msgs = ((InternalEObject)newProblem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputPackage.PROBLEM_SHELL__PROBLEM, null, msgs);
      msgs = basicSetProblem(newProblem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.PROBLEM_SHELL__PROBLEM, newProblem, newProblem));
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
      case InputPackage.PROBLEM_SHELL__PROBLEM:
        return basicSetProblem(null, msgs);
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
      case InputPackage.PROBLEM_SHELL__PROBLEM:
        return getProblem();
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
      case InputPackage.PROBLEM_SHELL__PROBLEM:
        setProblem((Problem)newValue);
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
      case InputPackage.PROBLEM_SHELL__PROBLEM:
        setProblem((Problem)null);
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
      case InputPackage.PROBLEM_SHELL__PROBLEM:
        return problem != null;
    }
    return super.eIsSet(featureID);
  }



	public int hashCode() {
		int ret = getClass().hashCode();
		ret += problem == null ? 0 :problem.hashCode();
		return ret;
	}

	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		return toString().equals(obj.toString());
	}

	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append('{' + problem.toString() + '}');
		return ret.toString();
	}


} //ProblemShellImpl