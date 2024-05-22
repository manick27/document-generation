/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.myDsl.For;
import org.xtext.example.myDsl.Loop;
import org.xtext.example.myDsl.MyDslPackage;
import org.xtext.example.myDsl.With;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.impl.LoopImpl#getWithLoop <em>With Loop</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.LoopImpl#getForLoop <em>For Loop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends MinimalEObjectImpl.Container implements Loop
{
  /**
   * The cached value of the '{@link #getWithLoop() <em>With Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithLoop()
   * @generated
   * @ordered
   */
  protected With withLoop;

  /**
   * The cached value of the '{@link #getForLoop() <em>For Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForLoop()
   * @generated
   * @ordered
   */
  protected For forLoop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopImpl()
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
    return MyDslPackage.Literals.LOOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public With getWithLoop()
  {
    return withLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWithLoop(With newWithLoop, NotificationChain msgs)
  {
    With oldWithLoop = withLoop;
    withLoop = newWithLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOOP__WITH_LOOP, oldWithLoop, newWithLoop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWithLoop(With newWithLoop)
  {
    if (newWithLoop != withLoop)
    {
      NotificationChain msgs = null;
      if (withLoop != null)
        msgs = ((InternalEObject)withLoop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOOP__WITH_LOOP, null, msgs);
      if (newWithLoop != null)
        msgs = ((InternalEObject)newWithLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOOP__WITH_LOOP, null, msgs);
      msgs = basicSetWithLoop(newWithLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOOP__WITH_LOOP, newWithLoop, newWithLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public For getForLoop()
  {
    return forLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForLoop(For newForLoop, NotificationChain msgs)
  {
    For oldForLoop = forLoop;
    forLoop = newForLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOOP__FOR_LOOP, oldForLoop, newForLoop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForLoop(For newForLoop)
  {
    if (newForLoop != forLoop)
    {
      NotificationChain msgs = null;
      if (forLoop != null)
        msgs = ((InternalEObject)forLoop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOOP__FOR_LOOP, null, msgs);
      if (newForLoop != null)
        msgs = ((InternalEObject)newForLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOOP__FOR_LOOP, null, msgs);
      msgs = basicSetForLoop(newForLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOOP__FOR_LOOP, newForLoop, newForLoop));
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
      case MyDslPackage.LOOP__WITH_LOOP:
        return basicSetWithLoop(null, msgs);
      case MyDslPackage.LOOP__FOR_LOOP:
        return basicSetForLoop(null, msgs);
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
      case MyDslPackage.LOOP__WITH_LOOP:
        return getWithLoop();
      case MyDslPackage.LOOP__FOR_LOOP:
        return getForLoop();
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
      case MyDslPackage.LOOP__WITH_LOOP:
        setWithLoop((With)newValue);
        return;
      case MyDslPackage.LOOP__FOR_LOOP:
        setForLoop((For)newValue);
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
      case MyDslPackage.LOOP__WITH_LOOP:
        setWithLoop((With)null);
        return;
      case MyDslPackage.LOOP__FOR_LOOP:
        setForLoop((For)null);
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
      case MyDslPackage.LOOP__WITH_LOOP:
        return withLoop != null;
      case MyDslPackage.LOOP__FOR_LOOP:
        return forLoop != null;
    }
    return super.eIsSet(featureID);
  }

} //LoopImpl