/**
 */
package polybot.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import polybot.Instruction;
import polybot.PolybotPackage;
import polybot.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polybot.impl.WhileImpl#getNb <em>Nb</em>}</li>
 *   <li>{@link polybot.impl.WhileImpl#getListOfInstructions <em>List Of Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileImpl extends InstructionImpl implements While {
	/**
	 * The default value of the '{@link #getNb() <em>Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNb()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNb() <em>Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNb()
	 * @generated
	 * @ordered
	 */
	protected int nb = NB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListOfInstructions() <em>List Of Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> listOfInstructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolybotPackage.Literals.WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNb() {
		return nb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNb(int newNb) {
		int oldNb = nb;
		nb = newNb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolybotPackage.WHILE__NB, oldNb, nb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getListOfInstructions() {
		if (listOfInstructions == null) {
			listOfInstructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, PolybotPackage.WHILE__LIST_OF_INSTRUCTIONS);
		}
		return listOfInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolybotPackage.WHILE__LIST_OF_INSTRUCTIONS:
				return ((InternalEList<?>)getListOfInstructions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolybotPackage.WHILE__NB:
				return getNb();
			case PolybotPackage.WHILE__LIST_OF_INSTRUCTIONS:
				return getListOfInstructions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PolybotPackage.WHILE__NB:
				setNb((Integer)newValue);
				return;
			case PolybotPackage.WHILE__LIST_OF_INSTRUCTIONS:
				getListOfInstructions().clear();
				getListOfInstructions().addAll((Collection<? extends Instruction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PolybotPackage.WHILE__NB:
				setNb(NB_EDEFAULT);
				return;
			case PolybotPackage.WHILE__LIST_OF_INSTRUCTIONS:
				getListOfInstructions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PolybotPackage.WHILE__NB:
				return nb != NB_EDEFAULT;
			case PolybotPackage.WHILE__LIST_OF_INSTRUCTIONS:
				return listOfInstructions != null && !listOfInstructions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nb: ");
		result.append(nb);
		result.append(')');
		return result.toString();
	}

} //WhileImpl
