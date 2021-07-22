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

import relaciones.RelacionesPackage;
import relaciones.SintaxisAbstracta;

import sintaxisabstracta.Cardinalidad;
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
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getRoleA <em>Role A</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getRoleB <em>Role B</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getName <em>Name</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getId <em>Id</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getThesintaxisAbstracta <em>Thesintaxis Abstracta</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getTheCardinalidad <em>The Cardinalidad</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getSourceTabla <em>Source Tabla</em>}</li>
 *   <li>{@link sintaxisabstracta.impl.RelacionImpl#getTargetTabla <em>Target Tabla</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends MinimalEObjectImpl.Container implements Relacion {
	/**
	 * The default value of the '{@link #getMultiplicidadA() <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadA()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinalidad MULTIPLICIDAD_A_EDEFAULT = Cardinalidad.MUCHOS;

	/**
	 * The cached value of the '{@link #getMultiplicidadA() <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadA()
	 * @generated
	 * @ordered
	 */
	protected Cardinalidad multiplicidadA = MULTIPLICIDAD_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadB() <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadB()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinalidad MULTIPLICIDAD_B_EDEFAULT = Cardinalidad.MUCHOS;

	/**
	 * The cached value of the '{@link #getMultiplicidadB() <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadB()
	 * @generated
	 * @ordered
	 */
	protected Cardinalidad multiplicidadB = MULTIPLICIDAD_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleA() <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleA()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleA() <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleA()
	 * @generated
	 * @ordered
	 */
	protected String roleA = ROLE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleB() <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleB()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleB() <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleB()
	 * @generated
	 * @ordered
	 */
	protected String roleB = ROLE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTheCardinalidad() <em>The Cardinalidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCardinalidad()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinalidad THE_CARDINALIDAD_EDEFAULT = Cardinalidad.MUCHOS;

	/**
	 * The cached value of the '{@link #getTheCardinalidad() <em>The Cardinalidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCardinalidad()
	 * @generated
	 * @ordered
	 */
	protected Cardinalidad theCardinalidad = THE_CARDINALIDAD_EDEFAULT;

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
	 * The cached value of the '{@link #getTargetTabla() <em>Target Tabla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTabla()
	 * @generated
	 * @ordered
	 */
	protected Tabla targetTabla;

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
	public Cardinalidad getMultiplicidadA() {
		return multiplicidadA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadA(Cardinalidad newMultiplicidadA) {
		Cardinalidad oldMultiplicidadA = multiplicidadA;
		multiplicidadA = newMultiplicidadA == null ? MULTIPLICIDAD_A_EDEFAULT : newMultiplicidadA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A, oldMultiplicidadA, multiplicidadA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinalidad getMultiplicidadB() {
		return multiplicidadB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadB(Cardinalidad newMultiplicidadB) {
		Cardinalidad oldMultiplicidadB = multiplicidadB;
		multiplicidadB = newMultiplicidadB == null ? MULTIPLICIDAD_B_EDEFAULT : newMultiplicidadB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B, oldMultiplicidadB, multiplicidadB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleA() {
		return roleA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleA(String newRoleA) {
		String oldRoleA = roleA;
		roleA = newRoleA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__ROLE_A, oldRoleA, roleA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleB() {
		return roleB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleB(String newRoleB) {
		String oldRoleB = roleB;
		roleB = newRoleB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__ROLE_B, oldRoleB, roleB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__ID, oldId, id));
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
				msgs = ((InternalEObject)newThesintaxisAbstracta).eInverseAdd(this, RelacionesPackage.SINTAXIS_ABSTRACTA__LISTA_RELACIONES, SintaxisAbstracta.class, msgs);
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
	public Cardinalidad getTheCardinalidad() {
		return theCardinalidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCardinalidad(Cardinalidad newTheCardinalidad) {
		Cardinalidad oldTheCardinalidad = theCardinalidad;
		theCardinalidad = newTheCardinalidad == null ? THE_CARDINALIDAD_EDEFAULT : newTheCardinalidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SintaxisabstractaPackage.RELACION__THE_CARDINALIDAD, oldTheCardinalidad, theCardinalidad));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThesintaxisAbstracta((SintaxisAbstracta)otherEnd, msgs);
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				if (sourceTabla != null)
					msgs = ((InternalEObject)sourceTabla).eInverseRemove(this, SintaxisabstractaPackage.TABLA__RELACIONES_A, Tabla.class, msgs);
				return basicSetSourceTabla((Tabla)otherEnd, msgs);
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				if (targetTabla != null)
					msgs = ((InternalEObject)targetTabla).eInverseRemove(this, SintaxisabstractaPackage.TABLA__RELACIONES_B, Tabla.class, msgs);
				return basicSetTargetTabla((Tabla)otherEnd, msgs);
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
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				return basicSetThesintaxisAbstracta(null, msgs);
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				return basicSetSourceTabla(null, msgs);
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				return basicSetTargetTabla(null, msgs);
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
				return eInternalContainer().eInverseRemove(this, RelacionesPackage.SINTAXIS_ABSTRACTA__LISTA_RELACIONES, SintaxisAbstracta.class, msgs);
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
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A:
				return getMultiplicidadA();
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B:
				return getMultiplicidadB();
			case SintaxisabstractaPackage.RELACION__ROLE_A:
				return getRoleA();
			case SintaxisabstractaPackage.RELACION__ROLE_B:
				return getRoleB();
			case SintaxisabstractaPackage.RELACION__NAME:
				return getName();
			case SintaxisabstractaPackage.RELACION__ID:
				return getId();
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				return getThesintaxisAbstracta();
			case SintaxisabstractaPackage.RELACION__THE_CARDINALIDAD:
				return getTheCardinalidad();
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				if (resolve) return getSourceTabla();
				return basicGetSourceTabla();
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				if (resolve) return getTargetTabla();
				return basicGetTargetTabla();
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
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A:
				setMultiplicidadA((Cardinalidad)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB((Cardinalidad)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__ROLE_A:
				setRoleA((String)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__ROLE_B:
				setRoleB((String)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__NAME:
				setName((String)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__ID:
				setId((String)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				setThesintaxisAbstracta((SintaxisAbstracta)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__THE_CARDINALIDAD:
				setTheCardinalidad((Cardinalidad)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				setSourceTabla((Tabla)newValue);
				return;
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				setTargetTabla((Tabla)newValue);
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
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A:
				setMultiplicidadA(MULTIPLICIDAD_A_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB(MULTIPLICIDAD_B_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__ROLE_A:
				setRoleA(ROLE_A_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__ROLE_B:
				setRoleB(ROLE_B_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__ID:
				setId(ID_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				setThesintaxisAbstracta((SintaxisAbstracta)null);
				return;
			case SintaxisabstractaPackage.RELACION__THE_CARDINALIDAD:
				setTheCardinalidad(THE_CARDINALIDAD_EDEFAULT);
				return;
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				setSourceTabla((Tabla)null);
				return;
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				setTargetTabla((Tabla)null);
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
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_A:
				return multiplicidadA != MULTIPLICIDAD_A_EDEFAULT;
			case SintaxisabstractaPackage.RELACION__MULTIPLICIDAD_B:
				return multiplicidadB != MULTIPLICIDAD_B_EDEFAULT;
			case SintaxisabstractaPackage.RELACION__ROLE_A:
				return ROLE_A_EDEFAULT == null ? roleA != null : !ROLE_A_EDEFAULT.equals(roleA);
			case SintaxisabstractaPackage.RELACION__ROLE_B:
				return ROLE_B_EDEFAULT == null ? roleB != null : !ROLE_B_EDEFAULT.equals(roleB);
			case SintaxisabstractaPackage.RELACION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SintaxisabstractaPackage.RELACION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SintaxisabstractaPackage.RELACION__THESINTAXIS_ABSTRACTA:
				return getThesintaxisAbstracta() != null;
			case SintaxisabstractaPackage.RELACION__THE_CARDINALIDAD:
				return theCardinalidad != THE_CARDINALIDAD_EDEFAULT;
			case SintaxisabstractaPackage.RELACION__SOURCE_TABLA:
				return sourceTabla != null;
			case SintaxisabstractaPackage.RELACION__TARGET_TABLA:
				return targetTabla != null;
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
		result.append(" (multiplicidadA: ");
		result.append(multiplicidadA);
		result.append(", multiplicidadB: ");
		result.append(multiplicidadB);
		result.append(", roleA: ");
		result.append(roleA);
		result.append(", roleB: ");
		result.append(roleB);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", theCardinalidad: ");
		result.append(theCardinalidad);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
