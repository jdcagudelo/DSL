/**
 */
package sintaxisabstracta.impl;

import modelofinal.ModelofinalPackage;
import modelofinal.SintaxisAbstracta;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sintaxisabstracta.Ocurrencia;
import sintaxisabstracta.Relacion;
import sintaxisabstracta.SintaxisabstractaPackage;
import sintaxisabstracta.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getTargetTabla <em>Target Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getSourceTabla <em>Source Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends MinimalEObjectImpl.Container implements Relacion {
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
	 * The default value of the '{@link #getMultiplicidadA() <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadA()
	 * @generated
	 * @ordered
	 */
	protected static final Ocurrencia MULTIPLICIDAD_A_EDEFAULT = Ocurrencia.MUCHOS;

	/**
	 * The cached value of the '{@link #getMultiplicidadA() <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadA()
	 * @generated
	 * @ordered
	 */
	protected Ocurrencia multiplicidadA = MULTIPLICIDAD_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadB() <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadB()
	 * @generated
	 * @ordered
	 */
	protected static final Ocurrencia MULTIPLICIDAD_B_EDEFAULT = Ocurrencia.MUCHOS;

	/**
	 * The cached value of the '{@link #getMultiplicidadB() <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadB()
	 * @generated
	 * @ordered
	 */
	protected Ocurrencia multiplicidadB = MULTIPLICIDAD_B_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetTabla() <em>Target Tabla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTabla()
	 * @generated
	 * @ordered
	 */
	protected Tabla targetTabla;

	/**
	 * The cached value of the '{@link #getSourceTabla() <em>Source Tabla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTabla()
	 * @generated
	 * @ordered
	 */
	protected Tabla sourceTabla;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SintaxisabstractaPackage.Literals.RELACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ocurrencia getMultiplicidadA() {
		return multiplicidadA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadA(Ocurrencia newMultiplicidadA) {
		Ocurrencia oldMultiplicidadA = multiplicidadA;
		multiplicidadA = newMultiplicidadA == null ? MULTIPLICIDAD_A_EDEFAULT : newMultiplicidadA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A, oldMultiplicidadA, multiplicidadA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ocurrencia getMultiplicidadB() {
		return multiplicidadB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadB(Ocurrencia newMultiplicidadB) {
		Ocurrencia oldMultiplicidadB = multiplicidadB;
		multiplicidadB = newMultiplicidadB == null ? MULTIPLICIDAD_B_EDEFAULT : newMultiplicidadB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B, oldMultiplicidadB, multiplicidadB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getTargetTabla() {
		if (targetTabla != null && targetTabla.eIsProxy()) {
			InternalEObject oldTargetTabla = (InternalEObject)targetTabla;
			targetTabla = (Tabla)eResolveProxy(oldTargetTabla);
			if (targetTabla != oldTargetTabla) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SintaxisabstractaPackage.RELACION__TARGET_TABLA, oldTargetTabla, targetTabla));
			}
		}
		return targetTabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTargetTabla() {
		return targetTabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetTabla(Tabla newTargetTabla, NotificationChain msgs) {
		Tabla oldTargetTabla = targetTabla;
		targetTabla = newTargetTabla;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__TARGET_TABLA, oldTargetTabla, newTargetTabla);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTabla(Tabla newTargetTabla) {
		if (newTargetTabla != targetTabla) {
			NotificationChain msgs = null;
			if (targetTabla != null)
				msgs = ((InternalEObject)targetTabla).eInverseRemove(this, SintaxisabstractaPackage.TABLA__RELACIONES_B, Tabla.class, msgs);
			if (newTargetTabla != null)
				msgs = ((InternalEObject)newTargetTabla).eInverseAdd(this, SintaxisabstractaPackage.TABLA__RELACIONES_B, Tabla.class, msgs);
			msgs = basicSetTargetTabla(newTargetTabla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__TARGET_TABLA, newTargetTabla, newTargetTabla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getSourceTabla() {
		if (sourceTabla != null && sourceTabla.eIsProxy()) {
			InternalEObject oldSourceTabla = (InternalEObject)sourceTabla;
			sourceTabla = (Tabla)eResolveProxy(oldSourceTabla);
			if (sourceTabla != oldSourceTabla) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SintaxisabstractaPackage.RELACION__SOURCE_TABLA, oldSourceTabla, sourceTabla));
			}
		}
		return sourceTabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetSourceTabla() {
		return sourceTabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceTabla(Tabla newSourceTabla, NotificationChain msgs) {
		Tabla oldSourceTabla = sourceTabla;
		sourceTabla = newSourceTabla;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__SOURCE_TABLA, oldSourceTabla, newSourceTabla);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTabla(Tabla newSourceTabla) {
		if (newSourceTabla != sourceTabla) {
			NotificationChain msgs = null;
			if (sourceTabla != null)
				msgs = ((InternalEObject)sourceTabla).eInverseRemove(this, SintaxisabstractaPackage.TABLA__RELACIONES_A, Tabla.class, msgs);
			if (newSourceTabla != null)
				msgs = ((InternalEObject)newSourceTabla).eInverseAdd(this, SintaxisabstractaPackage.TABLA__RELACIONES_A, Tabla.class, msgs);
			msgs = basicSetSourceTabla(newSourceTabla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__SOURCE_TABLA, newSourceTabla, newSourceTabla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SintaxisAbstracta getThesintaxisAbstracta() {
		if (eContainerFeatureID() != SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA) return null;
		return (SintaxisAbstracta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThesintaxisAbstracta(SintaxisAbstracta newThesintaxisAbstracta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThesintaxisAbstracta, SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThesintaxisAbstracta(SintaxisAbstracta newThesintaxisAbstracta) {
		if (newThesintaxisAbstracta != eInternalContainer() || (eContainerFeatureID() != SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA && newThesintaxisAbstracta != null)) {
			if (EcoreUtil.isAncestor(this, newThesintaxisAbstracta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThesintaxisAbstracta != null)
				msgs = ((InternalEObject)newThesintaxisAbstracta).eInverseAdd(this, ModelofinalPackage.SINTAXIS_ABSTRACTA__LISTA_RELACIONES, SintaxisAbstracta.class, msgs);
			msgs = basicSetThesintaxisAbstracta(newThesintaxisAbstracta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA, newThesintaxisAbstracta, newThesintaxisAbstracta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				if (targetTabla != null)
					msgs = ((InternalEObject)targetTabla).eInverseRemove(this, SintaxisabstractaPackage.TABLA__RELACIONES_B, Tabla.class, msgs);
				return basicSetTargetTabla((Tabla)otherEnd, msgs);
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				if (sourceTabla != null)
					msgs = ((InternalEObject)sourceTabla).eInverseRemove(this, SintaxisabstractaPackage.TABLA__RELACIONES_A, Tabla.class, msgs);
				return basicSetSourceTabla((Tabla)otherEnd, msgs);
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThesintaxisAbstracta((SintaxisAbstracta)otherEnd, msgs);
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
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				return basicSetTargetTabla(null, msgs);
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				return basicSetSourceTabla(null, msgs);
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				return basicSetThesintaxisAbstracta(null, msgs);
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
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				return eInternalContainer().eInverseRemove(this, ModelofinalPackage.SINTAXIS_ABSTRACTA__LISTA_RELACIONES, SintaxisAbstracta.class, msgs);
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
			case SintaxisabstractaPackage.RELACION__NOMBRE:
				return getNombre();
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A:
				return getMultiplicidadA();
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B:
				return getMultiplicidadB();
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				if (resolve) return getTargetTabla();
				return basicGetTargetTabla();
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				if (resolve) return getSourceTabla();
				return basicGetSourceTabla();
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				return getThesintaxisAbstracta();
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
			case SintaxisabstractaPackage.RELACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A:
				setMultiplicidadA((Ocurrencia)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB((Ocurrencia)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				setTargetTabla((Tabla)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				setSourceTabla((Tabla)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				setThesintaxisAbstracta((SintaxisAbstracta)newValue);
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
			case SintaxisabstractaPackage.RELACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A:
				setMultiplicidadA(MULTIPLICIDAD_A_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB(MULTIPLICIDAD_B_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				setTargetTabla((Tabla)null);
				return;
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				setSourceTabla((Tabla)null);
				return;
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				setThesintaxisAbstracta((SintaxisAbstracta)null);
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
			case SintaxisabstractaPackage.RELACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A:
				return multiplicidadA != MULTIPLICIDAD_A_EDEFAULT;
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B:
				return multiplicidadB != MULTIPLICIDAD_B_EDEFAULT;
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				return targetTabla != null;
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				return sourceTabla != null;
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				return getThesintaxisAbstracta() != null;
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
		result.append(", multiplicidadA: ");
		result.append(multiplicidadA);
		result.append(", multiplicidadB: ");
		result.append(multiplicidadB);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
