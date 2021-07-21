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
 * An implementation of the model object '<em><b>Relaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.impl.RelacionesImpl#getTablarelacionada <em>Tablarelacionada</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionesImpl#getTheTabla <em>The Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionesImpl#getTheCardinalidad <em>The Cardinalidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionesImpl extends MinimalEObjectImpl.Container implements Relaciones {
	/**
	 * The cached value of the '{@link #getTablarelacionada() <em>Tablarelacionada</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablarelacionada()
	 * @generated
	 * @ordered
	 */
	protected Tabla tablarelacionada;

	/**
	 * The cached value of the '{@link #getTheCardinalidad() <em>The Cardinalidad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCardinalidad()
	 * @generated
	 * @ordered
	 */
	protected Cardinalidad theCardinalidad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SintaxisabstractaPackage.Literals.RELACIONES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getTablarelacionada() {
		return tablarelacionada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTablarelacionada(Tabla newTablarelacionada, NotificationChain msgs) {
		Tabla oldTablarelacionada = tablarelacionada;
		tablarelacionada = newTablarelacionada;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA, oldTablarelacionada, newTablarelacionada);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablarelacionada(Tabla newTablarelacionada) {
		if (newTablarelacionada != tablarelacionada) {
			NotificationChain msgs = null;
			if (tablarelacionada != null)
				msgs = ((InternalEObject)tablarelacionada).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA, null, msgs);
			if (newTablarelacionada != null)
				msgs = ((InternalEObject)newTablarelacionada).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA, null, msgs);
			msgs = basicSetTablarelacionada(newTablarelacionada, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA, newTablarelacionada, newTablarelacionada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getTheTabla() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.RELACIONES__THE_TABLA) return null;
		return (Tabla)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheTabla(Tabla newTheTabla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheTabla, SintaxisabstractaPackage.RELACIONES__THE_TABLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTabla(Tabla newTheTabla) {
		if (newTheTabla != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.RELACIONES__THE_TABLA && newTheTabla != null)) {
			if (EcoreUtil.isAncestor(this, newTheTabla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheTabla != null)
				msgs = ((InternalEObject)newTheTabla).eInverseAdd(this, SintaxisabstractaPackage.TABLA__THE_RELACIONES, Tabla.class, msgs);
			msgs = basicSetTheTabla(newTheTabla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACIONES__THE_TABLA, newTheTabla, newTheTabla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinalidad getTheCardinalidad() {
		return theCardinalidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCardinalidad(Cardinalidad newTheCardinalidad, NotificationChain msgs) {
		Cardinalidad oldTheCardinalidad = theCardinalidad;
		theCardinalidad = newTheCardinalidad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD, oldTheCardinalidad, newTheCardinalidad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCardinalidad(Cardinalidad newTheCardinalidad) {
		if (newTheCardinalidad != theCardinalidad) {
			NotificationChain msgs = null;
			if (theCardinalidad != null)
				msgs = ((InternalEObject)theCardinalidad).eInverseRemove(this, SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES, Cardinalidad.class, msgs);
			if (newTheCardinalidad != null)
				msgs = ((InternalEObject)newTheCardinalidad).eInverseAdd(this, SintaxisabstractaPackage.CARDINALIDAD__THE_RELACIONES, Cardinalidad.class, msgs);
			msgs = basicSetTheCardinalidad(newTheCardinalidad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD, newTheCardinalidad, newTheCardinalidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SintaxisabstractaPackage.RELACIONES__THE_TABLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheTabla((Tabla)otherEnd, msgs);
			case SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD:
				if (theCardinalidad != null)
					msgs = ((InternalEObject)theCardinalidad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD, null, msgs);
				return basicSetTheCardinalidad((Cardinalidad)otherEnd, msgs);
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
			case SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA:
				return basicSetTablarelacionada(null, msgs);
			case SintaxisabstractaPackage.RELACIONES__THE_TABLA:
				return basicSetTheTabla(null, msgs);
			case SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD:
				return basicSetTheCardinalidad(null, msgs);
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
			case SintaxisabstractaPackage.RELACIONES__THE_TABLA:
				return eInternalContainer().eInverseRemove(this, SintaxisabstractaPackage.TABLA__THE_RELACIONES, Tabla.class, msgs);
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
			case SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA:
				return getTablarelacionada();
			case SintaxisabstractaPackage.RELACIONES__THE_TABLA:
				return getTheTabla();
			case SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD:
				return getTheCardinalidad();
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
			case SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA:
				setTablarelacionada((Tabla)newValue);
				return;
			case SintaxisabstractaPackage.RELACIONES__THE_TABLA:
				setTheTabla((Tabla)newValue);
				return;
			case SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD:
				setTheCardinalidad((Cardinalidad)newValue);
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
			case SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA:
				setTablarelacionada((Tabla)null);
				return;
			case SintaxisabstractaPackage.RELACIONES__THE_TABLA:
				setTheTabla((Tabla)null);
				return;
			case SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD:
				setTheCardinalidad((Cardinalidad)null);
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
			case SintaxisabstractaPackage.RELACIONES__TABLARELACIONADA:
				return tablarelacionada != null;
			case SintaxisabstractaPackage.RELACIONES__THE_TABLA:
				return getTheTabla() != null;
			case SintaxisabstractaPackage.RELACIONES__THE_CARDINALIDAD:
				return theCardinalidad != null;
		}
		return super.eIsSet(featureID);
	}

} //RelacionesImpl
