/**
 */
package relaciones.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import relaciones.ModelFactory;
import relaciones.RelacionesPackage;
import relaciones.SintaxisAbstracta;
import relaciones.SintaxisConcreta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relaciones.impl.ModelFactoryImpl#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 *   <li>{@link relaciones.impl.ModelFactoryImpl#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends MinimalEObjectImpl.Container implements ModelFactory {
	/**
	 * The cached value of the '{@link #getThesintaxisAbstracta() <em>Thesintaxis Abstracta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesintaxisAbstracta()
	 * @generated
	 * @ordered
	 */
	protected SintaxisAbstracta thesintaxisAbstracta;

	/**
	 * The cached value of the '{@link #getThesintaxisConcreta() <em>Thesintaxis Concreta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesintaxisConcreta()
	 * @generated
	 * @ordered
	 */
	protected SintaxisConcreta thesintaxisConcreta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelacionesPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisAbstracta getThesintaxisAbstracta() {
		return thesintaxisAbstracta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThesintaxisAbstracta(SintaxisAbstracta newThesintaxisAbstracta, NotificationChain msgs) {
		SintaxisAbstracta oldThesintaxisAbstracta = thesintaxisAbstracta;
		thesintaxisAbstracta = newThesintaxisAbstracta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA, oldThesintaxisAbstracta, newThesintaxisAbstracta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThesintaxisAbstracta(SintaxisAbstracta newThesintaxisAbstracta) {
		if (newThesintaxisAbstracta != thesintaxisAbstracta) {
			NotificationChain msgs = null;
			if (thesintaxisAbstracta != null)
				msgs = ((InternalEObject)thesintaxisAbstracta).eInverseRemove(this, RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY, SintaxisAbstracta.class, msgs);
			if (newThesintaxisAbstracta != null)
				msgs = ((InternalEObject)newThesintaxisAbstracta).eInverseAdd(this, RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY, SintaxisAbstracta.class, msgs);
			msgs = basicSetThesintaxisAbstracta(newThesintaxisAbstracta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA, newThesintaxisAbstracta, newThesintaxisAbstracta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisConcreta getThesintaxisConcreta() {
		return thesintaxisConcreta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThesintaxisConcreta(SintaxisConcreta newThesintaxisConcreta, NotificationChain msgs) {
		SintaxisConcreta oldThesintaxisConcreta = thesintaxisConcreta;
		thesintaxisConcreta = newThesintaxisConcreta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA, oldThesintaxisConcreta, newThesintaxisConcreta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThesintaxisConcreta(SintaxisConcreta newThesintaxisConcreta) {
		if (newThesintaxisConcreta != thesintaxisConcreta) {
			NotificationChain msgs = null;
			if (thesintaxisConcreta != null)
				msgs = ((InternalEObject)thesintaxisConcreta).eInverseRemove(this, RelacionesPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY, SintaxisConcreta.class, msgs);
			if (newThesintaxisConcreta != null)
				msgs = ((InternalEObject)newThesintaxisConcreta).eInverseAdd(this, RelacionesPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY, SintaxisConcreta.class, msgs);
			msgs = basicSetThesintaxisConcreta(newThesintaxisConcreta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA, newThesintaxisConcreta, newThesintaxisConcreta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA:
				if (thesintaxisAbstracta != null)
					msgs = ((InternalEObject)thesintaxisAbstracta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA, null, msgs);
				return basicSetThesintaxisAbstracta((SintaxisAbstracta)otherEnd, msgs);
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA:
				if (thesintaxisConcreta != null)
					msgs = ((InternalEObject)thesintaxisConcreta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA, null, msgs);
				return basicSetThesintaxisConcreta((SintaxisConcreta)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA:
				return basicSetThesintaxisAbstracta(null, msgs);
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA:
				return basicSetThesintaxisConcreta(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA:
				return getThesintaxisAbstracta();
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA:
				return getThesintaxisConcreta();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA:
				setThesintaxisAbstracta((SintaxisAbstracta)newValue);
				return;
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA:
				setThesintaxisConcreta((SintaxisConcreta)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA:
				setThesintaxisAbstracta((SintaxisAbstracta)null);
				return;
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA:
				setThesintaxisConcreta((SintaxisConcreta)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA:
				return thesintaxisAbstracta != null;
			case RelacionesPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA:
				return thesintaxisConcreta != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryImpl
