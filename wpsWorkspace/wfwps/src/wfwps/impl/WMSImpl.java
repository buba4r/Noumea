/**
 */
package wfwps.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import wfwps.ImageFormatType;
import wfwps.WMS;
import wfwps.WfwpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wfwps.impl.WMSImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getSRS <em>SRS</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getBboxXmin <em>Bbox Xmin</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getBboxXmax <em>Bbox Xmax</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getBboxYmin <em>Bbox Ymin</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getBboxYmax <em>Bbox Ymax</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getTransparent <em>Transparent</em>}</li>
 *   <li>{@link wfwps.impl.WMSImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WMSImpl extends RemoteDataImpl implements WMS {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final ImageFormatType FORMAT_EDEFAULT = ImageFormatType.PNG;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected ImageFormatType format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 583;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 420;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSRS() <em>SRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRS()
	 * @generated
	 * @ordered
	 */
	protected static final String SRS_EDEFAULT = "EPSG:4326";

	/**
	 * The cached value of the '{@link #getSRS() <em>SRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRS()
	 * @generated
	 * @ordered
	 */
	protected String srs = SRS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBboxXmin() <em>Bbox Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBboxXmin()
	 * @generated
	 * @ordered
	 */
	protected static final double BBOX_XMIN_EDEFAULT = -131.13151509433965;

	/**
	 * The cached value of the '{@link #getBboxXmin() <em>Bbox Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBboxXmin()
	 * @generated
	 * @ordered
	 */
	protected double bboxXmin = BBOX_XMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBboxXmax() <em>Bbox Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBboxXmax()
	 * @generated
	 * @ordered
	 */
	protected static final double BBOX_XMAX_EDEFAULT = 46.60532747661736;

	/**
	 * The cached value of the '{@link #getBboxXmax() <em>Bbox Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBboxXmax()
	 * @generated
	 * @ordered
	 */
	protected double bboxXmax = BBOX_XMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBboxYmin() <em>Bbox Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBboxYmin()
	 * @generated
	 * @ordered
	 */
	protected static final double BBOX_YMIN_EDEFAULT = -117.61620566037737;

	/**
	 * The cached value of the '{@link #getBboxYmin() <em>Bbox Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBboxYmin()
	 * @generated
	 * @ordered
	 */
	protected double bboxYmin = BBOX_YMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBboxYmax() <em>Bbox Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBboxYmax()
	 * @generated
	 * @ordered
	 */
	protected static final double BBOX_YMAX_EDEFAULT = 56.34191403281659;

	/**
	 * The cached value of the '{@link #getBboxYmax() <em>Bbox Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBboxYmax()
	 * @generated
	 * @ordered
	 */
	protected double bboxYmax = BBOX_YMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransparent() <em>Transparent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRANSPARENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTransparent() <em>Transparent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparent()
	 * @generated
	 * @ordered
	 */
	protected Boolean transparent = TRANSPARENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> styles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfwpsPackage.Literals.WMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFormatType getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(ImageFormatType newFormat) {
		ImageFormatType oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSRS() {
		return srs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSRS(String newSRS) {
		String oldSRS = srs;
		srs = newSRS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__SRS, oldSRS, srs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBboxXmin() {
		return bboxXmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBboxXmin(double newBboxXmin) {
		double oldBboxXmin = bboxXmin;
		bboxXmin = newBboxXmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__BBOX_XMIN, oldBboxXmin, bboxXmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBboxXmax() {
		return bboxXmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBboxXmax(double newBboxXmax) {
		double oldBboxXmax = bboxXmax;
		bboxXmax = newBboxXmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__BBOX_XMAX, oldBboxXmax, bboxXmax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBboxYmin() {
		return bboxYmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBboxYmin(double newBboxYmin) {
		double oldBboxYmin = bboxYmin;
		bboxYmin = newBboxYmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__BBOX_YMIN, oldBboxYmin, bboxYmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBboxYmax() {
		return bboxYmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBboxYmax(double newBboxYmax) {
		double oldBboxYmax = bboxYmax;
		bboxYmax = newBboxYmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__BBOX_YMAX, oldBboxYmax, bboxYmax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTransparent() {
		return transparent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparent(Boolean newTransparent) {
		Boolean oldTransparent = transparent;
		transparent = newTransparent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.WMS__TRANSPARENT, oldTransparent, transparent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStyles() {
		if (styles == null) {
			styles = new EDataTypeUniqueEList<String>(String.class, this, WfwpsPackage.WMS__STYLES);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WfwpsPackage.WMS__FORMAT:
				return getFormat();
			case WfwpsPackage.WMS__HEIGHT:
				return getHeight();
			case WfwpsPackage.WMS__WIDTH:
				return getWidth();
			case WfwpsPackage.WMS__SRS:
				return getSRS();
			case WfwpsPackage.WMS__BBOX_XMIN:
				return getBboxXmin();
			case WfwpsPackage.WMS__BBOX_XMAX:
				return getBboxXmax();
			case WfwpsPackage.WMS__BBOX_YMIN:
				return getBboxYmin();
			case WfwpsPackage.WMS__BBOX_YMAX:
				return getBboxYmax();
			case WfwpsPackage.WMS__TRANSPARENT:
				return getTransparent();
			case WfwpsPackage.WMS__STYLES:
				return getStyles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WfwpsPackage.WMS__FORMAT:
				setFormat((ImageFormatType)newValue);
				return;
			case WfwpsPackage.WMS__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case WfwpsPackage.WMS__WIDTH:
				setWidth((Integer)newValue);
				return;
			case WfwpsPackage.WMS__SRS:
				setSRS((String)newValue);
				return;
			case WfwpsPackage.WMS__BBOX_XMIN:
				setBboxXmin((Double)newValue);
				return;
			case WfwpsPackage.WMS__BBOX_XMAX:
				setBboxXmax((Double)newValue);
				return;
			case WfwpsPackage.WMS__BBOX_YMIN:
				setBboxYmin((Double)newValue);
				return;
			case WfwpsPackage.WMS__BBOX_YMAX:
				setBboxYmax((Double)newValue);
				return;
			case WfwpsPackage.WMS__TRANSPARENT:
				setTransparent((Boolean)newValue);
				return;
			case WfwpsPackage.WMS__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WfwpsPackage.WMS__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case WfwpsPackage.WMS__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WfwpsPackage.WMS__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WfwpsPackage.WMS__SRS:
				setSRS(SRS_EDEFAULT);
				return;
			case WfwpsPackage.WMS__BBOX_XMIN:
				setBboxXmin(BBOX_XMIN_EDEFAULT);
				return;
			case WfwpsPackage.WMS__BBOX_XMAX:
				setBboxXmax(BBOX_XMAX_EDEFAULT);
				return;
			case WfwpsPackage.WMS__BBOX_YMIN:
				setBboxYmin(BBOX_YMIN_EDEFAULT);
				return;
			case WfwpsPackage.WMS__BBOX_YMAX:
				setBboxYmax(BBOX_YMAX_EDEFAULT);
				return;
			case WfwpsPackage.WMS__TRANSPARENT:
				setTransparent(TRANSPARENT_EDEFAULT);
				return;
			case WfwpsPackage.WMS__STYLES:
				getStyles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WfwpsPackage.WMS__FORMAT:
				return format != FORMAT_EDEFAULT;
			case WfwpsPackage.WMS__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WfwpsPackage.WMS__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WfwpsPackage.WMS__SRS:
				return SRS_EDEFAULT == null ? srs != null : !SRS_EDEFAULT.equals(srs);
			case WfwpsPackage.WMS__BBOX_XMIN:
				return bboxXmin != BBOX_XMIN_EDEFAULT;
			case WfwpsPackage.WMS__BBOX_XMAX:
				return bboxXmax != BBOX_XMAX_EDEFAULT;
			case WfwpsPackage.WMS__BBOX_YMIN:
				return bboxYmin != BBOX_YMIN_EDEFAULT;
			case WfwpsPackage.WMS__BBOX_YMAX:
				return bboxYmax != BBOX_YMAX_EDEFAULT;
			case WfwpsPackage.WMS__TRANSPARENT:
				return TRANSPARENT_EDEFAULT == null ? transparent != null : !TRANSPARENT_EDEFAULT.equals(transparent);
			case WfwpsPackage.WMS__STYLES:
				return styles != null && !styles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (format: ");
		result.append(format);
		result.append(", height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(", SRS: ");
		result.append(srs);
		result.append(", bboxXmin: ");
		result.append(bboxXmin);
		result.append(", bboxXmax: ");
		result.append(bboxXmax);
		result.append(", bboxYmin: ");
		result.append(bboxYmin);
		result.append(", bboxYmax: ");
		result.append(bboxYmax);
		result.append(", transparent: ");
		result.append(transparent);
		result.append(", styles: ");
		result.append(styles);
		result.append(')');
		return result.toString();
	}

} //WMSImpl
