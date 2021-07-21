/**
 */
package sintaxisabstracta.tests;

import junit.textui.TestRunner;

import sintaxisabstracta.Cerouno;
import sintaxisabstracta.SintaxisabstractaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cerouno</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CerounoTest extends CardinalidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CerounoTest.class);
	}

	/**
	 * Constructs a new Cerouno test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerounoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cerouno test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cerouno getFixture() {
		return (Cerouno)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SintaxisabstractaFactory.eINSTANCE.createCerouno());
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

} //CerounoTest
