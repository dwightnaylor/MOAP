/**
 */
package algorithmMaker.input;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sugar Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.SugarAddition#getLeft <em>Left</em>}</li>
 *   <li>{@link algorithmMaker.input.SugarAddition#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link algorithmMaker.input.SugarAddition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getSugarAddition()
 * @model
 * @generated
 */
public interface SugarAddition extends SugarNumericalProperty
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
   * @see #setLeft(SugarNumericalProperty)
   * @see algorithmMaker.input.InputPackage#getSugarAddition_Left()
   * @model containment="true"
   * @generated
   */
  SugarNumericalProperty getLeft();

  /**
   * Sets the value of the '{@link algorithmMaker.input.SugarAddition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SugarNumericalProperty value);

  /**
   * Returns the value of the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' attribute.
   * @see #setSymbol(String)
   * @see algorithmMaker.input.InputPackage#getSugarAddition_Symbol()
   * @model
   * @generated
   */
  String getSymbol();

  /**
   * Sets the value of the '{@link algorithmMaker.input.SugarAddition#getSymbol <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' attribute.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SugarNumericalProperty)
   * @see algorithmMaker.input.InputPackage#getSugarAddition_Right()
   * @model containment="true"
   * @generated
   */
  SugarNumericalProperty getRight();

  /**
   * Sets the value of the '{@link algorithmMaker.input.SugarAddition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SugarNumericalProperty value);

} // SugarAddition
