/**
 */
package polybot;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polybot.While#getNb <em>Nb</em>}</li>
 *   <li>{@link polybot.While#getListOfInstructions <em>List Of Instructions</em>}</li>
 * </ul>
 *
 * @see polybot.PolybotPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Instruction {
	/**
	 * Returns the value of the '<em><b>Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb</em>' attribute.
	 * @see #setNb(int)
	 * @see polybot.PolybotPackage#getWhile_Nb()
	 * @model
	 * @generated
	 */
	int getNb();

	/**
	 * Sets the value of the '{@link polybot.While#getNb <em>Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb</em>' attribute.
	 * @see #getNb()
	 * @generated
	 */
	void setNb(int value);

	/**
	 * Returns the value of the '<em><b>List Of Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link polybot.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Instructions</em>' containment reference list.
	 * @see polybot.PolybotPackage#getWhile_ListOfInstructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getListOfInstructions();

} // While
