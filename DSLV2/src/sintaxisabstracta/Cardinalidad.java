/**
 */
package sintaxisabstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinalidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.Cardinalidad#getThetabla <em>Thetabla</em>}</li>
 *   <li>{@link sintaxisabstracta.Cardinalidad#getTheRelaciones <em>The Relaciones</em>}</li>
 * </ul>
 *
 * @see sintaxisabstracta.SintaxisabstractaPackage#getCardinalidad()
 * @model
 * @generated
 */
public interface Cardinalidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Thetabla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tabla#getThecardinalidad <em>Thecardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thetabla</em>' container reference.
	 * @see #setThetabla(Tabla)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getCardinalidad_Thetabla()
	 * @see sintaxisabstracta.Tabla#getThecardinalidad
	 * @model opposite="thecardinalidad"
	 * @generated
	 */
	Tabla getThetabla();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Cardinalidad#getThetabla <em>Thetabla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thetabla</em>' container reference.
	 * @see #getThetabla()
	 * @generated
	 */
	void setThetabla(Tabla value);

	/**
	 * Returns the value of the '<em><b>The Relaciones</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Relaciones#getTheCardinalidad <em>The Cardinalidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Relaciones</em>' container reference.
	 * @see #setTheRelaciones(Relaciones)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getCardinalidad_TheRelaciones()
	 * @see sintaxisabstracta.Relaciones#getTheCardinalidad
	 * @model opposite="theCardinalidad"
	 * @generated
	 */
	Relaciones getTheRelaciones();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Cardinalidad#getTheRelaciones <em>The Relaciones</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Relaciones</em>' container reference.
	 * @see #getTheRelaciones()
	 * @generated
	 */
	void setTheRelaciones(Relaciones value);

} // Cardinalidad
