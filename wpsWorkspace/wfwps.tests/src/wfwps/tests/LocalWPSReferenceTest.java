/**
 */
package wfwps.tests;

import junit.textui.TestRunner;

import wfwps.LocalWPSReference;
import wfwps.WfwpsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local WPS Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalWPSReferenceTest extends WPSReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalWPSReferenceTest.class);
	}

	/**
	 * Constructs a new Local WPS Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalWPSReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Local WPS Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LocalWPSReference getFixture() {
		return (LocalWPSReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfwpsFactory.eINSTANCE.createLocalWPSReference());
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

} //LocalWPSReferenceTest
