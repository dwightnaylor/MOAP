/**
 */
package algorithmMaker.input;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link algorithmMaker.input.Quantifier#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link algorithmMaker.input.Quantifier#getSubject <em>Subject</em>}</li>
 *   <li>{@link algorithmMaker.input.Quantifier#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see algorithmMaker.input.InputPackage#getQuantifier()
 * @model
 * @generated
 */
public interface Quantifier extends Property
{
  /**
   * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantifier</em>' attribute.
   * @see #setQuantifier(String)
   * @see algorithmMaker.input.InputPackage#getQuantifier_Quantifier()
   * @model
   * @generated
   */
  String getQuantifier();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Quantifier#getQuantifier <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantifier</em>' attribute.
   * @see #getQuantifier()
   * @generated
   */
  void setQuantifier(String value);

  /**
   * Returns the value of the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' containment reference.
   * @see #setSubject(Problem)
   * @see algorithmMaker.input.InputPackage#getQuantifier_Subject()
   * @model containment="true"
   * @generated
   */
  Problem getSubject();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Quantifier#getSubject <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' containment reference.
   * @see #getSubject()
   * @generated
   */
  void setSubject(Problem value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Property)
   * @see algorithmMaker.input.InputPackage#getQuantifier_Predicate()
   * @model containment="true"
   * @generated
   */
  Property getPredicate();

  /**
   * Sets the value of the '{@link algorithmMaker.input.Quantifier#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Property value);

} // Quantifier
