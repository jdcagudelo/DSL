/**
 */
package sintaxisabstracta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ocurrencia</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sintaxisabstracta.SintaxisabstractaPackage#getOcurrencia()
 * @model
 * @generated
 */
public enum Ocurrencia implements Enumerator {
	/**
	 * The '<em><b>MUCHOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUCHOS_VALUE
	 * @generated
	 * @ordered
	 */
	MUCHOS(0, "MUCHOS", "MUCHOS"),

	/**
	 * The '<em><b>UNOOMUCHOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNOOMUCHOS_VALUE
	 * @generated
	 * @ordered
	 */
	UNOOMUCHOS(1, "UNOOMUCHOS", "UNOOMUCHOS"),

	/**
	 * The '<em><b>CEROOMUCHOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEROOMUCHOS_VALUE
	 * @generated
	 * @ordered
	 */
	CEROOMUCHOS(2, "CEROOMUCHOS", "CEROOMUCHOS"),

	/**
	 * The '<em><b>CEROOUNO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEROOUNO_VALUE
	 * @generated
	 * @ordered
	 */
	CEROOUNO(3, "CEROOUNO", "CEROOUNO"),

	/**
	 * The '<em><b>UNO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNO_VALUE
	 * @generated
	 * @ordered
	 */
	UNO(4, "UNO", "UNO"),

	/**
	 * The '<em><b>CERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERO_VALUE
	 * @generated
	 * @ordered
	 */
	CERO(5, "CERO", "CERO");

	/**
	 * The '<em><b>MUCHOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUCHOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUCHOS_VALUE = 0;

	/**
	 * The '<em><b>UNOOMUCHOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNOOMUCHOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNOOMUCHOS_VALUE = 1;

	/**
	 * The '<em><b>CEROOMUCHOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEROOMUCHOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CEROOMUCHOS_VALUE = 2;

	/**
	 * The '<em><b>CEROOUNO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEROOUNO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CEROOUNO_VALUE = 3;

	/**
	 * The '<em><b>UNO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNO_VALUE = 4;

	/**
	 * The '<em><b>CERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CERO_VALUE = 5;

	/**
	 * An array of all the '<em><b>Ocurrencia</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Ocurrencia[] VALUES_ARRAY =
		new Ocurrencia[] {
			MUCHOS,
			UNOOMUCHOS,
			CEROOMUCHOS,
			CEROOUNO,
			UNO,
			CERO,
		};

	/**
	 * A public read-only list of all the '<em><b>Ocurrencia</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Ocurrencia> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ocurrencia</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ocurrencia get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ocurrencia result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ocurrencia</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ocurrencia getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ocurrencia result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ocurrencia</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ocurrencia get(int value) {
		switch (value) {
			case MUCHOS_VALUE: return MUCHOS;
			case UNOOMUCHOS_VALUE: return UNOOMUCHOS;
			case CEROOMUCHOS_VALUE: return CEROOMUCHOS;
			case CEROOUNO_VALUE: return CEROOUNO;
			case UNO_VALUE: return UNO;
			case CERO_VALUE: return CERO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Ocurrencia(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Ocurrencia
