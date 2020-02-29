/**
 */
package wfwps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.WPS#getInputs <em>Inputs</em>}</li>
 *   <li>{@link wfwps.WPS#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getWPS()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='singleInputName singleOutputName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot singleInputName='inputs->forAll(i1 : Input, i2 : Input | i1 <> i2 implies i1.name <> i2.name)' singleOutputName='outputs->forAll(o1 : Output, o2 : Output | o1 <> o2 implies o1.name <> o2.name)'"
 * @generated
 */
public interface WPS extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.Input}.
	 * It is bidirectional and its opposite is '{@link wfwps.Input#getWps <em>Wps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWPS_Inputs()
	 * @see wfwps.Input#getWps
	 * @model opposite="wps" containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link wfwps.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see wfwps.WfwpsPackage#getWPS_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

} // WPS
