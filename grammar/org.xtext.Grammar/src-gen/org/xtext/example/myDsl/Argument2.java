/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.Argument2#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.Argument2#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.Argument2#getIntegerEnd1 <em>Integer End1</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.Argument2#getIntegerEnd2 <em>Integer End2</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.Argument2#getIntegerEnd3 <em>Integer End3</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getArgument2()
 * @model
 * @generated
 */
public interface Argument2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myDsl.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see org.xtext.example.myDsl.MyDslPackage#getArgument2_Variable()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariable();

  /**
   * Returns the value of the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer</em>' attribute.
   * @see #setInteger(int)
   * @see org.xtext.example.myDsl.MyDslPackage#getArgument2_Integer()
   * @model
   * @generated
   */
  int getInteger();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Argument2#getInteger <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer</em>' attribute.
   * @see #getInteger()
   * @generated
   */
  void setInteger(int value);

  /**
   * Returns the value of the '<em><b>Integer End1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer End1</em>' attribute.
   * @see #setIntegerEnd1(int)
   * @see org.xtext.example.myDsl.MyDslPackage#getArgument2_IntegerEnd1()
   * @model
   * @generated
   */
  int getIntegerEnd1();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Argument2#getIntegerEnd1 <em>Integer End1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer End1</em>' attribute.
   * @see #getIntegerEnd1()
   * @generated
   */
  void setIntegerEnd1(int value);

  /**
   * Returns the value of the '<em><b>Integer End2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer End2</em>' attribute.
   * @see #setIntegerEnd2(int)
   * @see org.xtext.example.myDsl.MyDslPackage#getArgument2_IntegerEnd2()
   * @model
   * @generated
   */
  int getIntegerEnd2();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Argument2#getIntegerEnd2 <em>Integer End2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer End2</em>' attribute.
   * @see #getIntegerEnd2()
   * @generated
   */
  void setIntegerEnd2(int value);

  /**
   * Returns the value of the '<em><b>Integer End3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer End3</em>' attribute.
   * @see #setIntegerEnd3(int)
   * @see org.xtext.example.myDsl.MyDslPackage#getArgument2_IntegerEnd3()
   * @model
   * @generated
   */
  int getIntegerEnd3();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Argument2#getIntegerEnd3 <em>Integer End3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer End3</em>' attribute.
   * @see #getIntegerEnd3()
   * @generated
   */
  void setIntegerEnd3(int value);

} // Argument2
