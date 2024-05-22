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

import org.xtext.example.myDsl.Array;
import org.xtext.example.myDsl.MyDslPackage;
import org.xtext.example.myDsl.NestedObject;
import org.xtext.example.myDsl.Value;
import org.xtext.example.myDsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.impl.ValueImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.ValueImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.ValueImpl#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.ValueImpl#getTrueV <em>True V</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.ValueImpl#getFalseV <em>False V</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.ValueImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.ValueImpl#getNestedObject <em>Nested Object</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.impl.ValueImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value
{
  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

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
   * The cached value of the '{@link #getFloatValue() <em>Float Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatValue()
   * @generated
   * @ordered
   */
  protected org.xtext.example.myDsl.Float floatValue;

  /**
   * The default value of the '{@link #getTrueV() <em>True V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrueV()
   * @generated
   * @ordered
   */
  protected static final String TRUE_V_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrueV() <em>True V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrueV()
   * @generated
   * @ordered
   */
  protected String trueV = TRUE_V_EDEFAULT;

  /**
   * The default value of the '{@link #getFalseV() <em>False V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalseV()
   * @generated
   * @ordered
   */
  protected static final String FALSE_V_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFalseV() <em>False V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalseV()
   * @generated
   * @ordered
   */
  protected String falseV = FALSE_V_EDEFAULT;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected Array array;

  /**
   * The cached value of the '{@link #getNestedObject() <em>Nested Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedObject()
   * @generated
   * @ordered
   */
  protected NestedObject nestedObject;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueImpl()
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
    return MyDslPackage.Literals.VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__STRING, oldString, string));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__INTEGER, oldInteger, integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.example.myDsl.Float getFloatValue()
  {
    return floatValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFloatValue(org.xtext.example.myDsl.Float newFloatValue, NotificationChain msgs)
  {
    org.xtext.example.myDsl.Float oldFloatValue = floatValue;
    floatValue = newFloatValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__FLOAT_VALUE, oldFloatValue, newFloatValue);
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
  public void setFloatValue(org.xtext.example.myDsl.Float newFloatValue)
  {
    if (newFloatValue != floatValue)
    {
      NotificationChain msgs = null;
      if (floatValue != null)
        msgs = ((InternalEObject)floatValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VALUE__FLOAT_VALUE, null, msgs);
      if (newFloatValue != null)
        msgs = ((InternalEObject)newFloatValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VALUE__FLOAT_VALUE, null, msgs);
      msgs = basicSetFloatValue(newFloatValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__FLOAT_VALUE, newFloatValue, newFloatValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTrueV()
  {
    return trueV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTrueV(String newTrueV)
  {
    String oldTrueV = trueV;
    trueV = newTrueV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__TRUE_V, oldTrueV, trueV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFalseV()
  {
    return falseV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFalseV(String newFalseV)
  {
    String oldFalseV = falseV;
    falseV = newFalseV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__FALSE_V, oldFalseV, falseV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Array getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray(Array newArray, NotificationChain msgs)
  {
    Array oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__ARRAY, oldArray, newArray);
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
  public void setArray(Array newArray)
  {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VALUE__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VALUE__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__ARRAY, newArray, newArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedObject getNestedObject()
  {
    return nestedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNestedObject(NestedObject newNestedObject, NotificationChain msgs)
  {
    NestedObject oldNestedObject = nestedObject;
    nestedObject = newNestedObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__NESTED_OBJECT, oldNestedObject, newNestedObject);
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
  public void setNestedObject(NestedObject newNestedObject)
  {
    if (newNestedObject != nestedObject)
    {
      NotificationChain msgs = null;
      if (nestedObject != null)
        msgs = ((InternalEObject)nestedObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VALUE__NESTED_OBJECT, null, msgs);
      if (newNestedObject != null)
        msgs = ((InternalEObject)newNestedObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VALUE__NESTED_OBJECT, null, msgs);
      msgs = basicSetNestedObject(newNestedObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__NESTED_OBJECT, newNestedObject, newNestedObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__VARIABLE, oldVariable, newVariable);
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
  public void setVariable(Variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VALUE__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VALUE__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALUE__VARIABLE, newVariable, newVariable));
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
      case MyDslPackage.VALUE__FLOAT_VALUE:
        return basicSetFloatValue(null, msgs);
      case MyDslPackage.VALUE__ARRAY:
        return basicSetArray(null, msgs);
      case MyDslPackage.VALUE__NESTED_OBJECT:
        return basicSetNestedObject(null, msgs);
      case MyDslPackage.VALUE__VARIABLE:
        return basicSetVariable(null, msgs);
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
      case MyDslPackage.VALUE__STRING:
        return getString();
      case MyDslPackage.VALUE__INTEGER:
        return getInteger();
      case MyDslPackage.VALUE__FLOAT_VALUE:
        return getFloatValue();
      case MyDslPackage.VALUE__TRUE_V:
        return getTrueV();
      case MyDslPackage.VALUE__FALSE_V:
        return getFalseV();
      case MyDslPackage.VALUE__ARRAY:
        return getArray();
      case MyDslPackage.VALUE__NESTED_OBJECT:
        return getNestedObject();
      case MyDslPackage.VALUE__VARIABLE:
        return getVariable();
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
      case MyDslPackage.VALUE__STRING:
        setString((String)newValue);
        return;
      case MyDslPackage.VALUE__INTEGER:
        setInteger((Integer)newValue);
        return;
      case MyDslPackage.VALUE__FLOAT_VALUE:
        setFloatValue((org.xtext.example.myDsl.Float)newValue);
        return;
      case MyDslPackage.VALUE__TRUE_V:
        setTrueV((String)newValue);
        return;
      case MyDslPackage.VALUE__FALSE_V:
        setFalseV((String)newValue);
        return;
      case MyDslPackage.VALUE__ARRAY:
        setArray((Array)newValue);
        return;
      case MyDslPackage.VALUE__NESTED_OBJECT:
        setNestedObject((NestedObject)newValue);
        return;
      case MyDslPackage.VALUE__VARIABLE:
        setVariable((Variable)newValue);
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
      case MyDslPackage.VALUE__STRING:
        setString(STRING_EDEFAULT);
        return;
      case MyDslPackage.VALUE__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case MyDslPackage.VALUE__FLOAT_VALUE:
        setFloatValue((org.xtext.example.myDsl.Float)null);
        return;
      case MyDslPackage.VALUE__TRUE_V:
        setTrueV(TRUE_V_EDEFAULT);
        return;
      case MyDslPackage.VALUE__FALSE_V:
        setFalseV(FALSE_V_EDEFAULT);
        return;
      case MyDslPackage.VALUE__ARRAY:
        setArray((Array)null);
        return;
      case MyDslPackage.VALUE__NESTED_OBJECT:
        setNestedObject((NestedObject)null);
        return;
      case MyDslPackage.VALUE__VARIABLE:
        setVariable((Variable)null);
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
      case MyDslPackage.VALUE__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case MyDslPackage.VALUE__INTEGER:
        return integer != INTEGER_EDEFAULT;
      case MyDslPackage.VALUE__FLOAT_VALUE:
        return floatValue != null;
      case MyDslPackage.VALUE__TRUE_V:
        return TRUE_V_EDEFAULT == null ? trueV != null : !TRUE_V_EDEFAULT.equals(trueV);
      case MyDslPackage.VALUE__FALSE_V:
        return FALSE_V_EDEFAULT == null ? falseV != null : !FALSE_V_EDEFAULT.equals(falseV);
      case MyDslPackage.VALUE__ARRAY:
        return array != null;
      case MyDslPackage.VALUE__NESTED_OBJECT:
        return nestedObject != null;
      case MyDslPackage.VALUE__VARIABLE:
        return variable != null;
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
    result.append(" (string: ");
    result.append(string);
    result.append(", integer: ");
    result.append(integer);
    result.append(", trueV: ");
    result.append(trueV);
    result.append(", falseV: ");
    result.append(falseV);
    result.append(')');
    return result.toString();
  }

} //ValueImpl