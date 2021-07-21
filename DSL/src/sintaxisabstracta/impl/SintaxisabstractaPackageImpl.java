/**
 */
package sintaxisabstracta.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import relaciones.RelacionesPackage;

import relaciones.impl.RelacionesPackageImpl;

import sintaxisabstracta.Campo;
import sintaxisabstracta.Cardinalidad;
import sintaxisabstracta.Cero;
import sintaxisabstracta.Ceromuchos;
import sintaxisabstracta.Cerouno;
import sintaxisabstracta.Date;
import sintaxisabstracta.Muchos;
import sintaxisabstracta.NewClass;
import sintaxisabstracta.Numeric;
import sintaxisabstracta.Relaciones;
import sintaxisabstracta.SintaxisabstractaFactory;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;
import sintaxisabstracta.Tipo_Dato;
import sintaxisabstracta.Uno;
import sintaxisabstracta.Unomuchos;

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
	private EClass cardinalidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipo_DatoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unomuchosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceromuchosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muchosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cerounoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newClassEClass = null;

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
	public EReference getTabla_Thecardinalidad() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_TheRelaciones() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_ThesintaxisConcreta() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(6);
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
	public EReference getCampo_TheTipo_Dato() {
		return (EReference)campoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalidad() {
		return cardinalidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalidad_Thetabla() {
		return (EReference)cardinalidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalidad_TheRelaciones() {
		return (EReference)cardinalidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipo_Dato() {
		return tipo_DatoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTipo_Dato_TheCampo() {
		return (EReference)tipo_DatoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumeric() {
		return numericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUno() {
		return unoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnomuchos() {
		return unomuchosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCero() {
		return ceroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeromuchos() {
		return ceromuchosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuchos() {
		return muchosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCerouno() {
		return cerounoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelaciones() {
		return relacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaciones_Tablarelacionada() {
		return (EReference)relacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaciones_TheTabla() {
		return (EReference)relacionesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaciones_TheCardinalidad() {
		return (EReference)relacionesEClass.getEStructuralFeatures().get(2);
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
		createEReference(tablaEClass, TABLA__THECARDINALIDAD);
		createEReference(tablaEClass, TABLA__THE_RELACIONES);
		createEReference(tablaEClass, TABLA__THESINTAXIS_CONCRETA);

		campoEClass = createEClass(CAMPO);
		createEAttribute(campoEClass, CAMPO__ETIQUETA);
		createEAttribute(campoEClass, CAMPO__CODIGO);
		createEReference(campoEClass, CAMPO__THE_TABLA);
		createEReference(campoEClass, CAMPO__THE_TIPO_DATO);

		cardinalidadEClass = createEClass(CARDINALIDAD);
		createEReference(cardinalidadEClass, CARDINALIDAD__THETABLA);
		createEReference(cardinalidadEClass, CARDINALIDAD__THE_RELACIONES);

		tipo_DatoEClass = createEClass(TIPO_DATO);
		createEReference(tipo_DatoEClass, TIPO_DATO__THE_CAMPO);

		stringEClass = createEClass(STRING);

		numericEClass = createEClass(NUMERIC);

		dateEClass = createEClass(DATE);

		unoEClass = createEClass(UNO);

		unomuchosEClass = createEClass(UNOMUCHOS);

		ceroEClass = createEClass(CERO);

		ceromuchosEClass = createEClass(CEROMUCHOS);

		muchosEClass = createEClass(MUCHOS);

		cerounoEClass = createEClass(CEROUNO);

		relacionesEClass = createEClass(RELACIONES);
		createEReference(relacionesEClass, RELACIONES__TABLARELACIONADA);
		createEReference(relacionesEClass, RELACIONES__THE_TABLA);
		createEReference(relacionesEClass, RELACIONES__THE_CARDINALIDAD);

		newClassEClass = createEClass(NEW_CLASS);
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
		stringEClass.getESuperTypes().add(this.getTipo_Dato());
		numericEClass.getESuperTypes().add(this.getTipo_Dato());
		dateEClass.getESuperTypes().add(this.getTipo_Dato());
		unoEClass.getESuperTypes().add(this.getCardinalidad());
		unomuchosEClass.getESuperTypes().add(this.getCardinalidad());
		ceroEClass.getESuperTypes().add(this.getCardinalidad());
		ceromuchosEClass.getESuperTypes().add(this.getCardinalidad());
		muchosEClass.getESuperTypes().add(this.getCardinalidad());
		cerounoEClass.getESuperTypes().add(this.getCardinalidad());

		// Initialize classes, features, and operations; add parameters
		initEClass(tablaEClass, Tabla.class, "Tabla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabla_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabla_Id(), ecorePackage.getEString(), "id", null, 0, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_TheCampo(), this.getCampo(), this.getCampo_TheTabla(), "theCampo", null, 1, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_ThesintaxisAbstracta(), theRelacionesPackage.getSintaxisAbstracta(), theRelacionesPackage.getSintaxisAbstracta_TheTabla(), "thesintaxisAbstracta", null, 0, 1, Tabla.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_Thecardinalidad(), this.getCardinalidad(), this.getCardinalidad_Thetabla(), "thecardinalidad", null, 1, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_TheRelaciones(), this.getRelaciones(), this.getRelaciones_TheTabla(), "theRelaciones", null, 1, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_ThesintaxisConcreta(), theRelacionesPackage.getSintaxisConcreta(), theRelacionesPackage.getSintaxisConcreta_TheTabla(), "thesintaxisConcreta", null, 0, 1, Tabla.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoEClass, Campo.class, "Campo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampo_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampo_Codigo(), ecorePackage.getEIntegerObject(), "codigo", null, 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampo_TheTabla(), this.getTabla(), this.getTabla_TheCampo(), "theTabla", null, 0, 1, Campo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampo_TheTipo_Dato(), this.getTipo_Dato(), this.getTipo_Dato_TheCampo(), "theTipo_Dato", null, 1, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalidadEClass, Cardinalidad.class, "Cardinalidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardinalidad_Thetabla(), this.getTabla(), this.getTabla_Thecardinalidad(), "thetabla", null, 0, 1, Cardinalidad.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardinalidad_TheRelaciones(), this.getRelaciones(), this.getRelaciones_TheCardinalidad(), "theRelaciones", null, 0, 1, Cardinalidad.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipo_DatoEClass, Tipo_Dato.class, "Tipo_Dato", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTipo_Dato_TheCampo(), this.getCampo(), this.getCampo_TheTipo_Dato(), "theCampo", null, 0, 1, Tipo_Dato.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringEClass, sintaxisabstracta.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericEClass, Numeric.class, "Numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unoEClass, Uno.class, "Uno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unomuchosEClass, Unomuchos.class, "Unomuchos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ceroEClass, Cero.class, "Cero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ceromuchosEClass, Ceromuchos.class, "Ceromuchos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(muchosEClass, Muchos.class, "Muchos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cerounoEClass, Cerouno.class, "Cerouno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relacionesEClass, Relaciones.class, "Relaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelaciones_Tablarelacionada(), this.getTabla(), null, "tablarelacionada", null, 0, 1, Relaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelaciones_TheTabla(), this.getTabla(), this.getTabla_TheRelaciones(), "theTabla", null, 0, 1, Relaciones.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelaciones_TheCardinalidad(), this.getCardinalidad(), this.getCardinalidad_TheRelaciones(), "theCardinalidad", null, 1, 1, Relaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newClassEClass, NewClass.class, "NewClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SintaxisabstractaPackageImpl
