/**
 */
package polybot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import polybot.Bot;
import polybot.PolybotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BotTest extends TestCase {

	/**
	 * The fixture for this Bot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BotTest.class);
	}

	/**
	 * Constructs a new Bot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Bot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bot getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolybotFactory.eINSTANCE.createBot());
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

} //BotTest
