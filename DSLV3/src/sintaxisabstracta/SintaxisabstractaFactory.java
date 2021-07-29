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
	 * Returns a new object of class '<em>Document Atrtribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Atrtribute</em>'.
	 * @generated
	 */
	DocumentAtrtribute createDocumentAtrtribute();

	/**
	 * Returns a new object of class '<em>Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacion</em>'.
	 * @generated
	 */
	Relacion createRelacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SintaxisabstractaPackage getSintaxisabstractaPackage();

} //SintaxisabstractaFactory
