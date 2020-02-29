/**
 */
package wfwps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local WPS Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.LocalWPSReference#getWps <em>Wps</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getLocalWPSReference()
 * @model
 * @generated
 */
public interface LocalWPSReference extends WPSReference {
	/**
	 * Returns the value of the '<em><b>Wps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wps</em>' reference.
	 * @see #setWps(LocalWPS)
	 * @see wfwps.WfwpsPackage#getLocalWPSReference_Wps()
	 * @model required="true"
	 * @generated
	 */
	LocalWPS getWps();

	/**
	 * Sets the value of the '{@link wfwps.LocalWPSReference#getWps <em>Wps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wps</em>' reference.
	 * @see #getWps()
	 * @generated
	 */
	void setWps(LocalWPS value);

} // LocalWPSReference
