/**
 */
package sintaxisabstracta.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import relaciones.RelacionesPackage;

import relaciones.impl.RelacionesPackageImpl;

import sintaxisabstracta.Campo;
import sintaxisabstracta.Cardinalidad;
import sintaxisabstracta.NewClass;
import sintaxisabstracta.Relacion;
import sintaxisabstracta.SintaxisabstractaFactory;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;
import sintaxisabstracta.Tipo_Dato;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SintaxisabstractaPackageImpl extends EPackageImpl implements SintaxisabstractaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipo_DatoEEnum = null;

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
	 * @see sintaxisabstracta.SintaxisabstractaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SintaxisabstractaPackageImpl() {
		super(eNS_URI, SintaxisabstractaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SintaxisabstractaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SintaxisabstractaPackage init() {
		if (isInited) return (SintaxisabstractaPackage)EPackage.Registry.INSTANCE.getEPackage(SintaxisabstractaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSintaxisabstractaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SintaxisabstractaPackageImpl theSintaxisabstractaPackage = registeredSintaxisabstractaPackage instanceof SintaxisabstractaPackageImpl ? (SintaxisabstractaPackageImpl)registeredSintaxisabstractaPackage : new SintaxisabstractaPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelacionesPackage.eNS_URI);
		RelacionesPackageImpl theRelacionesPackage = (RelacionesPackageImpl)(registeredPackage instanceof RelacionesPackageImpl ? registeredPackage : RelacionesPackage.eINSTANCE);

		// Create package meta-data objects
		theSintaxisabstractaPackage.createPackageContents();
		theRelacionesPackage.createPackageContents();

		// Initialize created meta-data
		theSintaxisabstractaPackage.initializePackageContents();
		theRelacionesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSintaxisabstractaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SintaxisabstractaPackage.eNS_URI, theSintaxisabstractaPackage);
		return theSintaxisabstractaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabla() {
		return tablaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabla_Nombre() {
		return (EAttribute)tablaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabla_Id() {
		return (EAttribute)tablaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_TheCampo() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_ThesintaxisAbstracta() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabla_Thecardinalidad() {
		return (EAttribute)tablaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_RelacionesA() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_RelacionesB() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_ThesintaxisConcreta() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampo() {
		return campoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_Etiqueta() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_Codigo() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampo_TheTabla() {
		return (EReference)campoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_Tipo() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacion() {
		return relacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_MultiplicidadA() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_MultiplicidadB() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_RoleA() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_RoleB() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Name() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Id() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_ThesintaxisAbstracta() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_TheCardinalidad() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_SourceTabla() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_TargetTabla() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewClass() {
		return newClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinalidad() {
		return cardinalidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipo_Dato() {
		return tipo_DatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisabstractaFactory getSintaxisabstractaFactory() {
		return (SintaxisabstractaFactory)getEFactoryInstance();
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
		tablaEClass = createEClass(TABLA);
		createEAttribute(tablaEClass, TABLA__NOMBRE);
		createEAttribute(tablaEClass, TABLA__ID);
		createEReference(tablaEClass, TABLA__THE_CAMPO);
		createEReference(tablaEClass, TABLA__THESINTAXIS_ABSTRACTA);
		createEAttribute(tablaEClass, TABLA__THECARDINALIDAD);
		createEReference(tablaEClass, TABLA__RELACIONES_A);
		createEReference(tablaEClass, TABLA__RELACIONES_B);
		createEReference(tablaEClass, TABLA__THESINTAXIS_CONCRETA);

		campoEClass = createEClass(CAMPO);
		createEAttribute(campoEClass, CAMPO__ETIQUETA);
		createEAttribute(campoEClass, CAMPO__CODIGO);
		createEReference(campoEClass, CAMPO__THE_TABLA);
		createEAttribute(campoEClass, CAMPO__TIPO);

		relacionEClass = createEClass(RELACION);
		createEAttribute(relacionEClass, RELACION__MULTIPLICIDAD_A);
		createEAttribute(relacionEClass, RELACION__MULTIPLICIDAD_B);
		createEAttribute(relacionEClass, RELACION__ROLE_A);
		createEAttribute(relacionEClass, RELACION__ROLE_B);
		createEAttribute(relacionEClass, RELACION__NAME);
		createEAttribute(relacionEClass, RELACION__ID);
		createEReference(relacionEClass, RELACION__THESINTAXIS_ABSTRACTA);
		createEAttribute(relacionEClass, RELACION__THE_CARDINALIDAD);
		createEReference(relacionEClass, RELACION__SOURCE_TABLA);
		createEReference(relacionEClass, RELACION__TARGET_TABLA);

		newClassEClass = createEClass(NEW_CLASS);

		// Create enums
		cardinalidadEEnum = createEEnum(CARDINALIDAD);
		tipo_DatoEEnum = createEEnum(TIPO_DATO);
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
		RelacionesPackage theRelacionesPackage = (RelacionesPackage)EPackage.Registry.INSTANCE.getEPackage(RelacionesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tablaEClass, Tabla.class, "Tabla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabla_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabla_Id(), ecorePackage.getEString(), "id", null, 0, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_TheCampo(), this.getCampo(), this.getCampo_TheTabla(), "theCampo", null, 1, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_ThesintaxisAbstracta(), theRelacionesPackage.getSintaxisAbstracta(), theRelacionesPackage.getSintaxisAbstracta_TheTabla(), "thesintaxisAbstracta", null, 0, 1, Tabla.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabla_Thecardinalidad(), this.getCardinalidad(), "thecardinalidad", null, 1, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_RelacionesA(), this.getRelacion(), this.getRelacion_SourceTabla(), "relacionesA", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_RelacionesB(), this.getRelacion(), this.getRelacion_TargetTabla(), "relacionesB", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_ThesintaxisConcreta(), theRelacionesPackage.getSintaxisConcreta(), theRelacionesPackage.getSintaxisConcreta_TheTabla(), "thesintaxisConcreta", null, 0, 1, Tabla.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoEClass, Campo.class, "Campo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampo_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampo_Codigo(), ecorePackage.getEIntegerObject(), "codigo", null, 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampo_TheTabla(), this.getTabla(), this.getTabla_TheCampo(), "theTabla", null, 0, 1, Campo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampo_Tipo(), this.getTipo_Dato(), "tipo", null, 1, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelacion_MultiplicidadA(), this.getCardinalidad(), "multiplicidadA", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_MultiplicidadB(), this.getCardinalidad(), "multiplicidadB", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_RoleA(), ecorePackage.getEString(), "roleA", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_RoleB(), ecorePackage.getEString(), "roleB", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Id(), ecorePackage.getEString(), "id", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_ThesintaxisAbstracta(), theRelacionesPackage.getSintaxisAbstracta(), theRelacionesPackage.getSintaxisAbstracta_ListaRelaciones(), "thesintaxisAbstracta", null, 0, 1, Relacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_TheCardinalidad(), this.getCardinalidad(), "theCardinalidad", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_SourceTabla(), this.getTabla(), this.getTabla_RelacionesA(), "sourceTabla", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_TargetTabla(), this.getTabla(), this.getTabla_RelacionesB(), "targetTabla", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newClassEClass, NewClass.class, "NewClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(cardinalidadEEnum, Cardinalidad.class, "Cardinalidad");
		addEEnumLiteral(cardinalidadEEnum, Cardinalidad.MUCHOS);

		initEEnum(tipo_DatoEEnum, Tipo_Dato.class, "Tipo_Dato");
		addEEnumLiteral(tipo_DatoEEnum, Tipo_Dato.STRING);
		addEEnumLiteral(tipo_DatoEEnum, Tipo_Dato.DATE);
		addEEnumLiteral(tipo_DatoEEnum, Tipo_Dato.NUMERIC);

		// Create resource
		createResource(eNS_URI);
	}

} //SintaxisabstractaPackageImpl
