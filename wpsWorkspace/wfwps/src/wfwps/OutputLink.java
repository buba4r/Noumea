/**
 */
package wfwps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.OutputLink#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getOutputLink()
 * @model abstract="true"
 * @generated
 */
public interface OutputLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wfwps.Link#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see wfwps.WfwpsPackage#getOutputLink_Link()
	 * @see wfwps.Link#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link wfwps.OutputLink#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // OutputLink
