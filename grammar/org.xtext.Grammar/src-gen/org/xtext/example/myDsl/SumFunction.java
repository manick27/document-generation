/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.SumFunction#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.SumFunction#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getSumFunction()
 * @model
 * @generated
 */
public interface SumFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Argument1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myDsl.Argument1}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument1</em>' containment reference list.
   * @see org.xtext.example.myDsl.MyDslPackage#getSumFunction_Argument1()
   * @model containment="true"
   * @generated
   */
  EList<Argument1> getArgument1();

  /**
   * Returns the value of the '<em><b>Argument2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myDsl.Argument2}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument2</em>' containment reference list.
   * @see org.xtext.example.myDsl.MyDslPackage#getSumFunction_Argument2()
   * @model containment="true"
   * @generated
   */
  EList<Argument2> getArgument2();

} // SumFunction
