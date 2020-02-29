/**
 */
package wfwps.tests;

import junit.textui.TestRunner;

import wfwps.RemoteWPSReference;
import wfwps.WfwpsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remote WPS Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteWPSReferenceTest extends WPSReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoteWPSReferenceTest.class);
	}

	/**
	 * Constructs a new Remote WPS Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteWPSReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remote WPS Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoteWPSReference getFixture() {
		return (RemoteWPSReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfwpsFactory.eINSTANCE.createRemoteWPSReference());
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

} //RemoteWPSReferenceTest
