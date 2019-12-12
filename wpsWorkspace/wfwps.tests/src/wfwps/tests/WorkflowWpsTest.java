/**
 */
package wfwps.tests;

import junit.textui.TestRunner;

import wfwps.WfwpsFactory;
import wfwps.WorkflowWps;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workflow Wps</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowWpsTest extends DescribedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkflowWpsTest.class);
	}

	/**
	 * Constructs a new Workflow Wps test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowWpsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Workflow Wps test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkflowWps getFixture() {
		return (WorkflowWps)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfwpsFactory.eINSTANCE.createWorkflowWps());
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

} //WorkflowWpsTest
