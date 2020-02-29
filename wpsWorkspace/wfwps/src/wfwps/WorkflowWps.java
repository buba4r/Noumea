/**
 */
package wfwps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Wps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.WorkflowWps#getLocalWpsLibrary <em>Local Wps Library</em>}</li>
 *   <li>{@link wfwps.WorkflowWps#getRemoteWpsLibrary <em>Remote Wps Library</em>}</li>
 *   <li>{@link wfwps.WorkflowWps#getWfLibrary <em>Wf Library</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getWorkflowWps()
 * @model
 * @generated
 */
public interface WorkflowWps extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Local Wps Library</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.LocalWPS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Wps Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Wps Library</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkflowWps_LocalWpsLibrary()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalWPS> getLocalWpsLibrary();

	/**
	 * Returns the value of the '<em><b>Remote Wps Library</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.RemoteWPS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Wps Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Wps Library</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkflowWps_RemoteWpsLibrary()
	 * @model containment="true"
	 * @generated
	 */
	EList<RemoteWPS> getRemoteWpsLibrary();

	/**
	 * Returns the value of the '<em><b>Wf Library</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.WorkFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wf Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wf Library</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWorkflowWps_WfLibrary()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkFlow> getWfLibrary();

} // WorkflowWps
