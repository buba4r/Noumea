/**
 */
package wfwps.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wfwps.RemoteWPS;
import wfwps.WfwpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote WPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wfwps.impl.RemoteWPSImpl#isIsVersion1 <em>Is Version1</em>}</li>
 *   <li>{@link wfwps.impl.RemoteWPSImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteWPSImpl extends WPSImpl implements RemoteWPS {
	/**
	 * The default value of the '{@link #isIsVersion1() <em>Is Version1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVersion1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VERSION1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVersion1() <em>Is Version1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVersion1()
	 * @generated
	 * @ordered
	 */
	protected boolean isVersion1 = IS_VERSION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteWPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfwpsPackage.Literals.REMOTE_WPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVersion1() {
		return isVersion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVersion1(boolean newIsVersion1) {
		boolean oldIsVersion1 = isVersion1;
		isVersion1 = newIsVersion1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.REMOTE_WPS__IS_VERSION1, oldIsVersion1, isVersion1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfwpsPackage.REMOTE_WPS__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WfwpsPackage.REMOTE_WPS__IS_VERSION1:
				return isIsVersion1();
			case WfwpsPackage.REMOTE_WPS__URL:
				return getUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WfwpsPackage.REMOTE_WPS__IS_VERSION1:
				setIsVersion1((Boolean)newValue);
				return;
			case WfwpsPackage.REMOTE_WPS__URL:
				setUrl((String)newValue);
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
			case WfwpsPackage.REMOTE_WPS__IS_VERSION1:
				setIsVersion1(IS_VERSION1_EDEFAULT);
				return;
			case WfwpsPackage.REMOTE_WPS__URL:
				setUrl(URL_EDEFAULT);
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
			case WfwpsPackage.REMOTE_WPS__IS_VERSION1:
				return isVersion1 != IS_VERSION1_EDEFAULT;
			case WfwpsPackage.REMOTE_WPS__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(" (isVersion1: ");
		result.append(isVersion1);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //RemoteWPSImpl
