/**
 */
package org.xtext.function.function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.function.function.IfStatement#getIftype <em>Iftype</em>}</li>
 *   <li>{@link org.xtext.function.function.IfStatement#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.function.function.IfStatement#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.function.function.IfStatement#getWhentrue <em>Whentrue</em>}</li>
 *   <li>{@link org.xtext.function.function.IfStatement#getWhenfalse <em>Whenfalse</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.function.function.FunctionPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Start
{
  /**
   * Returns the value of the '<em><b>Iftype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iftype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iftype</em>' attribute.
   * @see #setIftype(String)
   * @see org.xtext.function.function.FunctionPackage#getIfStatement_Iftype()
   * @model
   * @generated
   */
  String getIftype();

  /**
   * Sets the value of the '{@link org.xtext.function.function.IfStatement#getIftype <em>Iftype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iftype</em>' attribute.
   * @see #getIftype()
   * @generated
   */
  void setIftype(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp)
   * @see org.xtext.function.function.FunctionPackage#getIfStatement_Left()
   * @model containment="true"
   * @generated
   */
  Exp getLeft();

  /**
   * Sets the value of the '{@link org.xtext.function.function.IfStatement#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Exp)
   * @see org.xtext.function.function.FunctionPackage#getIfStatement_Right()
   * @model containment="true"
   * @generated
   */
  Exp getRight();

  /**
   * Sets the value of the '{@link org.xtext.function.function.IfStatement#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp value);

  /**
   * Returns the value of the '<em><b>Whentrue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whentrue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whentrue</em>' containment reference.
   * @see #setWhentrue(Exp)
   * @see org.xtext.function.function.FunctionPackage#getIfStatement_Whentrue()
   * @model containment="true"
   * @generated
   */
  Exp getWhentrue();

  /**
   * Sets the value of the '{@link org.xtext.function.function.IfStatement#getWhentrue <em>Whentrue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whentrue</em>' containment reference.
   * @see #getWhentrue()
   * @generated
   */
  void setWhentrue(Exp value);

  /**
   * Returns the value of the '<em><b>Whenfalse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whenfalse</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whenfalse</em>' containment reference.
   * @see #setWhenfalse(Exp)
   * @see org.xtext.function.function.FunctionPackage#getIfStatement_Whenfalse()
   * @model containment="true"
   * @generated
   */
  Exp getWhenfalse();

  /**
   * Sets the value of the '{@link org.xtext.function.function.IfStatement#getWhenfalse <em>Whenfalse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whenfalse</em>' containment reference.
   * @see #getWhenfalse()
   * @generated
   */
  void setWhenfalse(Exp value);

} // IfStatement
