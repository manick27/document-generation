/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.Data#getKeyValue <em>Key Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject
{
  /**
   * Returns the value of the '<em><b>Key Value</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myDsl.KeyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Value</em>' containment reference list.
   * @see org.xtext.example.myDsl.MyDslPackage#getData_KeyValue()
   * @model containment="true"
   * @generated
   */
  EList<KeyValue> getKeyValue();

} // Data
