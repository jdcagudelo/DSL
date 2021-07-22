/**
 */
package relaciones;

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
 * @see relaciones.RelacionesFactory
 * @model kind="package"
 * @generated
 */
public interface RelacionesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relaciones";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///relaciones.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relaciones";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelacionesPackage eINSTANCE = relaciones.impl.RelacionesPackageImpl.init();

	/**
	 * The meta object id for the '{@link relaciones.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relaciones.impl.ModelFactoryImpl
	 * @see relaciones.impl.RelacionesPackageImpl#getModelFactory()
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
	 * The meta object id for the '{@link relaciones.impl.SintaxisAbstractaImpl <em>Sintaxis Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relaciones.impl.SintaxisAbstractaImpl
	 * @see relaciones.impl.RelacionesPackageImpl#getSintaxisAbstracta()
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
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_ABSTRACTA__LISTA_RELACIONES = 3;

	/**
	 * The number of structural features of the '<em>Sintaxis Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_ABSTRACTA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sintaxis Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTAXIS_ABSTRACTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relaciones.impl.SintaxisConcretaImpl <em>Sintaxis Concreta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relaciones.impl.SintaxisConcretaImpl
	 * @see relaciones.impl.RelacionesPackageImpl#getSintaxisConcreta()
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
	 * Returns the meta object for class '{@link relaciones.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see relaciones.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link relaciones.ModelFactory#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thesintaxis Abstracta</em>'.
	 * @see relaciones.ModelFactory#getThesintaxisAbstracta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ThesintaxisAbstracta();

	/**
	 * Returns the meta object for the containment reference '{@link relaciones.ModelFactory#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thesintaxis Concreta</em>'.
	 * @see relaciones.ModelFactory#getThesintaxisConcreta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ThesintaxisConcreta();

	/**
	 * Returns the meta object for class '{@link relaciones.SintaxisAbstracta <em>Sintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sintaxis Abstracta</em>'.
	 * @see relaciones.SintaxisAbstracta
	 * @generated
	 */
	EClass getSintaxisAbstracta();

	/**
	 * Returns the meta object for the container reference '{@link relaciones.SintaxisAbstracta#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see relaciones.SintaxisAbstracta#getTheModelFactory()
	 * @see #getSintaxisAbstracta()
	 * @generated
	 */
	EReference getSintaxisAbstracta_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link relaciones.SintaxisAbstracta#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Tabla</em>'.
	 * @see relaciones.SintaxisAbstracta#getTheTabla()
	 * @see #getSintaxisAbstracta()
	 * @generated
	 */
	EReference getSintaxisAbstracta_TheTabla();

	/**
	 * Returns the meta object for the reference list '{@link relaciones.SintaxisAbstracta#getSintaxisAbstracta <em>Sintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sintaxis Abstracta</em>'.
	 * @see relaciones.SintaxisAbstracta#getSintaxisAbstracta()
	 * @see #getSintaxisAbstracta()
	 * @generated
	 */
	EReference getSintaxisAbstracta_SintaxisAbstracta();

	/**
	 * Returns the meta object for the containment reference list '{@link relaciones.SintaxisAbstracta#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see relaciones.SintaxisAbstracta#getListaRelaciones()
	 * @see #getSintaxisAbstracta()
	 * @generated
	 */
	EReference getSintaxisAbstracta_ListaRelaciones();

	/**
	 * Returns the meta object for class '{@link relaciones.SintaxisConcreta <em>Sintaxis Concreta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sintaxis Concreta</em>'.
	 * @see relaciones.SintaxisConcreta
	 * @generated
	 */
	EClass getSintaxisConcreta();

	/**
	 * Returns the meta object for the container reference '{@link relaciones.SintaxisConcreta#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see relaciones.SintaxisConcreta#getTheModelFactory()
	 * @see #getSintaxisConcreta()
	 * @generated
	 */
	EReference getSintaxisConcreta_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link relaciones.SintaxisConcreta#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Tabla</em>'.
	 * @see relaciones.SintaxisConcreta#getTheTabla()
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
	RelacionesFactory getRelacionesFactory();

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
		 * The meta object literal for the '{@link relaciones.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relaciones.impl.ModelFactoryImpl
		 * @see relaciones.impl.RelacionesPackageImpl#getModelFactory()
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
		 * The meta object literal for the '{@link relaciones.impl.SintaxisAbstractaImpl <em>Sintaxis Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relaciones.impl.SintaxisAbstractaImpl
		 * @see relaciones.impl.RelacionesPackageImpl#getSintaxisAbstracta()
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
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINTAXIS_ABSTRACTA__LISTA_RELACIONES = eINSTANCE.getSintaxisAbstracta_ListaRelaciones();

		/**
		 * The meta object literal for the '{@link relaciones.impl.SintaxisConcretaImpl <em>Sintaxis Concreta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relaciones.impl.SintaxisConcretaImpl
		 * @see relaciones.impl.RelacionesPackageImpl#getSintaxisConcreta()
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

} //RelacionesPackage
