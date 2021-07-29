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
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__CODIGO = 1;

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
	 * The feature id for the '<em><b>Relaciones B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__RELACIONES_B = 4;

	/**
	 * The feature id for the '<em><b>Relaciones A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__RELACIONES_A = 5;

	/**
	 * The feature id for the '<em><b>Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__RELACION = 6;

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
	 * The meta object id for the '{@link sintaxisabstracta.impl.DocumentAtrtributeImpl <em>Document Atrtribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.DocumentAtrtributeImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getDocumentAtrtribute()
	 * @generated
	 */
	int DOCUMENT_ATRTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATRTRIBUTE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATRTRIBUTE__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>The Tabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATRTRIBUTE__THE_TABLA = 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATRTRIBUTE__TIPO = 3;

	/**
	 * The number of structural features of the '<em>Document Atrtribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATRTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Atrtribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATRTRIBUTE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Multiplicidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__MULTIPLICIDAD_A = 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__MULTIPLICIDAD_B = 2;

	/**
	 * The feature id for the '<em><b>Target Tabla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__TARGET_TABLA = 3;

	/**
	 * The feature id for the '<em><b>Source Tabla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__SOURCE_TABLA = 4;

	/**
	 * The feature id for the '<em><b>Thesintaxis Abstracta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__THESINTAXIS_ABSTRACTA = 5;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.Ocurrencia <em>Ocurrencia</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.Ocurrencia
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getOcurrencia()
	 * @generated
	 */
	int OCURRENCIA = 3;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.DataType
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 4;


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
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Tabla#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see sintaxisabstracta.Tabla#getCodigo()
	 * @see #getTabla()
	 * @generated
	 */
	EAttribute getTabla_Codigo();

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
	 * Returns the meta object for the containment reference list '{@link sintaxisabstracta.Tabla#getRelacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relacion</em>'.
	 * @see sintaxisabstracta.Tabla#getRelacion()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Relacion();

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
	 * Returns the meta object for class '{@link sintaxisabstracta.DocumentAtrtribute <em>Document Atrtribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Atrtribute</em>'.
	 * @see sintaxisabstracta.DocumentAtrtribute
	 * @generated
	 */
	EClass getDocumentAtrtribute();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.DocumentAtrtribute#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see sintaxisabstracta.DocumentAtrtribute#getNombre()
	 * @see #getDocumentAtrtribute()
	 * @generated
	 */
	EAttribute getDocumentAtrtribute_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.DocumentAtrtribute#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see sintaxisabstracta.DocumentAtrtribute#getCodigo()
	 * @see #getDocumentAtrtribute()
	 * @generated
	 */
	EAttribute getDocumentAtrtribute_Codigo();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.DocumentAtrtribute#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Tabla</em>'.
	 * @see sintaxisabstracta.DocumentAtrtribute#getTheTabla()
	 * @see #getDocumentAtrtribute()
	 * @generated
	 */
	EReference getDocumentAtrtribute_TheTabla();

	/**
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.DocumentAtrtribute#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see sintaxisabstracta.DocumentAtrtribute#getTipo()
	 * @see #getDocumentAtrtribute()
	 * @generated
	 */
	EAttribute getDocumentAtrtribute_Tipo();

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
	 * Returns the meta object for the attribute '{@link sintaxisabstracta.Relacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see sintaxisabstracta.Relacion#getNombre()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Nombre();

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
	 * Returns the meta object for enum '{@link sintaxisabstracta.Ocurrencia <em>Ocurrencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ocurrencia</em>'.
	 * @see sintaxisabstracta.Ocurrencia
	 * @generated
	 */
	EEnum getOcurrencia();

	/**
	 * Returns the meta object for enum '{@link sintaxisabstracta.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see sintaxisabstracta.DataType
	 * @generated
	 */
	EEnum getDataType();

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
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLA__CODIGO = eINSTANCE.getTabla_Codigo();

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
		 * The meta object literal for the '<em><b>Relaciones B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__RELACIONES_B = eINSTANCE.getTabla_RelacionesB();

		/**
		 * The meta object literal for the '<em><b>Relaciones A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__RELACIONES_A = eINSTANCE.getTabla_RelacionesA();

		/**
		 * The meta object literal for the '<em><b>Relacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__RELACION = eINSTANCE.getTabla_Relacion();

		/**
		 * The meta object literal for the '<em><b>Thesintaxis Concreta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__THESINTAXIS_CONCRETA = eINSTANCE.getTabla_ThesintaxisConcreta();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.DocumentAtrtributeImpl <em>Document Atrtribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.DocumentAtrtributeImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getDocumentAtrtribute()
		 * @generated
		 */
		EClass DOCUMENT_ATRTRIBUTE = eINSTANCE.getDocumentAtrtribute();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ATRTRIBUTE__NOMBRE = eINSTANCE.getDocumentAtrtribute_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ATRTRIBUTE__CODIGO = eINSTANCE.getDocumentAtrtribute_Codigo();

		/**
		 * The meta object literal for the '<em><b>The Tabla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ATRTRIBUTE__THE_TABLA = eINSTANCE.getDocumentAtrtribute_TheTabla();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ATRTRIBUTE__TIPO = eINSTANCE.getDocumentAtrtribute_Tipo();

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
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__NOMBRE = eINSTANCE.getRelacion_Nombre();

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
		 * The meta object literal for the '<em><b>Target Tabla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__TARGET_TABLA = eINSTANCE.getRelacion_TargetTabla();

		/**
		 * The meta object literal for the '<em><b>Source Tabla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__SOURCE_TABLA = eINSTANCE.getRelacion_SourceTabla();

		/**
		 * The meta object literal for the '<em><b>Thesintaxis Abstracta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__THESINTAXIS_ABSTRACTA = eINSTANCE.getRelacion_ThesintaxisAbstracta();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.Ocurrencia <em>Ocurrencia</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.Ocurrencia
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getOcurrencia()
		 * @generated
		 */
		EEnum OCURRENCIA = eINSTANCE.getOcurrencia();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.DataType
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //SintaxisabstractaPackage
