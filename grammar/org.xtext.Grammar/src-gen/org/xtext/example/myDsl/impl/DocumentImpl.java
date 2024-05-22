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

import org.xtext.example.myDsl.Build;
import org.xtext.example.myDsl.Data;
import org.xtext.example.myDsl.Document;
import org.xtext.example.myDsl.MyDslPackage;
import org.xtext.example.myDsl.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.impl.DocumentImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.DocumentImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.DocumentImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document
{
  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected Data data;

  /**
   * The cached value of the '{@link #getBuild() <em>Build</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuild()
   * @generated
   * @ordered
   */
  protected Build build;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected Style style;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentImpl()
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
    return MyDslPackage.Literals.DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Data getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData(Data newData, NotificationChain msgs)
  {
    Data oldData = data;
    data = newData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DOCUMENT__DATA, oldData, newData);
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
  public void setData(Data newData)
  {
    if (newData != data)
    {
      NotificationChain msgs = null;
      if (data != null)
        msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DOCUMENT__DATA, null, msgs);
      if (newData != null)
        msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DOCUMENT__DATA, null, msgs);
      msgs = basicSetData(newData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DOCUMENT__DATA, newData, newData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Build getBuild()
  {
    return build;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBuild(Build newBuild, NotificationChain msgs)
  {
    Build oldBuild = build;
    build = newBuild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DOCUMENT__BUILD, oldBuild, newBuild);
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
  public void setBuild(Build newBuild)
  {
    if (newBuild != build)
    {
      NotificationChain msgs = null;
      if (build != null)
        msgs = ((InternalEObject)build).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DOCUMENT__BUILD, null, msgs);
      if (newBuild != null)
        msgs = ((InternalEObject)newBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DOCUMENT__BUILD, null, msgs);
      msgs = basicSetBuild(newBuild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DOCUMENT__BUILD, newBuild, newBuild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Style getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(Style newStyle, NotificationChain msgs)
  {
    Style oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DOCUMENT__STYLE, oldStyle, newStyle);
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
  public void setStyle(Style newStyle)
  {
    if (newStyle != style)
    {
      NotificationChain msgs = null;
      if (style != null)
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DOCUMENT__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DOCUMENT__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DOCUMENT__STYLE, newStyle, newStyle));
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
      case MyDslPackage.DOCUMENT__DATA:
        return basicSetData(null, msgs);
      case MyDslPackage.DOCUMENT__BUILD:
        return basicSetBuild(null, msgs);
      case MyDslPackage.DOCUMENT__STYLE:
        return basicSetStyle(null, msgs);
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
      case MyDslPackage.DOCUMENT__DATA:
        return getData();
      case MyDslPackage.DOCUMENT__BUILD:
        return getBuild();
      case MyDslPackage.DOCUMENT__STYLE:
        return getStyle();
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
      case MyDslPackage.DOCUMENT__DATA:
        setData((Data)newValue);
        return;
      case MyDslPackage.DOCUMENT__BUILD:
        setBuild((Build)newValue);
        return;
      case MyDslPackage.DOCUMENT__STYLE:
        setStyle((Style)newValue);
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
      case MyDslPackage.DOCUMENT__DATA:
        setData((Data)null);
        return;
      case MyDslPackage.DOCUMENT__BUILD:
        setBuild((Build)null);
        return;
      case MyDslPackage.DOCUMENT__STYLE:
        setStyle((Style)null);
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
      case MyDslPackage.DOCUMENT__DATA:
        return data != null;
      case MyDslPackage.DOCUMENT__BUILD:
        return build != null;
      case MyDslPackage.DOCUMENT__STYLE:
        return style != null;
    }
    return super.eIsSet(featureID);
  }

} //DocumentImpl
