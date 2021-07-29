/**
 */
package sintaxisabstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Atrtribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.DocumentAtrtribute#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sintaxisabstracta.DocumentAtrtribute#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sintaxisabstracta.DocumentAtrtribute#getTheTabla <em>The Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.DocumentAtrtribute#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see sintaxisabstracta.SintaxisabstractaPackage#getDocumentAtrtribute()
 * @model
 * @generated
 */
public interface DocumentAtrtribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getDocumentAtrtribute_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.DocumentAtrtribute#getNombre <em>Nombre</em>}' attribute.
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
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getDocumentAtrtribute_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.DocumentAtrtribute#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>The Tabla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tabla#getTheCampo <em>The Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Tabla</em>' container reference.
	 * @see #setTheTabla(Tabla)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getDocumentAtrtribute_TheTabla()
	 * @see sintaxisabstracta.Tabla#getTheCampo
	 * @model opposite="theCampo"
	 * @generated
	 */
	Tabla getTheTabla();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.DocumentAtrtribute#getTheTabla <em>The Tabla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Tabla</em>' container reference.
	 * @see #getTheTabla()
	 * @generated
	 */
	void setTheTabla(Tabla value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link sintaxisabstracta.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see sintaxisabstracta.DataType
	 * @see #setTipo(DataType)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getDocumentAtrtribute_Tipo()
	 * @model required="true"
	 * @generated
	 */
	DataType getTipo();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.DocumentAtrtribute#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see sintaxisabstracta.DataType
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(DataType value);

} // DocumentAtrtribute
