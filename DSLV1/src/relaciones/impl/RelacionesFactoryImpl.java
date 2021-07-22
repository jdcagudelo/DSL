/**
 */
package relaciones.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import relaciones.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelacionesFactoryImpl extends EFactoryImpl implements RelacionesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelacionesFactory init() {
		try {
			RelacionesFactory theRelacionesFactory = (RelacionesFactory)EPackage.Registry.INSTANCE.getEFactory(RelacionesPackage.eNS_URI);
			if (theRelacionesFactory != null) {
				return theRelacionesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelacionesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelacionesFactoryImpl() {
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
			case RelacionesPackage.MODEL_FACTORY: return createModelFactory();
			case RelacionesPackage.SINTAXIS_ABSTRACTA: return createSintaxisAbstracta();
			case RelacionesPackage.SINTAXIS_CONCRETA: return createSintaxisConcreta();
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
	public RelacionesPackage getRelacionesPackage() {
		return (RelacionesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelacionesPackage getPackage() {
		return RelacionesPackage.eINSTANCE;
	}

} //RelacionesFactoryImpl
