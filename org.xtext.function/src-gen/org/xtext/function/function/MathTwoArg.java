/**
 */
package org.xtext.function.function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Two Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.MathTwoArg#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getMathTwoArg()
 * @model
 * @generated
 */
public interface MathTwoArg extends MathFunction
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
   * @see #setRight(TerminalExpression)
   * @see org.xtext.function.function.FunctionPackage#getMathTwoArg_Right()
   * @model containment="true"
   * @generated
   */
  TerminalExpression getRight();

  /**
   * Sets the value of the '{@link org.xtext.function.function.MathTwoArg#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(TerminalExpression value);

} // MathTwoArg
