/**
 */
package wfwps.tests;

import junit.textui.TestRunner;

import wfwps.BooleanConstant;
import wfwps.WfwpsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Constant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanConstantTest extends ConstantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanConstantTest.class);
	}

	/**
	 * Constructs a new Boolean Constant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConstantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Constant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanConstant getFixture() {
		return (BooleanConstant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfwpsFactory.eINSTANCE.createBooleanConstant());
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

} //BooleanConstantTest
