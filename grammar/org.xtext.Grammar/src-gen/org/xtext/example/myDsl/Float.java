/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.Float#getFirstInt <em>First Int</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.Float#getSecondInt <em>Second Int</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getFloat()
 * @model
 * @generated
 */
public interface Float extends EObject
{
  /**
   * Returns the value of the '<em><b>First Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Int</em>' attribute.
   * @see #setFirstInt(int)
   * @see org.xtext.example.myDsl.MyDslPackage#getFloat_FirstInt()
   * @model
   * @generated
   */
  int getFirstInt();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Float#getFirstInt <em>First Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Int</em>' attribute.
   * @see #getFirstInt()
   * @generated
   */
  void setFirstInt(int value);

  /**
   * Returns the value of the '<em><b>Second Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Int</em>' attribute.
   * @see #setSecondInt(int)
   * @see org.xtext.example.myDsl.MyDslPackage#getFloat_SecondInt()
   * @model
   * @generated
   */
  int getSecondInt();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Float#getSecondInt <em>Second Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Int</em>' attribute.
   * @see #getSecondInt()
   * @generated
   */
  void setSecondInt(int value);

} // Float