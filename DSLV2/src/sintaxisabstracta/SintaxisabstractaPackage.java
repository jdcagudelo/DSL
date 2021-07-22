/**
 */
package sintaxisabstracta;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The feature id for the '<em><b>Thecardinalidad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__THECARDINALIDAD = 4;

	/**
	 * The feature id for the '<em><b>The Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__THE_RELACIONES = 5;

	/**
	 * The feature id for the '<em><b>Thesintaxis Concreta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__THESINTAXIS_CONCRETA = 6;

	/**
	 * The number of structural features of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>The Tipo Dato</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__THE_TIPO_DATO = 3;

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
	 * The meta object id for the '{@link sintaxisabstracta.impl.CardinalidadImpl <em>Cardinalidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.CardinalidadImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCardinalidad()
	 * @generated
	 */
	int CARDINALIDAD = 2;

	/**
	 * The feature id for the '<em><b>Thetabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALIDAD__THETABLA = 0;

	/**
	 * The feature id for the '<em><b>The Relaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALIDAD__THE_RELACIONES = 1;

	/**
	 * The number of structural features of the '<em>Cardinalidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALIDAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cardinalidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.Tipo_DatoImpl <em>Tipo Dato</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.Tipo_DatoImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getTipo_Dato()
	 * @generated
	 */
	int TIPO_DATO = 3;

	/**
	 * The feature id for the '<em><b>The Campo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATO__THE_CAMPO = 0;

	/**
	 * The number of structural features of the '<em>Tipo Dato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tipo Dato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.StringImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getString()
	 * @generated
	 */
	int STRING = 4;

	/**
	 * The feature id for the '<em><b>The Campo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__THE_CAMPO = TIPO_DATO__THE_CAMPO;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.NumericImpl <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.NumericImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 5;

	/**
	 * The feature id for the '<em><b>The Campo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__THE_CAMPO = TIPO_DATO__THE_CAMPO;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.DateImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 6;

	/**
	 * The feature id for the '<em><b>The Campo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__THE_CAMPO = TIPO_DATO__THE_CAMPO;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.UnoImpl <em>Uno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.UnoImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getUno()
	 * @generated
	 */
	int UNO = 7;

	/**
	 * The feature id for the '<em><b>Thetabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNO__THETABLA = CARDINALIDAD__THETABLA;

	/**
	 * The feature id for the '<em><b>The Relaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNO__THE_RELACIONES = CARDINALIDAD__THE_RELACIONES;

	/**
	 * The number of structural features of the '<em>Uno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNO_FEATURE_COUNT = CARDINALIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNO_OPERATION_COUNT = CARDINALIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.UnomuchosImpl <em>Unomuchos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.UnomuchosImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getUnomuchos()
	 * @generated
	 */
	int UNOMUCHOS = 8;

	/**
	 * The feature id for the '<em><b>Thetabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOMUCHOS__THETABLA = CARDINALIDAD__THETABLA;

	/**
	 * The feature id for the '<em><b>The Relaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOMUCHOS__THE_RELACIONES = CARDINALIDAD__THE_RELACIONES;

	/**
	 * The number of structural features of the '<em>Unomuchos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOMUCHOS_FEATURE_COUNT = CARDINALIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unomuchos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOMUCHOS_OPERATION_COUNT = CARDINALIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.CeroImpl <em>Cero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.CeroImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCero()
	 * @generated
	 */
	int CERO = 9;

	/**
	 * The feature id for the '<em><b>Thetabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERO__THETABLA = CARDINALIDAD__THETABLA;

	/**
	 * The feature id for the '<em><b>The Relaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERO__THE_RELACIONES = CARDINALIDAD__THE_RELACIONES;

	/**
	 * The number of structural features of the '<em>Cero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERO_FEATURE_COUNT = CARDINALIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERO_OPERATION_COUNT = CARDINALIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.CeromuchosImpl <em>Ceromuchos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.CeromuchosImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCeromuchos()
	 * @generated
	 */
	int CEROMUCHOS = 10;

	/**
	 * The feature id for the '<em><b>Thetabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEROMUCHOS__THETABLA = CARDINALIDAD__THETABLA;

	/**
	 * The feature id for the '<em><b>The Relaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEROMUCHOS__THE_RELACIONES = CARDINALIDAD__THE_RELACIONES;

	/**
	 * The number of structural features of the '<em>Ceromuchos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEROMUCHOS_FEATURE_COUNT = CARDINALIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ceromuchos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEROMUCHOS_OPERATION_COUNT = CARDINALIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.MuchosImpl <em>Muchos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.MuchosImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getMuchos()
	 * @generated
	 */
	int MUCHOS = 11;

	/**
	 * The feature id for the '<em><b>Thetabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCHOS__THETABLA = CARDINALIDAD__THETABLA;

	/**
	 * The feature id for the '<em><b>The Relaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCHOS__THE_RELACIONES = CARDINALIDAD__THE_RELACIONES;

	/**
	 * The number of structural features of the '<em>Muchos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCHOS_FEATURE_COUNT = CARDINALIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Muchos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCHOS_OPERATION_COUNT = CARDINALIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.CerounoImpl <em>Cerouno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.CerounoImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCerouno()
	 * @generated
	 */
	int CEROUNO = 12;

	/**
	 * The feature id for the '<em><b>Thetabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEROUNO__THETABLA = CARDINALIDAD__THETABLA;

	/**
	 * The feature id for the '<em><b>The Relaciones</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEROUNO__THE_RELACIONES = CARDINALIDAD__THE_RELACIONES;

	/**
	 * The number of structural features of the '<em>Cerouno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEROUNO_FEATURE_COUNT = CARDINALIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cerouno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEROUNO_OPERATION_COUNT = CARDINALIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.RelacionesImpl <em>Relaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.RelacionesImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getRelaciones()
	 * @generated
	 */
	int RELACIONES = 13;

	/**
	 * The feature id for the '<em><b>Tablarelacionada</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONES__TABLARELACIONADA = 0;

	/**
	 * The feature id for the '<em><b>The Tabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONES__THE_TABLA = 1;

	/**
	 * The feature id for the '<em><b>The Cardinalidad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONES__THE_CARDINALIDAD = 2;

	/**
	 * The number of structural features of the '<em>Relaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sintaxisabstracta.impl.NewClassImpl <em>New Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sintaxisabstracta.impl.NewClassImpl
	 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getNewClass()
	 * @generated
	 */
	int NEW_CLASS = 14;

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
	 * Returns the meta object for the containment reference '{@link sintaxisabstracta.Tabla#getThecardinalidad <em>Thecardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thecardinalidad</em>'.
	 * @see sintaxisabstracta.Tabla#getThecardinalidad()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Thecardinalidad();

	/**
	 * Returns the meta object for the containment reference list '{@link sintaxisabstracta.Tabla#getTheRelaciones <em>The Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Relaciones</em>'.
	 * @see sintaxisabstracta.Tabla#getTheRelaciones()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_TheRelaciones();

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
	 * Returns the meta object for the containment reference '{@link sintaxisabstracta.Campo#getTheTipo_Dato <em>The Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Tipo Dato</em>'.
	 * @see sintaxisabstracta.Campo#getTheTipo_Dato()
	 * @see #getCampo()
	 * @generated
	 */
	EReference getCampo_TheTipo_Dato();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Cardinalidad <em>Cardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinalidad</em>'.
	 * @see sintaxisabstracta.Cardinalidad
	 * @generated
	 */
	EClass getCardinalidad();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.Cardinalidad#getThetabla <em>Thetabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Thetabla</em>'.
	 * @see sintaxisabstracta.Cardinalidad#getThetabla()
	 * @see #getCardinalidad()
	 * @generated
	 */
	EReference getCardinalidad_Thetabla();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.Cardinalidad#getTheRelaciones <em>The Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Relaciones</em>'.
	 * @see sintaxisabstracta.Cardinalidad#getTheRelaciones()
	 * @see #getCardinalidad()
	 * @generated
	 */
	EReference getCardinalidad_TheRelaciones();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Tipo_Dato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Dato</em>'.
	 * @see sintaxisabstracta.Tipo_Dato
	 * @generated
	 */
	EClass getTipo_Dato();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.Tipo_Dato#getTheCampo <em>The Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Campo</em>'.
	 * @see sintaxisabstracta.Tipo_Dato#getTheCampo()
	 * @see #getTipo_Dato()
	 * @generated
	 */
	EReference getTipo_Dato_TheCampo();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see sintaxisabstracta.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see sintaxisabstracta.Numeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see sintaxisabstracta.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Uno <em>Uno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uno</em>'.
	 * @see sintaxisabstracta.Uno
	 * @generated
	 */
	EClass getUno();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Unomuchos <em>Unomuchos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unomuchos</em>'.
	 * @see sintaxisabstracta.Unomuchos
	 * @generated
	 */
	EClass getUnomuchos();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Cero <em>Cero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cero</em>'.
	 * @see sintaxisabstracta.Cero
	 * @generated
	 */
	EClass getCero();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Ceromuchos <em>Ceromuchos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ceromuchos</em>'.
	 * @see sintaxisabstracta.Ceromuchos
	 * @generated
	 */
	EClass getCeromuchos();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Muchos <em>Muchos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Muchos</em>'.
	 * @see sintaxisabstracta.Muchos
	 * @generated
	 */
	EClass getMuchos();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Cerouno <em>Cerouno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cerouno</em>'.
	 * @see sintaxisabstracta.Cerouno
	 * @generated
	 */
	EClass getCerouno();

	/**
	 * Returns the meta object for class '{@link sintaxisabstracta.Relaciones <em>Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relaciones</em>'.
	 * @see sintaxisabstracta.Relaciones
	 * @generated
	 */
	EClass getRelaciones();

	/**
	 * Returns the meta object for the containment reference '{@link sintaxisabstracta.Relaciones#getTablarelacionada <em>Tablarelacionada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tablarelacionada</em>'.
	 * @see sintaxisabstracta.Relaciones#getTablarelacionada()
	 * @see #getRelaciones()
	 * @generated
	 */
	EReference getRelaciones_Tablarelacionada();

	/**
	 * Returns the meta object for the container reference '{@link sintaxisabstracta.Relaciones#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Tabla</em>'.
	 * @see sintaxisabstracta.Relaciones#getTheTabla()
	 * @see #getRelaciones()
	 * @generated
	 */
	EReference getRelaciones_TheTabla();

	/**
	 * Returns the meta object for the containment reference '{@link sintaxisabstracta.Relaciones#getTheCardinalidad <em>The Cardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Cardinalidad</em>'.
	 * @see sintaxisabstracta.Relaciones#getTheCardinalidad()
	 * @see #getRelaciones()
	 * @generated
	 */
	EReference getRelaciones_TheCardinalidad();

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
		 * The meta object literal for the '<em><b>Thecardinalidad</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__THECARDINALIDAD = eINSTANCE.getTabla_Thecardinalidad();

		/**
		 * The meta object literal for the '<em><b>The Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__THE_RELACIONES = eINSTANCE.getTabla_TheRelaciones();

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
		 * The meta object literal for the '<em><b>The Tipo Dato</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPO__THE_TIPO_DATO = eINSTANCE.getCampo_TheTipo_Dato();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.CardinalidadImpl <em>Cardinalidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.CardinalidadImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCardinalidad()
		 * @generated
		 */
		EClass CARDINALIDAD = eINSTANCE.getCardinalidad();

		/**
		 * The meta object literal for the '<em><b>Thetabla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALIDAD__THETABLA = eINSTANCE.getCardinalidad_Thetabla();

		/**
		 * The meta object literal for the '<em><b>The Relaciones</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALIDAD__THE_RELACIONES = eINSTANCE.getCardinalidad_TheRelaciones();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.Tipo_DatoImpl <em>Tipo Dato</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.Tipo_DatoImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getTipo_Dato()
		 * @generated
		 */
		EClass TIPO_DATO = eINSTANCE.getTipo_Dato();

		/**
		 * The meta object literal for the '<em><b>The Campo</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_DATO__THE_CAMPO = eINSTANCE.getTipo_Dato_TheCampo();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.StringImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.NumericImpl <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.NumericImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.DateImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.UnoImpl <em>Uno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.UnoImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getUno()
		 * @generated
		 */
		EClass UNO = eINSTANCE.getUno();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.UnomuchosImpl <em>Unomuchos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.UnomuchosImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getUnomuchos()
		 * @generated
		 */
		EClass UNOMUCHOS = eINSTANCE.getUnomuchos();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.CeroImpl <em>Cero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.CeroImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCero()
		 * @generated
		 */
		EClass CERO = eINSTANCE.getCero();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.CeromuchosImpl <em>Ceromuchos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.CeromuchosImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCeromuchos()
		 * @generated
		 */
		EClass CEROMUCHOS = eINSTANCE.getCeromuchos();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.MuchosImpl <em>Muchos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.MuchosImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getMuchos()
		 * @generated
		 */
		EClass MUCHOS = eINSTANCE.getMuchos();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.CerounoImpl <em>Cerouno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.CerounoImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getCerouno()
		 * @generated
		 */
		EClass CEROUNO = eINSTANCE.getCerouno();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.RelacionesImpl <em>Relaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.RelacionesImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getRelaciones()
		 * @generated
		 */
		EClass RELACIONES = eINSTANCE.getRelaciones();

		/**
		 * The meta object literal for the '<em><b>Tablarelacionada</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACIONES__TABLARELACIONADA = eINSTANCE.getRelaciones_Tablarelacionada();

		/**
		 * The meta object literal for the '<em><b>The Tabla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACIONES__THE_TABLA = eINSTANCE.getRelaciones_TheTabla();

		/**
		 * The meta object literal for the '<em><b>The Cardinalidad</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACIONES__THE_CARDINALIDAD = eINSTANCE.getRelaciones_TheCardinalidad();

		/**
		 * The meta object literal for the '{@link sintaxisabstracta.impl.NewClassImpl <em>New Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sintaxisabstracta.impl.NewClassImpl
		 * @see sintaxisabstracta.impl.SintaxisabstractaPackageImpl#getNewClass()
		 * @generated
		 */
		EClass NEW_CLASS = eINSTANCE.getNewClass();

	}

} //SintaxisabstractaPackage
