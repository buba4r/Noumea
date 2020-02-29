/**
 */
package wfwps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPS Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.WPSReference#getInputs <em>Inputs</em>}</li>
 *   <li>{@link wfwps.WPSReference#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getWPSReference()
 * @model abstract="true"
 * @generated
 */
public interface WPSReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.InputReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWPSReference_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputReference> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.OutputReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWPSReference_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputReference> getOutputs();

} // WPSReference
