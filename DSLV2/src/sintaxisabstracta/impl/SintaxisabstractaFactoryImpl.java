/**
 */
package sintaxisabstracta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SintaxisabstractaFactoryImpl extends EFactoryImpl implements SintaxisabstractaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SintaxisabstractaFactory init() {
		try {
			SintaxisabstractaFactory theSintaxisabstractaFactory = (SintaxisabstractaFactory)EPackage.Registry.INSTANCE.getEFactory(SintaxisabstractaPackage.eNS_URI);
			if (theSintaxisabstractaFactory != null) {
				return theSintaxisabstractaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SintaxisabstractaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisabstractaFactoryImpl() {
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
			case SintaxisabstractaPackage.TABLA: return createTabla();
			case SintaxisabstractaPackage.CAMPO: return createCampo();
			case SintaxisabstractaPackage.CARDINALIDAD: return createCardinalidad();
			case SintaxisabstractaPackage.TIPO_DATO: return createTipo_Dato();
			case SintaxisabstractaPackage.STRING: return createString();
			case SintaxisabstractaPackage.NUMERIC: return createNumeric();
			case SintaxisabstractaPackage.DATE: return createDate();
			case SintaxisabstractaPackage.UNO: return createUno();
			case SintaxisabstractaPackage.UNOMUCHOS: return createUnomuchos();
			case SintaxisabstractaPackage.CERO: return createCero();
			case SintaxisabstractaPackage.CEROMUCHOS: return createCeromuchos();
			case SintaxisabstractaPackage.MUCHOS: return createMuchos();
			case SintaxisabstractaPackage.CEROUNO: return createCerouno();
			case SintaxisabstractaPackage.RELACIONES: return createRelaciones();
			case SintaxisabstractaPackage.NEW_CLASS: return createNewClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla createTabla() {
		TablaImpl tabla = new TablaImpl();
		return tabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campo createCampo() {
		CampoImpl campo = new CampoImpl();
		return campo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinalidad createCardinalidad() {
		CardinalidadImpl cardinalidad = new CardinalidadImpl();
		return cardinalidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo_Dato createTipo_Dato() {
		Tipo_DatoImpl tipo_Dato = new Tipo_DatoImpl();
		return tipo_Dato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sintaxisabstracta.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Numeric createNumeric() {
		NumericImpl numeric = new NumericImpl();
		return numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uno createUno() {
		UnoImpl uno = new UnoImpl();
		return uno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unomuchos createUnomuchos() {
		UnomuchosImpl unomuchos = new UnomuchosImpl();
		return unomuchos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cero createCero() {
		CeroImpl cero = new CeroImpl();
		return cero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ceromuchos createCeromuchos() {
		CeromuchosImpl ceromuchos = new CeromuchosImpl();
		return ceromuchos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Muchos createMuchos() {
		MuchosImpl muchos = new MuchosImpl();
		return muchos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cerouno createCerouno() {
		CerounoImpl cerouno = new CerounoImpl();
		return cerouno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relaciones createRelaciones() {
		RelacionesImpl relaciones = new RelacionesImpl();
		return relaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewClass createNewClass() {
		NewClassImpl newClass = new NewClassImpl();
		return newClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisabstractaPackage getSintaxisabstractaPackage() {
		return (SintaxisabstractaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SintaxisabstractaPackage getPackage() {
		return SintaxisabstractaPackage.eINSTANCE;
	}

} //SintaxisabstractaFactoryImpl
