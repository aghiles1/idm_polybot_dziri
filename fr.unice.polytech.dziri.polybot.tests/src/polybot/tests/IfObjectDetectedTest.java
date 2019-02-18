/**
 */
package polybot.tests;

import junit.textui.TestRunner;

import polybot.IfObjectDetected;
import polybot.PolybotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Object Detected</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfObjectDetectedTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfObjectDetectedTest.class);
	}

	/**
	 * Constructs a new If Object Detected test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfObjectDetectedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this If Object Detected test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfObjectDetected getFixture() {
		return (IfObjectDetected)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolybotFactory.eINSTANCE.createIfObjectDetected());
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

} //IfObjectDetectedTest
