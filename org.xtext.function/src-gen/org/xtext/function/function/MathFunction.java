/**
 */
package org.xtext.function.function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.MathFunction#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getMathFunction()
 * @model
 * @generated
 */
public interface MathFunction extends Exp
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see org.xtext.function.function.FunctionPackage#getMathFunction_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link org.xtext.function.function.MathFunction#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

} // MathFunction
