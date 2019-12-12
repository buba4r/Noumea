/**
 */
package wfwps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.RemoteData#getUrl <em>Url</em>}</li>
 *   <li>{@link wfwps.RemoteData#getLayer <em>Layer</em>}</li>
 *   <li>{@link wfwps.RemoteData#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getRemoteData()
 * @model abstract="true"
 * @generated
 */
public interface RemoteData extends InputLink {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see wfwps.WfwpsPackage#getRemoteData_Url()
	 * @model default="" required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link wfwps.RemoteData#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' attribute.
	 * @see #setLayer(String)
	 * @see wfwps.WfwpsPackage#getRemoteData_Layer()
	 * @model
	 * @generated
	 */
	String getLayer();

	/**
	 * Sets the value of the '{@link wfwps.RemoteData#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"v1_1_1"</code>.
	 * The literals are from the enumeration {@link wfwps.VersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see wfwps.VersionType
	 * @see #setVersion(VersionType)
	 * @see wfwps.WfwpsPackage#getRemoteData_Version()
	 * @model default="v1_1_1" required="true"
	 * @generated
	 */
	VersionType getVersion();

	/**
	 * Sets the value of the '{@link wfwps.RemoteData#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see wfwps.VersionType
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionType value);

} // RemoteData
