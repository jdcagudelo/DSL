/**
 */
package sintaxisabstracta;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import relaciones.SintaxisAbstracta;
import relaciones.SintaxisConcreta;

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
 *   <li>{@link sintaxisabstracta.Tabla#getId <em>Id</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getTheCampo <em>The Campo</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getThecardinalidad <em>Thecardinalidad</em>}</li>
 *   <li>{@link sintaxisabstracta.Tabla#getTheRelaciones <em>The Relaciones</em>}</li>
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Tabla#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>The Campo</b></em>' containment reference list.
	 * The list contents are of type {@link sintaxisabstracta.Campo}.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Campo#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Campo</em>' containment reference list.
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_TheCampo()
	 * @see sintaxisabstracta.Campo#getTheTabla
	 * @model opposite="theTabla" containment="true" required="true"
	 * @generated
	 */
	EList<Campo> getTheCampo();

	/**
	 * Returns the value of the '<em><b>Thesintaxis Abstracta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relaciones.SintaxisAbstracta#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Abstracta</em>' container reference.
	 * @see #setThesintaxisAbstracta(SintaxisAbstracta)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_ThesintaxisAbstracta()
	 * @see relaciones.SintaxisAbstracta#getTheTabla
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
	 * Returns the value of the '<em><b>Thecardinalidad</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Cardinalidad#getThetabla <em>Thetabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thecardinalidad</em>' containment reference.
	 * @see #setThecardinalidad(Cardinalidad)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_Thecardinalidad()
	 * @see sintaxisabstracta.Cardinalidad#getThetabla
	 * @model opposite="thetabla" containment="true" required="true"
	 * @generated
	 */
	Cardinalidad getThecardinalidad();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Tabla#getThecardinalidad <em>Thecardinalidad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thecardinalidad</em>' containment reference.
	 * @see #getThecardinalidad()
	 * @generated
	 */
	void setThecardinalidad(Cardinalidad value);

	/**
	 * Returns the value of the '<em><b>The Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link sintaxisabstracta.Relaciones}.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Relaciones#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Relaciones</em>' containment reference list.
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_TheRelaciones()
	 * @see sintaxisabstracta.Relaciones#getTheTabla
	 * @model opposite="theTabla" containment="true" required="true"
	 * @generated
	 */
	EList<Relaciones> getTheRelaciones();

	/**
	 * Returns the value of the '<em><b>Thesintaxis Concreta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relaciones.SintaxisConcreta#getTheTabla <em>The Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Concreta</em>' container reference.
	 * @see #setThesintaxisConcreta(SintaxisConcreta)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTabla_ThesintaxisConcreta()
	 * @see relaciones.SintaxisConcreta#getTheTabla
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
