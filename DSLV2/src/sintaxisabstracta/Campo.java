/**
 */
package sintaxisabstracta;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.Campo#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link sintaxisabstracta.Campo#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sintaxisabstracta.Campo#getTheTabla <em>The Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.Campo#getTheTipo_Dato <em>The Tipo Dato</em>}</li>
 * </ul>
 *
 * @see sintaxisabstracta.SintaxisabstractaPackage#getCampo()
 * @model
 * @generated
 */
public interface Campo extends EObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see #setEtiqueta(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getCampo_Etiqueta()
	 * @model
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Campo#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(Integer)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getCampo_Codigo()
	 * @model
	 * @generated
	 */
	Integer getCodigo();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Campo#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(Integer value);

	/**
	 * Returns the value of the '<em><b>The Tabla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tabla#getTheCampo <em>The Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Tabla</em>' container reference.
	 * @see #setTheTabla(Tabla)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getCampo_TheTabla()
	 * @see sintaxisabstracta.Tabla#getTheCampo
	 * @model opposite="theCampo"
	 * @generated
	 */
	Tabla getTheTabla();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Campo#getTheTabla <em>The Tabla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Tabla</em>' container reference.
	 * @see #getTheTabla()
	 * @generated
	 */
	void setTheTabla(Tabla value);

	/**
	 * Returns the value of the '<em><b>The Tipo Dato</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tipo_Dato#getTheCampo <em>The Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Tipo Dato</em>' containment reference.
	 * @see #setTheTipo_Dato(Tipo_Dato)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getCampo_TheTipo_Dato()
	 * @see sintaxisabstracta.Tipo_Dato#getTheCampo
	 * @model opposite="theCampo" containment="true" required="true"
	 * @generated
	 */
	Tipo_Dato getTheTipo_Dato();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Campo#getTheTipo_Dato <em>The Tipo Dato</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Tipo Dato</em>' containment reference.
	 * @see #getTheTipo_Dato()
	 * @generated
	 */
	void setTheTipo_Dato(Tipo_Dato value);

} // Campo
