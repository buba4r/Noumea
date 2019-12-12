/**
 */
package wfwps.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wfwps.LocalWPS;
import wfwps.RemoteWPS;
import wfwps.WfwpsPackage;
import wfwps.WorkFlow;
import wfwps.WorkflowWps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Wps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wfwps.impl.WorkflowWpsImpl#getLocalWpsLibrary <em>Local Wps Library</em>}</li>
 *   <li>{@link wfwps.impl.WorkflowWpsImpl#getRemoteWpsLibrary <em>Remote Wps Library</em>}</li>
 *   <li>{@link wfwps.impl.WorkflowWpsImpl#getWfLibrary <em>Wf Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowWpsImpl extends DescribedElementImpl implements WorkflowWps {
	/**
	 * The cached value of the '{@link #getLocalWpsLibrary() <em>Local Wps Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalWpsLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalWPS> localWpsLibrary;

	/**
	 * The cached value of the '{@link #getRemoteWpsLibrary() <em>Remote Wps Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteWpsLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteWPS> remoteWpsLibrary;

	/**
	 * The cached value of the '{@link #getWfLibrary() <em>Wf Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWfLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkFlow> wfLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowWpsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfwpsPackage.Literals.WORKFLOW_WPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalWPS> getLocalWpsLibrary() {
		if (localWpsLibrary == null) {
			localWpsLibrary = new EObjectContainmentEList<LocalWPS>(LocalWPS.class, this, WfwpsPackage.WORKFLOW_WPS__LOCAL_WPS_LIBRARY);
		}
		return localWpsLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoteWPS> getRemoteWpsLibrary() {
		if (remoteWpsLibrary == null) {
			remoteWpsLibrary = new EObjectContainmentEList<RemoteWPS>(RemoteWPS.class, this, WfwpsPackage.WORKFLOW_WPS__REMOTE_WPS_LIBRARY);
		}
		return remoteWpsLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkFlow> getWfLibrary() {
		if (wfLibrary == null) {
			wfLibrary = new EObjectContainmentEList<WorkFlow>(WorkFlow.class, this, WfwpsPackage.WORKFLOW_WPS__WF_LIBRARY);
		}
		return wfLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WfwpsPackage.WORKFLOW_WPS__LOCAL_WPS_LIBRARY:
				return ((InternalEList<?>)getLocalWpsLibrary()).basicRemove(otherEnd, msgs);
			case WfwpsPackage.WORKFLOW_WPS__REMOTE_WPS_LIBRARY:
				return ((InternalEList<?>)getRemoteWpsLibrary()).basicRemove(otherEnd, msgs);
			case WfwpsPackage.WORKFLOW_WPS__WF_LIBRARY:
				return ((InternalEList<?>)getWfLibrary()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WfwpsPackage.WORKFLOW_WPS__LOCAL_WPS_LIBRARY:
				return getLocalWpsLibrary();
			case WfwpsPackage.WORKFLOW_WPS__REMOTE_WPS_LIBRARY:
				return getRemoteWpsLibrary();
			case WfwpsPackage.WORKFLOW_WPS__WF_LIBRARY:
				return getWfLibrary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WfwpsPackage.WORKFLOW_WPS__LOCAL_WPS_LIBRARY:
				getLocalWpsLibrary().clear();
				getLocalWpsLibrary().addAll((Collection<? extends LocalWPS>)newValue);
				return;
			case WfwpsPackage.WORKFLOW_WPS__REMOTE_WPS_LIBRARY:
				getRemoteWpsLibrary().clear();
				getRemoteWpsLibrary().addAll((Collection<? extends RemoteWPS>)newValue);
				return;
			case WfwpsPackage.WORKFLOW_WPS__WF_LIBRARY:
				getWfLibrary().clear();
				getWfLibrary().addAll((Collection<? extends WorkFlow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WfwpsPackage.WORKFLOW_WPS__LOCAL_WPS_LIBRARY:
				getLocalWpsLibrary().clear();
				return;
			case WfwpsPackage.WORKFLOW_WPS__REMOTE_WPS_LIBRARY:
				getRemoteWpsLibrary().clear();
				return;
			case WfwpsPackage.WORKFLOW_WPS__WF_LIBRARY:
				getWfLibrary().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WfwpsPackage.WORKFLOW_WPS__LOCAL_WPS_LIBRARY:
				return localWpsLibrary != null && !localWpsLibrary.isEmpty();
			case WfwpsPackage.WORKFLOW_WPS__REMOTE_WPS_LIBRARY:
				return remoteWpsLibrary != null && !remoteWpsLibrary.isEmpty();
			case WfwpsPackage.WORKFLOW_WPS__WF_LIBRARY:
				return wfLibrary != null && !wfLibrary.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowWpsImpl
