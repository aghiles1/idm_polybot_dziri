/**
 */
package polybot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polybot.Bot#getInitialPosition <em>Initial Position</em>}</li>
 *   <li>{@link polybot.Bot#getInstructionList <em>Instruction List</em>}</li>
 * </ul>
 *
 * @see polybot.PolybotPackage#getBot()
 * @model
 * @generated
 */
public interface Bot extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Position</em>' containment reference.
	 * @see #setInitialPosition(Point)
	 * @see polybot.PolybotPackage#getBot_InitialPosition()
	 * @model containment="true"
	 * @generated
	 */
	Point getInitialPosition();

	/**
	 * Sets the value of the '{@link polybot.Bot#getInitialPosition <em>Initial Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Position</em>' containment reference.
	 * @see #getInitialPosition()
	 * @generated
	 */
	void setInitialPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Instruction List</b></em>' containment reference list.
	 * The list contents are of type {@link polybot.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction List</em>' containment reference list.
	 * @see polybot.PolybotPackage#getBot_InstructionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructionList();

} // Bot
