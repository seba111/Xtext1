/**
 */
package org.xtext.function.function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp In Fun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.ExpInFun#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getExpInFun()
 * @model
 * @generated
 */
public interface ExpInFun extends TerminalExpressionInFun
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
   * @see #setLeft(TerminalExpressionInFun)
   * @see org.xtext.function.function.FunctionPackage#getExpInFun_Left()
   * @model containment="true"
   * @generated
   */
  TerminalExpressionInFun getLeft();

  /**
   * Sets the value of the '{@link org.xtext.function.function.ExpInFun#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(TerminalExpressionInFun value);

} // ExpInFun
