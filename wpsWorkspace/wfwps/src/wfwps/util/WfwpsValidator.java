/**
 */
package wfwps.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import wfwps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see wfwps.WfwpsPackage
 * @generated
 */
public class WfwpsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WfwpsValidator INSTANCE = new WfwpsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "wfwps";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfwpsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WfwpsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WfwpsPackage.DESCRIBED_ELEMENT:
				return validateDescribedElement((DescribedElement)value, diagnostics, context);
			case WfwpsPackage.WORKFLOW_WPS:
				return validateWorkflowWps((WorkflowWps)value, diagnostics, context);
			case WfwpsPackage.IMPLEMENTABLE:
				return validateImplementable((Implementable)value, diagnostics, context);
			case WfwpsPackage.WPS:
				return validateWPS((WPS)value, diagnostics, context);
			case WfwpsPackage.LOCAL_WPS:
				return validateLocalWPS((LocalWPS)value, diagnostics, context);
			case WfwpsPackage.REMOTE_WPS:
				return validateRemoteWPS((RemoteWPS)value, diagnostics, context);
			case WfwpsPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case WfwpsPackage.INPUT:
				return validateInput((Input)value, diagnostics, context);
			case WfwpsPackage.OUTPUT:
				return validateOutput((Output)value, diagnostics, context);
			case WfwpsPackage.INPUT_WORKFLOW:
				return validateInputWorkflow((InputWorkflow)value, diagnostics, context);
			case WfwpsPackage.OUTPUT_WORKFLOW:
				return validateOutputWorkflow((OutputWorkflow)value, diagnostics, context);
			case WfwpsPackage.WPS_REFERENCE:
				return validateWPSReference((WPSReference)value, diagnostics, context);
			case WfwpsPackage.LOCAL_WPS_REFERENCE:
				return validateLocalWPSReference((LocalWPSReference)value, diagnostics, context);
			case WfwpsPackage.REMOTE_WPS_REFERENCE:
				return validateRemoteWPSReference((RemoteWPSReference)value, diagnostics, context);
			case WfwpsPackage.WORKFLOW_REFERENCE:
				return validateWorkflowReference((WorkflowReference)value, diagnostics, context);
			case WfwpsPackage.INPUT_REFERENCE:
				return validateInputReference((InputReference)value, diagnostics, context);
			case WfwpsPackage.OUTPUT_REFERENCE:
				return validateOutputReference((OutputReference)value, diagnostics, context);
			case WfwpsPackage.WORK_FLOW:
				return validateWorkFlow((WorkFlow)value, diagnostics, context);
			case WfwpsPackage.INPUT_LINK:
				return validateInputLink((InputLink)value, diagnostics, context);
			case WfwpsPackage.OUTPUT_LINK:
				return validateOutputLink((OutputLink)value, diagnostics, context);
			case WfwpsPackage.REMOTE_DATA:
				return validateRemoteData((RemoteData)value, diagnostics, context);
			case WfwpsPackage.WMS:
				return validateWMS((WMS)value, diagnostics, context);
			case WfwpsPackage.WFS:
				return validateWFS((WFS)value, diagnostics, context);
			case WfwpsPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case WfwpsPackage.CONSTANT:
				return validateConstant((Constant)value, diagnostics, context);
			case WfwpsPackage.INTEGER_CONSTANT:
				return validateIntegerConstant((IntegerConstant)value, diagnostics, context);
			case WfwpsPackage.DOUBLE_CONSTANT:
				return validateDoubleConstant((DoubleConstant)value, diagnostics, context);
			case WfwpsPackage.STRING_CONSTANT:
				return validateStringConstant((StringConstant)value, diagnostics, context);
			case WfwpsPackage.BOOLEAN_CONSTANT:
				return validateBooleanConstant((BooleanConstant)value, diagnostics, context);
			case WfwpsPackage.GEOMETRY_CONSTANT:
				return validateGeometryConstant((GeometryConstant)value, diagnostics, context);
			case WfwpsPackage.RASTER_CONSTANT:
				return validateRasterConstant((RasterConstant)value, diagnostics, context);
			case WfwpsPackage.WP_STYPE:
				return validateWPStype((WPStype)value, diagnostics, context);
			case WfwpsPackage.IMAGE_FORMAT_TYPE:
				return validateImageFormatType((ImageFormatType)value, diagnostics, context);
			case WfwpsPackage.VERSION_TYPE:
				return validateVersionType((VersionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribedElement(DescribedElement describedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(describedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowWps(WorkflowWps workflowWps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowWps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementable(Implementable implementable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWPS(WPS wps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wps, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validateWPS_singleInputName(wps, diagnostics, context);
		if (result || diagnostics != null) result &= validateWPS_singleOutputName(wps, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the singleInputName constraint of '<em>WPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WPS__SINGLE_INPUT_NAME__EEXPRESSION = "inputs->forAll(i1 : Input, i2 : Input | i1 <> i2 implies i1.name <> i2.name)";

	/**
	 * Validates the singleInputName constraint of '<em>WPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWPS_singleInputName(WPS wps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfwpsPackage.Literals.WPS,
				 wps,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "singleInputName",
				 WPS__SINGLE_INPUT_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the singleOutputName constraint of '<em>WPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WPS__SINGLE_OUTPUT_NAME__EEXPRESSION = "outputs->forAll(o1 : Output, o2 : Output | o1 <> o2 implies o1.name <> o2.name)";

	/**
	 * Validates the singleOutputName constraint of '<em>WPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWPS_singleOutputName(WPS wps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfwpsPackage.Literals.WPS,
				 wps,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "singleOutputName",
				 WPS__SINGLE_OUTPUT_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalWPS(LocalWPS localWPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localWPS, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validateWPS_singleInputName(localWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validateWPS_singleOutputName(localWPS, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteWPS(RemoteWPS remoteWPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(remoteWPS, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validateWPS_singleInputName(remoteWPS, diagnostics, context);
		if (result || diagnostics != null) result &= validateWPS_singleOutputName(remoteWPS, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(data, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(data, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_positiveLowerBound(data, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_lowerBoundLessThanUpperBound(data, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveLowerBound constraint of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA__POSITIVE_LOWER_BOUND__EEXPRESSION = "(lowerBound > -1)";

	/**
	 * Validates the positiveLowerBound constraint of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData_positiveLowerBound(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfwpsPackage.Literals.DATA,
				 data,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "positiveLowerBound",
				 DATA__POSITIVE_LOWER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the lowerBoundLessThanUpperBound constraint of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA__LOWER_BOUND_LESS_THAN_UPPER_BOUND__EEXPRESSION = "(lowerBound <= upperBound)";

	/**
	 * Validates the lowerBoundLessThanUpperBound constraint of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData_lowerBoundLessThanUpperBound(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfwpsPackage.Literals.DATA,
				 data,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "lowerBoundLessThanUpperBound",
				 DATA__LOWER_BOUND_LESS_THAN_UPPER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(input, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(input, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(input, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_positiveLowerBound(input, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_lowerBoundLessThanUpperBound(input, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(output, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(output, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(output, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(output, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(output, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(output, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(output, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(output, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(output, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_positiveLowerBound(output, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_lowerBoundLessThanUpperBound(output, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputWorkflow(InputWorkflow inputWorkflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputWorkflow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_positiveLowerBound(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_lowerBoundLessThanUpperBound(inputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputWorkflow_workflowInputConnected(inputWorkflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the workflowInputConnected constraint of '<em>Input Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INPUT_WORKFLOW__WORKFLOW_INPUT_CONNECTED__EEXPRESSION = "((link<>null) and not(link->isEmpty()) )";

	/**
	 * Validates the workflowInputConnected constraint of '<em>Input Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputWorkflow_workflowInputConnected(InputWorkflow inputWorkflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfwpsPackage.Literals.INPUT_WORKFLOW,
				 inputWorkflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "workflowInputConnected",
				 INPUT_WORKFLOW__WORKFLOW_INPUT_CONNECTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputWorkflow(OutputWorkflow outputWorkflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputWorkflow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_positiveLowerBound(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateData_lowerBoundLessThanUpperBound(outputWorkflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputWorkflow_workflowOutputConnected(outputWorkflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the workflowOutputConnected constraint of '<em>Output Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT_WORKFLOW__WORKFLOW_OUTPUT_CONNECTED__EEXPRESSION = "(link<>null) ";

	/**
	 * Validates the workflowOutputConnected constraint of '<em>Output Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputWorkflow_workflowOutputConnected(OutputWorkflow outputWorkflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfwpsPackage.Literals.OUTPUT_WORKFLOW,
				 outputWorkflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "workflowOutputConnected",
				 OUTPUT_WORKFLOW__WORKFLOW_OUTPUT_CONNECTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWPSReference(WPSReference wpsReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wpsReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalWPSReference(LocalWPSReference localWPSReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localWPSReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteWPSReference(RemoteWPSReference remoteWPSReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteWPSReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowReference(WorkflowReference workflowReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputReference(InputReference inputReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputReference_WPSintputConnected(inputReference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the WPSintputConnected constraint of '<em>Input Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INPUT_REFERENCE__WP_SINTPUT_CONNECTED__EEXPRESSION = "if (not (self.input.optional)) then (link<>null) else true endif";

	/**
	 * Validates the WPSintputConnected constraint of '<em>Input Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputReference_WPSintputConnected(InputReference inputReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfwpsPackage.Literals.INPUT_REFERENCE,
				 inputReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "WPSintputConnected",
				 INPUT_REFERENCE__WP_SINTPUT_CONNECTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputReference(OutputReference outputReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkFlow(WorkFlow workFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputLink(InputLink inputLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputLink(OutputLink outputLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteData(RemoteData remoteData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWMS(WMS wms, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wms, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWFS(WFS wfs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wfs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(link, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_sameType(link, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sameType constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK__SAME_TYPE__EEXPRESSION = "(input.oclIsTypeOf(OutputReference) and output.oclIsTypeOf(InputReference))\n" +
		"\t\t\timplies input.oclAsType(OutputReference).output.type = output.oclAsType(InputReference).input.type";

	/**
	 * Validates the sameType constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_sameType(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfwpsPackage.Literals.LINK,
				 link,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sameType",
				 LINK__SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerConstant(IntegerConstant integerConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleConstant(DoubleConstant doubleConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringConstant(StringConstant stringConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanConstant(BooleanConstant booleanConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryConstant(GeometryConstant geometryConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometryConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRasterConstant(RasterConstant rasterConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rasterConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWPStype(WPStype wpStype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageFormatType(ImageFormatType imageFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(VersionType versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WfwpsValidator
