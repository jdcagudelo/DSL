/**
 */
package sintaxisabstracta.tests;

import junit.textui.TestRunner;

import sintaxisabstracta.SintaxisabstractaFactory;
import sintaxisabstracta.Uno;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uno</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnoTest extends CardinalidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnoTest.class);
	}

	/**
	 * Constructs a new Uno test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uno test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Uno getFixture() {
		return (Uno)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SintaxisabstractaFactory.eINSTANCE.createUno());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UnoTest
