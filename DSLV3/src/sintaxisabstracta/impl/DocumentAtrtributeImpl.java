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

import sintaxisabstracta.DataType;
import sintaxisabstracta.DocumentAtrtribute;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Atrtribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.impl.DocumentAtrtributeImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.DocumentAtrtributeImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.DocumentAtrtributeImpl#getTheTabla <em>The Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.DocumentAtrtributeImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentAtrtributeImpl extends MinimalEObjectImpl.Container implements DocumentAtrtribute {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final DataType TIPO_EDEFAULT = DataType.STRING;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected DataType tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentAtrtributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SintaxisabstractaPackage.Literals.DOCUMENT_ATRTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getTheTabla() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA) return null;
		return (Tabla)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheTabla(Tabla newTheTabla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheTabla, SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTabla(Tabla newTheTabla) {
		if (newTheTabla != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA && newTheTabla != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA, newTheTabla, newTheTabla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(DataType newTipo) {
		DataType oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheTabla((Tabla)otherEnd, msgs);
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
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA:
				return basicSetTheTabla(null, msgs);
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
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA:
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
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__NOMBRE:
				return getNombre();
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__CODIGO:
				return getCodigo();
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA:
				return getTheTabla();
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__TIPO:
				return getTipo();
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
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__CODIGO:
				setCodigo((String)newValue);
				return;
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA:
				setTheTabla((Tabla)newValue);
				return;
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__TIPO:
				setTipo((DataType)newValue);
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
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA:
				setTheTabla((Tabla)null);
				return;
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__TIPO:
				setTipo(TIPO_EDEFAULT);
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
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA:
				return getTheTabla() != null;
			case SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__TIPO:
				return tipo != TIPO_EDEFAULT;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //DocumentAtrtributeImpl
