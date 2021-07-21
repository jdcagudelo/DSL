/**
 */
package sintaxisabstracta.tests;

import junit.textui.TestRunner;

import sintaxisabstracta.Cero;
import sintaxisabstracta.SintaxisabstractaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cero</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CeroTest extends CardinalidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CeroTest.class);
	}

	/**
	 * Constructs a new Cero test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeroTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cero test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cero getFixture() {
		return (Cero)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SintaxisabstractaFactory.eINSTANCE.createCero());
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

} //CeroTest
