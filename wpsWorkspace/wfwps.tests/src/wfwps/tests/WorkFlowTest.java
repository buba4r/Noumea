/**
 */
package wfwps.tests;

import junit.textui.TestRunner;

import wfwps.WfwpsFactory;
import wfwps.WorkFlow;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkFlowTest extends DescribedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkFlowTest.class);
	}

	/**
	 * Constructs a new Work Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkFlow getFixture() {
		return (WorkFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfwpsFactory.eINSTANCE.createWorkFlow());
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

} //WorkFlowTest
