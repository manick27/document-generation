/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Build</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.ElementBuild#getVariableD <em>Variable D</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.ElementBuild#getPage <em>Page</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.ElementBuild#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.ElementBuild#getConditional <em>Conditional</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getElementBuild()
 * @model
 * @generated
 */
public interface ElementBuild extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable D</em>' containment reference.
   * @see #setVariableD(VariableD)
   * @see org.xtext.example.myDsl.MyDslPackage#getElementBuild_VariableD()
   * @model containment="true"
   * @generated
   */
  VariableD getVariableD();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.ElementBuild#getVariableD <em>Variable D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable D</em>' containment reference.
   * @see #getVariableD()
   * @generated
   */
  void setVariableD(VariableD value);

  /**
   * Returns the value of the '<em><b>Page</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page</em>' containment reference.
   * @see #setPage(Page)
   * @see org.xtext.example.myDsl.MyDslPackage#getElementBuild_Page()
   * @model containment="true"
   * @generated
   */
  Page getPage();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.ElementBuild#getPage <em>Page</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page</em>' containment reference.
   * @see #getPage()
   * @generated
   */
  void setPage(Page value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(Loop)
   * @see org.xtext.example.myDsl.MyDslPackage#getElementBuild_Loop()
   * @model containment="true"
   * @generated
   */
  Loop getLoop();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.ElementBuild#getLoop <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' containment reference.
   * @see #getLoop()
   * @generated
   */
  void setLoop(Loop value);

  /**
   * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' containment reference.
   * @see #setConditional(Conditional)
   * @see org.xtext.example.myDsl.MyDslPackage#getElementBuild_Conditional()
   * @model containment="true"
   * @generated
   */
  Conditional getConditional();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.ElementBuild#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(Conditional value);

} // ElementBuild