/**
 */
package wfwps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.WorkFlow#getInputs <em>Inputs</em>}</li>
 *   <li>{@link wfwps.WorkFlow#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link wfwps.WorkFlow#getWps <em>Wps</em>}</li>
 *   <li>{@link wfwps.WorkFlow#getLinks <em>Links</em>}</li>
 *   <li>{@link wfwps.WorkFlow#getRemoteData <em>Remote Data</em>}</li>
 *   <li>{@link wfwps.WorkFlow#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getWorkFlow()
 * @model
 * @generated
 */
public interface WorkFlow extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.InputWorkflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkFlow_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputWorkflow> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.OutputWorkflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkFlow_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputWorkflow> getOutputs();

	/**
	 * Returns the value of the '<em><b>Wps</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.WPSReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wps</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkFlow_Wps()
	 * @model containment="true"
	 * @generated
	 */
	EList<WPSReference> getWps();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkFlow_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Remote Data</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.RemoteData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Data</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkFlow_RemoteData()
	 * @model containment="true"
	 * @generated
	 */
	EList<RemoteData> getRemoteData();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkFlow_Constants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getConstants();

} // WorkFlow
