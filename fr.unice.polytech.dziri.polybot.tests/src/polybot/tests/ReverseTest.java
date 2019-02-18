/**
 */
package polybot.tests;

import junit.textui.TestRunner;

import polybot.PolybotFactory;
import polybot.Reverse;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reverse</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReverseTest extends MoveTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReverseTest.class);
	}

	/**
	 * Constructs a new Reverse test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReverseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reverse test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Reverse getFixture() {
		return (Reverse)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolybotFactory.eINSTANCE.createReverse());
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

} //ReverseTest
