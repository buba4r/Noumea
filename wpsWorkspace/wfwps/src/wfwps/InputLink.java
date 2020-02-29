/**
 */
package wfwps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.InputLink#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getInputLink()
 * @model abstract="true"
 * @generated
 */
public interface InputLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link wfwps.Link}.
	 * It is bidirectional and its opposite is '{@link wfwps.Link#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see wfwps.WfwpsPackage#getInputLink_Link()
	 * @see wfwps.Link#getInput
	 * @model opposite="input"
	 * @generated
	 */
	EList<Link> getLink();

} // InputLink
