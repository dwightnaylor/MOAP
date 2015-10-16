/**
 */
package algorithmMaker.input;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithmMaker.input.Type#getName <em>Name</em>}</li>
 *   <li>{@link algorithmMaker.input.Type#getTemplateType <em>Template Type</em>}</li>
 * </ul>
 *
 * @see algorithmMaker.input.InputPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see algorithmMaker.input.InputPackage#getType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Type#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Template Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Type</em>' containment reference.
   * @see #setTemplateType(Type)
   * @see algorithmMaker.input.InputPackage#getType_TemplateType()
   * @model containment="true"
   * @generated
   */
  Type getTemplateType();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Type#getTemplateType <em>Template Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Type</em>' containment reference.
   * @see #getTemplateType()
   * @generated
   */
  void setTemplateType(Type value);

} // Type
