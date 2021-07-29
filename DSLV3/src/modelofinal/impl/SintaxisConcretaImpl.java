/**
 */
package modelofinal.impl;

import java.util.Collection;

import modelofinal.ModelFactory;
import modelofinal.ModelofinalPackage;
import modelofinal.SintaxisConcreta;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sintaxis Concreta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelofinal.impl.SintaxisConcretaImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link modelofinal.impl.SintaxisConcretaImpl#getTheTabla <em>The Tabla</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SintaxisConcretaImpl extends MinimalEObjectImpl.Container implements SintaxisConcreta {
	/**
	 * The cached value of the '{@link #getTheTabla() <em>The Tabla</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheTabla()
	 * @generated
	 * @ordered
	 */
	protected EList<Tabla> theTabla;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SintaxisConcretaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelofinalPackage.Literals.SINTAXIS_CONCRETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, ModelofinalPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tabla> getTheTabla() {
		if (theTabla == null) {
			theTabla = new EObjectContainmentWithInverseEList<Tabla>(Tabla.class, this, ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA, SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA);
		}
		return theTabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheTabla()).basicAdd(otherEnd, msgs);
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
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA:
				return ((InternalEList<?>)getTheTabla()).basicRemove(otherEnd, msgs);
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
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, ModelofinalPackage.MODEL_FACTORY__THESINTAXIS_CONCRETA, ModelFactory.class, msgs);
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
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA:
				return getTheTabla();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA:
				getTheTabla().clear();
				getTheTabla().addAll((Collection<? extends Tabla>)newValue);
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
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA:
				getTheTabla().clear();
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
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA:
				return theTabla != null && !theTabla.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SintaxisConcretaImpl
