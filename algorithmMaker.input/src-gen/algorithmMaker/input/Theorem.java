/**
 */
package algorithmMaker.input;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.Theorem#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link algorithmMaker.input.Theorem#getResult <em>Result</em>}</li>
 *   <li>{@link algorithmMaker.input.Theorem#getCost <em>Cost</em>}</li>
 *   <li>{@link algorithmMaker.input.Theorem#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getTheorem()
 * @model
 * @generated
 */
public interface Theorem extends EObject
{
  /**
   * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' containment reference.
   * @see #setRequirement(Property)
   * @see algorithmMaker.input.InputPackage#getTheorem_Requirement()
   * @model containment="true"
   * @generated
   */
  Property getRequirement();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Theorem#getRequirement <em>Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirement</em>' containment reference.
   * @see #getRequirement()
   * @generated
   */
  void setRequirement(Property value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference.
   * @see #setResult(Property)
   * @see algorithmMaker.input.InputPackage#getTheorem_Result()
   * @model containment="true"
   * @generated
   */
  Property getResult();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Theorem#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Property value);

  /**
   * Returns the value of the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' attribute.
   * @see #setCost(int)
   * @see algorithmMaker.input.InputPackage#getTheorem_Cost()
   * @model
   * @generated
   */
  int getCost();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Theorem#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(int value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see algorithmMaker.input.InputPackage#getTheorem_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Theorem#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Theorem
