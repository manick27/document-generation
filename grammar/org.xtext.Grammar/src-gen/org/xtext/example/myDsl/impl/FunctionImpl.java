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

import org.xtext.example.myDsl.DivFunction;
import org.xtext.example.myDsl.Function;
import org.xtext.example.myDsl.MyDslPackage;
import org.xtext.example.myDsl.ProdFunction;
import org.xtext.example.myDsl.SumFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.impl.FunctionImpl#getSumFunction <em>Sum Function</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.FunctionImpl#getProdFunction <em>Prod Function</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.FunctionImpl#getDivFunction <em>Div Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function
{
  /**
   * The cached value of the '{@link #getSumFunction() <em>Sum Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSumFunction()
   * @generated
   * @ordered
   */
  protected SumFunction sumFunction;

  /**
   * The cached value of the '{@link #getProdFunction() <em>Prod Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProdFunction()
   * @generated
   * @ordered
   */
  protected ProdFunction prodFunction;

  /**
   * The cached value of the '{@link #getDivFunction() <em>Div Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivFunction()
   * @generated
   * @ordered
   */
  protected DivFunction divFunction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return MyDslPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SumFunction getSumFunction()
  {
    return sumFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSumFunction(SumFunction newSumFunction, NotificationChain msgs)
  {
    SumFunction oldSumFunction = sumFunction;
    sumFunction = newSumFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__SUM_FUNCTION, oldSumFunction, newSumFunction);
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
  public void setSumFunction(SumFunction newSumFunction)
  {
    if (newSumFunction != sumFunction)
    {
      NotificationChain msgs = null;
      if (sumFunction != null)
        msgs = ((InternalEObject)sumFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNCTION__SUM_FUNCTION, null, msgs);
      if (newSumFunction != null)
        msgs = ((InternalEObject)newSumFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNCTION__SUM_FUNCTION, null, msgs);
      msgs = basicSetSumFunction(newSumFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__SUM_FUNCTION, newSumFunction, newSumFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProdFunction getProdFunction()
  {
    return prodFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProdFunction(ProdFunction newProdFunction, NotificationChain msgs)
  {
    ProdFunction oldProdFunction = prodFunction;
    prodFunction = newProdFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__PROD_FUNCTION, oldProdFunction, newProdFunction);
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
  public void setProdFunction(ProdFunction newProdFunction)
  {
    if (newProdFunction != prodFunction)
    {
      NotificationChain msgs = null;
      if (prodFunction != null)
        msgs = ((InternalEObject)prodFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNCTION__PROD_FUNCTION, null, msgs);
      if (newProdFunction != null)
        msgs = ((InternalEObject)newProdFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNCTION__PROD_FUNCTION, null, msgs);
      msgs = basicSetProdFunction(newProdFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__PROD_FUNCTION, newProdFunction, newProdFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DivFunction getDivFunction()
  {
    return divFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDivFunction(DivFunction newDivFunction, NotificationChain msgs)
  {
    DivFunction oldDivFunction = divFunction;
    divFunction = newDivFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__DIV_FUNCTION, oldDivFunction, newDivFunction);
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
  public void setDivFunction(DivFunction newDivFunction)
  {
    if (newDivFunction != divFunction)
    {
      NotificationChain msgs = null;
      if (divFunction != null)
        msgs = ((InternalEObject)divFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNCTION__DIV_FUNCTION, null, msgs);
      if (newDivFunction != null)
        msgs = ((InternalEObject)newDivFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNCTION__DIV_FUNCTION, null, msgs);
      msgs = basicSetDivFunction(newDivFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__DIV_FUNCTION, newDivFunction, newDivFunction));
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
      case MyDslPackage.FUNCTION__SUM_FUNCTION:
        return basicSetSumFunction(null, msgs);
      case MyDslPackage.FUNCTION__PROD_FUNCTION:
        return basicSetProdFunction(null, msgs);
      case MyDslPackage.FUNCTION__DIV_FUNCTION:
        return basicSetDivFunction(null, msgs);
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
      case MyDslPackage.FUNCTION__SUM_FUNCTION:
        return getSumFunction();
      case MyDslPackage.FUNCTION__PROD_FUNCTION:
        return getProdFunction();
      case MyDslPackage.FUNCTION__DIV_FUNCTION:
        return getDivFunction();
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
      case MyDslPackage.FUNCTION__SUM_FUNCTION:
        setSumFunction((SumFunction)newValue);
        return;
      case MyDslPackage.FUNCTION__PROD_FUNCTION:
        setProdFunction((ProdFunction)newValue);
        return;
      case MyDslPackage.FUNCTION__DIV_FUNCTION:
        setDivFunction((DivFunction)newValue);
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
      case MyDslPackage.FUNCTION__SUM_FUNCTION:
        setSumFunction((SumFunction)null);
        return;
      case MyDslPackage.FUNCTION__PROD_FUNCTION:
        setProdFunction((ProdFunction)null);
        return;
      case MyDslPackage.FUNCTION__DIV_FUNCTION:
        setDivFunction((DivFunction)null);
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
      case MyDslPackage.FUNCTION__SUM_FUNCTION:
        return sumFunction != null;
      case MyDslPackage.FUNCTION__PROD_FUNCTION:
        return prodFunction != null;
      case MyDslPackage.FUNCTION__DIV_FUNCTION:
        return divFunction != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionImpl