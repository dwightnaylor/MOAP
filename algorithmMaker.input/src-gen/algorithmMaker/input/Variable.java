/**
 */
package algorithmMaker.input;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.Variable#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NumericalProperty
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' attribute.
   * @see #setArg(String)
   * @see algorithmMaker.input.InputPackage#getVariable_Arg()
   * @model
   * @generated
   */
  String getArg();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Variable#getArg <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' attribute.
   * @see #getArg()
   * @generated
   */
  void setArg(String value);

} // Variable
