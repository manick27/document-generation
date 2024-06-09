/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.Condition1#getFirstPart <em>First Part</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.Condition1#getCompare <em>Compare</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.Condition1#getSecondPart <em>Second Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getCondition1()
 * @model
 * @generated
 */
public interface Condition1 extends EObject
{
  /**
   * Returns the value of the '<em><b>First Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Part</em>' containment reference.
   * @see #setFirstPart(Part)
   * @see org.xtext.example.myDsl.MyDslPackage#getCondition1_FirstPart()
   * @model containment="true"
   * @generated
   */
  Part getFirstPart();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Condition1#getFirstPart <em>First Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Part</em>' containment reference.
   * @see #getFirstPart()
   * @generated
   */
  void setFirstPart(Part value);

  /**
   * Returns the value of the '<em><b>Compare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compare</em>' attribute.
   * @see #setCompare(String)
   * @see org.xtext.example.myDsl.MyDslPackage#getCondition1_Compare()
   * @model
   * @generated
   */
  String getCompare();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Condition1#getCompare <em>Compare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compare</em>' attribute.
   * @see #getCompare()
   * @generated
   */
  void setCompare(String value);

  /**
   * Returns the value of the '<em><b>Second Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Part</em>' containment reference.
   * @see #setSecondPart(Part)
   * @see org.xtext.example.myDsl.MyDslPackage#getCondition1_SecondPart()
   * @model containment="true"
   * @generated
   */
  Part getSecondPart();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.Condition1#getSecondPart <em>Second Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Part</em>' containment reference.
   * @see #getSecondPart()
   * @generated
   */
  void setSecondPart(Part value);

} // Condition1