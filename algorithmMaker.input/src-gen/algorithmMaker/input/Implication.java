/**
 */
package algorithmMaker.input;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.Implication#getLeft <em>Left</em>}</li>
 *   <li>{@link algorithmMaker.input.Implication#getImplication <em>Implication</em>}</li>
 *   <li>{@link algorithmMaker.input.Implication#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getImplication()
 * @model
 * @generated
 */
public interface Implication extends Property
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Property)
   * @see algorithmMaker.input.InputPackage#getImplication_Left()
   * @model containment="true"
   * @generated
   */
  Property getLeft();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Implication#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Property value);

  /**
   * Returns the value of the '<em><b>Implication</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implication</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implication</em>' attribute.
   * @see #setImplication(String)
   * @see algorithmMaker.input.InputPackage#getImplication_Implication()
   * @model
   * @generated
   */
  String getImplication();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Implication#getImplication <em>Implication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implication</em>' attribute.
   * @see #getImplication()
   * @generated
   */
  void setImplication(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Property)
   * @see algorithmMaker.input.InputPackage#getImplication_Right()
   * @model containment="true"
   * @generated
   */
  Property getRight();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Implication#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Property value);

} // Implication
