/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.ExtensionList#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getExtensionList()
 * @model
 * @generated
 */
public interface ExtensionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myDsl.SingleExtension}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensions</em>' containment reference list.
   * @see org.xtext.example.myDsl.MyDslPackage#getExtensionList_Extensions()
   * @model containment="true"
   * @generated
   */
  EList<SingleExtension> getExtensions();

} // ExtensionList
