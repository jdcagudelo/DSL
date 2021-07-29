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
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE: return createDocumentAtrtribute();
			case SintaxisabstractaPackage.RELACION: return createRelacion();
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
			case SintaxisabstractaPackage.OCURRENCIA:
				return createOcurrenciaFromString(eDataType, initialValue);
			case SintaxisabstractaPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
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
			case SintaxisabstractaPackage.OCURRENCIA:
				return convertOcurrenciaToString(eDataType, instanceValue);
			case SintaxisabstractaPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
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
	public DocumentAtrtribute createDocumentAtrtribute() {
		DocumentAtrtributeImpl documentAtrtribute = new DocumentAtrtributeImpl();
		return documentAtrtribute;
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
	public Ocurrencia createOcurrenciaFromString(EDataType eDataType, String initialValue) {
		Ocurrencia result = Ocurrencia.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOcurrenciaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
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
