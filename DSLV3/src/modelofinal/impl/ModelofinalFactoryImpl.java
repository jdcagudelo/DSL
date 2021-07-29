/**
 */
package modelofinal.impl;

import modelofinal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelofinalFactoryImpl extends EFactoryImpl implements ModelofinalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelofinalFactory init() {
		try {
			ModelofinalFactory theModelofinalFactory = (ModelofinalFactory)EPackage.Registry.INSTANCE.getEFactory(ModelofinalPackage.eNS_URI);
			if (theModelofinalFactory != null) {
				return theModelofinalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelofinalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelofinalFactoryImpl() {
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
			case ModelofinalPackage.MODEL_FACTORY: return createModelFactory();
			case ModelofinalPackage.SINTAXIS_ABSTRACTA: return createSintaxisAbstracta();
			case ModelofinalPackage.SINTAXIS_CONCRETA: return createSintaxisConcreta();
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
	public ModelofinalPackage getModelofinalPackage() {
		return (ModelofinalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelofinalPackage getPackage() {
		return ModelofinalPackage.eINSTANCE;
	}

} //ModelofinalFactoryImpl
