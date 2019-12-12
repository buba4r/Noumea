/**
 */
package wfwps.tests;

import junit.textui.TestRunner;

import wfwps.RemoteWPS;
import wfwps.WfwpsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remote WPS</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteWPSTest extends WPSTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoteWPSTest.class);
	}

	/**
	 * Constructs a new Remote WPS test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteWPSTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remote WPS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoteWPS getFixture() {
		return (RemoteWPS)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfwpsFactory.eINSTANCE.createRemoteWPS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RemoteWPSTest
