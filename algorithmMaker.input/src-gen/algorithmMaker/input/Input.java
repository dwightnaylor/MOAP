/**
 */
package algorithmMaker.input;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.Input#getGiven <em>Given</em>}</li>
 *   <li>{@link algorithmMaker.input.Input#getTask <em>Task</em>}</li>
 *   <li>{@link algorithmMaker.input.Input#getGoal <em>Goal</em>}</li>
 *   <li>{@link algorithmMaker.input.Input#getTheorems <em>Theorems</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject
{
  /**
   * Returns the value of the '<em><b>Given</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Given</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Given</em>' containment reference.
   * @see #setGiven(Problem)
   * @see algorithmMaker.input.InputPackage#getInput_Given()
   * @model containment="true"
   * @generated
   */
  Problem getGiven();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Input#getGiven <em>Given</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Given</em>' containment reference.
   * @see #getGiven()
   * @generated
   */
  void setGiven(Problem value);

  /**
   * Returns the value of the '<em><b>Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' attribute.
   * @see #setTask(String)
   * @see algorithmMaker.input.InputPackage#getInput_Task()
   * @model
   * @generated
   */
  String getTask();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Input#getTask <em>Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' attribute.
   * @see #getTask()
   * @generated
   */
  void setTask(String value);

  /**
   * Returns the value of the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' containment reference.
   * @see #setGoal(Problem)
   * @see algorithmMaker.input.InputPackage#getInput_Goal()
   * @model containment="true"
   * @generated
   */
  Problem getGoal();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Input#getGoal <em>Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' containment reference.
   * @see #getGoal()
   * @generated
   */
  void setGoal(Problem value);

  /**
   * Returns the value of the '<em><b>Theorems</b></em>' containment reference list.
   * The list contents are of type {@link algorithmMaker.input.Theorem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Theorems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Theorems</em>' containment reference list.
   * @see algorithmMaker.input.InputPackage#getInput_Theorems()
   * @model containment="true"
   * @generated
   */
  EList<Theorem> getTheorems();

} // Input
