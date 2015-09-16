/**
 */
package algorithmMaker.input;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link algorithmMaker.input.Problem#getVars <em>Vars</em>}</li>
 *   <li>{@link algorithmMaker.input.Problem#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see algorithmMaker.input.InputPackage#getProblem()
 * @model
 * @generated
 */
public interface Problem extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' attribute list.
   * @see algorithmMaker.input.InputPackage#getProblem_Vars()
   * @model unique="false"
   * @generated
   */
  EList<String> getVars();

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(Property)
   * @see algorithmMaker.input.InputPackage#getProblem_Property()
   * @model containment="true"
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Problem#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

} // Problem