/**
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myDsl.ElementPage#getRow <em>Row</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.ElementPage#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.ElementPage#getConditional <em>Conditional</em>}</li>
 *   <li>{@link org.xtext.example.myDsl.ElementPage#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myDsl.MyDslPackage#getElementPage()
 * @model
 * @generated
 */
public interface ElementPage extends EObject
{
  /**
   * Returns the value of the '<em><b>Row</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Row</em>' containment reference.
   * @see #setRow(Row)
   * @see org.xtext.example.myDsl.MyDslPackage#getElementPage_Row()
   * @model containment="true"
   * @generated
   */
  Row getRow();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.ElementPage#getRow <em>Row</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row</em>' containment reference.
   * @see #getRow()
   * @generated
   */
  void setRow(Row value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(Loop)
   * @see org.xtext.example.myDsl.MyDslPackage#getElementPage_Loop()
   * @model containment="true"
   * @generated
   */
  Loop getLoop();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.ElementPage#getLoop <em>Loop</em>}' containment reference.
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
   * @see org.xtext.example.myDsl.MyDslPackage#getElementPage_Conditional()
   * @model containment="true"
   * @generated
   */
  Conditional getConditional();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.ElementPage#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(Conditional value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableD)
   * @see org.xtext.example.myDsl.MyDslPackage#getElementPage_Variable()
   * @model containment="true"
   * @generated
   */
  VariableD getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.myDsl.ElementPage#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableD value);

} // ElementPage
