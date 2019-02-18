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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import polybot.Bot;
import polybot.Instruction;
import polybot.Point;
import polybot.PolybotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polybot.impl.BotImpl#getInitialPosition <em>Initial Position</em>}</li>
 *   <li>{@link polybot.impl.BotImpl#getInstructionList <em>Instruction List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BotImpl extends MinimalEObjectImpl.Container implements Bot {
	/**
	 * The cached value of the '{@link #getInitialPosition() <em>Initial Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPosition()
	 * @generated
	 * @ordered
	 */
	protected Point initialPosition;

	/**
	 * The cached value of the '{@link #getInstructionList() <em>Instruction List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructionList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolybotPackage.Literals.BOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getInitialPosition() {
		return initialPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialPosition(Point newInitialPosition, NotificationChain msgs) {
		Point oldInitialPosition = initialPosition;
		initialPosition = newInitialPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolybotPackage.BOT__INITIAL_POSITION, oldInitialPosition, newInitialPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPosition(Point newInitialPosition) {
		if (newInitialPosition != initialPosition) {
			NotificationChain msgs = null;
			if (initialPosition != null)
				msgs = ((InternalEObject)initialPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolybotPackage.BOT__INITIAL_POSITION, null, msgs);
			if (newInitialPosition != null)
				msgs = ((InternalEObject)newInitialPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolybotPackage.BOT__INITIAL_POSITION, null, msgs);
			msgs = basicSetInitialPosition(newInitialPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolybotPackage.BOT__INITIAL_POSITION, newInitialPosition, newInitialPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstructionList() {
		if (instructionList == null) {
			instructionList = new EObjectContainmentEList<Instruction>(Instruction.class, this, PolybotPackage.BOT__INSTRUCTION_LIST);
		}
		return instructionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolybotPackage.BOT__INITIAL_POSITION:
				return basicSetInitialPosition(null, msgs);
			case PolybotPackage.BOT__INSTRUCTION_LIST:
				return ((InternalEList<?>)getInstructionList()).basicRemove(otherEnd, msgs);
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
			case PolybotPackage.BOT__INITIAL_POSITION:
				return getInitialPosition();
			case PolybotPackage.BOT__INSTRUCTION_LIST:
				return getInstructionList();
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
			case PolybotPackage.BOT__INITIAL_POSITION:
				setInitialPosition((Point)newValue);
				return;
			case PolybotPackage.BOT__INSTRUCTION_LIST:
				getInstructionList().clear();
				getInstructionList().addAll((Collection<? extends Instruction>)newValue);
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
			case PolybotPackage.BOT__INITIAL_POSITION:
				setInitialPosition((Point)null);
				return;
			case PolybotPackage.BOT__INSTRUCTION_LIST:
				getInstructionList().clear();
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
			case PolybotPackage.BOT__INITIAL_POSITION:
				return initialPosition != null;
			case PolybotPackage.BOT__INSTRUCTION_LIST:
				return instructionList != null && !instructionList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BotImpl
