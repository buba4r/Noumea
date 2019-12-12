/**
 */
package wfwps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wfwps.WfwpsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface WfwpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wfwps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.ubo.mde.babau.wfwps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wfwps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WfwpsPackage eINSTANCE = wfwps.impl.WfwpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link wfwps.impl.DescribedElementImpl <em>Described Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.DescribedElementImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getDescribedElement()
	 * @generated
	 */
	int DESCRIBED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__ABSTRACT = 1;

	/**
	 * The number of structural features of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.WorkflowWpsImpl <em>Workflow Wps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.WorkflowWpsImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getWorkflowWps()
	 * @generated
	 */
	int WORKFLOW_WPS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_WPS__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_WPS__ABSTRACT = DESCRIBED_ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Local Wps Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_WPS__LOCAL_WPS_LIBRARY = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remote Wps Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_WPS__REMOTE_WPS_LIBRARY = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wf Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_WPS__WF_LIBRARY = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow Wps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_WPS_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workflow Wps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_WPS_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.ImplementableImpl <em>Implementable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.ImplementableImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getImplementable()
	 * @generated
	 */
	int IMPLEMENTABLE = 2;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTABLE__PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTABLE__CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTABLE__FUNCTION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Implementable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Implementable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.WPSImpl <em>WPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.WPSImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getWPS()
	 * @generated
	 */
	int WPS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS__ABSTRACT = DESCRIBED_ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS__INPUTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS__OUTPUTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>WPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.LocalWPSImpl <em>Local WPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.LocalWPSImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getLocalWPS()
	 * @generated
	 */
	int LOCAL_WPS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS__NAME = WPS__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS__ABSTRACT = WPS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS__INPUTS = WPS__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS__OUTPUTS = WPS__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS__PACKAGE_NAME = WPS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS__CLASS_NAME = WPS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS__FUNCTION_NAME = WPS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Local WPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS_FEATURE_COUNT = WPS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Local WPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS_OPERATION_COUNT = WPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.RemoteWPSImpl <em>Remote WPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.RemoteWPSImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getRemoteWPS()
	 * @generated
	 */
	int REMOTE_WPS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS__NAME = WPS__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS__ABSTRACT = WPS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS__INPUTS = WPS__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS__OUTPUTS = WPS__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Is Version1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS__IS_VERSION1 = WPS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS__URL = WPS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remote WPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS_FEATURE_COUNT = WPS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Remote WPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS_OPERATION_COUNT = WPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.DataImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ABSTRACT = DESCRIBED_ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LOWER_BOUND = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__UPPER_BOUND = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.InputImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ABSTRACT = DATA__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LOWER_BOUND = DATA__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__UPPER_BOUND = DATA__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OPTIONAL = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DEFAULT_VALUE = DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__WPS = DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.OutputImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ABSTRACT = DATA__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LOWER_BOUND = DATA__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__UPPER_BOUND = DATA__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.InputWorkflowImpl <em>Input Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.InputWorkflowImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getInputWorkflow()
	 * @generated
	 */
	int INPUT_WORKFLOW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__ABSTRACT = INPUT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__TYPE = INPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__LOWER_BOUND = INPUT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__UPPER_BOUND = INPUT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__OPTIONAL = INPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__DEFAULT_VALUE = INPUT__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Wps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__WPS = INPUT__WPS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW__LINK = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORKFLOW_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.OutputWorkflowImpl <em>Output Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.OutputWorkflowImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getOutputWorkflow()
	 * @generated
	 */
	int OUTPUT_WORKFLOW = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WORKFLOW__NAME = OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WORKFLOW__ABSTRACT = OUTPUT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WORKFLOW__TYPE = OUTPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WORKFLOW__LOWER_BOUND = OUTPUT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WORKFLOW__UPPER_BOUND = OUTPUT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WORKFLOW__LINK = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WORKFLOW_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WORKFLOW_OPERATION_COUNT = OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.WPSReferenceImpl <em>WPS Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.WPSReferenceImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getWPSReference()
	 * @generated
	 */
	int WPS_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS_REFERENCE__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS_REFERENCE__OUTPUTS = 1;

	/**
	 * The number of structural features of the '<em>WPS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WPS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPS_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.LocalWPSReferenceImpl <em>Local WPS Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.LocalWPSReferenceImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getLocalWPSReference()
	 * @generated
	 */
	int LOCAL_WPS_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS_REFERENCE__INPUTS = WPS_REFERENCE__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS_REFERENCE__OUTPUTS = WPS_REFERENCE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Wps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS_REFERENCE__WPS = WPS_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local WPS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS_REFERENCE_FEATURE_COUNT = WPS_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local WPS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_WPS_REFERENCE_OPERATION_COUNT = WPS_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.RemoteWPSReferenceImpl <em>Remote WPS Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.RemoteWPSReferenceImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getRemoteWPSReference()
	 * @generated
	 */
	int REMOTE_WPS_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS_REFERENCE__INPUTS = WPS_REFERENCE__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS_REFERENCE__OUTPUTS = WPS_REFERENCE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Wps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS_REFERENCE__WPS = WPS_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote WPS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS_REFERENCE_FEATURE_COUNT = WPS_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remote WPS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_WPS_REFERENCE_OPERATION_COUNT = WPS_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.WorkflowReferenceImpl <em>Workflow Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.WorkflowReferenceImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getWorkflowReference()
	 * @generated
	 */
	int WORKFLOW_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_REFERENCE__INPUTS = WPS_REFERENCE__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_REFERENCE__OUTPUTS = WPS_REFERENCE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Wps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_REFERENCE__WPS = WPS_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_REFERENCE_FEATURE_COUNT = WPS_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workflow Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_REFERENCE_OPERATION_COUNT = WPS_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.OutputLinkImpl <em>Output Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.OutputLinkImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getOutputLink()
	 * @generated
	 */
	int OUTPUT_LINK = 19;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK__LINK = 0;

	/**
	 * The number of structural features of the '<em>Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.InputReferenceImpl <em>Input Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.InputReferenceImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getInputReference()
	 * @generated
	 */
	int INPUT_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REFERENCE__LINK = OUTPUT_LINK__LINK;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REFERENCE__INPUT = OUTPUT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REFERENCE_FEATURE_COUNT = OUTPUT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REFERENCE_OPERATION_COUNT = OUTPUT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.InputLinkImpl <em>Input Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.InputLinkImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getInputLink()
	 * @generated
	 */
	int INPUT_LINK = 18;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK__LINK = 0;

	/**
	 * The number of structural features of the '<em>Input Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.OutputReferenceImpl <em>Output Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.OutputReferenceImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getOutputReference()
	 * @generated
	 */
	int OUTPUT_REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REFERENCE__LINK = INPUT_LINK__LINK;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REFERENCE__OUTPUT = INPUT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REFERENCE_FEATURE_COUNT = INPUT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REFERENCE_OPERATION_COUNT = INPUT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.WorkFlowImpl <em>Work Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.WorkFlowImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getWorkFlow()
	 * @generated
	 */
	int WORK_FLOW = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__ABSTRACT = DESCRIBED_ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__INPUTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__OUTPUTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__WPS = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__LINKS = DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remote Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__REMOTE_DATA = DESCRIBED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__CONSTANTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Work Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Work Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.RemoteDataImpl <em>Remote Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.RemoteDataImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getRemoteData()
	 * @generated
	 */
	int REMOTE_DATA = 20;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_DATA__LINK = INPUT_LINK__LINK;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_DATA__URL = INPUT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_DATA__LAYER = INPUT_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_DATA__VERSION = INPUT_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remote Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_DATA_FEATURE_COUNT = INPUT_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Remote Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_DATA_OPERATION_COUNT = INPUT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.WMSImpl <em>WMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.WMSImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getWMS()
	 * @generated
	 */
	int WMS = 21;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__LINK = REMOTE_DATA__LINK;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__URL = REMOTE_DATA__URL;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__LAYER = REMOTE_DATA__LAYER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__VERSION = REMOTE_DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__FORMAT = REMOTE_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__HEIGHT = REMOTE_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__WIDTH = REMOTE_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>SRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__SRS = REMOTE_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bbox Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__BBOX_XMIN = REMOTE_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bbox Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__BBOX_XMAX = REMOTE_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bbox Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__BBOX_YMIN = REMOTE_DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bbox Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__BBOX_YMAX = REMOTE_DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__TRANSPARENT = REMOTE_DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS__STYLES = REMOTE_DATA_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>WMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS_FEATURE_COUNT = REMOTE_DATA_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>WMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMS_OPERATION_COUNT = REMOTE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.WFSImpl <em>WFS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.WFSImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getWFS()
	 * @generated
	 */
	int WFS = 22;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS__LINK = REMOTE_DATA__LINK;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS__URL = REMOTE_DATA__URL;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS__LAYER = REMOTE_DATA__LAYER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS__VERSION = REMOTE_DATA__VERSION;

	/**
	 * The number of structural features of the '<em>WFS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_FEATURE_COUNT = REMOTE_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WFS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_OPERATION_COUNT = REMOTE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.LinkImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 23;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.ConstantImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 24;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__LINK = INPUT_LINK__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = INPUT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ABSTRACT = INPUT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = INPUT_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = INPUT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.IntegerConstantImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 25;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__LINK = CONSTANT__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__ABSTRACT = CONSTANT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.DoubleConstantImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getDoubleConstant()
	 * @generated
	 */
	int DOUBLE_CONSTANT = 26;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT__LINK = CONSTANT__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT__ABSTRACT = CONSTANT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.StringConstantImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 27;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__LINK = CONSTANT__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__ABSTRACT = CONSTANT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.BooleanConstantImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getBooleanConstant()
	 * @generated
	 */
	int BOOLEAN_CONSTANT = 28;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__LINK = CONSTANT__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__ABSTRACT = CONSTANT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.GeometryConstantImpl <em>Geometry Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.GeometryConstantImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getGeometryConstant()
	 * @generated
	 */
	int GEOMETRY_CONSTANT = 29;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_CONSTANT__LINK = CONSTANT__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_CONSTANT__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_CONSTANT__ABSTRACT = CONSTANT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometry Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geometry Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.impl.RasterConstantImpl <em>Raster Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.impl.RasterConstantImpl
	 * @see wfwps.impl.WfwpsPackageImpl#getRasterConstant()
	 * @generated
	 */
	int RASTER_CONSTANT = 30;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_CONSTANT__LINK = CONSTANT__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_CONSTANT__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_CONSTANT__ABSTRACT = CONSTANT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_CONSTANT__FILE_NAME = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raster Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raster Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfwps.WPStype <em>WP Stype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.WPStype
	 * @see wfwps.impl.WfwpsPackageImpl#getWPStype()
	 * @generated
	 */
	int WP_STYPE = 31;

	/**
	 * The meta object id for the '{@link wfwps.ImageFormatType <em>Image Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.ImageFormatType
	 * @see wfwps.impl.WfwpsPackageImpl#getImageFormatType()
	 * @generated
	 */
	int IMAGE_FORMAT_TYPE = 32;

	/**
	 * The meta object id for the '{@link wfwps.VersionType <em>Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfwps.VersionType
	 * @see wfwps.impl.WfwpsPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 33;


	/**
	 * Returns the meta object for class '{@link wfwps.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Element</em>'.
	 * @see wfwps.DescribedElement
	 * @generated
	 */
	EClass getDescribedElement();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.DescribedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wfwps.DescribedElement#getName()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.DescribedElement#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see wfwps.DescribedElement#getAbstract()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Abstract();

	/**
	 * Returns the meta object for class '{@link wfwps.WorkflowWps <em>Workflow Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Wps</em>'.
	 * @see wfwps.WorkflowWps
	 * @generated
	 */
	EClass getWorkflowWps();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkflowWps#getLocalWpsLibrary <em>Local Wps Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Wps Library</em>'.
	 * @see wfwps.WorkflowWps#getLocalWpsLibrary()
	 * @see #getWorkflowWps()
	 * @generated
	 */
	EReference getWorkflowWps_LocalWpsLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkflowWps#getRemoteWpsLibrary <em>Remote Wps Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remote Wps Library</em>'.
	 * @see wfwps.WorkflowWps#getRemoteWpsLibrary()
	 * @see #getWorkflowWps()
	 * @generated
	 */
	EReference getWorkflowWps_RemoteWpsLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkflowWps#getWfLibrary <em>Wf Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wf Library</em>'.
	 * @see wfwps.WorkflowWps#getWfLibrary()
	 * @see #getWorkflowWps()
	 * @generated
	 */
	EReference getWorkflowWps_WfLibrary();

	/**
	 * Returns the meta object for class '{@link wfwps.Implementable <em>Implementable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementable</em>'.
	 * @see wfwps.Implementable
	 * @generated
	 */
	EClass getImplementable();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.Implementable#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see wfwps.Implementable#getPackageName()
	 * @see #getImplementable()
	 * @generated
	 */
	EAttribute getImplementable_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.Implementable#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see wfwps.Implementable#getClassName()
	 * @see #getImplementable()
	 * @generated
	 */
	EAttribute getImplementable_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.Implementable#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see wfwps.Implementable#getFunctionName()
	 * @see #getImplementable()
	 * @generated
	 */
	EAttribute getImplementable_FunctionName();

	/**
	 * Returns the meta object for class '{@link wfwps.WPS <em>WPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPS</em>'.
	 * @see wfwps.WPS
	 * @generated
	 */
	EClass getWPS();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WPS#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see wfwps.WPS#getInputs()
	 * @see #getWPS()
	 * @generated
	 */
	EReference getWPS_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WPS#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see wfwps.WPS#getOutputs()
	 * @see #getWPS()
	 * @generated
	 */
	EReference getWPS_Outputs();

	/**
	 * Returns the meta object for class '{@link wfwps.LocalWPS <em>Local WPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local WPS</em>'.
	 * @see wfwps.LocalWPS
	 * @generated
	 */
	EClass getLocalWPS();

	/**
	 * Returns the meta object for class '{@link wfwps.RemoteWPS <em>Remote WPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote WPS</em>'.
	 * @see wfwps.RemoteWPS
	 * @generated
	 */
	EClass getRemoteWPS();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.RemoteWPS#isIsVersion1 <em>Is Version1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Version1</em>'.
	 * @see wfwps.RemoteWPS#isIsVersion1()
	 * @see #getRemoteWPS()
	 * @generated
	 */
	EAttribute getRemoteWPS_IsVersion1();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.RemoteWPS#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see wfwps.RemoteWPS#getUrl()
	 * @see #getRemoteWPS()
	 * @generated
	 */
	EAttribute getRemoteWPS_Url();

	/**
	 * Returns the meta object for class '{@link wfwps.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see wfwps.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wfwps.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Type();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.Data#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see wfwps.Data#getLowerBound()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.Data#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see wfwps.Data#getUpperBound()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_UpperBound();

	/**
	 * Returns the meta object for class '{@link wfwps.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see wfwps.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.Input#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see wfwps.Input#isOptional()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Optional();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.Input#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see wfwps.Input#getDefaultValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_DefaultValue();

	/**
	 * Returns the meta object for the container reference '{@link wfwps.Input#getWps <em>Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Wps</em>'.
	 * @see wfwps.Input#getWps()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Wps();

	/**
	 * Returns the meta object for class '{@link wfwps.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see wfwps.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link wfwps.InputWorkflow <em>Input Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Workflow</em>'.
	 * @see wfwps.InputWorkflow
	 * @generated
	 */
	EClass getInputWorkflow();

	/**
	 * Returns the meta object for class '{@link wfwps.OutputWorkflow <em>Output Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Workflow</em>'.
	 * @see wfwps.OutputWorkflow
	 * @generated
	 */
	EClass getOutputWorkflow();

	/**
	 * Returns the meta object for class '{@link wfwps.WPSReference <em>WPS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPS Reference</em>'.
	 * @see wfwps.WPSReference
	 * @generated
	 */
	EClass getWPSReference();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WPSReference#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see wfwps.WPSReference#getInputs()
	 * @see #getWPSReference()
	 * @generated
	 */
	EReference getWPSReference_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WPSReference#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see wfwps.WPSReference#getOutputs()
	 * @see #getWPSReference()
	 * @generated
	 */
	EReference getWPSReference_Outputs();

	/**
	 * Returns the meta object for class '{@link wfwps.LocalWPSReference <em>Local WPS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local WPS Reference</em>'.
	 * @see wfwps.LocalWPSReference
	 * @generated
	 */
	EClass getLocalWPSReference();

	/**
	 * Returns the meta object for the reference '{@link wfwps.LocalWPSReference#getWps <em>Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wps</em>'.
	 * @see wfwps.LocalWPSReference#getWps()
	 * @see #getLocalWPSReference()
	 * @generated
	 */
	EReference getLocalWPSReference_Wps();

	/**
	 * Returns the meta object for class '{@link wfwps.RemoteWPSReference <em>Remote WPS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote WPS Reference</em>'.
	 * @see wfwps.RemoteWPSReference
	 * @generated
	 */
	EClass getRemoteWPSReference();

	/**
	 * Returns the meta object for the reference '{@link wfwps.RemoteWPSReference#getWps <em>Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wps</em>'.
	 * @see wfwps.RemoteWPSReference#getWps()
	 * @see #getRemoteWPSReference()
	 * @generated
	 */
	EReference getRemoteWPSReference_Wps();

	/**
	 * Returns the meta object for class '{@link wfwps.WorkflowReference <em>Workflow Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Reference</em>'.
	 * @see wfwps.WorkflowReference
	 * @generated
	 */
	EClass getWorkflowReference();

	/**
	 * Returns the meta object for the reference '{@link wfwps.WorkflowReference#getWps <em>Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wps</em>'.
	 * @see wfwps.WorkflowReference#getWps()
	 * @see #getWorkflowReference()
	 * @generated
	 */
	EReference getWorkflowReference_Wps();

	/**
	 * Returns the meta object for class '{@link wfwps.InputReference <em>Input Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Reference</em>'.
	 * @see wfwps.InputReference
	 * @generated
	 */
	EClass getInputReference();

	/**
	 * Returns the meta object for the reference '{@link wfwps.InputReference#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see wfwps.InputReference#getInput()
	 * @see #getInputReference()
	 * @generated
	 */
	EReference getInputReference_Input();

	/**
	 * Returns the meta object for class '{@link wfwps.OutputReference <em>Output Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Reference</em>'.
	 * @see wfwps.OutputReference
	 * @generated
	 */
	EClass getOutputReference();

	/**
	 * Returns the meta object for the reference '{@link wfwps.OutputReference#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see wfwps.OutputReference#getOutput()
	 * @see #getOutputReference()
	 * @generated
	 */
	EReference getOutputReference_Output();

	/**
	 * Returns the meta object for class '{@link wfwps.WorkFlow <em>Work Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Flow</em>'.
	 * @see wfwps.WorkFlow
	 * @generated
	 */
	EClass getWorkFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkFlow#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see wfwps.WorkFlow#getInputs()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkFlow#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see wfwps.WorkFlow#getOutputs()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkFlow#getWps <em>Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wps</em>'.
	 * @see wfwps.WorkFlow#getWps()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Wps();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkFlow#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see wfwps.WorkFlow#getLinks()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkFlow#getRemoteData <em>Remote Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remote Data</em>'.
	 * @see wfwps.WorkFlow#getRemoteData()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_RemoteData();

	/**
	 * Returns the meta object for the containment reference list '{@link wfwps.WorkFlow#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see wfwps.WorkFlow#getConstants()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Constants();

	/**
	 * Returns the meta object for class '{@link wfwps.InputLink <em>Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Link</em>'.
	 * @see wfwps.InputLink
	 * @generated
	 */
	EClass getInputLink();

	/**
	 * Returns the meta object for the reference list '{@link wfwps.InputLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see wfwps.InputLink#getLink()
	 * @see #getInputLink()
	 * @generated
	 */
	EReference getInputLink_Link();

	/**
	 * Returns the meta object for class '{@link wfwps.OutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Link</em>'.
	 * @see wfwps.OutputLink
	 * @generated
	 */
	EClass getOutputLink();

	/**
	 * Returns the meta object for the reference '{@link wfwps.OutputLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see wfwps.OutputLink#getLink()
	 * @see #getOutputLink()
	 * @generated
	 */
	EReference getOutputLink_Link();

	/**
	 * Returns the meta object for class '{@link wfwps.RemoteData <em>Remote Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Data</em>'.
	 * @see wfwps.RemoteData
	 * @generated
	 */
	EClass getRemoteData();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.RemoteData#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see wfwps.RemoteData#getUrl()
	 * @see #getRemoteData()
	 * @generated
	 */
	EAttribute getRemoteData_Url();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.RemoteData#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see wfwps.RemoteData#getLayer()
	 * @see #getRemoteData()
	 * @generated
	 */
	EAttribute getRemoteData_Layer();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.RemoteData#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see wfwps.RemoteData#getVersion()
	 * @see #getRemoteData()
	 * @generated
	 */
	EAttribute getRemoteData_Version();

	/**
	 * Returns the meta object for class '{@link wfwps.WMS <em>WMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WMS</em>'.
	 * @see wfwps.WMS
	 * @generated
	 */
	EClass getWMS();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see wfwps.WMS#getFormat()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_Format();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see wfwps.WMS#getHeight()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_Height();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see wfwps.WMS#getWidth()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_Width();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getSRS <em>SRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRS</em>'.
	 * @see wfwps.WMS#getSRS()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_SRS();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getBboxXmin <em>Bbox Xmin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox Xmin</em>'.
	 * @see wfwps.WMS#getBboxXmin()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_BboxXmin();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getBboxXmax <em>Bbox Xmax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox Xmax</em>'.
	 * @see wfwps.WMS#getBboxXmax()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_BboxXmax();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getBboxYmin <em>Bbox Ymin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox Ymin</em>'.
	 * @see wfwps.WMS#getBboxYmin()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_BboxYmin();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getBboxYmax <em>Bbox Ymax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox Ymax</em>'.
	 * @see wfwps.WMS#getBboxYmax()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_BboxYmax();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.WMS#getTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see wfwps.WMS#getTransparent()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_Transparent();

	/**
	 * Returns the meta object for the attribute list '{@link wfwps.WMS#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Styles</em>'.
	 * @see wfwps.WMS#getStyles()
	 * @see #getWMS()
	 * @generated
	 */
	EAttribute getWMS_Styles();

	/**
	 * Returns the meta object for class '{@link wfwps.WFS <em>WFS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WFS</em>'.
	 * @see wfwps.WFS
	 * @generated
	 */
	EClass getWFS();

	/**
	 * Returns the meta object for class '{@link wfwps.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see wfwps.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link wfwps.Link#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see wfwps.Link#getInput()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Input();

	/**
	 * Returns the meta object for the reference '{@link wfwps.Link#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see wfwps.Link#getOutput()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Output();

	/**
	 * Returns the meta object for class '{@link wfwps.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see wfwps.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link wfwps.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see wfwps.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wfwps.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link wfwps.DoubleConstant <em>Double Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Constant</em>'.
	 * @see wfwps.DoubleConstant
	 * @generated
	 */
	EClass getDoubleConstant();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.DoubleConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wfwps.DoubleConstant#getValue()
	 * @see #getDoubleConstant()
	 * @generated
	 */
	EAttribute getDoubleConstant_Value();

	/**
	 * Returns the meta object for class '{@link wfwps.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see wfwps.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wfwps.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link wfwps.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant</em>'.
	 * @see wfwps.BooleanConstant
	 * @generated
	 */
	EClass getBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.BooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wfwps.BooleanConstant#isValue()
	 * @see #getBooleanConstant()
	 * @generated
	 */
	EAttribute getBooleanConstant_Value();

	/**
	 * Returns the meta object for class '{@link wfwps.GeometryConstant <em>Geometry Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Constant</em>'.
	 * @see wfwps.GeometryConstant
	 * @generated
	 */
	EClass getGeometryConstant();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.GeometryConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wfwps.GeometryConstant#getValue()
	 * @see #getGeometryConstant()
	 * @generated
	 */
	EAttribute getGeometryConstant_Value();

	/**
	 * Returns the meta object for class '{@link wfwps.RasterConstant <em>Raster Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Constant</em>'.
	 * @see wfwps.RasterConstant
	 * @generated
	 */
	EClass getRasterConstant();

	/**
	 * Returns the meta object for the attribute '{@link wfwps.RasterConstant#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see wfwps.RasterConstant#getFileName()
	 * @see #getRasterConstant()
	 * @generated
	 */
	EAttribute getRasterConstant_FileName();

	/**
	 * Returns the meta object for enum '{@link wfwps.WPStype <em>WP Stype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WP Stype</em>'.
	 * @see wfwps.WPStype
	 * @generated
	 */
	EEnum getWPStype();

	/**
	 * Returns the meta object for enum '{@link wfwps.ImageFormatType <em>Image Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Format Type</em>'.
	 * @see wfwps.ImageFormatType
	 * @generated
	 */
	EEnum getImageFormatType();

	/**
	 * Returns the meta object for enum '{@link wfwps.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Type</em>'.
	 * @see wfwps.VersionType
	 * @generated
	 */
	EEnum getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WfwpsFactory getWfwpsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wfwps.impl.DescribedElementImpl <em>Described Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.DescribedElementImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getDescribedElement()
		 * @generated
		 */
		EClass DESCRIBED_ELEMENT = eINSTANCE.getDescribedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__NAME = eINSTANCE.getDescribedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__ABSTRACT = eINSTANCE.getDescribedElement_Abstract();

		/**
		 * The meta object literal for the '{@link wfwps.impl.WorkflowWpsImpl <em>Workflow Wps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.WorkflowWpsImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getWorkflowWps()
		 * @generated
		 */
		EClass WORKFLOW_WPS = eINSTANCE.getWorkflowWps();

		/**
		 * The meta object literal for the '<em><b>Local Wps Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_WPS__LOCAL_WPS_LIBRARY = eINSTANCE.getWorkflowWps_LocalWpsLibrary();

		/**
		 * The meta object literal for the '<em><b>Remote Wps Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_WPS__REMOTE_WPS_LIBRARY = eINSTANCE.getWorkflowWps_RemoteWpsLibrary();

		/**
		 * The meta object literal for the '<em><b>Wf Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_WPS__WF_LIBRARY = eINSTANCE.getWorkflowWps_WfLibrary();

		/**
		 * The meta object literal for the '{@link wfwps.impl.ImplementableImpl <em>Implementable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.ImplementableImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getImplementable()
		 * @generated
		 */
		EClass IMPLEMENTABLE = eINSTANCE.getImplementable();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTABLE__PACKAGE_NAME = eINSTANCE.getImplementable_PackageName();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTABLE__CLASS_NAME = eINSTANCE.getImplementable_ClassName();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTABLE__FUNCTION_NAME = eINSTANCE.getImplementable_FunctionName();

		/**
		 * The meta object literal for the '{@link wfwps.impl.WPSImpl <em>WPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.WPSImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getWPS()
		 * @generated
		 */
		EClass WPS = eINSTANCE.getWPS();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPS__INPUTS = eINSTANCE.getWPS_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPS__OUTPUTS = eINSTANCE.getWPS_Outputs();

		/**
		 * The meta object literal for the '{@link wfwps.impl.LocalWPSImpl <em>Local WPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.LocalWPSImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getLocalWPS()
		 * @generated
		 */
		EClass LOCAL_WPS = eINSTANCE.getLocalWPS();

		/**
		 * The meta object literal for the '{@link wfwps.impl.RemoteWPSImpl <em>Remote WPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.RemoteWPSImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getRemoteWPS()
		 * @generated
		 */
		EClass REMOTE_WPS = eINSTANCE.getRemoteWPS();

		/**
		 * The meta object literal for the '<em><b>Is Version1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_WPS__IS_VERSION1 = eINSTANCE.getRemoteWPS_IsVersion1();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_WPS__URL = eINSTANCE.getRemoteWPS_Url();

		/**
		 * The meta object literal for the '{@link wfwps.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.DataImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__LOWER_BOUND = eINSTANCE.getData_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__UPPER_BOUND = eINSTANCE.getData_UpperBound();

		/**
		 * The meta object literal for the '{@link wfwps.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.InputImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__OPTIONAL = eINSTANCE.getInput_Optional();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DEFAULT_VALUE = eINSTANCE.getInput_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Wps</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__WPS = eINSTANCE.getInput_Wps();

		/**
		 * The meta object literal for the '{@link wfwps.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.OutputImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link wfwps.impl.InputWorkflowImpl <em>Input Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.InputWorkflowImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getInputWorkflow()
		 * @generated
		 */
		EClass INPUT_WORKFLOW = eINSTANCE.getInputWorkflow();

		/**
		 * The meta object literal for the '{@link wfwps.impl.OutputWorkflowImpl <em>Output Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.OutputWorkflowImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getOutputWorkflow()
		 * @generated
		 */
		EClass OUTPUT_WORKFLOW = eINSTANCE.getOutputWorkflow();

		/**
		 * The meta object literal for the '{@link wfwps.impl.WPSReferenceImpl <em>WPS Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.WPSReferenceImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getWPSReference()
		 * @generated
		 */
		EClass WPS_REFERENCE = eINSTANCE.getWPSReference();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPS_REFERENCE__INPUTS = eINSTANCE.getWPSReference_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPS_REFERENCE__OUTPUTS = eINSTANCE.getWPSReference_Outputs();

		/**
		 * The meta object literal for the '{@link wfwps.impl.LocalWPSReferenceImpl <em>Local WPS Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.LocalWPSReferenceImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getLocalWPSReference()
		 * @generated
		 */
		EClass LOCAL_WPS_REFERENCE = eINSTANCE.getLocalWPSReference();

		/**
		 * The meta object literal for the '<em><b>Wps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_WPS_REFERENCE__WPS = eINSTANCE.getLocalWPSReference_Wps();

		/**
		 * The meta object literal for the '{@link wfwps.impl.RemoteWPSReferenceImpl <em>Remote WPS Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.RemoteWPSReferenceImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getRemoteWPSReference()
		 * @generated
		 */
		EClass REMOTE_WPS_REFERENCE = eINSTANCE.getRemoteWPSReference();

		/**
		 * The meta object literal for the '<em><b>Wps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_WPS_REFERENCE__WPS = eINSTANCE.getRemoteWPSReference_Wps();

		/**
		 * The meta object literal for the '{@link wfwps.impl.WorkflowReferenceImpl <em>Workflow Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.WorkflowReferenceImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getWorkflowReference()
		 * @generated
		 */
		EClass WORKFLOW_REFERENCE = eINSTANCE.getWorkflowReference();

		/**
		 * The meta object literal for the '<em><b>Wps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_REFERENCE__WPS = eINSTANCE.getWorkflowReference_Wps();

		/**
		 * The meta object literal for the '{@link wfwps.impl.InputReferenceImpl <em>Input Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.InputReferenceImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getInputReference()
		 * @generated
		 */
		EClass INPUT_REFERENCE = eINSTANCE.getInputReference();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_REFERENCE__INPUT = eINSTANCE.getInputReference_Input();

		/**
		 * The meta object literal for the '{@link wfwps.impl.OutputReferenceImpl <em>Output Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.OutputReferenceImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getOutputReference()
		 * @generated
		 */
		EClass OUTPUT_REFERENCE = eINSTANCE.getOutputReference();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_REFERENCE__OUTPUT = eINSTANCE.getOutputReference_Output();

		/**
		 * The meta object literal for the '{@link wfwps.impl.WorkFlowImpl <em>Work Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.WorkFlowImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getWorkFlow()
		 * @generated
		 */
		EClass WORK_FLOW = eINSTANCE.getWorkFlow();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__INPUTS = eINSTANCE.getWorkFlow_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__OUTPUTS = eINSTANCE.getWorkFlow_Outputs();

		/**
		 * The meta object literal for the '<em><b>Wps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__WPS = eINSTANCE.getWorkFlow_Wps();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__LINKS = eINSTANCE.getWorkFlow_Links();

		/**
		 * The meta object literal for the '<em><b>Remote Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__REMOTE_DATA = eINSTANCE.getWorkFlow_RemoteData();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__CONSTANTS = eINSTANCE.getWorkFlow_Constants();

		/**
		 * The meta object literal for the '{@link wfwps.impl.InputLinkImpl <em>Input Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.InputLinkImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getInputLink()
		 * @generated
		 */
		EClass INPUT_LINK = eINSTANCE.getInputLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_LINK__LINK = eINSTANCE.getInputLink_Link();

		/**
		 * The meta object literal for the '{@link wfwps.impl.OutputLinkImpl <em>Output Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.OutputLinkImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getOutputLink()
		 * @generated
		 */
		EClass OUTPUT_LINK = eINSTANCE.getOutputLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_LINK__LINK = eINSTANCE.getOutputLink_Link();

		/**
		 * The meta object literal for the '{@link wfwps.impl.RemoteDataImpl <em>Remote Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.RemoteDataImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getRemoteData()
		 * @generated
		 */
		EClass REMOTE_DATA = eINSTANCE.getRemoteData();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_DATA__URL = eINSTANCE.getRemoteData_Url();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_DATA__LAYER = eINSTANCE.getRemoteData_Layer();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_DATA__VERSION = eINSTANCE.getRemoteData_Version();

		/**
		 * The meta object literal for the '{@link wfwps.impl.WMSImpl <em>WMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.WMSImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getWMS()
		 * @generated
		 */
		EClass WMS = eINSTANCE.getWMS();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__FORMAT = eINSTANCE.getWMS_Format();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__HEIGHT = eINSTANCE.getWMS_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__WIDTH = eINSTANCE.getWMS_Width();

		/**
		 * The meta object literal for the '<em><b>SRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__SRS = eINSTANCE.getWMS_SRS();

		/**
		 * The meta object literal for the '<em><b>Bbox Xmin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__BBOX_XMIN = eINSTANCE.getWMS_BboxXmin();

		/**
		 * The meta object literal for the '<em><b>Bbox Xmax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__BBOX_XMAX = eINSTANCE.getWMS_BboxXmax();

		/**
		 * The meta object literal for the '<em><b>Bbox Ymin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__BBOX_YMIN = eINSTANCE.getWMS_BboxYmin();

		/**
		 * The meta object literal for the '<em><b>Bbox Ymax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__BBOX_YMAX = eINSTANCE.getWMS_BboxYmax();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__TRANSPARENT = eINSTANCE.getWMS_Transparent();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMS__STYLES = eINSTANCE.getWMS_Styles();

		/**
		 * The meta object literal for the '{@link wfwps.impl.WFSImpl <em>WFS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.WFSImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getWFS()
		 * @generated
		 */
		EClass WFS = eINSTANCE.getWFS();

		/**
		 * The meta object literal for the '{@link wfwps.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.LinkImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__INPUT = eINSTANCE.getLink_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__OUTPUT = eINSTANCE.getLink_Output();

		/**
		 * The meta object literal for the '{@link wfwps.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.ConstantImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link wfwps.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.IntegerConstantImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link wfwps.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.DoubleConstantImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getDoubleConstant()
		 * @generated
		 */
		EClass DOUBLE_CONSTANT = eINSTANCE.getDoubleConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_CONSTANT__VALUE = eINSTANCE.getDoubleConstant_Value();

		/**
		 * The meta object literal for the '{@link wfwps.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.StringConstantImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link wfwps.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.BooleanConstantImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getBooleanConstant()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

		/**
		 * The meta object literal for the '{@link wfwps.impl.GeometryConstantImpl <em>Geometry Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.GeometryConstantImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getGeometryConstant()
		 * @generated
		 */
		EClass GEOMETRY_CONSTANT = eINSTANCE.getGeometryConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_CONSTANT__VALUE = eINSTANCE.getGeometryConstant_Value();

		/**
		 * The meta object literal for the '{@link wfwps.impl.RasterConstantImpl <em>Raster Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.impl.RasterConstantImpl
		 * @see wfwps.impl.WfwpsPackageImpl#getRasterConstant()
		 * @generated
		 */
		EClass RASTER_CONSTANT = eINSTANCE.getRasterConstant();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_CONSTANT__FILE_NAME = eINSTANCE.getRasterConstant_FileName();

		/**
		 * The meta object literal for the '{@link wfwps.WPStype <em>WP Stype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.WPStype
		 * @see wfwps.impl.WfwpsPackageImpl#getWPStype()
		 * @generated
		 */
		EEnum WP_STYPE = eINSTANCE.getWPStype();

		/**
		 * The meta object literal for the '{@link wfwps.ImageFormatType <em>Image Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.ImageFormatType
		 * @see wfwps.impl.WfwpsPackageImpl#getImageFormatType()
		 * @generated
		 */
		EEnum IMAGE_FORMAT_TYPE = eINSTANCE.getImageFormatType();

		/**
		 * The meta object literal for the '{@link wfwps.VersionType <em>Version Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfwps.VersionType
		 * @see wfwps.impl.WfwpsPackageImpl#getVersionType()
		 * @generated
		 */
		EEnum VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //WfwpsPackage
