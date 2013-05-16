/**
 */
package org.xtext.function.function.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.function.function.Exp;
import org.xtext.function.function.FunctionPackage;
import org.xtext.function.function.IfStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.function.function.impl.IfStatementImpl#getIftype <em>Iftype</em>}</li>
 *   <li>{@link org.xtext.function.function.impl.IfStatementImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.function.function.impl.IfStatementImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.function.function.impl.IfStatementImpl#getWhentrue <em>Whentrue</em>}</li>
 *   <li>{@link org.xtext.function.function.impl.IfStatementImpl#getWhenfalse <em>Whenfalse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends StartImpl implements IfStatement
{
  /**
   * The default value of the '{@link #getIftype() <em>Iftype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIftype()
   * @generated
   * @ordered
   */
  protected static final String IFTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIftype() <em>Iftype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIftype()
   * @generated
   * @ordered
   */
  protected String iftype = IFTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Exp left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Exp right;

  /**
   * The cached value of the '{@link #getWhentrue() <em>Whentrue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhentrue()
   * @generated
   * @ordered
   */
  protected Exp whentrue;

  /**
   * The cached value of the '{@link #getWhenfalse() <em>Whenfalse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenfalse()
   * @generated
   * @ordered
   */
  protected Exp whenfalse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return FunctionPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIftype()
  {
    return iftype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIftype(String newIftype)
  {
    String oldIftype = iftype;
    iftype = newIftype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__IFTYPE, oldIftype, iftype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Exp newLeft, NotificationChain msgs)
  {
    Exp oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Exp newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.IF_STATEMENT__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.IF_STATEMENT__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Exp newRight, NotificationChain msgs)
  {
    Exp oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Exp newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.IF_STATEMENT__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.IF_STATEMENT__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getWhentrue()
  {
    return whentrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhentrue(Exp newWhentrue, NotificationChain msgs)
  {
    Exp oldWhentrue = whentrue;
    whentrue = newWhentrue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__WHENTRUE, oldWhentrue, newWhentrue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhentrue(Exp newWhentrue)
  {
    if (newWhentrue != whentrue)
    {
      NotificationChain msgs = null;
      if (whentrue != null)
        msgs = ((InternalEObject)whentrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.IF_STATEMENT__WHENTRUE, null, msgs);
      if (newWhentrue != null)
        msgs = ((InternalEObject)newWhentrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.IF_STATEMENT__WHENTRUE, null, msgs);
      msgs = basicSetWhentrue(newWhentrue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__WHENTRUE, newWhentrue, newWhentrue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getWhenfalse()
  {
    return whenfalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhenfalse(Exp newWhenfalse, NotificationChain msgs)
  {
    Exp oldWhenfalse = whenfalse;
    whenfalse = newWhenfalse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__WHENFALSE, oldWhenfalse, newWhenfalse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhenfalse(Exp newWhenfalse)
  {
    if (newWhenfalse != whenfalse)
    {
      NotificationChain msgs = null;
      if (whenfalse != null)
        msgs = ((InternalEObject)whenfalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.IF_STATEMENT__WHENFALSE, null, msgs);
      if (newWhenfalse != null)
        msgs = ((InternalEObject)newWhenfalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.IF_STATEMENT__WHENFALSE, null, msgs);
      msgs = basicSetWhenfalse(newWhenfalse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.IF_STATEMENT__WHENFALSE, newWhenfalse, newWhenfalse));
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
      case FunctionPackage.IF_STATEMENT__LEFT:
        return basicSetLeft(null, msgs);
      case FunctionPackage.IF_STATEMENT__RIGHT:
        return basicSetRight(null, msgs);
      case FunctionPackage.IF_STATEMENT__WHENTRUE:
        return basicSetWhentrue(null, msgs);
      case FunctionPackage.IF_STATEMENT__WHENFALSE:
        return basicSetWhenfalse(null, msgs);
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
      case FunctionPackage.IF_STATEMENT__IFTYPE:
        return getIftype();
      case FunctionPackage.IF_STATEMENT__LEFT:
        return getLeft();
      case FunctionPackage.IF_STATEMENT__RIGHT:
        return getRight();
      case FunctionPackage.IF_STATEMENT__WHENTRUE:
        return getWhentrue();
      case FunctionPackage.IF_STATEMENT__WHENFALSE:
        return getWhenfalse();
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
      case FunctionPackage.IF_STATEMENT__IFTYPE:
        setIftype((String)newValue);
        return;
      case FunctionPackage.IF_STATEMENT__LEFT:
        setLeft((Exp)newValue);
        return;
      case FunctionPackage.IF_STATEMENT__RIGHT:
        setRight((Exp)newValue);
        return;
      case FunctionPackage.IF_STATEMENT__WHENTRUE:
        setWhentrue((Exp)newValue);
        return;
      case FunctionPackage.IF_STATEMENT__WHENFALSE:
        setWhenfalse((Exp)newValue);
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
      case FunctionPackage.IF_STATEMENT__IFTYPE:
        setIftype(IFTYPE_EDEFAULT);
        return;
      case FunctionPackage.IF_STATEMENT__LEFT:
        setLeft((Exp)null);
        return;
      case FunctionPackage.IF_STATEMENT__RIGHT:
        setRight((Exp)null);
        return;
      case FunctionPackage.IF_STATEMENT__WHENTRUE:
        setWhentrue((Exp)null);
        return;
      case FunctionPackage.IF_STATEMENT__WHENFALSE:
        setWhenfalse((Exp)null);
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
      case FunctionPackage.IF_STATEMENT__IFTYPE:
        return IFTYPE_EDEFAULT == null ? iftype != null : !IFTYPE_EDEFAULT.equals(iftype);
      case FunctionPackage.IF_STATEMENT__LEFT:
        return left != null;
      case FunctionPackage.IF_STATEMENT__RIGHT:
        return right != null;
      case FunctionPackage.IF_STATEMENT__WHENTRUE:
        return whentrue != null;
      case FunctionPackage.IF_STATEMENT__WHENFALSE:
        return whenfalse != null;
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
    result.append(" (iftype: ");
    result.append(iftype);
    result.append(')');
    return result.toString();
  }

} //IfStatementImpl
