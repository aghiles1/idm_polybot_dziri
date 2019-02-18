/**
 */
package polybot.tests;

import junit.textui.TestRunner;

import polybot.GoTo;
import polybot.PolybotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Go To</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoToTest extends MoveTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GoToTest.class);
	}

	/**
	 * Constructs a new Go To test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoToTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Go To test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GoTo getFixture() {
		return (GoTo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolybotFactory.eINSTANCE.createGoTo());
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

} //GoToTest
