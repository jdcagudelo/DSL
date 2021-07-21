/**
 */
package sintaxisabstracta.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sintaxisabstracta.Cardinalidad;
import sintaxisabstracta.Relaciones;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinalidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.impl.CardinalidadImpl#getThetabla <em>Thetabla</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.CardinalidadImpl#getTheRelaciones <em>The Relaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalidadImpl extends MinimalEObjectImpl.Container implements Cardinalidad {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SintaxisabstractaPackage.Literals.CARDINALIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getThetabla() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.CARDINALIDAD__THETABLA) return null;
		return (Tabla)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThetabla(Tabla newThetabla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThetabla, SintaxisabstractaPackage.CARDINALIDAD__THETABLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThetabla(Tabla newThetabla) {
		if (newThetabla != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.CARDINALIDAD__THETABLA && newThetabla != null)) {
			if (EcoreUtil.isAncestor(this, newThetabla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThetabla != null)
				msgs = ((InternalEObject)newThetabla).eInverseAdd(this, SintaxisabstractaPackage.TABLA__THECARDINALIDAD, Tabla.class, msgs);
			msgs = basicSetThetabla(newThetabla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.CARDINALIDAD__THETABLA, newThetabla, newThetabla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relaciones getTheRelaciones() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES) return null;
		return (Relaciones)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheRelaciones(Relaciones newTheRelaciones, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheRelaciones, SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheRelaciones(Relaciones newTheRelaciones) {
		if (newTheRelaciones != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES && newTheRelaciones != null)) {
			if (EcoreUtil.isAncestor(this, newTheRelaciones))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheRelaciones != null)
				msgs = ((InternalEObject)newTheRelaciones).eInverseAdd(this, SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD, Relaciones.class, msgs);
			msgs = basicSetTheRelaciones(newTheRelaciones, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES, newTheRelaciones, newTheRelaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SintaxisabstractaPackage.CARDINALIDAD__THETABLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThetabla((Tabla)otherEnd, msgs);
			case SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheRelaciones((Relaciones)otherEnd, msgs);
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
			case SintaxisabstractaPackage.CARDINALIDAD__THETABLA:
				return basicSetThetabla(null, msgs);
			case SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES:
				return basicSetTheRelaciones(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SintaxisabstractaPackage.CARDINALIDAD__THETABLA:
				return eInternalContainer().eInverseRemove(this, SintaxisabstractaPackage.TABLA__THECARDINALIDAD, Tabla.class, msgs);
			case SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES:
				return eInternalContainer().eInverseRemove(this, SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD, Relaciones.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SintaxisabstractaPackage.CARDINALIDAD__THETABLA:
				return getThetabla();
			case SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES:
				return getTheRelaciones();
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
			case SintaxisabstractaPackage.CARDINALIDAD__THETABLA:
				setThetabla((Tabla)newValue);
				return;
			case SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES:
				setTheRelaciones((Relaciones)newValue);
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
			case SintaxisabstractaPackage.CARDINALIDAD__THETABLA:
				setThetabla((Tabla)null);
				return;
			case SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES:
				setTheRelaciones((Relaciones)null);
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
			case SintaxisabstractaPackage.CARDINALIDAD__THETABLA:
				return getThetabla() != null;
			case SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES:
				return getTheRelaciones() != null;
		}
		return super.eIsSet(featureID);
	}

} //CardinalidadImpl
