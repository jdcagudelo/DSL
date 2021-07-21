/**
 */
package sintaxisabstracta.tests;

import junit.textui.TestRunner;

import sintaxisabstracta.SintaxisabstractaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringTest extends Tipo_DatoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringTest.class);
	}

	/**
	 * Constructs a new String test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected sintaxisabstracta.String getFixture() {
		return (sintaxisabstracta.String)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SintaxisabstractaFactory.eINSTANCE.createString());
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

} //StringTest
