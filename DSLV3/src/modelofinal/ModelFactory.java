/**
 */
package modelofinal;

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
 *   <li>{@link modelofinal.ModelFactory#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 *   <li>{@link modelofinal.ModelFactory#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}</li>
 * </ul>
 *
 * @see modelofinal.ModelofinalPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Thesintaxis Abstracta</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link modelofinal.SintaxisAbstracta#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Abstracta</em>' containment reference.
	 * @see #setThesintaxisAbstracta(SintaxisAbstracta)
	 * @see modelofinal.ModelofinalPackage#getModelFactory_ThesintaxisAbstracta()
	 * @see modelofinal.SintaxisAbstracta#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true" required="true"
	 * @generated
	 */
	SintaxisAbstracta getThesintaxisAbstracta();

	/**
	 * Sets the value of the '{@link modelofinal.ModelFactory#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesintaxis Abstracta</em>' containment reference.
	 * @see #getThesintaxisAbstracta()
	 * @generated
	 */
	void setThesintaxisAbstracta(SintaxisAbstracta value);

	/**
	 * Returns the value of the '<em><b>Thesintaxis Concreta</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link modelofinal.SintaxisConcreta#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Concreta</em>' containment reference.
	 * @see #setThesintaxisConcreta(SintaxisConcreta)
	 * @see modelofinal.ModelofinalPackage#getModelFactory_ThesintaxisConcreta()
	 * @see modelofinal.SintaxisConcreta#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true" required="true"
	 * @generated
	 */
	SintaxisConcreta getThesintaxisConcreta();

	/**
	 * Sets the value of the '{@link modelofinal.ModelFactory#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesintaxis Concreta</em>' containment reference.
	 * @see #getThesintaxisConcreta()
	 * @generated
	 */
	void setThesintaxisConcreta(SintaxisConcreta value);

} // ModelFactory
