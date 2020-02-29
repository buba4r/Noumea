/**
 */
package wfwps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.InputReference#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getInputReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WPSintputConnected'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot WPSintputConnected='if (not (self.input.optional)) then (link<>null) else true endif'"
 * @generated
 */
public interface InputReference extends OutputLink {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Input)
	 * @see wfwps.WfwpsPackage#getInputReference_Input()
	 * @model required="true"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link wfwps.InputReference#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

} // InputReference
