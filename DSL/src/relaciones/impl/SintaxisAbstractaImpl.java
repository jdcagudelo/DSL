/**
 */
package relaciones.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import relaciones.ModelFactory;
import relaciones.RelacionesPackage;
import relaciones.SintaxisAbstracta;

import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sintaxis Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relaciones.impl.SintaxisAbstractaImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link relaciones.impl.SintaxisAbstractaImpl#getTheTabla <em>The Tabla</em>}</li>
 *   <li>{@link relaciones.impl.SintaxisAbstractaImpl#getSintaxisAbstracta <em>Sintaxis Abstracta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SintaxisAbstractaImpl extends MinimalEObjectImpl.Container implements SintaxisAbstracta {
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
	 * The cached value of the '{@link #getSintaxisAbstracta() <em>Sintaxis Abstracta</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSintaxisAbstracta()
	 * @generated
	 * @ordered
	 */
	protected EList<SintaxisAbstracta> sintaxisAbstracta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SintaxisAbstractaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelacionesPackage.Literals.SINTAXIS_ABSTRACTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tabla> getTheTabla() {
		if (theTabla == null) {
			theTabla = new EObjectContainmentWithInverseEList<Tabla>(Tabla.class, this, RelacionesPackage.SINTAXIS_ABSTRACTA__THE_TABLA, SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA);
		}
		return theTabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SintaxisAbstracta> getSintaxisAbstracta() {
		if (sintaxisAbstracta == null) {
			sintaxisAbstracta = new EObjectResolvingEList<SintaxisAbstracta>(SintaxisAbstracta.class, this, RelacionesPackage.SINTAXIS_ABSTRACTA__SINTAXIS_ABSTRACTA);
		}
		return sintaxisAbstracta;
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
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_TABLA:
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
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_TABLA:
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
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, RelacionesPackage.MODEL_FACTORY__THESINTAXIS_ABSTRACTA, ModelFactory.class, msgs);
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
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_TABLA:
				return getTheTabla();
			case RelacionesPackage.SINTAXIS_ABSTRACTA__SINTAXIS_ABSTRACTA:
				return getSintaxisAbstracta();
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
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_TABLA:
				getTheTabla().clear();
				getTheTabla().addAll((Collection<? extends Tabla>)newValue);
				return;
			case RelacionesPackage.SINTAXIS_ABSTRACTA__SINTAXIS_ABSTRACTA:
				getSintaxisAbstracta().clear();
				getSintaxisAbstracta().addAll((Collection<? extends SintaxisAbstracta>)newValue);
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
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_TABLA:
				getTheTabla().clear();
				return;
			case RelacionesPackage.SINTAXIS_ABSTRACTA__SINTAXIS_ABSTRACTA:
				getSintaxisAbstracta().clear();
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
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case RelacionesPackage.SINTAXIS_ABSTRACTA__THE_TABLA:
				return theTabla != null && !theTabla.isEmpty();
			case RelacionesPackage.SINTAXIS_ABSTRACTA__SINTAXIS_ABSTRACTA:
				return sintaxisAbstracta != null && !sintaxisAbstracta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SintaxisAbstractaImpl
