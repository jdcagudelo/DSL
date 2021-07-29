/**
 */
package modelofinal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sintaxisabstracta.Relacion;
import sintaxisabstracta.Tabla;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sintaxis Abstracta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelofinal.SintaxisAbstracta#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link modelofinal.SintaxisAbstracta#getTheTabla <em>The Tabla</em>}</li>
 *   <li>{@link modelofinal.SintaxisAbstracta#getSintaxisAbstracta <em>Sintaxis Abstracta</em>}</li>
 *   <li>{@link modelofinal.SintaxisAbstracta#getListaRelaciones <em>Lista Relaciones</em>}</li>
 * </ul>
 *
 * @see modelofinal.ModelofinalPackage#getSintaxisAbstracta()
 * @model
 * @generated
 */
public interface SintaxisAbstracta extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelofinal.ModelFactory#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see modelofinal.ModelofinalPackage#getSintaxisAbstracta_TheModelFactory()
	 * @see modelofinal.ModelFactory#getThesintaxisAbstracta
	 * @model opposite="thesintaxisAbstracta"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link modelofinal.SintaxisAbstracta#getTheModelFactory <em>The Model Factory</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tabla#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Tabla</em>' containment reference list.
	 * @see modelofinal.ModelofinalPackage#getSintaxisAbstracta_TheTabla()
	 * @see sintaxisabstracta.Tabla#getThesintaxisAbstracta
	 * @model opposite="thesintaxisAbstracta" containment="true"
	 * @generated
	 */
	EList<Tabla> getTheTabla();

	/**
	 * Returns the value of the '<em><b>Sintaxis Abstracta</b></em>' reference list.
	 * The list contents are of type {@link modelofinal.SintaxisAbstracta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sintaxis Abstracta</em>' reference list.
	 * @see modelofinal.ModelofinalPackage#getSintaxisAbstracta_SintaxisAbstracta()
	 * @model
	 * @generated
	 */
	EList<SintaxisAbstracta> getSintaxisAbstracta();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link sintaxisabstracta.Relacion}.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Relacion#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones</em>' containment reference list.
	 * @see modelofinal.ModelofinalPackage#getSintaxisAbstracta_ListaRelaciones()
	 * @see sintaxisabstracta.Relacion#getThesintaxisAbstracta
	 * @model opposite="thesintaxisAbstracta" containment="true"
	 * @generated
	 */
	EList<Relacion> getListaRelaciones();

} // SintaxisAbstracta
