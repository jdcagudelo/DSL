/**
 */
package sintaxisabstracta.tests;

import junit.textui.TestRunner;

import sintaxisabstracta.SintaxisabstractaFactory;
import sintaxisabstracta.Unomuchos;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unomuchos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnomuchosTest extends CardinalidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnomuchosTest.class);
	}

	/**
	 * Constructs a new Unomuchos test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnomuchosTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unomuchos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Unomuchos getFixture() {
		return (Unomuchos)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SintaxisabstractaFactory.eINSTANCE.createUnomuchos());
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

} //UnomuchosTest
