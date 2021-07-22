/**
 */
package sintaxisabstracta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see sintaxisabstracta.SintaxisabstractaFactory
 * @model kind="package"
 * @generated
 */
public interface SintaxisabstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sintaxisabstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sintaxisabstracta.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sintaxisabstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SintaxisabstractaPackage eINSTANCE = sintaxisabstracta.impl.SintaxisabstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.TablaImpl <em>Tabla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.TablaImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getTabla()
	 * @generated
	 */
	int TABLA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__ID = 1;

	/**
	 * The feature id for the '<em><b>The Campo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__THE_CAMPO = 2;

	/**
	 * The feature id for the '<em><b>Thesintaxis Abstracta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__THESINTAXIS_ABSTRACTA = 3;

	/**
	 * The feature id for the '<em><b>Thecardinalidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__THECARDINALIDAD = 4;

	/**
	 * The feature id for the '<em><b>Relaciones A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__RELACIONES_A = 5;

	/**
	 * The feature id for the '<em><b>Relaciones B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__RELACIONES_B = 6;

	/**
	 * The feature id for the '<em><b>Thesintaxis Concreta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__THESINTAXIS_CONCRETA = 7;

	/**
	 * The number of structural features of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.CampoImpl <em>Campo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.CampoImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCampo()
	 * @generated
	 */
	int CAMPO = 1;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__ETIQUETA = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>The Tabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__THE_TABLA = 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__TIPO = 3;

	/**
	 * The number of structural features of the '<em>Campo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Campo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.RelacionImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__MULTIPLICIDAD_A = 0;

	/**
	 * The feature id for the '<em><b>Multiplicidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__MULTIPLICIDAD_B = 1;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ROLE_A = 2;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ROLE_B = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ID = 5;

	/**
	 * The feature id for the '<em><b>Thesintaxis Abstracta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__THESINTAXIS_ABSTRACTA = 6;

	/**
	 * The feature id for the '<em><b>The Cardinalidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__THE_CARDINALIDAD = 7;

	/**
	 * The feature id for the '<em><b>Source Tabla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__SOURCE_TABLA = 8;

	/**
	 * The feature id for the '<em><b>Target Tabla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__TARGET_TABLA = 9;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.NewClassImpl <em>New Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.NewClassImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getNewClass()
	 * @generated
	 */
	int NEW_CLASS = 3;

	/**
	 * The number of structural features of the '<em>New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.Cardinalidad <em>Cardinalidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.Cardinalidad
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCardinalidad()
	 * @generated
	 */
	int CARDINALIDAD = 4;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.Tipo_Dato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.Tipo_Dato
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getTipo_Dato()
	 * @generated
	 */
	int TIPO_DATO = 5;


	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabla</em>'.
	 * @see sintaxisabstracta.Tabla
	 * @generated
	 */
	EClass getTabla();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Tabla#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see sintaxisabstracta.Tabla#getNombre()
	 * @see #getTabla()
	 * @generated
	 */
	EAttribute getTabla_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Tabla#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sintaxisabstracta.Tabla#getId()
	 * @see #getTabla()
	 * @generated
	 */
	EAttribute getTabla_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link sintaxisabstracta.Tabla#getTheCampo <em>The Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Campo</em>'.
	 * @see sintaxisabstracta.Tabla#getTheCampo()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_TheCampo();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.Tabla#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Thesintaxis Abstracta</em>'.
	 * @see sintaxisabstracta.Tabla#getThesintaxisAbstracta()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_ThesintaxisAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Tabla#getThecardinalidad <em>Thecardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thecardinalidad</em>'.
	 * @see sintaxisabstracta.Tabla#getThecardinalidad()
	 * @see #getTabla()
	 * @generated
	 */
	EAttribute getTabla_Thecardinalidad();

	/**
	 * Returns the meta object for the reference list '{@link sintaxisabstracta.Tabla#getRelacionesA <em>Relaciones A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relaciones A</em>'.
	 * @see sintaxisabstracta.Tabla#getRelacionesA()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_RelacionesA();

	/**
	 * Returns the meta object for the reference list '{@link sintaxisabstracta.Tabla#getRelacionesB <em>Relaciones B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relaciones B</em>'.
	 * @see sintaxisabstracta.Tabla#getRelacionesB()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_RelacionesB();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.Tabla#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Thesintaxis Concreta</em>'.
	 * @see sintaxisabstracta.Tabla#getThesintaxisConcreta()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_ThesintaxisConcreta();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Campo <em>Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campo</em>'.
	 * @see sintaxisabstracta.Campo
	 * @generated
	 */
	EClass getCampo();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Campo#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see sintaxisabstracta.Campo#getEtiqueta()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Campo#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see sintaxisabstracta.Campo#getCodigo()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_Codigo();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.Campo#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Tabla</em>'.
	 * @see sintaxisabstracta.Campo#getTheTabla()
	 * @see #getCampo()
	 * @generated
	 */
	EReference getCampo_TheTabla();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Campo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see sintaxisabstracta.Campo#getTipo()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_Tipo();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see sintaxisabstracta.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Relacion#getMultiplicidadA <em>Multiplicidad A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad A</em>'.
	 * @see sintaxisabstracta.Relacion#getMultiplicidadA()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_MultiplicidadA();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Relacion#getMultiplicidadB <em>Multiplicidad B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad B</em>'.
	 * @see sintaxisabstracta.Relacion#getMultiplicidadB()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_MultiplicidadB();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Relacion#getRoleA <em>Role A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role A</em>'.
	 * @see sintaxisabstracta.Relacion#getRoleA()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_RoleA();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Relacion#getRoleB <em>Role B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role B</em>'.
	 * @see sintaxisabstracta.Relacion#getRoleB()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_RoleB();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Relacion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sintaxisabstracta.Relacion#getName()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Name();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Relacion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sintaxisabstracta.Relacion#getId()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Id();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.Relacion#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Thesintaxis Abstracta</em>'.
	 * @see sintaxisabstracta.Relacion#getThesintaxisAbstracta()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_ThesintaxisAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Relacion#getTheCardinalidad <em>The Cardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Cardinalidad</em>'.
	 * @see sintaxisabstracta.Relacion#getTheCardinalidad()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_TheCardinalidad();

	/**
	 * Returns the meta object for the reference '{@link sintaxisabstracta.Relacion#getSourceTabla <em>Source Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Tabla</em>'.
	 * @see sintaxisabstracta.Relacion#getSourceTabla()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_SourceTabla();

	/**
	 * Returns the meta object for the reference '{@link sintaxisabstracta.Relacion#getTargetTabla <em>Target Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Tabla</em>'.
	 * @see sintaxisabstracta.Relacion#getTargetTabla()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_TargetTabla();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.NewClass <em>New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Class</em>'.
	 * @see sintaxisabstracta.NewClass
	 * @generated
	 */
	EClass getNewClass();

	/**
	 * Returns the meta object for enum '{@link sintaxisabstracta.Cardinalidad <em>Cardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinalidad</em>'.
	 * @see sintaxisabstracta.Cardinalidad
	 * @generated
	 */
	EEnum getCardinalidad();

	/**
	 * Returns the meta object for enum '{@link sintaxisabstracta.Tipo_Dato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see sintaxisabstracta.Tipo_Dato
	 * @generated
	 */
	EEnum getTipo_Dato();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SintaxisabstractaFactory getSintaxisabstractaFactory();

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
		 * The meta object literal for the '{@link sintaxisabstracta.impl.TablaImpl <em>Tabla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.TablaImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getTabla()
		 * @generated
		 */
		EClass TABLA = eINSTANCE.getTabla();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLA__NOMBRE = eINSTANCE.getTabla_Nombre();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLA__ID = eINSTANCE.getTabla_Id();

		/**
		 * The meta object literal for the '<em><b>The Campo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__THE_CAMPO = eINSTANCE.getTabla_TheCampo();

		/**
		 * The meta object literal for the '<em><b>Thesintaxis Abstracta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__THESINTAXIS_ABSTRACTA = eINSTANCE.getTabla_ThesintaxisAbstracta();

		/**
		 * The meta object literal for the '<em><b>Thecardinalidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLA__THECARDINALIDAD = eINSTANCE.getTabla_Thecardinalidad();

		/**
		 * The meta object literal for the '<em><b>Relaciones A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__RELACIONES_A = eINSTANCE.getTabla_RelacionesA();

		/**
		 * The meta object literal for the '<em><b>Relaciones B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__RELACIONES_B = eINSTANCE.getTabla_RelacionesB();

		/**
		 * The meta object literal for the '<em><b>Thesintaxis Concreta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__THESINTAXIS_CONCRETA = eINSTANCE.getTabla_ThesintaxisConcreta();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.CampoImpl <em>Campo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.CampoImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCampo()
		 * @generated
		 */
		EClass CAMPO = eINSTANCE.getCampo();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__ETIQUETA = eINSTANCE.getCampo_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__CODIGO = eINSTANCE.getCampo_Codigo();

		/**
		 * The meta object literal for the '<em><b>The Tabla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPO__THE_TABLA = eINSTANCE.getCampo_TheTabla();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__TIPO = eINSTANCE.getCampo_Tipo();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.RelacionImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__MULTIPLICIDAD_A = eINSTANCE.getRelacion_MultiplicidadA();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__MULTIPLICIDAD_B = eINSTANCE.getRelacion_MultiplicidadB();

		/**
		 * The meta object literal for the '<em><b>Role A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__ROLE_A = eINSTANCE.getRelacion_RoleA();

		/**
		 * The meta object literal for the '<em><b>Role B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__ROLE_B = eINSTANCE.getRelacion_RoleB();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__NAME = eINSTANCE.getRelacion_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__ID = eINSTANCE.getRelacion_Id();

		/**
		 * The meta object literal for the '<em><b>Thesintaxis Abstracta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__THESINTAXIS_ABSTRACTA = eINSTANCE.getRelacion_ThesintaxisAbstracta();

		/**
		 * The meta object literal for the '<em><b>The Cardinalidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__THE_CARDINALIDAD = eINSTANCE.getRelacion_TheCardinalidad();

		/**
		 * The meta object literal for the '<em><b>Source Tabla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__SOURCE_TABLA = eINSTANCE.getRelacion_SourceTabla();

		/**
		 * The meta object literal for the '<em><b>Target Tabla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__TARGET_TABLA = eINSTANCE.getRelacion_TargetTabla();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.NewClassImpl <em>New Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.NewClassImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getNewClass()
		 * @generated
		 */
		EClass NEW_CLASS = eINSTANCE.getNewClass();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.Cardinalidad <em>Cardinalidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.Cardinalidad
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCardinalidad()
		 * @generated
		 */
		EEnum CARDINALIDAD = eINSTANCE.getCardinalidad();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.Tipo_Dato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.Tipo_Dato
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getTipo_Dato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipo_Dato();

	}

} //SintaxisabstractaPackage
