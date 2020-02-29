/**
 */
package wfwps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wfwps.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WfwpsFactoryImpl extends EFactoryImpl implements WfwpsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WfwpsFactory init() {
		try {
			WfwpsFactory theWfwpsFactory = (WfwpsFactory)EPackage.Registry.INSTANCE.getEFactory(WfwpsPackage.eNS_URI);
			if (theWfwpsFactory != null) {
				return theWfwpsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WfwpsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfwpsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WfwpsPackage.WORKFLOW_WPS: return createWorkflowWps();
			case WfwpsPackage.LOCAL_WPS: return createLocalWPS();
			case WfwpsPackage.REMOTE_WPS: return createRemoteWPS();
			case WfwpsPackage.INPUT: return createInput();
			case WfwpsPackage.OUTPUT: return createOutput();
			case WfwpsPackage.INPUT_WORKFLOW: return createInputWorkflow();
			case WfwpsPackage.OUTPUT_WORKFLOW: return createOutputWorkflow();
			case WfwpsPackage.LOCAL_WPS_REFERENCE: return createLocalWPSReference();
			case WfwpsPackage.REMOTE_WPS_REFERENCE: return createRemoteWPSReference();
			case WfwpsPackage.WORKFLOW_REFERENCE: return createWorkflowReference();
			case WfwpsPackage.INPUT_REFERENCE: return createInputReference();
			case WfwpsPackage.OUTPUT_REFERENCE: return createOutputReference();
			case WfwpsPackage.WORK_FLOW: return createWorkFlow();
			case WfwpsPackage.WMS: return createWMS();
			case WfwpsPackage.WFS: return createWFS();
			case WfwpsPackage.LINK: return createLink();
			case WfwpsPackage.INTEGER_CONSTANT: return createIntegerConstant();
			case WfwpsPackage.DOUBLE_CONSTANT: return createDoubleConstant();
			case WfwpsPackage.STRING_CONSTANT: return createStringConstant();
			case WfwpsPackage.BOOLEAN_CONSTANT: return createBooleanConstant();
			case WfwpsPackage.GEOMETRY_CONSTANT: return createGeometryConstant();
			case WfwpsPackage.RASTER_CONSTANT: return createRasterConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WfwpsPackage.WP_STYPE:
				return createWPStypeFromString(eDataType, initialValue);
			case WfwpsPackage.IMAGE_FORMAT_TYPE:
				return createImageFormatTypeFromString(eDataType, initialValue);
			case WfwpsPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WfwpsPackage.WP_STYPE:
				return convertWPStypeToString(eDataType, instanceValue);
			case WfwpsPackage.IMAGE_FORMAT_TYPE:
				return convertImageFormatTypeToString(eDataType, instanceValue);
			case WfwpsPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowWps createWorkflowWps() {
		WorkflowWpsImpl workflowWps = new WorkflowWpsImpl();
		return workflowWps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalWPS createLocalWPS() {
		LocalWPSImpl localWPS = new LocalWPSImpl();
		return localWPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteWPS createRemoteWPS() {
		RemoteWPSImpl remoteWPS = new RemoteWPSImpl();
		return remoteWPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputWorkflow createInputWorkflow() {
		InputWorkflowImpl inputWorkflow = new InputWorkflowImpl();
		return inputWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputWorkflow createOutputWorkflow() {
		OutputWorkflowImpl outputWorkflow = new OutputWorkflowImpl();
		return outputWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalWPSReference createLocalWPSReference() {
		LocalWPSReferenceImpl localWPSReference = new LocalWPSReferenceImpl();
		return localWPSReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteWPSReference createRemoteWPSReference() {
		RemoteWPSReferenceImpl remoteWPSReference = new RemoteWPSReferenceImpl();
		return remoteWPSReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowReference createWorkflowReference() {
		WorkflowReferenceImpl workflowReference = new WorkflowReferenceImpl();
		return workflowReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputReference createInputReference() {
		InputReferenceImpl inputReference = new InputReferenceImpl();
		return inputReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputReference createOutputReference() {
		OutputReferenceImpl outputReference = new OutputReferenceImpl();
		return outputReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlow createWorkFlow() {
		WorkFlowImpl workFlow = new WorkFlowImpl();
		return workFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMS createWMS() {
		WMSImpl wms = new WMSImpl();
		return wms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFS createWFS() {
		WFSImpl wfs = new WFSImpl();
		return wfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConstant createIntegerConstant() {
		IntegerConstantImpl integerConstant = new IntegerConstantImpl();
		return integerConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleConstant createDoubleConstant() {
		DoubleConstantImpl doubleConstant = new DoubleConstantImpl();
		return doubleConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConstant createBooleanConstant() {
		BooleanConstantImpl booleanConstant = new BooleanConstantImpl();
		return booleanConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryConstant createGeometryConstant() {
		GeometryConstantImpl geometryConstant = new GeometryConstantImpl();
		return geometryConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterConstant createRasterConstant() {
		RasterConstantImpl rasterConstant = new RasterConstantImpl();
		return rasterConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WPStype createWPStypeFromString(EDataType eDataType, String initialValue) {
		WPStype result = WPStype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWPStypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFormatType createImageFormatTypeFromString(EDataType eDataType, String initialValue) {
		ImageFormatType result = ImageFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionTypeFromString(EDataType eDataType, String initialValue) {
		VersionType result = VersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfwpsPackage getWfwpsPackage() {
		return (WfwpsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WfwpsPackage getPackage() {
		return WfwpsPackage.eINSTANCE;
	}

} //WfwpsFactoryImpl
