/**
 */
package org.xtext.function.function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Two Arg In Fun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.MathTwoArgInFun#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getMathTwoArgInFun()
 * @model
 * @generated
 */
public interface MathTwoArgInFun extends MathFunctionInFun
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(TerminalExpressionInFun)
   * @see org.xtext.function.function.FunctionPackage#getMathTwoArgInFun_Right()
   * @model containment="true"
   * @generated
   */
  TerminalExpressionInFun getRight();

  /**
   * Sets the value of the '{@link org.xtext.function.function.MathTwoArgInFun#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(TerminalExpressionInFun value);

} // MathTwoArgInFun
