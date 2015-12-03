/**
 */
package algorithmMaker.input.impl;

import algorithmMaker.input.InputPackage;
import algorithmMaker.input.Negation;
import algorithmMaker.input.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Negation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link algorithmMaker.input.impl.NegationImpl#getNegated <em>Negated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegationImpl extends PropertyImpl implements Negation {
	/**
	 * The cached value of the '{@link #getNegated() <em>Negated</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNegated()
	 * @generated
	 * @ordered
	 */
	protected Property negated;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputPackage.Literals.NEGATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Property getNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNegated(Property newNegated, NotificationChain msgs) {
		Property oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					InputPackage.NEGATION__NEGATED, oldNegated, newNegated);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNegated(Property newNegated) {
		if (newNegated != negated) {
			NotificationChain msgs = null;
			if (negated != null)
				msgs = ((InternalEObject) negated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- InputPackage.NEGATION__NEGATED, null, msgs);
			if (newNegated != null)
				msgs = ((InternalEObject) newNegated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- InputPackage.NEGATION__NEGATED, null, msgs);
			msgs = basicSetNegated(newNegated, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.NEGATION__NEGATED, newNegated,
					newNegated));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InputPackage.NEGATION__NEGATED:
			return basicSetNegated(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InputPackage.NEGATION__NEGATED:
			return getNegated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InputPackage.NEGATION__NEGATED:
			setNegated((Property) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case InputPackage.NEGATION__NEGATED:
			setNegated((Property) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case InputPackage.NEGATION__NEGATED:
			return negated != null;
		}
		return super.eIsSet(featureID);
	}

	public int hashCode() {
		int ret = getClass().hashCode();
		ret += negated == null ? 0 : negated.hashCode();
		return ret;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		return toString().equals(obj.toString());
	}

	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append('!'
				+ (negated instanceof algorithmMaker.input.ANDing | negated instanceof algorithmMaker.input.ORing ? "("
						: "")
				+ negated.toString()
				+ (negated instanceof algorithmMaker.input.ANDing | negated instanceof algorithmMaker.input.ORing ? ")"
						: ""));
		return ret.toString();
	}

} // NegationImpl