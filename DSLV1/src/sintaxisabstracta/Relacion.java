/**
 */
package sintaxisabstracta;

import org.eclipse.emf.ecore.EObject;

import relaciones.SintaxisAbstracta;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.Relacion#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getRoleA <em>Role A</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getRoleB <em>Role B</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getName <em>Name</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getId <em>Id</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getTheCardinalidad <em>The Cardinalidad</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getSourceTabla <em>Source Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.Relacion#getTargetTabla <em>Target Tabla</em>}</li>
 * </ul>
 *
 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicidad A</b></em>' attribute.
	 * The literals are from the enumeration {@link sintaxisabstracta.Cardinalidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad A</em>' attribute.
	 * @see sintaxisabstracta.Cardinalidad
	 * @see #setMultiplicidadA(Cardinalidad)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_MultiplicidadA()
	 * @model
	 * @generated
	 */
	Cardinalidad getMultiplicidadA();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getMultiplicidadA <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad A</em>' attribute.
	 * @see sintaxisabstracta.Cardinalidad
	 * @see #getMultiplicidadA()
	 * @generated
	 */
	void setMultiplicidadA(Cardinalidad value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad B</b></em>' attribute.
	 * The literals are from the enumeration {@link sintaxisabstracta.Cardinalidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad B</em>' attribute.
	 * @see sintaxisabstracta.Cardinalidad
	 * @see #setMultiplicidadB(Cardinalidad)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_MultiplicidadB()
	 * @model
	 * @generated
	 */
	Cardinalidad getMultiplicidadB();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getMultiplicidadB <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad B</em>' attribute.
	 * @see sintaxisabstracta.Cardinalidad
	 * @see #getMultiplicidadB()
	 * @generated
	 */
	void setMultiplicidadB(Cardinalidad value);

	/**
	 * Returns the value of the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role A</em>' attribute.
	 * @see #setRoleA(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_RoleA()
	 * @model
	 * @generated
	 */
	String getRoleA();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getRoleA <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role A</em>' attribute.
	 * @see #getRoleA()
	 * @generated
	 */
	void setRoleA(String value);

	/**
	 * Returns the value of the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role B</em>' attribute.
	 * @see #setRoleB(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_RoleB()
	 * @model
	 * @generated
	 */
	String getRoleB();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getRoleB <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role B</em>' attribute.
	 * @see #getRoleB()
	 * @generated
	 */
	void setRoleB(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Thesintaxis Abstracta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relaciones.SintaxisAbstracta#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesintaxis Abstracta</em>' container reference.
	 * @see #setThesintaxisAbstracta(SintaxisAbstracta)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_ThesintaxisAbstracta()
	 * @see relaciones.SintaxisAbstracta#getListaRelaciones
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

	/**
	 * Returns the value of the '<em><b>The Cardinalidad</b></em>' attribute.
	 * The literals are from the enumeration {@link sintaxisabstracta.Cardinalidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Cardinalidad</em>' attribute.
	 * @see sintaxisabstracta.Cardinalidad
	 * @see #setTheCardinalidad(Cardinalidad)
	 * @see sintaxisabstracta.SintaxisabstractaPackage#getRelacion_TheCardinalidad()
	 * @model required="true"
	 * @generated
	 */
	Cardinalidad getTheCardinalidad();

	/**
	 * Sets the value of the '{@link sintaxisabstracta.Relacion#getTheCardinalidad <em>The Cardinalidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Cardinalidad</em>' attribute.
	 * @see sintaxisabstracta.Cardinalidad
	 * @see #getTheCardinalidad()
	 * @generated
	 */
	void setTheCardinalidad(Cardinalidad value);

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

} // Relacion
