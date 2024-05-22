/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.myDsl.Argument2;
import org.xtext.example.myDsl.MyDslPackage;
import org.xtext.example.myDsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.impl.Argument2Impl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.Argument2Impl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.Argument2Impl#getIntegerEnd1 <em>Integer End1</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.Argument2Impl#getIntegerEnd2 <em>Integer End2</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.Argument2Impl#getIntegerEnd3 <em>Integer End3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Argument2Impl extends MinimalEObjectImpl.Container implements Argument2
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<Variable> variable;

  /**
   * The default value of the '{@link #getInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected static final int INTEGER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected int integer = INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #getIntegerEnd1() <em>Integer End1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerEnd1()
   * @generated
   * @ordered
   */
  protected static final int INTEGER_END1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntegerEnd1() <em>Integer End1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerEnd1()
   * @generated
   * @ordered
   */
  protected int integerEnd1 = INTEGER_END1_EDEFAULT;

  /**
   * The default value of the '{@link #getIntegerEnd2() <em>Integer End2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerEnd2()
   * @generated
   * @ordered
   */
  protected static final int INTEGER_END2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntegerEnd2() <em>Integer End2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerEnd2()
   * @generated
   * @ordered
   */
  protected int integerEnd2 = INTEGER_END2_EDEFAULT;

  /**
   * The default value of the '{@link #getIntegerEnd3() <em>Integer End3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerEnd3()
   * @generated
   * @ordered
   */
  protected static final int INTEGER_END3_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntegerEnd3() <em>Integer End3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerEnd3()
   * @generated
   * @ordered
   */
  protected int integerEnd3 = INTEGER_END3_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Argument2Impl()
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
    return MyDslPackage.Literals.ARGUMENT2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getVariable()
  {
    if (variable == null)
    {
      variable = new EObjectContainmentEList<Variable>(Variable.class, this, MyDslPackage.ARGUMENT2__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getInteger()
  {
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInteger(int newInteger)
  {
    int oldInteger = integer;
    integer = newInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ARGUMENT2__INTEGER, oldInteger, integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIntegerEnd1()
  {
    return integerEnd1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntegerEnd1(int newIntegerEnd1)
  {
    int oldIntegerEnd1 = integerEnd1;
    integerEnd1 = newIntegerEnd1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ARGUMENT2__INTEGER_END1, oldIntegerEnd1, integerEnd1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIntegerEnd2()
  {
    return integerEnd2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntegerEnd2(int newIntegerEnd2)
  {
    int oldIntegerEnd2 = integerEnd2;
    integerEnd2 = newIntegerEnd2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ARGUMENT2__INTEGER_END2, oldIntegerEnd2, integerEnd2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIntegerEnd3()
  {
    return integerEnd3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntegerEnd3(int newIntegerEnd3)
  {
    int oldIntegerEnd3 = integerEnd3;
    integerEnd3 = newIntegerEnd3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ARGUMENT2__INTEGER_END3, oldIntegerEnd3, integerEnd3));
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
      case MyDslPackage.ARGUMENT2__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ARGUMENT2__VARIABLE:
        return getVariable();
      case MyDslPackage.ARGUMENT2__INTEGER:
        return getInteger();
      case MyDslPackage.ARGUMENT2__INTEGER_END1:
        return getIntegerEnd1();
      case MyDslPackage.ARGUMENT2__INTEGER_END2:
        return getIntegerEnd2();
      case MyDslPackage.ARGUMENT2__INTEGER_END3:
        return getIntegerEnd3();
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
      case MyDslPackage.ARGUMENT2__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends Variable>)newValue);
        return;
      case MyDslPackage.ARGUMENT2__INTEGER:
        setInteger((Integer)newValue);
        return;
      case MyDslPackage.ARGUMENT2__INTEGER_END1:
        setIntegerEnd1((Integer)newValue);
        return;
      case MyDslPackage.ARGUMENT2__INTEGER_END2:
        setIntegerEnd2((Integer)newValue);
        return;
      case MyDslPackage.ARGUMENT2__INTEGER_END3:
        setIntegerEnd3((Integer)newValue);
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
      case MyDslPackage.ARGUMENT2__VARIABLE:
        getVariable().clear();
        return;
      case MyDslPackage.ARGUMENT2__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case MyDslPackage.ARGUMENT2__INTEGER_END1:
        setIntegerEnd1(INTEGER_END1_EDEFAULT);
        return;
      case MyDslPackage.ARGUMENT2__INTEGER_END2:
        setIntegerEnd2(INTEGER_END2_EDEFAULT);
        return;
      case MyDslPackage.ARGUMENT2__INTEGER_END3:
        setIntegerEnd3(INTEGER_END3_EDEFAULT);
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
      case MyDslPackage.ARGUMENT2__VARIABLE:
        return variable != null && !variable.isEmpty();
      case MyDslPackage.ARGUMENT2__INTEGER:
        return integer != INTEGER_EDEFAULT;
      case MyDslPackage.ARGUMENT2__INTEGER_END1:
        return integerEnd1 != INTEGER_END1_EDEFAULT;
      case MyDslPackage.ARGUMENT2__INTEGER_END2:
        return integerEnd2 != INTEGER_END2_EDEFAULT;
      case MyDslPackage.ARGUMENT2__INTEGER_END3:
        return integerEnd3 != INTEGER_END3_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (integer: ");
    result.append(integer);
    result.append(", integerEnd1: ");
    result.append(integerEnd1);
    result.append(", integerEnd2: ");
    result.append(integerEnd2);
    result.append(", integerEnd3: ");
    result.append(integerEnd3);
    result.append(')');
    return result.toString();
  }

} //Argument2Impl