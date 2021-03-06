/**
 */
package polybot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Object Detected</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polybot.IfObjectDetected#getListOfInstructions <em>List Of Instructions</em>}</li>
 * </ul>
 *
 * @see polybot.PolybotPackage#getIfObjectDetected()
 * @model
 * @generated
 */
public interface IfObjectDetected extends Instruction {
	/**
	 * Returns the value of the '<em><b>List Of Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link polybot.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Instructions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Instructions</em>' containment reference list.
	 * @see polybot.PolybotPackage#getIfObjectDetected_ListOfInstructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getListOfInstructions();

} // IfObjectDetected
