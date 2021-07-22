/**
 */
package relaciones1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import relaciones1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Relaciones1FactoryImpl extends EFactoryImpl implements Relaciones1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Relaciones1Factory init() {
		try {
			Relaciones1Factory theRelaciones1Factory = (Relaciones1Factory)EPackage.Registry.INSTANCE.getEFactory(Relaciones1Package.eNS_URI);
			if (theRelaciones1Factory != null) {
				return theRelaciones1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Relaciones1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relaciones1FactoryImpl() {
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
			case Relaciones1Package.MODEL_FACTORY: return createModelFactory();
			case Relaciones1Package.SINTAXIS_ABSTRACTA: return createSintaxisAbstracta();
			case Relaciones1Package.SINTAXIS_CONCRETA: return createSintaxisConcreta();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisAbstracta createSintaxisAbstracta() {
		SintaxisAbstractaImpl sintaxisAbstracta = new SintaxisAbstractaImpl();
		return sintaxisAbstracta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisConcreta createSintaxisConcreta() {
		SintaxisConcretaImpl sintaxisConcreta = new SintaxisConcretaImpl();
		return sintaxisConcreta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relaciones1Package getRelaciones1Package() {
		return (Relaciones1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Relaciones1Package getPackage() {
		return Relaciones1Package.eINSTANCE;
	}

} //Relaciones1FactoryImpl
