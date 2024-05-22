/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.Row#getElementRow <em>Element Row</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject
{
  /**
   * Returns the value of the '<em><b>Element Row</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myDsl.ElementRow}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Row</em>' containment reference list.
   * @see org.xtext.example.myDsl.MyDslPackage#getRow_ElementRow()
   * @model containment="true"
   * @generated
   */
  EList<ElementRow> getElementRow();

} // Row
