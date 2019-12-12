/**
 */
package wfwps.tests;

import junit.textui.TestRunner;

import wfwps.WfwpsFactory;
import wfwps.WorkflowReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workflow Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowReferenceTest extends WPSReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkflowReferenceTest.class);
	}

	/**
	 * Constructs a new Workflow Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Workflow Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkflowReference getFixture() {
		return (WorkflowReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfwpsFactory.eINSTANCE.createWorkflowReference());
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

} //WorkflowReferenceTest
