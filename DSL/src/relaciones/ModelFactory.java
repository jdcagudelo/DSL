/**
 */
package relaciones;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relaciones.ModelFactory#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 *   <li>{@link relaciones.ModelFactory#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}</li>
 * </ul>
 *
 * @see relaciones.RelacionesPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Thesintaxis Abstracta</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link relaciones.SintaxisAbstracta#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Abstracta</em>' containment reference.
	 * @see #setThesintaxisAbstracta(SintaxisAbstracta)
	 * @see relaciones.RelacionesPackage#getModelFactory_ThesintaxisAbstracta()
	 * @see relaciones.SintaxisAbstracta#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true" required="true"
	 * @generated
	 */
	SintaxisAbstracta getThesintaxisAbstracta();

	/**
	 * Sets the value of the '{@link relaciones.ModelFactory#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesintaxis Abstracta</em>' containment reference.
	 * @see #getThesintaxisAbstracta()
	 * @generated
	 */
	void setThesintaxisAbstracta(SintaxisAbstracta value);

	/**
	 * Returns the value of the '<em><b>Thesintaxis Concreta</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link relaciones.SintaxisConcreta#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Concreta</em>' containment reference.
	 * @see #setThesintaxisConcreta(SintaxisConcreta)
	 * @see relaciones.RelacionesPackage#getModelFactory_ThesintaxisConcreta()
	 * @see relaciones.SintaxisConcreta#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true" required="true"
	 * @generated
	 */
	SintaxisConcreta getThesintaxisConcreta();

	/**
	 * Sets the value of the '{@link relaciones.ModelFactory#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesintaxis Concreta</em>' containment reference.
	 * @see #getThesintaxisConcreta()
	 * @generated
	 */
	void setThesintaxisConcreta(SintaxisConcreta value);

} // ModelFactory
