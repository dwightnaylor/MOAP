/**
 */
package algorithmMaker.input;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.Negation#getNegated <em>Negated</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getNegation()
 * @model
 * @generated
 */
public interface Negation extends Property
{
  /**
   * Returns the value of the '<em><b>Negated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negated</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negated</em>' containment reference.
   * @see #setNegated(Property)
   * @see algorithmMaker.input.InputPackage#getNegation_Negated()
   * @model containment="true"
   * @generated
   */
  Property getNegated();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Negation#getNegated <em>Negated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negated</em>' containment reference.
   * @see #getNegated()
   * @generated
   */
  void setNegated(Property value);

} // Negation
