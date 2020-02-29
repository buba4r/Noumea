/**
 */
package wfwps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wfwps.Implementable#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link wfwps.Implementable#getClassName <em>Class Name</em>}</li>
 *   <li>{@link wfwps.Implementable#getFunctionName <em>Function Name</em>}</li>
 * </ul>
 *
 * @see wfwps.WfwpsPackage#getImplementable()
 * @model abstract="true"
 * @generated
 */
public interface Implementable extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * The default value is <code>"packageName"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see wfwps.WfwpsPackage#getImplementable_PackageName()
	 * @model default="packageName" required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link wfwps.Implementable#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"className"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see wfwps.WfwpsPackage#getImplementable_ClassName()
	 * @model default="className" required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link wfwps.Implementable#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * The default value is <code>"functionName"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see wfwps.WfwpsPackage#getImplementable_FunctionName()
	 * @model default="functionName" required="true"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link wfwps.Implementable#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

} // Implementable
