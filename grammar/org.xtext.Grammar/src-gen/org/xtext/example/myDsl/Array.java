/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.Array#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myDsl.Value}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.xtext.example.myDsl.MyDslPackage#getArray_Values()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValues();

} // Array
