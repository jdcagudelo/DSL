/**
 */
package sintaxisabstracta.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sintaxisabstracta.Campo;
import sintaxisabstracta.Cardinalidad;
import sintaxisabstracta.Cero;
import sintaxisabstracta.Ceromuchos;
import sintaxisabstracta.Cerouno;
import sintaxisabstracta.Date;
import sintaxisabstracta.Muchos;
import sintaxisabstracta.NewClass;
import sintaxisabstracta.Numeric;
import sintaxisabstracta.Relaciones;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;
import sintaxisabstracta.Tipo_Dato;
import sintaxisabstracta.Uno;
import sintaxisabstracta.Unomuchos;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sintaxisabstracta.SintaxisabstractaPackage
 * @generated
 */
public class SintaxisabstractaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SintaxisabstractaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisabstractaSwitch() {
		if (modelPackage == null) {
			modelPackage = SintaxisabstractaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SintaxisabstractaPackage.TABLA: {
				Tabla tabla = (Tabla)theEObject;
				T result = caseTabla(tabla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.CAMPO: {
				Campo campo = (Campo)theEObject;
				T result = caseCampo(campo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.CARDINALIDAD: {
				Cardinalidad cardinalidad = (Cardinalidad)theEObject;
				T result = caseCardinalidad(cardinalidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.TIPO_DATO: {
				Tipo_Dato tipo_Dato = (Tipo_Dato)theEObject;
				T result = caseTipo_Dato(tipo_Dato);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.STRING: {
				sintaxisabstracta.String string = (sintaxisabstracta.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseTipo_Dato(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.NUMERIC: {
				Numeric numeric = (Numeric)theEObject;
				T result = caseNumeric(numeric);
				if (result == null) result = caseTipo_Dato(numeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseTipo_Dato(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.UNO: {
				Uno uno = (Uno)theEObject;
				T result = caseUno(uno);
				if (result == null) result = caseCardinalidad(uno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.UNOMUCHOS: {
				Unomuchos unomuchos = (Unomuchos)theEObject;
				T result = caseUnomuchos(unomuchos);
				if (result == null) result = caseCardinalidad(unomuchos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.CERO: {
				Cero cero = (Cero)theEObject;
				T result = caseCero(cero);
				if (result == null) result = caseCardinalidad(cero);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.CEROMUCHOS: {
				Ceromuchos ceromuchos = (Ceromuchos)theEObject;
				T result = caseCeromuchos(ceromuchos);
				if (result == null) result = caseCardinalidad(ceromuchos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.MUCHOS: {
				Muchos muchos = (Muchos)theEObject;
				T result = caseMuchos(muchos);
				if (result == null) result = caseCardinalidad(muchos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.CEROUNO: {
				Cerouno cerouno = (Cerouno)theEObject;
				T result = caseCerouno(cerouno);
				if (result == null) result = caseCardinalidad(cerouno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.RELACIONES: {
				Relaciones relaciones = (Relaciones)theEObject;
				T result = caseRelaciones(relaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SintaxisabstractaPackage.NEW_CLASS: {
				NewClass newClass = (NewClass)theEObject;
				T result = caseNewClass(newClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabla(Tabla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampo(Campo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinalidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinalidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalidad(Cardinalidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Dato</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Dato</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipo_Dato(Tipo_Dato object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(sintaxisabstracta.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeric(Numeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUno(Uno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unomuchos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unomuchos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnomuchos(Unomuchos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cero</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cero</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCero(Cero object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ceromuchos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ceromuchos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeromuchos(Ceromuchos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Muchos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Muchos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuchos(Muchos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cerouno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cerouno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCerouno(Cerouno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelaciones(Relaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewClass(NewClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SintaxisabstractaSwitch
