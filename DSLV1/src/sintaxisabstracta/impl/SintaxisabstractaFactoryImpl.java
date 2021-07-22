/**
 */
package sintaxisabstracta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sintaxisabstracta.*;

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
			case SintaxisabstractaPackage.RELACION: return createRelacion();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SintaxisabstractaPackage.CARDINALIDAD:
				return createCardinalidadFromString(eDataType, initialValue);
			case SintaxisabstractaPackage.TIPO_DATO:
				return createTipo_DatoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SintaxisabstractaPackage.CARDINALIDAD:
				return convertCardinalidadToString(eDataType, instanceValue);
			case SintaxisabstractaPackage.TIPO_DATO:
				return convertTipo_DatoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public Relacion createRelacion() {
		RelacionImpl relacion = new RelacionImpl();
		return relacion;
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
	public Cardinalidad createCardinalidadFromString(EDataType eDataType, String initialValue) {
		Cardinalidad result = Cardinalidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo_Dato createTipo_DatoFromString(EDataType eDataType, String initialValue) {
		Tipo_Dato result = Tipo_Dato.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipo_DatoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
