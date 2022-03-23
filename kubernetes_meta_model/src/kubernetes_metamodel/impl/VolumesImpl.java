/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.Kubernetes_metamodelPackage;
import kubernetes_metamodel.VolumeType;
import kubernetes_metamodel.Volumes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volumes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.VolumesImpl#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.VolumesImpl#getType <em>Type</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.VolumesImpl#getClaimName <em>Claim Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.VolumesImpl#getConfigMapName <em>Config Map Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumesImpl extends MinimalEObjectImpl.Container implements Volumes {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VolumeType TYPE_EDEFAULT = VolumeType.PERSISTENT_VOLUME_CLAIM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VolumeType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClaimName() <em>Claim Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAIM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClaimName() <em>Claim Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimName()
	 * @generated
	 * @ordered
	 */
	protected String claimName = CLAIM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigMapName() <em>Config Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigMapName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_MAP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigMapName() <em>Config Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigMapName()
	 * @generated
	 * @ordered
	 */
	protected String configMapName = CONFIG_MAP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.VOLUME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.VOLUME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VolumeType newType) {
		VolumeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.VOLUME__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClaimName() {
		return claimName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimName(String newClaimName) {
		String oldClaimName = claimName;
		claimName = newClaimName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.VOLUME__CLAIM_NAME, oldClaimName, claimName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigMapName() {
		return configMapName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigMapName(String newConfigMapName) {
		String oldConfigMapName = configMapName;
		configMapName = newConfigMapName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.VOLUME__CONFIG_MAP_NAME, oldConfigMapName, configMapName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.VOLUME__NAME:
				return getName();
			case Kubernetes_metamodelPackage.VOLUME__TYPE:
				return getType();
			case Kubernetes_metamodelPackage.VOLUME__CLAIM_NAME:
				return getClaimName();
			case Kubernetes_metamodelPackage.VOLUME__CONFIG_MAP_NAME:
				return getConfigMapName();
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
			case Kubernetes_metamodelPackage.VOLUME__NAME:
				setName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.VOLUME__TYPE:
				setType((VolumeType)newValue);
				return;
			case Kubernetes_metamodelPackage.VOLUME__CLAIM_NAME:
				setClaimName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.VOLUME__CONFIG_MAP_NAME:
				setConfigMapName((String)newValue);
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
			case Kubernetes_metamodelPackage.VOLUME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.VOLUME__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.VOLUME__CLAIM_NAME:
				setClaimName(CLAIM_NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.VOLUME__CONFIG_MAP_NAME:
				setConfigMapName(CONFIG_MAP_NAME_EDEFAULT);
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
			case Kubernetes_metamodelPackage.VOLUME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Kubernetes_metamodelPackage.VOLUME__TYPE:
				return type != TYPE_EDEFAULT;
			case Kubernetes_metamodelPackage.VOLUME__CLAIM_NAME:
				return CLAIM_NAME_EDEFAULT == null ? claimName != null : !CLAIM_NAME_EDEFAULT.equals(claimName);
			case Kubernetes_metamodelPackage.VOLUME__CONFIG_MAP_NAME:
				return CONFIG_MAP_NAME_EDEFAULT == null ? configMapName != null : !CONFIG_MAP_NAME_EDEFAULT.equals(configMapName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", claimName: ");
		result.append(claimName);
		result.append(", configMapName: ");
		result.append(configMapName);
		result.append(')');
		return result.toString();
	}

} //VolumesImpl
