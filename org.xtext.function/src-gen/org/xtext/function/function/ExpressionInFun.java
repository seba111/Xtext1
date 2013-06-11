/**
 */
package org.xtext.function.function;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression In Fun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.ExpressionInFun#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.function.function.ExpressionInFun#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getExpressionInFun()
 * @model
 * @generated
 */
public interface ExpressionInFun extends ExpInFun
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.function.function.FunctionPackage#getExpressionInFun_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.function.function.ExpressionInFun#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.function.function.TerminalExpressionInFun}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see org.xtext.function.function.FunctionPackage#getExpressionInFun_Right()
   * @model containment="true"
   * @generated
   */
  EList<TerminalExpressionInFun> getRight();

} // ExpressionInFun
