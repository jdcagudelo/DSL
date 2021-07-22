/**
 */
package sintaxisabstracta.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sintaxisabstracta.Campo;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;
import sintaxisabstracta.Tipo_Dato;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.impl.CampoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.CampoImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.CampoImpl#getTheTabla <em>The Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.CampoImpl#getTheTipo_Dato <em>The Tipo Dato</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampoImpl extends MinimalEObjectImpl.Container implements Campo {
	/**
	 * The default value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected String etiqueta = ETIQUETA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected Integer codigo = CODIGO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheTipo_Dato() <em>The Tipo Dato</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheTipo_Dato()
	 * @generated
	 * @ordered
	 */
	protected Tipo_Dato theTipo_Dato;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SintaxisabstractaPackage.Literals.CAMPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
		return etiqueta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtiqueta(String newEtiqueta) {
		String oldEtiqueta = etiqueta;
		etiqueta = newEtiqueta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.CAMPO__ETIQUETA, oldEtiqueta, etiqueta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(Integer newCodigo) {
		Integer oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.CAMPO__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getTheTabla() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.CAMPO__THE_TABLA) return null;
		return (Tabla)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheTabla(Tabla newTheTabla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheTabla, SintaxisabstractaPackage.CAMPO__THE_TABLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTabla(Tabla newTheTabla) {
		if (newTheTabla != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.CAMPO__THE_TABLA && newTheTabla != null)) {
			if (EcoreUtil.isAncestor(this, newTheTabla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheTabla != null)
				msgs = ((InternalEObject)newTheTabla).eInverseAdd(this, SintaxisabstractaPackage.TABLA__THE_CAMPO, Tabla.class, msgs);
			msgs = basicSetTheTabla(newTheTabla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.CAMPO__THE_TABLA, newTheTabla, newTheTabla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo_Dato getTheTipo_Dato() {
		return theTipo_Dato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheTipo_Dato(Tipo_Dato newTheTipo_Dato, NotificationChain msgs) {
		Tipo_Dato oldTheTipo_Dato = theTipo_Dato;
		theTipo_Dato = newTheTipo_Dato;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO, oldTheTipo_Dato, newTheTipo_Dato);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTipo_Dato(Tipo_Dato newTheTipo_Dato) {
		if (newTheTipo_Dato != theTipo_Dato) {
			NotificationChain msgs = null;
			if (theTipo_Dato != null)
				msgs = ((InternalEObject)theTipo_Dato).eInverseRemove(this, SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO, Tipo_Dato.class, msgs);
			if (newTheTipo_Dato != null)
				msgs = ((InternalEObject)newTheTipo_Dato).eInverseAdd(this, SintaxisabstractaPackage.TIPO_DATO__THE_CAMPO, Tipo_Dato.class, msgs);
			msgs = basicSetTheTipo_Dato(newTheTipo_Dato, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO, newTheTipo_Dato, newTheTipo_Dato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SintaxisabstractaPackage.CAMPO__THE_TABLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheTabla((Tabla)otherEnd, msgs);
			case SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO:
				if (theTipo_Dato != null)
					msgs = ((InternalEObject)theTipo_Dato).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO, null, msgs);
				return basicSetTheTipo_Dato((Tipo_Dato)otherEnd, msgs);
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
			case SintaxisabstractaPackage.CAMPO__THE_TABLA:
				return basicSetTheTabla(null, msgs);
			case SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO:
				return basicSetTheTipo_Dato(null, msgs);
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
			case SintaxisabstractaPackage.CAMPO__THE_TABLA:
				return eInternalContainer().eInverseRemove(this, SintaxisabstractaPackage.TABLA__THE_CAMPO, Tabla.class, msgs);
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
			case SintaxisabstractaPackage.CAMPO__ETIQUETA:
				return getEtiqueta();
			case SintaxisabstractaPackage.CAMPO__CODIGO:
				return getCodigo();
			case SintaxisabstractaPackage.CAMPO__THE_TABLA:
				return getTheTabla();
			case SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO:
				return getTheTipo_Dato();
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
			case SintaxisabstractaPackage.CAMPO__ETIQUETA:
				setEtiqueta((String)newValue);
				return;
			case SintaxisabstractaPackage.CAMPO__CODIGO:
				setCodigo((Integer)newValue);
				return;
			case SintaxisabstractaPackage.CAMPO__THE_TABLA:
				setTheTabla((Tabla)newValue);
				return;
			case SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO:
				setTheTipo_Dato((Tipo_Dato)newValue);
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
			case SintaxisabstractaPackage.CAMPO__ETIQUETA:
				setEtiqueta(ETIQUETA_EDEFAULT);
				return;
			case SintaxisabstractaPackage.CAMPO__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case SintaxisabstractaPackage.CAMPO__THE_TABLA:
				setTheTabla((Tabla)null);
				return;
			case SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO:
				setTheTipo_Dato((Tipo_Dato)null);
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
			case SintaxisabstractaPackage.CAMPO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? etiqueta != null : !ETIQUETA_EDEFAULT.equals(etiqueta);
			case SintaxisabstractaPackage.CAMPO__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SintaxisabstractaPackage.CAMPO__THE_TABLA:
				return getTheTabla() != null;
			case SintaxisabstractaPackage.CAMPO__THE_TIPO_DATO:
				return theTipo_Dato != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (etiqueta: ");
		result.append(etiqueta);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(')');
		return result.toString();
	}

} //CampoImpl
