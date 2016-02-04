/**
 */
package algorithmMaker.input;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.Atomic#getFunction <em>Function</em>}</li>
 *   <li>{@link algorithmMaker.input.Atomic#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getAtomic()
 * @model
 * @generated
 */
public interface Atomic extends Property, NumericalProperty
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see algorithmMaker.input.InputPackage#getAtomic_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Atomic#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link algorithmMaker.input.NumericalProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see algorithmMaker.input.InputPackage#getAtomic_Args()
   * @model containment="true"
   * @generated
   */
	EList<NumericalProperty> getArgs();

} // Atomic
