/**
 */
package wfwps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.Link#getInput <em>Input</em>}</li>
 *   <li>{@link wfwps.Link#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sameType='(input.oclIsTypeOf(OutputReference) and output.oclIsTypeOf(InputReference))\n\t\t\timplies input.oclAsType(OutputReference).output.type = output.oclAsType(InputReference).input.type'"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wfwps.InputLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(InputLink)
	 * @see wfwps.WfwpsPackage#getLink_Input()
	 * @see wfwps.InputLink#getLink
	 * @model opposite="link" required="true"
	 * @generated
	 */
	InputLink getInput();

	/**
	 * Sets the value of the '{@link wfwps.Link#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputLink value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wfwps.OutputLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(OutputLink)
	 * @see wfwps.WfwpsPackage#getLink_Output()
	 * @see wfwps.OutputLink#getLink
	 * @model opposite="link" required="true"
	 * @generated
	 */
	OutputLink getOutput();

	/**
	 * Sets the value of the '{@link wfwps.Link#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(OutputLink value);

} // Link
