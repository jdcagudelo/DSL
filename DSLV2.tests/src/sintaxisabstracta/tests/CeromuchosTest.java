/**
 */
package sintaxisabstracta.tests;

import junit.textui.TestRunner;

import sintaxisabstracta.Ceromuchos;
import sintaxisabstracta.SintaxisabstractaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ceromuchos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CeromuchosTest extends CardinalidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CeromuchosTest.class);
	}

	/**
	 * Constructs a new Ceromuchos test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeromuchosTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ceromuchos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ceromuchos getFixture() {
		return (Ceromuchos)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SintaxisabstractaFactory.eINSTANCE.createCeromuchos());
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

} //CeromuchosTest
