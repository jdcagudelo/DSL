/**
 */
package sintaxisabstracta;

import modelofinal.SintaxisAbstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.Relacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getTargetTabla <em>Target Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getSourceTabla <em>Source Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 * </ul>
 *
 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad A</b></em>' attribute.
	 * The literals are from the enumeration {@link sintaxisabstracta.Ocurrencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad A</em>' attribute.
	 * @see sintaxisabstracta.Ocurrencia
	 * @see #setMultiplicidadA(Ocurrencia)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_MultiplicidadA()
	 * @model
	 * @generated
	 */
	Ocurrencia getMultiplicidadA();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getMultiplicidadA <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad A</em>' attribute.
	 * @see sintaxisabstracta.Ocurrencia
	 * @see #getMultiplicidadA()
	 * @generated
	 */
	void setMultiplicidadA(Ocurrencia value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad B</b></em>' attribute.
	 * The literals are from the enumeration {@link sintaxisabstracta.Ocurrencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad B</em>' attribute.
	 * @see sintaxisabstracta.Ocurrencia
	 * @see #setMultiplicidadB(Ocurrencia)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_MultiplicidadB()
	 * @model
	 * @generated
	 */
	Ocurrencia getMultiplicidadB();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getMultiplicidadB <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad B</em>' attribute.
	 * @see sintaxisabstracta.Ocurrencia
	 * @see #getMultiplicidadB()
	 * @generated
	 */
	void setMultiplicidadB(Ocurrencia value);

	/**
	 * Returns the value of the '<em><b>Target Tabla</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tabla#getRelacionesB <em>Relaciones B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Tabla</em>' reference.
	 * @see #setTargetTabla(Tabla)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_TargetTabla()
	 * @see sintaxisabstracta.Tabla#getRelacionesB
	 * @model opposite="relacionesB" required="true"
	 * @generated
	 */
	Tabla getTargetTabla();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getTargetTabla <em>Target Tabla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Tabla</em>' reference.
	 * @see #getTargetTabla()
	 * @generated
	 */
	void setTargetTabla(Tabla value);

	/**
	 * Returns the value of the '<em><b>Source Tabla</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sintaxisabstracta.Tabla#getRelacionesA <em>Relaciones A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Tabla</em>' reference.
	 * @see #setSourceTabla(Tabla)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_SourceTabla()
	 * @see sintaxisabstracta.Tabla#getRelacionesA
	 * @model opposite="relacionesA" required="true"
	 * @generated
	 */
	Tabla getSourceTabla();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getSourceTabla <em>Source Tabla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Tabla</em>' reference.
	 * @see #getSourceTabla()
	 * @generated
	 */
	void setSourceTabla(Tabla value);

	/**
	 * Returns the value of the '<em><b>Thesintaxis Abstracta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelofinal.SintaxisAbstracta#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Abstracta</em>' container reference.
	 * @see #setThesintaxisAbstracta(SintaxisAbstracta)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_ThesintaxisAbstracta()
	 * @see modelofinal.SintaxisAbstracta#getListaRelaciones
	 * @model opposite="ListaRelaciones"
	 * @generated
	 */
	SintaxisAbstracta getThesintaxisAbstracta();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesintaxis Abstracta</em>' container reference.
	 * @see #getThesintaxisAbstracta()
	 * @generated
	 */
	void setThesintaxisAbstracta(SintaxisAbstracta value);

} // Relacion
