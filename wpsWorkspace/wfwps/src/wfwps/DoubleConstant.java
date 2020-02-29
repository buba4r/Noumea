/**
 */
package wfwps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.DoubleConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getDoubleConstant()
 * @model
 * @generated
 */
public interface DoubleConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see wfwps.WfwpsPackage#getDoubleConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link wfwps.DoubleConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // DoubleConstant
