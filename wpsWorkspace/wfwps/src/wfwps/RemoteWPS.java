/**
 */
package wfwps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote WPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.RemoteWPS#isIsVersion1 <em>Is Version1</em>}</li>
 *   <li>{@link wfwps.RemoteWPS#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getRemoteWPS()
 * @model
 * @generated
 */
public interface RemoteWPS extends WPS {
	/**
	 * Returns the value of the '<em><b>Is Version1</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Version1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Version1</em>' attribute.
	 * @see #setIsVersion1(boolean)
	 * @see wfwps.WfwpsPackage#getRemoteWPS_IsVersion1()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsVersion1();

	/**
	 * Sets the value of the '{@link wfwps.RemoteWPS#isIsVersion1 <em>Is Version1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Version1</em>' attribute.
	 * @see #isIsVersion1()
	 * @generated
	 */
	void setIsVersion1(boolean value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see wfwps.WfwpsPackage#getRemoteWPS_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link wfwps.RemoteWPS#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // RemoteWPS
