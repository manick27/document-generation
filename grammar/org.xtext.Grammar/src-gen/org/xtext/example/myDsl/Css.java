/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Css</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.Css#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getCss()
 * @model
 * @generated
 */
public interface Css extends EObject
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myDsl.Rule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.xtext.example.myDsl.MyDslPackage#getCss_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // Css
