/**
 */
package wfwps.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wfwps.WfwpsPackage;
import wfwps.WorkFlow;
import wfwps.WorkflowReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wfwps.impl.WorkflowReferenceImpl#getWps <em>Wps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowReferenceImpl extends WPSReferenceImpl implements WorkflowReference {
	/**
	 * The cached value of the '{@link #getWps() <em>Wps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWps()
	 * @generated
	 * @ordered
	 */
	protected WorkFlow wps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfwpsPackage.Literals.WORKFLOW_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlow getWps() {
		if (wps != null && wps.eIsProxy()) {
			InternalEObject oldWps = (InternalEObject)wps;
			wps = (WorkFlow)eResolveProxy(oldWps);
			if (wps != oldWps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfwpsPackage.WORKFLOW_REFERENCE__WPS, oldWps, wps));
			}
		}
		return wps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlow basicGetWps() {
		return wps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWps(WorkFlow newWps) {
		WorkFlow oldWps = wps;
		wps = newWps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WORKFLOW_REFERENCE__WPS, oldWps, wps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WfwpsPackage.WORKFLOW_REFERENCE__WPS:
				if (resolve) return getWps();
				return basicGetWps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WfwpsPackage.WORKFLOW_REFERENCE__WPS:
				setWps((WorkFlow)newValue);
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
			case WfwpsPackage.WORKFLOW_REFERENCE__WPS:
				setWps((WorkFlow)null);
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
			case WfwpsPackage.WORKFLOW_REFERENCE__WPS:
				return wps != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkflowReferenceImpl
