/**
 */
package algorithmMaker.input;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.ProblemShell#getProblem <em>Problem</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getProblemShell()
 * @model
 * @generated
 */
public interface ProblemShell extends Property
{
  /**
   * Returns the value of the '<em><b>Problem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Problem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Problem</em>' containment reference.
   * @see #setProblem(Problem)
   * @see algorithmMaker.input.InputPackage#getProblemShell_Problem()
   * @model containment="true"
   * @generated
   */
  Problem getProblem();

  /**
   * Sets the value of the '{@link algorithmMaker.input.ProblemShell#getProblem <em>Problem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Problem</em>' containment reference.
   * @see #getProblem()
   * @generated
   */
  void setProblem(Problem value);

} // ProblemShell
