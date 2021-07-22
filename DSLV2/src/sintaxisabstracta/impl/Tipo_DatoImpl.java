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

import sintaxisabstracta.Campo;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tipo_Dato;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tipo Dato</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.impl.Tipo_DatoImpl#getTheCampo <em>The Campo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tipo_DatoImpl extends MinimalEObjectImpl.Container implements Tipo_Dato {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tipo_DatoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SintaxisabstractaPackage.Literals.TIPO_DATO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campo getTheCampo() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO) return null;
		return (Campo)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCampo(Campo newTheCampo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheCampo, SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCampo(Campo newTheCampo) {
		if (newTheCampo != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO && newTheCampo != null)) {
			if (EcoreUtil.isAncestor(this, newTheCampo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheCampo != null)
				msgs = ((InternalEObject)newTheCampo).eInverseAdd(this, SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO, Campo.class, msgs);
			msgs = basicSetTheCampo(newTheCampo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO, newTheCampo, newTheCampo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheCampo((Campo)otherEnd, msgs);
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
			case SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO:
				return basicSetTheCampo(null, msgs);
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
			case SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO:
				return eInternalContainer().eInverseRemove(this, SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO, Campo.class, msgs);
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
			case SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO:
				return getTheCampo();
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
			case SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO:
				setTheCampo((Campo)newValue);
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
			case SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO:
				setTheCampo((Campo)null);
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
			case SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO:
				return getTheCampo() != null;
		}
		return super.eIsSet(featureID);
	}

} //Tipo_DatoImpl
