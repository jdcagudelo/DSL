/**
 */
package sintaxisabstracta.impl;

import modelofinal.ModelofinalPackage;

import modelofinal.impl.ModelofinalPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sintaxisabstracta.DataType;
import sintaxisabstracta.DocumentAtrtribute;
import sintaxisabstracta.Ocurrencia;
import sintaxisabstracta.Relacion;
import sintaxisabstracta.SintaxisabstractaFactory;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;

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
	private EClass documentAtrtributeEClass = null;

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
	private EEnum ocurrenciaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelofinalPackage.eNS_URI);
		ModelofinalPackageImpl theModelofinalPackage = (ModelofinalPackageImpl)(registeredPackage instanceof ModelofinalPackageImpl ? registeredPackage : ModelofinalPackage.eINSTANCE);

		// Create package meta-data objects
		theSintaxisabstractaPackage.createPackageContents();
		theModelofinalPackage.createPackageContents();

		// Initialize created meta-data
		theSintaxisabstractaPackage.initializePackageContents();
		theModelofinalPackage.initializePackageContents();

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
	public EAttribute getTabla_Codigo() {
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
	public EReference getTabla_RelacionesB() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(4);
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
	public EReference getTabla_Relacion() {
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
	public EClass getDocumentAtrtribute() {
		return documentAtrtributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentAtrtribute_Nombre() {
		return (EAttribute)documentAtrtributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentAtrtribute_Codigo() {
		return (EAttribute)documentAtrtributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentAtrtribute_TheTabla() {
		return (EReference)documentAtrtributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentAtrtribute_Tipo() {
		return (EAttribute)documentAtrtributeEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getRelacion_Nombre() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_MultiplicidadA() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_MultiplicidadB() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_TargetTabla() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_SourceTabla() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_ThesintaxisAbstracta() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOcurrencia() {
		return ocurrenciaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
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
		createEAttribute(tablaEClass, TABLA__CODIGO);
		createEReference(tablaEClass, TABLA__THE_CAMPO);
		createEReference(tablaEClass, TABLA__THESINTAXIS_ABSTRACTA);
		createEReference(tablaEClass, TABLA__RELACIONES_B);
		createEReference(tablaEClass, TABLA__RELACIONES_A);
		createEReference(tablaEClass, TABLA__RELACION);
		createEReference(tablaEClass, TABLA__THESINTAXIS_CONCRETA);

		documentAtrtributeEClass = createEClass(DOCUMENT_ATRTRIBUTE);
		createEAttribute(documentAtrtributeEClass, DOCUMENT_ATRTRIBUTE__NOMBRE);
		createEAttribute(documentAtrtributeEClass, DOCUMENT_ATRTRIBUTE__CODIGO);
		createEReference(documentAtrtributeEClass, DOCUMENT_ATRTRIBUTE__THE_TABLA);
		createEAttribute(documentAtrtributeEClass, DOCUMENT_ATRTRIBUTE__TIPO);

		relacionEClass = createEClass(RELACION);
		createEAttribute(relacionEClass, RELACION__NOMBRE);
		createEAttribute(relacionEClass, RELACION__MULTIPLICIDAD_A);
		createEAttribute(relacionEClass, RELACION__MULTIPLICIDAD_B);
		createEReference(relacionEClass, RELACION__TARGET_TABLA);
		createEReference(relacionEClass, RELACION__SOURCE_TABLA);
		createEReference(relacionEClass, RELACION__THESINTAXIS_ABSTRACTA);

		// Create enums
		ocurrenciaEEnum = createEEnum(OCURRENCIA);
		dataTypeEEnum = createEEnum(DATA_TYPE);
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
		ModelofinalPackage theModelofinalPackage = (ModelofinalPackage)EPackage.Registry.INSTANCE.getEPackage(ModelofinalPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tablaEClass, Tabla.class, "Tabla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabla_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabla_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_TheCampo(), this.getDocumentAtrtribute(), this.getDocumentAtrtribute_TheTabla(), "theCampo", null, 1, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_ThesintaxisAbstracta(), theModelofinalPackage.getSintaxisAbstracta(), theModelofinalPackage.getSintaxisAbstracta_TheTabla(), "thesintaxisAbstracta", null, 0, 1, Tabla.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_RelacionesB(), this.getRelacion(), this.getRelacion_TargetTabla(), "relacionesB", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_RelacionesA(), this.getRelacion(), this.getRelacion_SourceTabla(), "relacionesA", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_Relacion(), this.getRelacion(), null, "Relacion", null, 1, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_ThesintaxisConcreta(), theModelofinalPackage.getSintaxisConcreta(), theModelofinalPackage.getSintaxisConcreta_TheTabla(), "thesintaxisConcreta", null, 0, 1, Tabla.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentAtrtributeEClass, DocumentAtrtribute.class, "DocumentAtrtribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentAtrtribute_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, DocumentAtrtribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentAtrtribute_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, DocumentAtrtribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentAtrtribute_TheTabla(), this.getTabla(), this.getTabla_TheCampo(), "theTabla", null, 0, 1, DocumentAtrtribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentAtrtribute_Tipo(), this.getDataType(), "tipo", null, 1, 1, DocumentAtrtribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_MultiplicidadA(), this.getOcurrencia(), "multiplicidadA", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_MultiplicidadB(), this.getOcurrencia(), "multiplicidadB", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_TargetTabla(), this.getTabla(), this.getTabla_RelacionesB(), "targetTabla", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_SourceTabla(), this.getTabla(), this.getTabla_RelacionesA(), "sourceTabla", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_ThesintaxisAbstracta(), theModelofinalPackage.getSintaxisAbstracta(), theModelofinalPackage.getSintaxisAbstracta_ListaRelaciones(), "thesintaxisAbstracta", null, 0, 1, Relacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ocurrenciaEEnum, Ocurrencia.class, "Ocurrencia");
		addEEnumLiteral(ocurrenciaEEnum, Ocurrencia.MUCHOS);
		addEEnumLiteral(ocurrenciaEEnum, Ocurrencia.UNOOMUCHOS);
		addEEnumLiteral(ocurrenciaEEnum, Ocurrencia.CEROOMUCHOS);
		addEEnumLiteral(ocurrenciaEEnum, Ocurrencia.CEROOUNO);
		addEEnumLiteral(ocurrenciaEEnum, Ocurrencia.UNO);
		addEEnumLiteral(ocurrenciaEEnum, Ocurrencia.CERO);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE);
		addEEnumLiteral(dataTypeEEnum, DataType.NUMERIC);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //SintaxisabstractaPackageImpl
