/**
 */
package relaciones1;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see relaciones1.Relaciones1Factory
 * @model kind="package"
 * @generated
 */
public interface Relaciones1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relaciones1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///relaciones1.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relaciones1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Relaciones1Package eINSTANCE = relaciones1.impl.Relaciones1PackageImpl.init();

	/**
	 * The meta object id for the '{@link relaciones1.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relaciones1.impl.ModelFactoryImpl
	 * @see relaciones1.impl.Relaciones1PackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Thesintaxis Abstracta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__THESINTAXIS_ABSTRACTA = 0;

	/**
	 * The feature id for the '<em><b>Thesintaxis Concreta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__THESINTAXIS_CONCRETA = 1;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relaciones1.impl.SintaxisAbstractaImpl <em>Sintaxis Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relaciones1.impl.SintaxisAbstractaImpl
	 * @see relaciones1.impl.Relaciones1PackageImpl#getSintaxisAbstracta()
	 * @generated
	 */
	int SINTAXIS_ABSTRACTA = 1;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The Tabla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_ABSTRACTA__THE_TABLA = 1;

	/**
	 * The feature id for the '<em><b>Sintaxis Abstracta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_ABSTRACTA__SINTAXIS_ABSTRACTA = 2;

	/**
	 * The number of structural features of the '<em>Sintaxis Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_ABSTRACTA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sintaxis Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_ABSTRACTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relaciones1.impl.SintaxisConcretaImpl <em>Sintaxis Concreta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relaciones1.impl.SintaxisConcretaImpl
	 * @see relaciones1.impl.Relaciones1PackageImpl#getSintaxisConcreta()
	 * @generated
	 */
	int SINTAXIS_CONCRETA = 2;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_CONCRETA__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The Tabla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_CONCRETA__THE_TABLA = 1;

	/**
	 * The number of structural features of the '<em>Sintaxis Concreta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_CONCRETA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sintaxis Concreta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_CONCRETA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link relaciones1.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see relaciones1.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link relaciones1.ModelFactory#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thesintaxis Abstracta</em>'.
	 * @see relaciones1.ModelFactory#getThesintaxisAbstracta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ThesintaxisAbstracta();

	/**
	 * Returns the meta object for the containment reference '{@link relaciones1.ModelFactory#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thesintaxis Concreta</em>'.
	 * @see relaciones1.ModelFactory#getThesintaxisConcreta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ThesintaxisConcreta();

	/**
	 * Returns the meta object for class '{@link relaciones1.SintaxisAbstracta <em>Sintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sintaxis Abstracta</em>'.
	 * @see relaciones1.SintaxisAbstracta
	 * @generated
	 */
	EClass getSintaxisAbstracta();

	/**
	 * Returns the meta object for the container reference '{@link relaciones1.SintaxisAbstracta#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see relaciones1.SintaxisAbstracta#getTheModelFactory()
	 * @see #getSintaxisAbstracta()
	 * @generated
	 */
	EReference getSintaxisAbstracta_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link relaciones1.SintaxisAbstracta#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Tabla</em>'.
	 * @see relaciones1.SintaxisAbstracta#getTheTabla()
	 * @see #getSintaxisAbstracta()
	 * @generated
	 */
	EReference getSintaxisAbstracta_TheTabla();

	/**
	 * Returns the meta object for the reference list '{@link relaciones1.SintaxisAbstracta#getSintaxisAbstracta <em>Sintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sintaxis Abstracta</em>'.
	 * @see relaciones1.SintaxisAbstracta#getSintaxisAbstracta()
	 * @see #getSintaxisAbstracta()
	 * @generated
	 */
	EReference getSintaxisAbstracta_SintaxisAbstracta();

	/**
	 * Returns the meta object for class '{@link relaciones1.SintaxisConcreta <em>Sintaxis Concreta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sintaxis Concreta</em>'.
	 * @see relaciones1.SintaxisConcreta
	 * @generated
	 */
	EClass getSintaxisConcreta();

	/**
	 * Returns the meta object for the container reference '{@link relaciones1.SintaxisConcreta#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see relaciones1.SintaxisConcreta#getTheModelFactory()
	 * @see #getSintaxisConcreta()
	 * @generated
	 */
	EReference getSintaxisConcreta_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link relaciones1.SintaxisConcreta#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Tabla</em>'.
	 * @see relaciones1.SintaxisConcreta#getTheTabla()
	 * @see #getSintaxisConcreta()
	 * @generated
	 */
	EReference getSintaxisConcreta_TheTabla();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Relaciones1Factory getRelaciones1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link relaciones1.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relaciones1.impl.ModelFactoryImpl
		 * @see relaciones1.impl.Relaciones1PackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Thesintaxis Abstracta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__THESINTAXIS_ABSTRACTA = eINSTANCE.getModelFactory_ThesintaxisAbstracta();

		/**
		 * The meta object literal for the '<em><b>Thesintaxis Concreta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__THESINTAXIS_CONCRETA = eINSTANCE.getModelFactory_ThesintaxisConcreta();

		/**
		 * The meta object literal for the '{@link relaciones1.impl.SintaxisAbstractaImpl <em>Sintaxis Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relaciones1.impl.SintaxisAbstractaImpl
		 * @see relaciones1.impl.Relaciones1PackageImpl#getSintaxisAbstracta()
		 * @generated
		 */
		EClass SINTAXIS_ABSTRACTA = eINSTANCE.getSintaxisAbstracta();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY = eINSTANCE.getSintaxisAbstracta_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>The Tabla</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINTAXIS_ABSTRACTA__THE_TABLA = eINSTANCE.getSintaxisAbstracta_TheTabla();

		/**
		 * The meta object literal for the '<em><b>Sintaxis Abstracta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINTAXIS_ABSTRACTA__SINTAXIS_ABSTRACTA = eINSTANCE.getSintaxisAbstracta_SintaxisAbstracta();

		/**
		 * The meta object literal for the '{@link relaciones1.impl.SintaxisConcretaImpl <em>Sintaxis Concreta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relaciones1.impl.SintaxisConcretaImpl
		 * @see relaciones1.impl.Relaciones1PackageImpl#getSintaxisConcreta()
		 * @generated
		 */
		EClass SINTAXIS_CONCRETA = eINSTANCE.getSintaxisConcreta();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINTAXIS_CONCRETA__THE_MODEL_FACTORY = eINSTANCE.getSintaxisConcreta_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>The Tabla</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINTAXIS_CONCRETA__THE_TABLA = eINSTANCE.getSintaxisConcreta_TheTabla();

	}

} //Relaciones1Package
