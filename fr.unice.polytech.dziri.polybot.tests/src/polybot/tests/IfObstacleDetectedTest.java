/**
 */
package polybot.tests;

import junit.textui.TestRunner;

import polybot.IfObstacleDetected;
import polybot.PolybotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Obstacle Detected</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfObstacleDetectedTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfObstacleDetectedTest.class);
	}

	/**
	 * Constructs a new If Obstacle Detected test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfObstacleDetectedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this If Obstacle Detected test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfObstacleDetected getFixture() {
		return (IfObstacleDetected)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolybotFactory.eINSTANCE.createIfObstacleDetected());
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

} //IfObstacleDetectedTest
