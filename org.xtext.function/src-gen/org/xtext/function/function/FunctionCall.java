/**
 */
package org.xtext.function.function;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.FunctionCall#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.function.function.FunctionCall#getParamvalues <em>Paramvalues</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Start
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' reference.
   * @see #setFunc(FunctionDefinition)
   * @see org.xtext.function.function.FunctionPackage#getFunctionCall_Func()
   * @model
   * @generated
   */
  FunctionDefinition getFunc();

  /**
   * Sets the value of the '{@link org.xtext.function.function.FunctionCall#getFunc <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(FunctionDefinition value);

  /**
   * Returns the value of the '<em><b>Paramvalues</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.function.function.ParamValues}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramvalues</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramvalues</em>' containment reference list.
   * @see org.xtext.function.function.FunctionPackage#getFunctionCall_Paramvalues()
   * @model containment="true"
   * @generated
   */
  EList<ParamValues> getParamvalues();

} // FunctionCall
