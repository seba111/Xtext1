/**
 */
package org.xtext.function.function.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.function.function.FunctionCall;
import org.xtext.function.function.FunctionPackage;
import org.xtext.function.function.TerminalExpression;
import org.xtext.function.function.VariableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.function.function.impl.TerminalExpressionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.function.function.impl.TerminalExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.function.function.impl.TerminalExpressionImpl#getFunctioncall <em>Functioncall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalExpressionImpl extends MinimalEObjectImpl.Container implements TerminalExpression
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableDefinition variable;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunctioncall() <em>Functioncall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctioncall()
   * @generated
   * @ordered
   */
  protected FunctionCall functioncall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerminalExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FunctionPackage.Literals.TERMINAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (VariableDefinition)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionPackage.TERMINAL_EXPRESSION__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VariableDefinition newVariable)
  {
    VariableDefinition oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.TERMINAL_EXPRESSION__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.TERMINAL_EXPRESSION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall getFunctioncall()
  {
    return functioncall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctioncall(FunctionCall newFunctioncall, NotificationChain msgs)
  {
    FunctionCall oldFunctioncall = functioncall;
    functioncall = newFunctioncall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL, oldFunctioncall, newFunctioncall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctioncall(FunctionCall newFunctioncall)
  {
    if (newFunctioncall != functioncall)
    {
      NotificationChain msgs = null;
      if (functioncall != null)
        msgs = ((InternalEObject)functioncall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL, null, msgs);
      if (newFunctioncall != null)
        msgs = ((InternalEObject)newFunctioncall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL, null, msgs);
      msgs = basicSetFunctioncall(newFunctioncall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL, newFunctioncall, newFunctioncall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL:
        return basicSetFunctioncall(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FunctionPackage.TERMINAL_EXPRESSION__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case FunctionPackage.TERMINAL_EXPRESSION__VALUE:
        return getValue();
      case FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL:
        return getFunctioncall();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FunctionPackage.TERMINAL_EXPRESSION__VARIABLE:
        setVariable((VariableDefinition)newValue);
        return;
      case FunctionPackage.TERMINAL_EXPRESSION__VALUE:
        setValue((String)newValue);
        return;
      case FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL:
        setFunctioncall((FunctionCall)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FunctionPackage.TERMINAL_EXPRESSION__VARIABLE:
        setVariable((VariableDefinition)null);
        return;
      case FunctionPackage.TERMINAL_EXPRESSION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL:
        setFunctioncall((FunctionCall)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FunctionPackage.TERMINAL_EXPRESSION__VARIABLE:
        return variable != null;
      case FunctionPackage.TERMINAL_EXPRESSION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case FunctionPackage.TERMINAL_EXPRESSION__FUNCTIONCALL:
        return functioncall != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //TerminalExpressionImpl
