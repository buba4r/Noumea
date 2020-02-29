/**
 */
package wfwps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wfwps.WfwpsPackage
 * @generated
 */
public interface WfwpsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WfwpsFactory eINSTANCE = wfwps.impl.WfwpsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow Wps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Wps</em>'.
	 * @generated
	 */
	WorkflowWps createWorkflowWps();

	/**
	 * Returns a new object of class '<em>Local WPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local WPS</em>'.
	 * @generated
	 */
	LocalWPS createLocalWPS();

	/**
	 * Returns a new object of class '<em>Remote WPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote WPS</em>'.
	 * @generated
	 */
	RemoteWPS createRemoteWPS();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Input Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Workflow</em>'.
	 * @generated
	 */
	InputWorkflow createInputWorkflow();

	/**
	 * Returns a new object of class '<em>Output Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Workflow</em>'.
	 * @generated
	 */
	OutputWorkflow createOutputWorkflow();

	/**
	 * Returns a new object of class '<em>Local WPS Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local WPS Reference</em>'.
	 * @generated
	 */
	LocalWPSReference createLocalWPSReference();

	/**
	 * Returns a new object of class '<em>Remote WPS Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote WPS Reference</em>'.
	 * @generated
	 */
	RemoteWPSReference createRemoteWPSReference();

	/**
	 * Returns a new object of class '<em>Workflow Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Reference</em>'.
	 * @generated
	 */
	WorkflowReference createWorkflowReference();

	/**
	 * Returns a new object of class '<em>Input Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Reference</em>'.
	 * @generated
	 */
	InputReference createInputReference();

	/**
	 * Returns a new object of class '<em>Output Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Reference</em>'.
	 * @generated
	 */
	OutputReference createOutputReference();

	/**
	 * Returns a new object of class '<em>Work Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Flow</em>'.
	 * @generated
	 */
	WorkFlow createWorkFlow();

	/**
	 * Returns a new object of class '<em>WMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WMS</em>'.
	 * @generated
	 */
	WMS createWMS();

	/**
	 * Returns a new object of class '<em>WFS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WFS</em>'.
	 * @generated
	 */
	WFS createWFS();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Constant</em>'.
	 * @generated
	 */
	IntegerConstant createIntegerConstant();

	/**
	 * Returns a new object of class '<em>Double Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Constant</em>'.
	 * @generated
	 */
	DoubleConstant createDoubleConstant();

	/**
	 * Returns a new object of class '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Constant</em>'.
	 * @generated
	 */
	StringConstant createStringConstant();

	/**
	 * Returns a new object of class '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Constant</em>'.
	 * @generated
	 */
	BooleanConstant createBooleanConstant();

	/**
	 * Returns a new object of class '<em>Geometry Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry Constant</em>'.
	 * @generated
	 */
	GeometryConstant createGeometryConstant();

	/**
	 * Returns a new object of class '<em>Raster Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Constant</em>'.
	 * @generated
	 */
	RasterConstant createRasterConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WfwpsPackage getWfwpsPackage();

} //WfwpsFactory
