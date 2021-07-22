/**
 */
package relaciones1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sintaxisabstracta.Tabla;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sintaxis Concreta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relaciones1.SintaxisConcreta#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link relaciones1.SintaxisConcreta#getTheTabla <em>The Tabla</em>}</li>
 * </ul>
 *
 * @see relaciones1.Relaciones1Package#getSintaxisConcreta()
 * @model
 * @generated
 */
public interface SintaxisConcreta extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relaciones1.ModelFactory#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see relaciones1.Relaciones1Package#getSintaxisConcreta_TheModelFactory()
	 * @see relaciones1.ModelFactory#getThesintaxisConcreta
	 * @model opposite="thesintaxisConcreta"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link relaciones1.SintaxisConcreta#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>The Tabla</b></em>' containment reference list.
	 * The list contents are of type {@link sintaxisabstracta.Tabla}.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tabla#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Tabla</em>' containment reference list.
	 * @see relaciones1.Relaciones1Package#getSintaxisConcreta_TheTabla()
	 * @see sintaxisabstracta.Tabla#getThesintaxisConcreta
	 * @model opposite="thesintaxisConcreta" containment="true"
	 * @generated
	 */
	EList<Tabla> getTheTabla();

} // SintaxisConcreta
