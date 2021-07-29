/**
 */
package sintaxisabstracta;

import modelofinal.SintaxisAbstracta;
import modelofinal.SintaxisConcreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.Tabla#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getTheCampo <em>The Campo</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getRelacionesB <em>Relaciones B</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getRelacionesA <em>Relaciones A</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getRelacion <em>Relacion</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}</li>
 * </ul>
 *
 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla()
 * @model
 * @generated
 */
public interface Tabla extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Tabla#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Tabla#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>The Campo</b></em>' containment reference list.
	 * The list contents are of type {@link sintaxisabstracta.DocumentAtrtribute}.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.DocumentAtrtribute#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Campo</em>' containment reference list.
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_TheCampo()
	 * @see sintaxisabstracta.DocumentAtrtribute#getTheTabla
	 * @model opposite="theTabla" containment="true" required="true"
	 * @generated
	 */
	EList<DocumentAtrtribute> getTheCampo();

	/**
	 * Returns the value of the '<em><b>Thesintaxis Abstracta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelofinal.SintaxisAbstracta#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Abstracta</em>' container reference.
	 * @see #setThesintaxisAbstracta(SintaxisAbstracta)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_ThesintaxisAbstracta()
	 * @see modelofinal.SintaxisAbstracta#getTheTabla
	 * @model opposite="theTabla"
	 * @generated
	 */
	SintaxisAbstracta getThesintaxisAbstracta();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Tabla#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesintaxis Abstracta</em>' container reference.
	 * @see #getThesintaxisAbstracta()
	 * @generated
	 */
	void setThesintaxisAbstracta(SintaxisAbstracta value);

	/**
	 * Returns the value of the '<em><b>Relaciones B</b></em>' reference list.
	 * The list contents are of type {@link sintaxisabstracta.Relacion}.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Relacion#getTargetTabla <em>Target Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones B</em>' reference list.
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_RelacionesB()
	 * @see sintaxisabstracta.Relacion#getTargetTabla
	 * @model opposite="targetTabla"
	 * @generated
	 */
	EList<Relacion> getRelacionesB();

	/**
	 * Returns the value of the '<em><b>Relaciones A</b></em>' reference list.
	 * The list contents are of type {@link sintaxisabstracta.Relacion}.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Relacion#getSourceTabla <em>Source Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones A</em>' reference list.
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_RelacionesA()
	 * @see sintaxisabstracta.Relacion#getSourceTabla
	 * @model opposite="sourceTabla"
	 * @generated
	 */
	EList<Relacion> getRelacionesA();

	/**
	 * Returns the value of the '<em><b>Relacion</b></em>' containment reference list.
	 * The list contents are of type {@link sintaxisabstracta.Relacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion</em>' containment reference list.
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_Relacion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Relacion> getRelacion();

	/**
	 * Returns the value of the '<em><b>Thesintaxis Concreta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelofinal.SintaxisConcreta#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Concreta</em>' container reference.
	 * @see #setThesintaxisConcreta(SintaxisConcreta)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_ThesintaxisConcreta()
	 * @see modelofinal.SintaxisConcreta#getTheTabla
	 * @model opposite="theTabla"
	 * @generated
	 */
	SintaxisConcreta getThesintaxisConcreta();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Tabla#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesintaxis Concreta</em>' container reference.
	 * @see #getThesintaxisConcreta()
	 * @generated
	 */
	void setThesintaxisConcreta(SintaxisConcreta value);

} // Tabla
