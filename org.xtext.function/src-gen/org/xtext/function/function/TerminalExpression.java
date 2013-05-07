/**
 */
package org.xtext.function.function;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.TerminalExpression#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.function.function.TerminalExpression#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.function.function.TerminalExpression#getFunctioncall <em>Functioncall</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getTerminalExpression()
 * @model
 * @generated
 */
public interface TerminalExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VariableDefinition)
   * @see org.xtext.function.function.FunctionPackage#getTerminalExpression_Variable()
   * @model
   * @generated
   */
  VariableDefinition getVariable();

  /**
   * Sets the value of the '{@link org.xtext.function.function.TerminalExpression#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDefinition value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.function.function.FunctionPackage#getTerminalExpression_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.function.function.TerminalExpression#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Functioncall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functioncall</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functioncall</em>' containment reference.
   * @see #setFunctioncall(FunctionCall)
   * @see org.xtext.function.function.FunctionPackage#getTerminalExpression_Functioncall()
   * @model containment="true"
   * @generated
   */
  FunctionCall getFunctioncall();

  /**
   * Sets the value of the '{@link org.xtext.function.function.TerminalExpression#getFunctioncall <em>Functioncall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functioncall</em>' containment reference.
   * @see #getFunctioncall()
   * @generated
   */
  void setFunctioncall(FunctionCall value);

} // TerminalExpression
