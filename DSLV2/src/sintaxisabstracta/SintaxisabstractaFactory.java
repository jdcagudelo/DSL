/**
 */
package sintaxisabstracta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sintaxisabstracta.SintaxisabstractaPackage
 * @generated
 */
public interface SintaxisabstractaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SintaxisabstractaFactory eINSTANCE = sintaxisabstracta.impl.SintaxisabstractaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabla</em>'.
	 * @generated
	 */
	Tabla createTabla();

	/**
	 * Returns a new object of class '<em>Campo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campo</em>'.
	 * @generated
	 */
	Campo createCampo();

	/**
	 * Returns a new object of class '<em>Cardinalidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinalidad</em>'.
	 * @generated
	 */
	Cardinalidad createCardinalidad();

	/**
	 * Returns a new object of class '<em>Tipo Dato</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Dato</em>'.
	 * @generated
	 */
	Tipo_Dato createTipo_Dato();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric</em>'.
	 * @generated
	 */
	Numeric createNumeric();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Uno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uno</em>'.
	 * @generated
	 */
	Uno createUno();

	/**
	 * Returns a new object of class '<em>Unomuchos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unomuchos</em>'.
	 * @generated
	 */
	Unomuchos createUnomuchos();

	/**
	 * Returns a new object of class '<em>Cero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cero</em>'.
	 * @generated
	 */
	Cero createCero();

	/**
	 * Returns a new object of class '<em>Ceromuchos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ceromuchos</em>'.
	 * @generated
	 */
	Ceromuchos createCeromuchos();

	/**
	 * Returns a new object of class '<em>Muchos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Muchos</em>'.
	 * @generated
	 */
	Muchos createMuchos();

	/**
	 * Returns a new object of class '<em>Cerouno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cerouno</em>'.
	 * @generated
	 */
	Cerouno createCerouno();

	/**
	 * Returns a new object of class '<em>Relaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relaciones</em>'.
	 * @generated
	 */
	Relaciones createRelaciones();

	/**
	 * Returns a new object of class '<em>New Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Class</em>'.
	 * @generated
	 */
	NewClass createNewClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SintaxisabstractaPackage getSintaxisabstractaPackage();

} //SintaxisabstractaFactory
