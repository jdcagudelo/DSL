/**
 */
package sintaxisabstracta.impl;

import java.util.Collection;

import modelofinal.ModelofinalPackage;
import modelofinal.SintaxisAbstracta;
import modelofinal.SintaxisConcreta;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sintaxisabstracta.DocumentAtrtribute;
import sintaxisabstracta.Relacion;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.impl.TablaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.TablaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.TablaImpl#getTheCampo <em>The Campo</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.TablaImpl#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.TablaImpl#getRelacionesB <em>Relaciones B</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.TablaImpl#getRelacionesA <em>Relaciones A</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.TablaImpl#getRelacion <em>Relacion</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.TablaImpl#getThesintaxisConcreta <em>Thesintaxis Concreta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TablaImpl extends MinimalEObjectImpl.Container implements Tabla {
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
	 * The cached value of the '{@link #getTheCampo() <em>The Campo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCampo()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentAtrtribute> theCampo;

	/**
	 * The cached value of the '{@link #getRelacionesB() <em>Relaciones B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesB()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relacionesB;

	/**
	 * The cached value of the '{@link #getRelacionesA() <em>Relaciones A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesA()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relacionesA;

	/**
	 * The cached value of the '{@link #getRelacion() <em>Relacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TablaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SintaxisabstractaPackage.Literals.TABLA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.TABLA__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.TABLA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentAtrtribute> getTheCampo() {
		if (theCampo == null) {
			theCampo = new EObjectContainmentWithInverseEList<DocumentAtrtribute>(DocumentAtrtribute.class, this, SintaxisabstractaPackage.TABLA__THE_CAMPO, SintaxisabstractaPackage.DOCUMENT_ATRTRIBUTE__THE_TABLA);
		}
		return theCampo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisAbstracta getThesintaxisAbstracta() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA) return null;
		return (SintaxisAbstracta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThesintaxisAbstracta(SintaxisAbstracta newThesintaxisAbstracta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThesintaxisAbstracta, SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThesintaxisAbstracta(SintaxisAbstracta newThesintaxisAbstracta) {
		if (newThesintaxisAbstracta != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA && newThesintaxisAbstracta != null)) {
			if (EcoreUtil.isAncestor(this, newThesintaxisAbstracta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThesintaxisAbstracta != null)
				msgs = ((InternalEObject)newThesintaxisAbstracta).eInverseAdd(this, ModelofinalPackage.SINTAXIS_ABSTRACTA__THE_TABLA, SintaxisAbstracta.class, msgs);
			msgs = basicSetThesintaxisAbstracta(newThesintaxisAbstracta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA, newThesintaxisAbstracta, newThesintaxisAbstracta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relacion> getRelacionesB() {
		if (relacionesB == null) {
			relacionesB = new EObjectWithInverseResolvingEList<Relacion>(Relacion.class, this, SintaxisabstractaPackage.TABLA__RELACIONES_B, SintaxisabstractaPackage.RELACION__TARGET_TABLA);
		}
		return relacionesB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relacion> getRelacionesA() {
		if (relacionesA == null) {
			relacionesA = new EObjectWithInverseResolvingEList<Relacion>(Relacion.class, this, SintaxisabstractaPackage.TABLA__RELACIONES_A, SintaxisabstractaPackage.RELACION__SOURCE_TABLA);
		}
		return relacionesA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relacion> getRelacion() {
		if (relacion == null) {
			relacion = new EObjectContainmentEList<Relacion>(Relacion.class, this, SintaxisabstractaPackage.TABLA__RELACION);
		}
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisConcreta getThesintaxisConcreta() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA) return null;
		return (SintaxisConcreta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThesintaxisConcreta(SintaxisConcreta newThesintaxisConcreta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThesintaxisConcreta, SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThesintaxisConcreta(SintaxisConcreta newThesintaxisConcreta) {
		if (newThesintaxisConcreta != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA && newThesintaxisConcreta != null)) {
			if (EcoreUtil.isAncestor(this, newThesintaxisConcreta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThesintaxisConcreta != null)
				msgs = ((InternalEObject)newThesintaxisConcreta).eInverseAdd(this, ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA, SintaxisConcreta.class, msgs);
			msgs = basicSetThesintaxisConcreta(newThesintaxisConcreta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA, newThesintaxisConcreta, newThesintaxisConcreta));
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
			case SintaxisabstractaPackage.TABLA__THE_CAMPO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheCampo()).basicAdd(otherEnd, msgs);
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThesintaxisAbstracta((SintaxisAbstracta)otherEnd, msgs);
			case SintaxisabstractaPackage.TABLA__RELACIONES_B:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelacionesB()).basicAdd(otherEnd, msgs);
			case SintaxisabstractaPackage.TABLA__RELACIONES_A:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelacionesA()).basicAdd(otherEnd, msgs);
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case SintaxisabstractaPackage.TABLA__THE_CAMPO:
				return ((InternalEList<?>)getTheCampo()).basicRemove(otherEnd, msgs);
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA:
				return basicSetThesintaxisAbstracta(null, msgs);
			case SintaxisabstractaPackage.TABLA__RELACIONES_B:
				return ((InternalEList<?>)getRelacionesB()).basicRemove(otherEnd, msgs);
			case SintaxisabstractaPackage.TABLA__RELACIONES_A:
				return ((InternalEList<?>)getRelacionesA()).basicRemove(otherEnd, msgs);
			case SintaxisabstractaPackage.TABLA__RELACION:
				return ((InternalEList<?>)getRelacion()).basicRemove(otherEnd, msgs);
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA:
				return eInternalContainer().eInverseRemove(this, ModelofinalPackage.SINTAXIS_ABSTRACTA__THE_TABLA, SintaxisAbstracta.class, msgs);
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA:
				return eInternalContainer().eInverseRemove(this, ModelofinalPackage.SINTAXIS_CONCRETA__THE_TABLA, SintaxisConcreta.class, msgs);
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
			case SintaxisabstractaPackage.TABLA__NOMBRE:
				return getNombre();
			case SintaxisabstractaPackage.TABLA__CODIGO:
				return getCodigo();
			case SintaxisabstractaPackage.TABLA__THE_CAMPO:
				return getTheCampo();
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA:
				return getThesintaxisAbstracta();
			case SintaxisabstractaPackage.TABLA__RELACIONES_B:
				return getRelacionesB();
			case SintaxisabstractaPackage.TABLA__RELACIONES_A:
				return getRelacionesA();
			case SintaxisabstractaPackage.TABLA__RELACION:
				return getRelacion();
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA:
				return getThesintaxisConcreta();
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
			case SintaxisabstractaPackage.TABLA__NOMBRE:
				setNombre((String)newValue);
				return;
			case SintaxisabstractaPackage.TABLA__CODIGO:
				setCodigo((String)newValue);
				return;
			case SintaxisabstractaPackage.TABLA__THE_CAMPO:
				getTheCampo().clear();
				getTheCampo().addAll((Collection<? extends DocumentAtrtribute>)newValue);
				return;
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA:
				setThesintaxisAbstracta((SintaxisAbstracta)newValue);
				return;
			case SintaxisabstractaPackage.TABLA__RELACIONES_B:
				getRelacionesB().clear();
				getRelacionesB().addAll((Collection<? extends Relacion>)newValue);
				return;
			case SintaxisabstractaPackage.TABLA__RELACIONES_A:
				getRelacionesA().clear();
				getRelacionesA().addAll((Collection<? extends Relacion>)newValue);
				return;
			case SintaxisabstractaPackage.TABLA__RELACION:
				getRelacion().clear();
				getRelacion().addAll((Collection<? extends Relacion>)newValue);
				return;
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA:
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
			case SintaxisabstractaPackage.TABLA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SintaxisabstractaPackage.TABLA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case SintaxisabstractaPackage.TABLA__THE_CAMPO:
				getTheCampo().clear();
				return;
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA:
				setThesintaxisAbstracta((SintaxisAbstracta)null);
				return;
			case SintaxisabstractaPackage.TABLA__RELACIONES_B:
				getRelacionesB().clear();
				return;
			case SintaxisabstractaPackage.TABLA__RELACIONES_A:
				getRelacionesA().clear();
				return;
			case SintaxisabstractaPackage.TABLA__RELACION:
				getRelacion().clear();
				return;
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA:
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
			case SintaxisabstractaPackage.TABLA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SintaxisabstractaPackage.TABLA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case SintaxisabstractaPackage.TABLA__THE_CAMPO:
				return theCampo != null && !theCampo.isEmpty();
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_ABSTRACTA:
				return getThesintaxisAbstracta() != null;
			case SintaxisabstractaPackage.TABLA__RELACIONES_B:
				return relacionesB != null && !relacionesB.isEmpty();
			case SintaxisabstractaPackage.TABLA__RELACIONES_A:
				return relacionesA != null && !relacionesA.isEmpty();
			case SintaxisabstractaPackage.TABLA__RELACION:
				return relacion != null && !relacion.isEmpty();
			case SintaxisabstractaPackage.TABLA__THESINTAXIS_CONCRETA:
				return getThesintaxisConcreta() != null;
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
		result.append(')');
		return result.toString();
	}

} //TablaImpl
