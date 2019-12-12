/**
 */
package wfwps.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import wfwps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see wfwps.WfwpsPackage
 * @generated
 */
public class WfwpsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WfwpsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfwpsSwitch() {
		if (modelPackage == null) {
			modelPackage = WfwpsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WfwpsPackage.DESCRIBED_ELEMENT: {
				DescribedElement describedElement = (DescribedElement)theEObject;
				T result = caseDescribedElement(describedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.WORKFLOW_WPS: {
				WorkflowWps workflowWps = (WorkflowWps)theEObject;
				T result = caseWorkflowWps(workflowWps);
				if (result == null) result = caseDescribedElement(workflowWps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.IMPLEMENTABLE: {
				Implementable implementable = (Implementable)theEObject;
				T result = caseImplementable(implementable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.WPS: {
				WPS wps = (WPS)theEObject;
				T result = caseWPS(wps);
				if (result == null) result = caseDescribedElement(wps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.LOCAL_WPS: {
				LocalWPS localWPS = (LocalWPS)theEObject;
				T result = caseLocalWPS(localWPS);
				if (result == null) result = caseWPS(localWPS);
				if (result == null) result = caseImplementable(localWPS);
				if (result == null) result = caseDescribedElement(localWPS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.REMOTE_WPS: {
				RemoteWPS remoteWPS = (RemoteWPS)theEObject;
				T result = caseRemoteWPS(remoteWPS);
				if (result == null) result = caseWPS(remoteWPS);
				if (result == null) result = caseDescribedElement(remoteWPS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseDescribedElement(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseData(input);
				if (result == null) result = caseDescribedElement(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseData(output);
				if (result == null) result = caseDescribedElement(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.INPUT_WORKFLOW: {
				InputWorkflow inputWorkflow = (InputWorkflow)theEObject;
				T result = caseInputWorkflow(inputWorkflow);
				if (result == null) result = caseInput(inputWorkflow);
				if (result == null) result = caseInputLink(inputWorkflow);
				if (result == null) result = caseData(inputWorkflow);
				if (result == null) result = caseDescribedElement(inputWorkflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.OUTPUT_WORKFLOW: {
				OutputWorkflow outputWorkflow = (OutputWorkflow)theEObject;
				T result = caseOutputWorkflow(outputWorkflow);
				if (result == null) result = caseOutput(outputWorkflow);
				if (result == null) result = caseOutputLink(outputWorkflow);
				if (result == null) result = caseData(outputWorkflow);
				if (result == null) result = caseDescribedElement(outputWorkflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.WPS_REFERENCE: {
				WPSReference wpsReference = (WPSReference)theEObject;
				T result = caseWPSReference(wpsReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.LOCAL_WPS_REFERENCE: {
				LocalWPSReference localWPSReference = (LocalWPSReference)theEObject;
				T result = caseLocalWPSReference(localWPSReference);
				if (result == null) result = caseWPSReference(localWPSReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.REMOTE_WPS_REFERENCE: {
				RemoteWPSReference remoteWPSReference = (RemoteWPSReference)theEObject;
				T result = caseRemoteWPSReference(remoteWPSReference);
				if (result == null) result = caseWPSReference(remoteWPSReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.WORKFLOW_REFERENCE: {
				WorkflowReference workflowReference = (WorkflowReference)theEObject;
				T result = caseWorkflowReference(workflowReference);
				if (result == null) result = caseWPSReference(workflowReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.INPUT_REFERENCE: {
				InputReference inputReference = (InputReference)theEObject;
				T result = caseInputReference(inputReference);
				if (result == null) result = caseOutputLink(inputReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.OUTPUT_REFERENCE: {
				OutputReference outputReference = (OutputReference)theEObject;
				T result = caseOutputReference(outputReference);
				if (result == null) result = caseInputLink(outputReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.WORK_FLOW: {
				WorkFlow workFlow = (WorkFlow)theEObject;
				T result = caseWorkFlow(workFlow);
				if (result == null) result = caseDescribedElement(workFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.INPUT_LINK: {
				InputLink inputLink = (InputLink)theEObject;
				T result = caseInputLink(inputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.OUTPUT_LINK: {
				OutputLink outputLink = (OutputLink)theEObject;
				T result = caseOutputLink(outputLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.REMOTE_DATA: {
				RemoteData remoteData = (RemoteData)theEObject;
				T result = caseRemoteData(remoteData);
				if (result == null) result = caseInputLink(remoteData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.WMS: {
				WMS wms = (WMS)theEObject;
				T result = caseWMS(wms);
				if (result == null) result = caseRemoteData(wms);
				if (result == null) result = caseInputLink(wms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.WFS: {
				WFS wfs = (WFS)theEObject;
				T result = caseWFS(wfs);
				if (result == null) result = caseRemoteData(wfs);
				if (result == null) result = caseInputLink(wfs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseInputLink(constant);
				if (result == null) result = caseDescribedElement(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.INTEGER_CONSTANT: {
				IntegerConstant integerConstant = (IntegerConstant)theEObject;
				T result = caseIntegerConstant(integerConstant);
				if (result == null) result = caseConstant(integerConstant);
				if (result == null) result = caseInputLink(integerConstant);
				if (result == null) result = caseDescribedElement(integerConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.DOUBLE_CONSTANT: {
				DoubleConstant doubleConstant = (DoubleConstant)theEObject;
				T result = caseDoubleConstant(doubleConstant);
				if (result == null) result = caseConstant(doubleConstant);
				if (result == null) result = caseInputLink(doubleConstant);
				if (result == null) result = caseDescribedElement(doubleConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.STRING_CONSTANT: {
				StringConstant stringConstant = (StringConstant)theEObject;
				T result = caseStringConstant(stringConstant);
				if (result == null) result = caseConstant(stringConstant);
				if (result == null) result = caseInputLink(stringConstant);
				if (result == null) result = caseDescribedElement(stringConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.BOOLEAN_CONSTANT: {
				BooleanConstant booleanConstant = (BooleanConstant)theEObject;
				T result = caseBooleanConstant(booleanConstant);
				if (result == null) result = caseConstant(booleanConstant);
				if (result == null) result = caseInputLink(booleanConstant);
				if (result == null) result = caseDescribedElement(booleanConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.GEOMETRY_CONSTANT: {
				GeometryConstant geometryConstant = (GeometryConstant)theEObject;
				T result = caseGeometryConstant(geometryConstant);
				if (result == null) result = caseConstant(geometryConstant);
				if (result == null) result = caseInputLink(geometryConstant);
				if (result == null) result = caseDescribedElement(geometryConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WfwpsPackage.RASTER_CONSTANT: {
				RasterConstant rasterConstant = (RasterConstant)theEObject;
				T result = caseRasterConstant(rasterConstant);
				if (result == null) result = caseConstant(rasterConstant);
				if (result == null) result = caseInputLink(rasterConstant);
				if (result == null) result = caseDescribedElement(rasterConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedElement(DescribedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Wps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Wps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowWps(WorkflowWps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementable(Implementable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPS(WPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local WPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local WPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalWPS(LocalWPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote WPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote WPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteWPS(RemoteWPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputWorkflow(InputWorkflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputWorkflow(OutputWorkflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPS Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPS Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPSReference(WPSReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local WPS Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local WPS Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalWPSReference(LocalWPSReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote WPS Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote WPS Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteWPSReference(RemoteWPSReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowReference(WorkflowReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputReference(InputReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputReference(OutputReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkFlow(WorkFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputLink(InputLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputLink(OutputLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteData(RemoteData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMS(WMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WFS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WFS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWFS(WFS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstant(IntegerConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleConstant(DoubleConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConstant(BooleanConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryConstant(GeometryConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raster Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raster Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRasterConstant(RasterConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WfwpsSwitch
