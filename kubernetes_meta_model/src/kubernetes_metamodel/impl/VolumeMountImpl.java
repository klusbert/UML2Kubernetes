/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.Kubernetes_metamodelPackage;
import kubernetes_metamodel.VolumeMount;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume Mount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.VolumeMountImpl#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.VolumeMountImpl#getMountPath <em>Mount Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeMountImpl extends MinimalEObjectImpl.Container implements VolumeMount {
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
	 * The default value of the '{@link #getMountPath() <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMountPath() <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountPath()
	 * @generated
	 * @ordered
	 */
	protected String mountPath = MOUNT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeMountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.VOLUME_MOUNT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.VOLUME_MOUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMountPath() {
		return mountPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountPath(String newMountPath) {
		String oldMountPath = mountPath;
		mountPath = newMountPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.VOLUME_MOUNT__MOUNT_PATH, oldMountPath, mountPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.VOLUME_MOUNT__NAME:
				return getName();
			case Kubernetes_metamodelPackage.VOLUME_MOUNT__MOUNT_PATH:
				return getMountPath();
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
			case Kubernetes_metamodelPackage.VOLUME_MOUNT__NAME:
				setName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.VOLUME_MOUNT__MOUNT_PATH:
				setMountPath((String)newValue);
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
			case Kubernetes_metamodelPackage.VOLUME_MOUNT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.VOLUME_MOUNT__MOUNT_PATH:
				setMountPath(MOUNT_PATH_EDEFAULT);
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
			case Kubernetes_metamodelPackage.VOLUME_MOUNT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Kubernetes_metamodelPackage.VOLUME_MOUNT__MOUNT_PATH:
				return MOUNT_PATH_EDEFAULT == null ? mountPath != null : !MOUNT_PATH_EDEFAULT.equals(mountPath);
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
		result.append(", mountPath: ");
		result.append(mountPath);
		result.append(')');
		return result.toString();
	}

} //VolumeMountImpl
