/**
 */
package sintaxisabstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Dato</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.Tipo_Dato#getTheCampo <em>The Campo</em>}</li>
 * </ul>
 *
 * @see sintaxisabstracta.SintaxisabstractaPackage#getTipo_Dato()
 * @model
 * @generated
 */
public interface Tipo_Dato extends EObject {
	/**
	 * Returns the value of the '<em><b>The Campo</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Campo#getTheTipo_Dato <em>The Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Campo</em>' container reference.
	 * @see #setTheCampo(Campo)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getTipo_Dato_TheCampo()
	 * @see sintaxisabstracta.Campo#getTheTipo_Dato
	 * @model opposite="theTipo_Dato"
	 * @generated
	 */
	Campo getTheCampo();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Tipo_Dato#getTheCampo <em>The Campo</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Campo</em>' container reference.
	 * @see #getTheCampo()
	 * @generated
	 */
	void setTheCampo(Campo value);

} // Tipo_Dato
