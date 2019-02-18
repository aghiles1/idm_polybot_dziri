/**
 */
package polybot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import polybot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolybotFactoryImpl extends EFactoryImpl implements PolybotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolybotFactory init() {
		try {
			PolybotFactory thePolybotFactory = (PolybotFactory)EPackage.Registry.INSTANCE.getEFactory(PolybotPackage.eNS_URI);
			if (thePolybotFactory != null) {
				return thePolybotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolybotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolybotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PolybotPackage.BOT: return createBot();
			case PolybotPackage.POINT: return createPoint();
			case PolybotPackage.GO_TO: return createGoTo();
			case PolybotPackage.RIGHT: return createRight();
			case PolybotPackage.LEFT: return createLeft();
			case PolybotPackage.REVERSE: return createReverse();
			case PolybotPackage.FORWARD: return createForward();
			case PolybotPackage.IF_OBJECT_DETECTED: return createIfObjectDetected();
			case PolybotPackage.IF_OBSTACLE_DETECTED: return createIfObstacleDetected();
			case PolybotPackage.TAKE_DROP_OBJECT: return createTakeDropObject();
			case PolybotPackage.WHILE: return createWhile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bot createBot() {
		BotImpl bot = new BotImpl();
		return bot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTo createGoTo() {
		GoToImpl goTo = new GoToImpl();
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Left createLeft() {
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reverse createReverse() {
		ReverseImpl reverse = new ReverseImpl();
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfObjectDetected createIfObjectDetected() {
		IfObjectDetectedImpl ifObjectDetected = new IfObjectDetectedImpl();
		return ifObjectDetected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfObstacleDetected createIfObstacleDetected() {
		IfObstacleDetectedImpl ifObstacleDetected = new IfObstacleDetectedImpl();
		return ifObstacleDetected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TakeDropObject createTakeDropObject() {
		TakeDropObjectImpl takeDropObject = new TakeDropObjectImpl();
		return takeDropObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolybotPackage getPolybotPackage() {
		return (PolybotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolybotPackage getPackage() {
		return PolybotPackage.eINSTANCE;
	}

} //PolybotFactoryImpl
