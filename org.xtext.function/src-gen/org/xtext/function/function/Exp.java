/**
 */
package org.xtext.function.function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.Exp#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getExp()
 * @model
 * @generated
 */
public interface Exp extends ExpWithDefinitions, TerminalExpression
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
   * @see #setLeft(TerminalExpression)
   * @see org.xtext.function.function.FunctionPackage#getExp_Left()
   * @model containment="true"
   * @generated
   */
  TerminalExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.function.function.Exp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(TerminalExpression value);

} // Exp
