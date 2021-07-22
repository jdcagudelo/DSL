/**
 */
package relaciones1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see relaciones1.Relaciones1Package
 * @generated
 */
public interface Relaciones1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Relaciones1Factory eINSTANCE = relaciones1.impl.Relaciones1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory</em>'.
	 * @generated
	 */
	ModelFactory createModelFactory();

	/**
	 * Returns a new object of class '<em>Sintaxis Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sintaxis Abstracta</em>'.
	 * @generated
	 */
	SintaxisAbstracta createSintaxisAbstracta();

	/**
	 * Returns a new object of class '<em>Sintaxis Concreta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sintaxis Concreta</em>'.
	 * @generated
	 */
	SintaxisConcreta createSintaxisConcreta();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Relaciones1Package getRelaciones1Package();

} //Relaciones1Factory
