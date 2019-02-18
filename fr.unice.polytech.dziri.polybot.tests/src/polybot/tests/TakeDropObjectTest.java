/**
 */
package polybot.tests;

import junit.textui.TestRunner;

import polybot.PolybotFactory;
import polybot.TakeDropObject;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Take Drop Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TakeDropObjectTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TakeDropObjectTest.class);
	}

	/**
	 * Constructs a new Take Drop Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TakeDropObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Take Drop Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TakeDropObject getFixture() {
		return (TakeDropObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolybotFactory.eINSTANCE.createTakeDropObject());
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

} //TakeDropObjectTest
