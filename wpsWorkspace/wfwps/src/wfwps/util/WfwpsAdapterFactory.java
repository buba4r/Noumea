/**
 */
package wfwps.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wfwps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wfwps.WfwpsPackage
 * @generated
 */
public class WfwpsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WfwpsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfwpsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WfwpsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WfwpsSwitch<Adapter> modelSwitch =
		new WfwpsSwitch<Adapter>() {
			@Override
			public Adapter caseDescribedElement(DescribedElement object) {
				return createDescribedElementAdapter();
			}
			@Override
			public Adapter caseWorkflowWps(WorkflowWps object) {
				return createWorkflowWpsAdapter();
			}
			@Override
			public Adapter caseImplementable(Implementable object) {
				return createImplementableAdapter();
			}
			@Override
			public Adapter caseWPS(WPS object) {
				return createWPSAdapter();
			}
			@Override
			public Adapter caseLocalWPS(LocalWPS object) {
				return createLocalWPSAdapter();
			}
			@Override
			public Adapter caseRemoteWPS(RemoteWPS object) {
				return createRemoteWPSAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseInputWorkflow(InputWorkflow object) {
				return createInputWorkflowAdapter();
			}
			@Override
			public Adapter caseOutputWorkflow(OutputWorkflow object) {
				return createOutputWorkflowAdapter();
			}
			@Override
			public Adapter caseWPSReference(WPSReference object) {
				return createWPSReferenceAdapter();
			}
			@Override
			public Adapter caseLocalWPSReference(LocalWPSReference object) {
				return createLocalWPSReferenceAdapter();
			}
			@Override
			public Adapter caseRemoteWPSReference(RemoteWPSReference object) {
				return createRemoteWPSReferenceAdapter();
			}
			@Override
			public Adapter caseWorkflowReference(WorkflowReference object) {
				return createWorkflowReferenceAdapter();
			}
			@Override
			public Adapter caseInputReference(InputReference object) {
				return createInputReferenceAdapter();
			}
			@Override
			public Adapter caseOutputReference(OutputReference object) {
				return createOutputReferenceAdapter();
			}
			@Override
			public Adapter caseWorkFlow(WorkFlow object) {
				return createWorkFlowAdapter();
			}
			@Override
			public Adapter caseInputLink(InputLink object) {
				return createInputLinkAdapter();
			}
			@Override
			public Adapter caseOutputLink(OutputLink object) {
				return createOutputLinkAdapter();
			}
			@Override
			public Adapter caseRemoteData(RemoteData object) {
				return createRemoteDataAdapter();
			}
			@Override
			public Adapter caseWMS(WMS object) {
				return createWMSAdapter();
			}
			@Override
			public Adapter caseWFS(WFS object) {
				return createWFSAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseIntegerConstant(IntegerConstant object) {
				return createIntegerConstantAdapter();
			}
			@Override
			public Adapter caseDoubleConstant(DoubleConstant object) {
				return createDoubleConstantAdapter();
			}
			@Override
			public Adapter caseStringConstant(StringConstant object) {
				return createStringConstantAdapter();
			}
			@Override
			public Adapter caseBooleanConstant(BooleanConstant object) {
				return createBooleanConstantAdapter();
			}
			@Override
			public Adapter caseGeometryConstant(GeometryConstant object) {
				return createGeometryConstantAdapter();
			}
			@Override
			public Adapter caseRasterConstant(RasterConstant object) {
				return createRasterConstantAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link wfwps.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.DescribedElement
	 * @generated
	 */
	public Adapter createDescribedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.WorkflowWps <em>Workflow Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.WorkflowWps
	 * @generated
	 */
	public Adapter createWorkflowWpsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.Implementable <em>Implementable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.Implementable
	 * @generated
	 */
	public Adapter createImplementableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.WPS <em>WPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.WPS
	 * @generated
	 */
	public Adapter createWPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.LocalWPS <em>Local WPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.LocalWPS
	 * @generated
	 */
	public Adapter createLocalWPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.RemoteWPS <em>Remote WPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.RemoteWPS
	 * @generated
	 */
	public Adapter createRemoteWPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.InputWorkflow <em>Input Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.InputWorkflow
	 * @generated
	 */
	public Adapter createInputWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.OutputWorkflow <em>Output Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.OutputWorkflow
	 * @generated
	 */
	public Adapter createOutputWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.WPSReference <em>WPS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.WPSReference
	 * @generated
	 */
	public Adapter createWPSReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.LocalWPSReference <em>Local WPS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.LocalWPSReference
	 * @generated
	 */
	public Adapter createLocalWPSReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.RemoteWPSReference <em>Remote WPS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.RemoteWPSReference
	 * @generated
	 */
	public Adapter createRemoteWPSReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.WorkflowReference <em>Workflow Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.WorkflowReference
	 * @generated
	 */
	public Adapter createWorkflowReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.InputReference <em>Input Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.InputReference
	 * @generated
	 */
	public Adapter createInputReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.OutputReference <em>Output Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.OutputReference
	 * @generated
	 */
	public Adapter createOutputReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.WorkFlow <em>Work Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.WorkFlow
	 * @generated
	 */
	public Adapter createWorkFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.InputLink <em>Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.InputLink
	 * @generated
	 */
	public Adapter createInputLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.OutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.OutputLink
	 * @generated
	 */
	public Adapter createOutputLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.RemoteData <em>Remote Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.RemoteData
	 * @generated
	 */
	public Adapter createRemoteDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.WMS <em>WMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.WMS
	 * @generated
	 */
	public Adapter createWMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.WFS <em>WFS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.WFS
	 * @generated
	 */
	public Adapter createWFSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.IntegerConstant
	 * @generated
	 */
	public Adapter createIntegerConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.DoubleConstant <em>Double Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.DoubleConstant
	 * @generated
	 */
	public Adapter createDoubleConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.BooleanConstant
	 * @generated
	 */
	public Adapter createBooleanConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.GeometryConstant <em>Geometry Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.GeometryConstant
	 * @generated
	 */
	public Adapter createGeometryConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wfwps.RasterConstant <em>Raster Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wfwps.RasterConstant
	 * @generated
	 */
	public Adapter createRasterConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WfwpsAdapterFactory
