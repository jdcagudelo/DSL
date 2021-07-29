/**
 */
package modelofinal.impl;

import modelofinal.ModelFactory;
import modelofinal.ModelofinalFactory;
import modelofinal.ModelofinalPackage;
import modelofinal.SintaxisAbstracta;
import modelofinal.SintaxisConcreta;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sintaxisabstracta.SintaxisabstractaPackage;

import sintaxisabstracta.impl.SintaxisabstractaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelofinalPackageImpl extends EPackageImpl implements ModelofinalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sintaxisAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sintaxisConcretaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modelofinal.ModelofinalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelofinalPackageImpl() {
		super(eNS_URI, ModelofinalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModelofinalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelofinalPackage init() {
		if (isInited) return (ModelofinalPackage)EPackage.Registry.INSTANCE.getEPackage(ModelofinalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelofinalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelofinalPackageImpl theModelofinalPackage = registeredModelofinalPackage instanceof ModelofinalPackageImpl ? (ModelofinalPackageImpl)registeredModelofinalPackage : new ModelofinalPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SintaxisabstractaPackage.eNS_URI);
		SintaxisabstractaPackageImpl theSintaxisabstractaPackage = (SintaxisabstractaPackageImpl)(registeredPackage instanceof SintaxisabstractaPackageImpl ? registeredPackage : SintaxisabstractaPackage.eINSTANCE);

		// Create package meta-data objects
		theModelofinalPackage.createPackageContents();
		theSintaxisabstractaPackage.createPackageContents();

		// Initialize created meta-data
		theModelofinalPackage.initializePackageContents();
		theSintaxisabstractaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelofinalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelofinalPackage.eNS_URI, theModelofinalPackage);
		return theModelofinalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ThesintaxisAbstracta() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ThesintaxisConcreta() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSintaxisAbstracta() {
		return sintaxisAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSintaxisAbstracta_TheModelFactory() {
		return (EReference)sintaxisAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSintaxisAbstracta_TheTabla() {
		return (EReference)sintaxisAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSintaxisAbstracta_SintaxisAbstracta() {
		return (EReference)sintaxisAbstractaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSintaxisAbstracta_ListaRelaciones() {
		return (EReference)sintaxisAbstractaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSintaxisConcreta() {
		return sintaxisConcretaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSintaxisConcreta_TheModelFactory() {
		return (EReference)sintaxisConcretaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSintaxisConcreta_TheTabla() {
		return (EReference)sintaxisConcretaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelofinalFactory getModelofinalFactory() {
		return (ModelofinalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEReference(modelFactoryEClass, MODEL_FACTORY__THESINTAXIS_ABSTRACTA);
		createEReference(modelFactoryEClass, MODEL_FACTORY__THESINTAXIS_CONCRETA);

		sintaxisAbstractaEClass = createEClass(SINTAXIS_ABSTRACTA);
		createEReference(sintaxisAbstractaEClass, SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY);
		createEReference(sintaxisAbstractaEClass, SINTAXIS_ABSTRACTA__THE_TABLA);
		createEReference(sintaxisAbstractaEClass, SINTAXIS_ABSTRACTA__SINTAXIS_ABSTRACTA);
		createEReference(sintaxisAbstractaEClass, SINTAXIS_ABSTRACTA__LISTA_RELACIONES);

		sintaxisConcretaEClass = createEClass(SINTAXIS_CONCRETA);
		createEReference(sintaxisConcretaEClass, SINTAXIS_CONCRETA__THE_MODEL_FACTORY);
		createEReference(sintaxisConcretaEClass, SINTAXIS_CONCRETA__THE_TABLA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SintaxisabstractaPackage theSintaxisabstractaPackage = (SintaxisabstractaPackage)EPackage.Registry.INSTANCE.getEPackage(SintaxisabstractaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactory_ThesintaxisAbstracta(), this.getSintaxisAbstracta(), this.getSintaxisAbstracta_TheModelFactory(), "thesintaxisAbstracta", null, 1, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ThesintaxisConcreta(), this.getSintaxisConcreta(), this.getSintaxisConcreta_TheModelFactory(), "thesintaxisConcreta", null, 1, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sintaxisAbstractaEClass, SintaxisAbstracta.class, "SintaxisAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSintaxisAbstracta_TheModelFactory(), this.getModelFactory(), this.getModelFactory_ThesintaxisAbstracta(), "theModelFactory", null, 0, 1, SintaxisAbstracta.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSintaxisAbstracta_TheTabla(), theSintaxisabstractaPackage.getTabla(), theSintaxisabstractaPackage.getTabla_ThesintaxisAbstracta(), "theTabla", null, 0, -1, SintaxisAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSintaxisAbstracta_SintaxisAbstracta(), this.getSintaxisAbstracta(), null, "SintaxisAbstracta", null, 0, -1, SintaxisAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSintaxisAbstracta_ListaRelaciones(), theSintaxisabstractaPackage.getRelacion(), theSintaxisabstractaPackage.getRelacion_ThesintaxisAbstracta(), "ListaRelaciones", null, 0, -1, SintaxisAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sintaxisConcretaEClass, SintaxisConcreta.class, "SintaxisConcreta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSintaxisConcreta_TheModelFactory(), this.getModelFactory(), this.getModelFactory_ThesintaxisConcreta(), "theModelFactory", null, 0, 1, SintaxisConcreta.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSintaxisConcreta_TheTabla(), theSintaxisabstractaPackage.getTabla(), theSintaxisabstractaPackage.getTabla_ThesintaxisConcreta(), "theTabla", null, 0, -1, SintaxisConcreta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelofinalPackageImpl
