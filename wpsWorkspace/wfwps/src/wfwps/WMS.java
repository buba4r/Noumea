/**
 */
package wfwps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.WMS#getFormat <em>Format</em>}</li>
 *   <li>{@link wfwps.WMS#getHeight <em>Height</em>}</li>
 *   <li>{@link wfwps.WMS#getWidth <em>Width</em>}</li>
 *   <li>{@link wfwps.WMS#getSRS <em>SRS</em>}</li>
 *   <li>{@link wfwps.WMS#getBboxXmin <em>Bbox Xmin</em>}</li>
 *   <li>{@link wfwps.WMS#getBboxXmax <em>Bbox Xmax</em>}</li>
 *   <li>{@link wfwps.WMS#getBboxYmin <em>Bbox Ymin</em>}</li>
 *   <li>{@link wfwps.WMS#getBboxYmax <em>Bbox Ymax</em>}</li>
 *   <li>{@link wfwps.WMS#getTransparent <em>Transparent</em>}</li>
 *   <li>{@link wfwps.WMS#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getWMS()
 * @model
 * @generated
 */
public interface WMS extends RemoteData {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"png"</code>.
	 * The literals are from the enumeration {@link wfwps.ImageFormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see wfwps.ImageFormatType
	 * @see #setFormat(ImageFormatType)
	 * @see wfwps.WfwpsPackage#getWMS_Format()
	 * @model default="png" required="true"
	 * @generated
	 */
	ImageFormatType getFormat();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see wfwps.ImageFormatType
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(ImageFormatType value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"583"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see wfwps.WfwpsPackage#getWMS_Height()
	 * @model default="583" required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"420"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see wfwps.WfwpsPackage#getWMS_Width()
	 * @model default="420" required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>SRS</b></em>' attribute.
	 * The default value is <code>"EPSG:4326"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SRS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SRS</em>' attribute.
	 * @see #setSRS(String)
	 * @see wfwps.WfwpsPackage#getWMS_SRS()
	 * @model default="EPSG:4326" required="true"
	 * @generated
	 */
	String getSRS();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getSRS <em>SRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRS</em>' attribute.
	 * @see #getSRS()
	 * @generated
	 */
	void setSRS(String value);

	/**
	 * Returns the value of the '<em><b>Bbox Xmin</b></em>' attribute.
	 * The default value is <code>"-131.13151509433965"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bbox Xmin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbox Xmin</em>' attribute.
	 * @see #setBboxXmin(double)
	 * @see wfwps.WfwpsPackage#getWMS_BboxXmin()
	 * @model default="-131.13151509433965" required="true"
	 * @generated
	 */
	double getBboxXmin();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getBboxXmin <em>Bbox Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbox Xmin</em>' attribute.
	 * @see #getBboxXmin()
	 * @generated
	 */
	void setBboxXmin(double value);

	/**
	 * Returns the value of the '<em><b>Bbox Xmax</b></em>' attribute.
	 * The default value is <code>"46.60532747661736"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bbox Xmax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbox Xmax</em>' attribute.
	 * @see #setBboxXmax(double)
	 * @see wfwps.WfwpsPackage#getWMS_BboxXmax()
	 * @model default="46.60532747661736" required="true"
	 * @generated
	 */
	double getBboxXmax();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getBboxXmax <em>Bbox Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbox Xmax</em>' attribute.
	 * @see #getBboxXmax()
	 * @generated
	 */
	void setBboxXmax(double value);

	/**
	 * Returns the value of the '<em><b>Bbox Ymin</b></em>' attribute.
	 * The default value is <code>"-117.61620566037737"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bbox Ymin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbox Ymin</em>' attribute.
	 * @see #setBboxYmin(double)
	 * @see wfwps.WfwpsPackage#getWMS_BboxYmin()
	 * @model default="-117.61620566037737" required="true"
	 * @generated
	 */
	double getBboxYmin();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getBboxYmin <em>Bbox Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbox Ymin</em>' attribute.
	 * @see #getBboxYmin()
	 * @generated
	 */
	void setBboxYmin(double value);

	/**
	 * Returns the value of the '<em><b>Bbox Ymax</b></em>' attribute.
	 * The default value is <code>"56.34191403281659"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bbox Ymax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbox Ymax</em>' attribute.
	 * @see #setBboxYmax(double)
	 * @see wfwps.WfwpsPackage#getWMS_BboxYmax()
	 * @model default="56.34191403281659" required="true"
	 * @generated
	 */
	double getBboxYmax();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getBboxYmax <em>Bbox Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbox Ymax</em>' attribute.
	 * @see #getBboxYmax()
	 * @generated
	 */
	void setBboxYmax(double value);

	/**
	 * Returns the value of the '<em><b>Transparent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparent</em>' attribute.
	 * @see #setTransparent(Boolean)
	 * @see wfwps.WfwpsPackage#getWMS_Transparent()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getTransparent();

	/**
	 * Sets the value of the '{@link wfwps.WMS#getTransparent <em>Transparent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparent</em>' attribute.
	 * @see #getTransparent()
	 * @generated
	 */
	void setTransparent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' attribute list.
	 * @see wfwps.WfwpsPackage#getWMS_Styles()
	 * @model
	 * @generated
	 */
	EList<String> getStyles();

} // WMS
