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

import wfwps.Constant;
import wfwps.InputWorkflow;
import wfwps.Link;
import wfwps.OutputWorkflow;
import wfwps.RemoteData;
import wfwps.WPSReference;
import wfwps.WfwpsPackage;
import wfwps.WorkFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wfwps.impl.WorkFlowImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link wfwps.impl.WorkFlowImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link wfwps.impl.WorkFlowImpl#getWps <em>Wps</em>}</li>
 *   <li>{@link wfwps.impl.WorkFlowImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link wfwps.impl.WorkFlowImpl#getRemoteData <em>Remote Data</em>}</li>
 *   <li>{@link wfwps.impl.WorkFlowImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkFlowImpl extends DescribedElementImpl implements WorkFlow {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputWorkflow> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputWorkflow> outputs;

	/**
	 * The cached value of the '{@link #getWps() <em>Wps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWps()
	 * @generated
	 * @ordered
	 */
	protected EList<WPSReference> wps;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getRemoteData() <em>Remote Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteData()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteData> remoteData;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfwpsPackage.Literals.WORK_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputWorkflow> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputWorkflow>(InputWorkflow.class, this, WfwpsPackage.WORK_FLOW__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputWorkflow> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputWorkflow>(OutputWorkflow.class, this, WfwpsPackage.WORK_FLOW__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WPSReference> getWps() {
		if (wps == null) {
			wps = new EObjectContainmentEList<WPSReference>(WPSReference.class, this, WfwpsPackage.WORK_FLOW__WPS);
		}
		return wps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, WfwpsPackage.WORK_FLOW__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoteData> getRemoteData() {
		if (remoteData == null) {
			remoteData = new EObjectContainmentEList<RemoteData>(RemoteData.class, this, WfwpsPackage.WORK_FLOW__REMOTE_DATA);
		}
		return remoteData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<Constant>(Constant.class, this, WfwpsPackage.WORK_FLOW__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WfwpsPackage.WORK_FLOW__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case WfwpsPackage.WORK_FLOW__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case WfwpsPackage.WORK_FLOW__WPS:
				return ((InternalEList<?>)getWps()).basicRemove(otherEnd, msgs);
			case WfwpsPackage.WORK_FLOW__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case WfwpsPackage.WORK_FLOW__REMOTE_DATA:
				return ((InternalEList<?>)getRemoteData()).basicRemove(otherEnd, msgs);
			case WfwpsPackage.WORK_FLOW__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
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
			case WfwpsPackage.WORK_FLOW__INPUTS:
				return getInputs();
			case WfwpsPackage.WORK_FLOW__OUTPUTS:
				return getOutputs();
			case WfwpsPackage.WORK_FLOW__WPS:
				return getWps();
			case WfwpsPackage.WORK_FLOW__LINKS:
				return getLinks();
			case WfwpsPackage.WORK_FLOW__REMOTE_DATA:
				return getRemoteData();
			case WfwpsPackage.WORK_FLOW__CONSTANTS:
				return getConstants();
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
			case WfwpsPackage.WORK_FLOW__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputWorkflow>)newValue);
				return;
			case WfwpsPackage.WORK_FLOW__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputWorkflow>)newValue);
				return;
			case WfwpsPackage.WORK_FLOW__WPS:
				getWps().clear();
				getWps().addAll((Collection<? extends WPSReference>)newValue);
				return;
			case WfwpsPackage.WORK_FLOW__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case WfwpsPackage.WORK_FLOW__REMOTE_DATA:
				getRemoteData().clear();
				getRemoteData().addAll((Collection<? extends RemoteData>)newValue);
				return;
			case WfwpsPackage.WORK_FLOW__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
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
			case WfwpsPackage.WORK_FLOW__INPUTS:
				getInputs().clear();
				return;
			case WfwpsPackage.WORK_FLOW__OUTPUTS:
				getOutputs().clear();
				return;
			case WfwpsPackage.WORK_FLOW__WPS:
				getWps().clear();
				return;
			case WfwpsPackage.WORK_FLOW__LINKS:
				getLinks().clear();
				return;
			case WfwpsPackage.WORK_FLOW__REMOTE_DATA:
				getRemoteData().clear();
				return;
			case WfwpsPackage.WORK_FLOW__CONSTANTS:
				getConstants().clear();
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
			case WfwpsPackage.WORK_FLOW__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case WfwpsPackage.WORK_FLOW__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case WfwpsPackage.WORK_FLOW__WPS:
				return wps != null && !wps.isEmpty();
			case WfwpsPackage.WORK_FLOW__LINKS:
				return links != null && !links.isEmpty();
			case WfwpsPackage.WORK_FLOW__REMOTE_DATA:
				return remoteData != null && !remoteData.isEmpty();
			case WfwpsPackage.WORK_FLOW__CONSTANTS:
				return constants != null && !constants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkFlowImpl
