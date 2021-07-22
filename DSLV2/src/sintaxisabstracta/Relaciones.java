/**
 */
package sintaxisabstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.Relaciones#getTablarelacionada <em>Tablarelacionada</em>}</li>
 *   <li>{@link sintaxisabstracta.Relaciones#getTheTabla <em>The Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.Relaciones#getTheCardinalidad <em>The Cardinalidad</em>}</li>
 * </ul>
 *
 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelaciones()
 * @model
 * @generated
 */
public interface Relaciones extends EObject {
	/**
	 * Returns the value of the '<em><b>Tablarelacionada</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablarelacionada</em>' containment reference.
	 * @see #setTablarelacionada(Tabla)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelaciones_Tablarelacionada()
	 * @model containment="true"
	 * @generated
	 */
	Tabla getTablarelacionada();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relaciones#getTablarelacionada <em>Tablarelacionada</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tablarelacionada</em>' containment reference.
	 * @see #getTablarelacionada()
	 * @generated
	 */
	void setTablarelacionada(Tabla value);

	/**
	 * Returns the value of the '<em><b>The Tabla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tabla#getTheRelaciones <em>The Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Tabla</em>' container reference.
	 * @see #setTheTabla(Tabla)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelaciones_TheTabla()
	 * @see sintaxisabstracta.Tabla#getTheRelaciones
	 * @model opposite="theRelaciones"
	 * @generated
	 */
	Tabla getTheTabla();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relaciones#getTheTabla <em>The Tabla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Tabla</em>' container reference.
	 * @see #getTheTabla()
	 * @generated
	 */
	void setTheTabla(Tabla value);

	/**
	 * Returns the value of the '<em><b>The Cardinalidad</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Cardinalidad#getTheRelaciones <em>The Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Cardinalidad</em>' containment reference.
	 * @see #setTheCardinalidad(Cardinalidad)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelaciones_TheCardinalidad()
	 * @see sintaxisabstracta.Cardinalidad#getTheRelaciones
	 * @model opposite="theRelaciones" containment="true" required="true"
	 * @generated
	 */
	Cardinalidad getTheCardinalidad();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relaciones#getTheCardinalidad <em>The Cardinalidad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Cardinalidad</em>' containment reference.
	 * @see #getTheCardinalidad()
	 * @generated
	 */
	void setTheCardinalidad(Cardinalidad value);

} // Relaciones
