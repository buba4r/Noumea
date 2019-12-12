/**
 */
package wfwps.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wfwps.BooleanConstant;
import wfwps.Constant;
import wfwps.Data;
import wfwps.DescribedElement;
import wfwps.DoubleConstant;
import wfwps.GeometryConstant;
import wfwps.ImageFormatType;
import wfwps.Implementable;
import wfwps.Input;
import wfwps.InputLink;
import wfwps.InputReference;
import wfwps.InputWorkflow;
import wfwps.IntegerConstant;
import wfwps.Link;
import wfwps.LocalWPS;
import wfwps.LocalWPSReference;
import wfwps.Output;
import wfwps.OutputLink;
import wfwps.OutputReference;
import wfwps.OutputWorkflow;
import wfwps.RasterConstant;
import wfwps.RemoteData;
import wfwps.RemoteWPS;
import wfwps.RemoteWPSReference;
import wfwps.StringConstant;
import wfwps.VersionType;
import wfwps.WPSReference;
import wfwps.WPStype;
import wfwps.WfwpsFactory;
import wfwps.WfwpsPackage;
import wfwps.WorkFlow;
import wfwps.WorkflowReference;
import wfwps.WorkflowWps;

import wfwps.util.WfwpsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WfwpsPackageImpl extends EPackageImpl implements WfwpsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowWpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localWPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteWPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputWorkflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputWorkflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wpsReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localWPSReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteWPSReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wfsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasterConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wpStypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imageFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see wfwps.WfwpsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WfwpsPackageImpl() {
		super(eNS_URI, WfwpsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WfwpsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WfwpsPackage init() {
		if (isInited) return (WfwpsPackage)EPackage.Registry.INSTANCE.getEPackage(WfwpsPackage.eNS_URI);

		// Obtain or create and register package
		WfwpsPackageImpl theWfwpsPackage = (WfwpsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WfwpsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WfwpsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWfwpsPackage.createPackageContents();

		// Initialize created meta-data
		theWfwpsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWfwpsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WfwpsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWfwpsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WfwpsPackage.eNS_URI, theWfwpsPackage);
		return theWfwpsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribedElement() {
		return describedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribedElement_Name() {
		return (EAttribute)describedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribedElement_Abstract() {
		return (EAttribute)describedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowWps() {
		return workflowWpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowWps_LocalWpsLibrary() {
		return (EReference)workflowWpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowWps_RemoteWpsLibrary() {
		return (EReference)workflowWpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowWps_WfLibrary() {
		return (EReference)workflowWpsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementable() {
		return implementableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementable_PackageName() {
		return (EAttribute)implementableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementable_ClassName() {
		return (EAttribute)implementableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementable_FunctionName() {
		return (EAttribute)implementableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWPS() {
		return wpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPS_Inputs() {
		return (EReference)wpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPS_Outputs() {
		return (EReference)wpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalWPS() {
		return localWPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteWPS() {
		return remoteWPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteWPS_IsVersion1() {
		return (EAttribute)remoteWPSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteWPS_Url() {
		return (EAttribute)remoteWPSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Type() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_LowerBound() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_UpperBound() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Optional() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_DefaultValue() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Wps() {
		return (EReference)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputWorkflow() {
		return inputWorkflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputWorkflow() {
		return outputWorkflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWPSReference() {
		return wpsReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPSReference_Inputs() {
		return (EReference)wpsReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPSReference_Outputs() {
		return (EReference)wpsReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalWPSReference() {
		return localWPSReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalWPSReference_Wps() {
		return (EReference)localWPSReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteWPSReference() {
		return remoteWPSReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoteWPSReference_Wps() {
		return (EReference)remoteWPSReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowReference() {
		return workflowReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowReference_Wps() {
		return (EReference)workflowReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputReference() {
		return inputReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputReference_Input() {
		return (EReference)inputReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputReference() {
		return outputReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputReference_Output() {
		return (EReference)outputReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkFlow() {
		return workFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_Inputs() {
		return (EReference)workFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_Outputs() {
		return (EReference)workFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_Wps() {
		return (EReference)workFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_Links() {
		return (EReference)workFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_RemoteData() {
		return (EReference)workFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkFlow_Constants() {
		return (EReference)workFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputLink() {
		return inputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputLink_Link() {
		return (EReference)inputLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputLink() {
		return outputLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputLink_Link() {
		return (EReference)outputLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteData() {
		return remoteDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteData_Url() {
		return (EAttribute)remoteDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteData_Layer() {
		return (EAttribute)remoteDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteData_Version() {
		return (EAttribute)remoteDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWMS() {
		return wmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_Format() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_Height() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_Width() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_SRS() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_BboxXmin() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_BboxXmax() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_BboxYmin() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_BboxYmax() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_Transparent() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMS_Styles() {
		return (EAttribute)wmsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWFS() {
		return wfsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Input() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Output() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerConstant() {
		return integerConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerConstant_Value() {
		return (EAttribute)integerConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleConstant() {
		return doubleConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleConstant_Value() {
		return (EAttribute)doubleConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringConstant() {
		return stringConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringConstant_Value() {
		return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConstant() {
		return booleanConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanConstant_Value() {
		return (EAttribute)booleanConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryConstant() {
		return geometryConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryConstant_Value() {
		return (EAttribute)geometryConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterConstant() {
		return rasterConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterConstant_FileName() {
		return (EAttribute)rasterConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWPStype() {
		return wpStypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImageFormatType() {
		return imageFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionType() {
		return versionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfwpsFactory getWfwpsFactory() {
		return (WfwpsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		describedElementEClass = createEClass(DESCRIBED_ELEMENT);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__NAME);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__ABSTRACT);

		workflowWpsEClass = createEClass(WORKFLOW_WPS);
		createEReference(workflowWpsEClass, WORKFLOW_WPS__LOCAL_WPS_LIBRARY);
		createEReference(workflowWpsEClass, WORKFLOW_WPS__REMOTE_WPS_LIBRARY);
		createEReference(workflowWpsEClass, WORKFLOW_WPS__WF_LIBRARY);

		implementableEClass = createEClass(IMPLEMENTABLE);
		createEAttribute(implementableEClass, IMPLEMENTABLE__PACKAGE_NAME);
		createEAttribute(implementableEClass, IMPLEMENTABLE__CLASS_NAME);
		createEAttribute(implementableEClass, IMPLEMENTABLE__FUNCTION_NAME);

		wpsEClass = createEClass(WPS);
		createEReference(wpsEClass, WPS__INPUTS);
		createEReference(wpsEClass, WPS__OUTPUTS);

		localWPSEClass = createEClass(LOCAL_WPS);

		remoteWPSEClass = createEClass(REMOTE_WPS);
		createEAttribute(remoteWPSEClass, REMOTE_WPS__IS_VERSION1);
		createEAttribute(remoteWPSEClass, REMOTE_WPS__URL);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__TYPE);
		createEAttribute(dataEClass, DATA__LOWER_BOUND);
		createEAttribute(dataEClass, DATA__UPPER_BOUND);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__OPTIONAL);
		createEAttribute(inputEClass, INPUT__DEFAULT_VALUE);
		createEReference(inputEClass, INPUT__WPS);

		outputEClass = createEClass(OUTPUT);

		inputWorkflowEClass = createEClass(INPUT_WORKFLOW);

		outputWorkflowEClass = createEClass(OUTPUT_WORKFLOW);

		wpsReferenceEClass = createEClass(WPS_REFERENCE);
		createEReference(wpsReferenceEClass, WPS_REFERENCE__INPUTS);
		createEReference(wpsReferenceEClass, WPS_REFERENCE__OUTPUTS);

		localWPSReferenceEClass = createEClass(LOCAL_WPS_REFERENCE);
		createEReference(localWPSReferenceEClass, LOCAL_WPS_REFERENCE__WPS);

		remoteWPSReferenceEClass = createEClass(REMOTE_WPS_REFERENCE);
		createEReference(remoteWPSReferenceEClass, REMOTE_WPS_REFERENCE__WPS);

		workflowReferenceEClass = createEClass(WORKFLOW_REFERENCE);
		createEReference(workflowReferenceEClass, WORKFLOW_REFERENCE__WPS);

		inputReferenceEClass = createEClass(INPUT_REFERENCE);
		createEReference(inputReferenceEClass, INPUT_REFERENCE__INPUT);

		outputReferenceEClass = createEClass(OUTPUT_REFERENCE);
		createEReference(outputReferenceEClass, OUTPUT_REFERENCE__OUTPUT);

		workFlowEClass = createEClass(WORK_FLOW);
		createEReference(workFlowEClass, WORK_FLOW__INPUTS);
		createEReference(workFlowEClass, WORK_FLOW__OUTPUTS);
		createEReference(workFlowEClass, WORK_FLOW__WPS);
		createEReference(workFlowEClass, WORK_FLOW__LINKS);
		createEReference(workFlowEClass, WORK_FLOW__REMOTE_DATA);
		createEReference(workFlowEClass, WORK_FLOW__CONSTANTS);

		inputLinkEClass = createEClass(INPUT_LINK);
		createEReference(inputLinkEClass, INPUT_LINK__LINK);

		outputLinkEClass = createEClass(OUTPUT_LINK);
		createEReference(outputLinkEClass, OUTPUT_LINK__LINK);

		remoteDataEClass = createEClass(REMOTE_DATA);
		createEAttribute(remoteDataEClass, REMOTE_DATA__URL);
		createEAttribute(remoteDataEClass, REMOTE_DATA__LAYER);
		createEAttribute(remoteDataEClass, REMOTE_DATA__VERSION);

		wmsEClass = createEClass(WMS);
		createEAttribute(wmsEClass, WMS__FORMAT);
		createEAttribute(wmsEClass, WMS__HEIGHT);
		createEAttribute(wmsEClass, WMS__WIDTH);
		createEAttribute(wmsEClass, WMS__SRS);
		createEAttribute(wmsEClass, WMS__BBOX_XMIN);
		createEAttribute(wmsEClass, WMS__BBOX_XMAX);
		createEAttribute(wmsEClass, WMS__BBOX_YMIN);
		createEAttribute(wmsEClass, WMS__BBOX_YMAX);
		createEAttribute(wmsEClass, WMS__TRANSPARENT);
		createEAttribute(wmsEClass, WMS__STYLES);

		wfsEClass = createEClass(WFS);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__INPUT);
		createEReference(linkEClass, LINK__OUTPUT);

		constantEClass = createEClass(CONSTANT);

		integerConstantEClass = createEClass(INTEGER_CONSTANT);
		createEAttribute(integerConstantEClass, INTEGER_CONSTANT__VALUE);

		doubleConstantEClass = createEClass(DOUBLE_CONSTANT);
		createEAttribute(doubleConstantEClass, DOUBLE_CONSTANT__VALUE);

		stringConstantEClass = createEClass(STRING_CONSTANT);
		createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

		booleanConstantEClass = createEClass(BOOLEAN_CONSTANT);
		createEAttribute(booleanConstantEClass, BOOLEAN_CONSTANT__VALUE);

		geometryConstantEClass = createEClass(GEOMETRY_CONSTANT);
		createEAttribute(geometryConstantEClass, GEOMETRY_CONSTANT__VALUE);

		rasterConstantEClass = createEClass(RASTER_CONSTANT);
		createEAttribute(rasterConstantEClass, RASTER_CONSTANT__FILE_NAME);

		// Create enums
		wpStypeEEnum = createEEnum(WP_STYPE);
		imageFormatTypeEEnum = createEEnum(IMAGE_FORMAT_TYPE);
		versionTypeEEnum = createEEnum(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowWpsEClass.getESuperTypes().add(this.getDescribedElement());
		wpsEClass.getESuperTypes().add(this.getDescribedElement());
		localWPSEClass.getESuperTypes().add(this.getWPS());
		localWPSEClass.getESuperTypes().add(this.getImplementable());
		remoteWPSEClass.getESuperTypes().add(this.getWPS());
		dataEClass.getESuperTypes().add(this.getDescribedElement());
		inputEClass.getESuperTypes().add(this.getData());
		outputEClass.getESuperTypes().add(this.getData());
		inputWorkflowEClass.getESuperTypes().add(this.getInput());
		inputWorkflowEClass.getESuperTypes().add(this.getInputLink());
		outputWorkflowEClass.getESuperTypes().add(this.getOutput());
		outputWorkflowEClass.getESuperTypes().add(this.getOutputLink());
		localWPSReferenceEClass.getESuperTypes().add(this.getWPSReference());
		remoteWPSReferenceEClass.getESuperTypes().add(this.getWPSReference());
		workflowReferenceEClass.getESuperTypes().add(this.getWPSReference());
		inputReferenceEClass.getESuperTypes().add(this.getOutputLink());
		outputReferenceEClass.getESuperTypes().add(this.getInputLink());
		workFlowEClass.getESuperTypes().add(this.getDescribedElement());
		remoteDataEClass.getESuperTypes().add(this.getInputLink());
		wmsEClass.getESuperTypes().add(this.getRemoteData());
		wfsEClass.getESuperTypes().add(this.getRemoteData());
		constantEClass.getESuperTypes().add(this.getInputLink());
		constantEClass.getESuperTypes().add(this.getDescribedElement());
		integerConstantEClass.getESuperTypes().add(this.getConstant());
		doubleConstantEClass.getESuperTypes().add(this.getConstant());
		stringConstantEClass.getESuperTypes().add(this.getConstant());
		booleanConstantEClass.getESuperTypes().add(this.getConstant());
		geometryConstantEClass.getESuperTypes().add(this.getConstant());
		rasterConstantEClass.getESuperTypes().add(this.getConstant());

		// Initialize classes, features, and operations; add parameters
		initEClass(describedElementEClass, DescribedElement.class, "DescribedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribedElement_Abstract(), ecorePackage.getEString(), "abstract", null, 1, 1, DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowWpsEClass, WorkflowWps.class, "WorkflowWps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowWps_LocalWpsLibrary(), this.getLocalWPS(), null, "localWpsLibrary", null, 0, -1, WorkflowWps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowWps_RemoteWpsLibrary(), this.getRemoteWPS(), null, "remoteWpsLibrary", null, 0, -1, WorkflowWps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowWps_WfLibrary(), this.getWorkFlow(), null, "wfLibrary", null, 0, -1, WorkflowWps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementableEClass, Implementable.class, "Implementable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementable_PackageName(), ecorePackage.getEString(), "packageName", "packageName", 1, 1, Implementable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementable_ClassName(), ecorePackage.getEString(), "className", "className", 1, 1, Implementable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementable_FunctionName(), ecorePackage.getEString(), "functionName", "functionName", 1, 1, Implementable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wpsEClass, wfwps.WPS.class, "WPS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPS_Inputs(), this.getInput(), this.getInput_Wps(), "inputs", null, 0, -1, wfwps.WPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWPS_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, wfwps.WPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localWPSEClass, LocalWPS.class, "LocalWPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteWPSEClass, RemoteWPS.class, "RemoteWPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteWPS_IsVersion1(), ecorePackage.getEBoolean(), "isVersion1", "false", 1, 1, RemoteWPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteWPS_Url(), ecorePackage.getEString(), "url", null, 1, 1, RemoteWPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Type(), this.getWPStype(), "type", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_LowerBound(), ecorePackage.getEInt(), "lowerBound", "1", 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Optional(), ecorePackage.getEBoolean(), "optional", "false", 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_DefaultValue(), ecorePackage.getEString(), "defaultValue", "", 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Wps(), this.getWPS(), this.getWPS_Inputs(), "wps", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputWorkflowEClass, InputWorkflow.class, "InputWorkflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputWorkflowEClass, OutputWorkflow.class, "OutputWorkflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wpsReferenceEClass, WPSReference.class, "WPSReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPSReference_Inputs(), this.getInputReference(), null, "inputs", null, 0, -1, WPSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWPSReference_Outputs(), this.getOutputReference(), null, "outputs", null, 0, -1, WPSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localWPSReferenceEClass, LocalWPSReference.class, "LocalWPSReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalWPSReference_Wps(), this.getLocalWPS(), null, "wps", null, 1, 1, LocalWPSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteWPSReferenceEClass, RemoteWPSReference.class, "RemoteWPSReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoteWPSReference_Wps(), this.getRemoteWPS(), null, "wps", null, 1, 1, RemoteWPSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowReferenceEClass, WorkflowReference.class, "WorkflowReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowReference_Wps(), this.getWorkFlow(), null, "wps", null, 1, 1, WorkflowReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputReferenceEClass, InputReference.class, "InputReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputReference_Input(), this.getInput(), null, "input", null, 1, 1, InputReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputReferenceEClass, OutputReference.class, "OutputReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputReference_Output(), this.getOutput(), null, "output", null, 1, 1, OutputReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workFlowEClass, WorkFlow.class, "WorkFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkFlow_Inputs(), this.getInputWorkflow(), null, "inputs", null, 0, -1, WorkFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlow_Outputs(), this.getOutputWorkflow(), null, "outputs", null, 0, -1, WorkFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlow_Wps(), this.getWPSReference(), null, "wps", null, 0, -1, WorkFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlow_Links(), this.getLink(), null, "links", null, 0, -1, WorkFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlow_RemoteData(), this.getRemoteData(), null, "remoteData", null, 0, -1, WorkFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlow_Constants(), this.getConstant(), null, "constants", null, 0, -1, WorkFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputLinkEClass, InputLink.class, "InputLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputLink_Link(), this.getLink(), this.getLink_Input(), "link", null, 0, -1, InputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputLinkEClass, OutputLink.class, "OutputLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputLink_Link(), this.getLink(), this.getLink_Output(), "link", null, 0, 1, OutputLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteDataEClass, RemoteData.class, "RemoteData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteData_Url(), ecorePackage.getEString(), "url", "", 1, 1, RemoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteData_Layer(), ecorePackage.getEString(), "layer", null, 0, 1, RemoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteData_Version(), this.getVersionType(), "version", "v1_1_1", 1, 1, RemoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmsEClass, wfwps.WMS.class, "WMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWMS_Format(), this.getImageFormatType(), "format", "png", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_Height(), ecorePackage.getEInt(), "height", "583", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_Width(), ecorePackage.getEInt(), "width", "420", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_SRS(), ecorePackage.getEString(), "SRS", "EPSG:4326", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_BboxXmin(), ecorePackage.getEDouble(), "bboxXmin", "-131.13151509433965", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_BboxXmax(), ecorePackage.getEDouble(), "bboxXmax", "46.60532747661736", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_BboxYmin(), ecorePackage.getEDouble(), "bboxYmin", "-117.61620566037737", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_BboxYmax(), ecorePackage.getEDouble(), "bboxYmax", "56.34191403281659", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_Transparent(), ecorePackage.getEBooleanObject(), "transparent", "false", 1, 1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMS_Styles(), ecorePackage.getEString(), "styles", null, 0, -1, wfwps.WMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wfsEClass, wfwps.WFS.class, "WFS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Input(), this.getInputLink(), this.getInputLink_Link(), "input", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Output(), this.getOutputLink(), this.getOutputLink_Link(), "output", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerConstantEClass, IntegerConstant.class, "IntegerConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerConstant_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleConstantEClass, DoubleConstant.class, "DoubleConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleConstant_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanConstantEClass, BooleanConstant.class, "BooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanConstant_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryConstantEClass, GeometryConstant.class, "GeometryConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeometryConstant_Value(), ecorePackage.getEString(), "value", null, 1, 1, GeometryConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rasterConstantEClass, RasterConstant.class, "RasterConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRasterConstant_FileName(), ecorePackage.getEString(), "fileName", null, 1, 1, RasterConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(wpStypeEEnum, WPStype.class, "WPStype");
		addEEnumLiteral(wpStypeEEnum, WPStype.BOOLEAN);
		addEEnumLiteral(wpStypeEEnum, WPStype.INTEGER);
		addEEnumLiteral(wpStypeEEnum, WPStype.DOUBLE);
		addEEnumLiteral(wpStypeEEnum, WPStype.STRING);
		addEEnumLiteral(wpStypeEEnum, WPStype.GEOMETRY);
		addEEnumLiteral(wpStypeEEnum, WPStype.RASTER);
		addEEnumLiteral(wpStypeEEnum, WPStype.COMPLEX);

		initEEnum(imageFormatTypeEEnum, ImageFormatType.class, "ImageFormatType");
		addEEnumLiteral(imageFormatTypeEEnum, ImageFormatType.PNG);
		addEEnumLiteral(imageFormatTypeEEnum, ImageFormatType.JPEG);

		initEEnum(versionTypeEEnum, VersionType.class, "VersionType");
		addEEnumLiteral(versionTypeEEnum, VersionType.V1_11);
		addEEnumLiteral(versionTypeEEnum, VersionType.V1_30);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (wpsEClass, 
		   source, 
		   new String[] {
			 "constraints", "singleInputName singleOutputName"
		   });	
		addAnnotation
		  (dataEClass, 
		   source, 
		   new String[] {
			 "constraints", "positiveLowerBound lowerBoundLessThanUpperBound"
		   });	
		addAnnotation
		  (inputWorkflowEClass, 
		   source, 
		   new String[] {
			 "constraints", "workflowInputConnected"
		   });	
		addAnnotation
		  (outputWorkflowEClass, 
		   source, 
		   new String[] {
			 "constraints", "workflowOutputConnected"
		   });	
		addAnnotation
		  (inputReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "WPSintputConnected"
		   });	
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sameType"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (wpsEClass, 
		   source, 
		   new String[] {
			 "singleInputName", "inputs->forAll(i1 : Input, i2 : Input | i1 <> i2 implies i1.name <> i2.name)",
			 "singleOutputName", "outputs->forAll(o1 : Output, o2 : Output | o1 <> o2 implies o1.name <> o2.name)"
		   });	
		addAnnotation
		  (dataEClass, 
		   source, 
		   new String[] {
			 "positiveLowerBound", "(lowerBound > -1)",
			 "lowerBoundLessThanUpperBound", "(lowerBound <= upperBound)"
		   });	
		addAnnotation
		  (inputWorkflowEClass, 
		   source, 
		   new String[] {
			 "workflowInputConnected", "((link<>null) and not(link->isEmpty()) )"
		   });	
		addAnnotation
		  (outputWorkflowEClass, 
		   source, 
		   new String[] {
			 "workflowOutputConnected", "(link<>null) "
		   });	
		addAnnotation
		  (inputReferenceEClass, 
		   source, 
		   new String[] {
			 "WPSintputConnected", "if (not (self.input.optional)) then (link<>null) else true endif"
		   });	
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "sameType", "(input.oclIsTypeOf(OutputReference) and output.oclIsTypeOf(InputReference))\n\t\t\timplies input.oclAsType(OutputReference).output.type = output.oclAsType(InputReference).input.type"
		   });
	}

} //WfwpsPackageImpl
