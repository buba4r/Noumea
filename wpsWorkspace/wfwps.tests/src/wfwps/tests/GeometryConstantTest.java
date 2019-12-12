/**
 */
package wfwps.tests;

import junit.textui.TestRunner;

import wfwps.GeometryConstant;
import wfwps.WfwpsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Geometry Constant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometryConstantTest extends ConstantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeometryConstantTest.class);
	}

	/**
	 * Constructs a new Geometry Constant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryConstantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Geometry Constant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GeometryConstant getFixture() {
		return (GeometryConstant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfwpsFactory.eINSTANCE.createGeometryConstant());
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

} //GeometryConstantTest
