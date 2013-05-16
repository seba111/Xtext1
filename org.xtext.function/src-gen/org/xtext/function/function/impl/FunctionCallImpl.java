/**
 */
package org.xtext.function.function.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.function.function.FunctionCall;
import org.xtext.function.function.FunctionDefinition;
import org.xtext.function.function.FunctionPackage;
import org.xtext.function.function.ParamValues;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.function.function.impl.FunctionCallImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.function.function.impl.FunctionCallImpl#getParamvalues <em>Paramvalues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionCallImpl extends StartImpl implements FunctionCall
{
  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected FunctionDefinition func;

  /**
   * The cached value of the '{@link #getParamvalues() <em>Paramvalues</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamvalues()
   * @generated
   * @ordered
   */
  protected EList<ParamValues> paramvalues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionCallImpl()
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
    return FunctionPackage.Literals.FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition getFunc()
  {
    if (func != null && func.eIsProxy())
    {
      InternalEObject oldFunc = (InternalEObject)func;
      func = (FunctionDefinition)eResolveProxy(oldFunc);
      if (func != oldFunc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionPackage.FUNCTION_CALL__FUNC, oldFunc, func));
      }
    }
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition basicGetFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(FunctionDefinition newFunc)
  {
    FunctionDefinition oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNCTION_CALL__FUNC, oldFunc, func));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParamValues> getParamvalues()
  {
    if (paramvalues == null)
    {
      paramvalues = new EObjectContainmentEList<ParamValues>(ParamValues.class, this, FunctionPackage.FUNCTION_CALL__PARAMVALUES);
    }
    return paramvalues;
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
      case FunctionPackage.FUNCTION_CALL__PARAMVALUES:
        return ((InternalEList<?>)getParamvalues()).basicRemove(otherEnd, msgs);
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
      case FunctionPackage.FUNCTION_CALL__FUNC:
        if (resolve) return getFunc();
        return basicGetFunc();
      case FunctionPackage.FUNCTION_CALL__PARAMVALUES:
        return getParamvalues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FunctionPackage.FUNCTION_CALL__FUNC:
        setFunc((FunctionDefinition)newValue);
        return;
      case FunctionPackage.FUNCTION_CALL__PARAMVALUES:
        getParamvalues().clear();
        getParamvalues().addAll((Collection<? extends ParamValues>)newValue);
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
      case FunctionPackage.FUNCTION_CALL__FUNC:
        setFunc((FunctionDefinition)null);
        return;
      case FunctionPackage.FUNCTION_CALL__PARAMVALUES:
        getParamvalues().clear();
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
      case FunctionPackage.FUNCTION_CALL__FUNC:
        return func != null;
      case FunctionPackage.FUNCTION_CALL__PARAMVALUES:
        return paramvalues != null && !paramvalues.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionCallImpl
