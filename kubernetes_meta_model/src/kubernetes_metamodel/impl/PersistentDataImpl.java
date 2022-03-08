/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.Kubernetes_metamodelPackage;
import kubernetes_metamodel.PersistentData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistent Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.PersistentDataImpl#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.PersistentDataImpl#getSizeInGB <em>Size In GB</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistentDataImpl extends MinimalEObjectImpl.Container implements PersistentData {
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
	 * The default value of the '{@link #getSizeInGB() <em>Size In GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInGB()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_IN_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeInGB() <em>Size In GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInGB()
	 * @generated
	 * @ordered
	 */
	protected int sizeInGB = SIZE_IN_GB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistentDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.PERSISTENT_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.PERSISTENT_DATA__MOUNT_PATH, oldMountPath, mountPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizeInGB() {
		return sizeInGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInGB(int newSizeInGB) {
		int oldSizeInGB = sizeInGB;
		sizeInGB = newSizeInGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.PERSISTENT_DATA__SIZE_IN_GB, oldSizeInGB, sizeInGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.PERSISTENT_DATA__MOUNT_PATH:
				return getMountPath();
			case Kubernetes_metamodelPackage.PERSISTENT_DATA__SIZE_IN_GB:
				return getSizeInGB();
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
			case Kubernetes_metamodelPackage.PERSISTENT_DATA__MOUNT_PATH:
				setMountPath((String)newValue);
				return;
			case Kubernetes_metamodelPackage.PERSISTENT_DATA__SIZE_IN_GB:
				setSizeInGB((Integer)newValue);
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
			case Kubernetes_metamodelPackage.PERSISTENT_DATA__MOUNT_PATH:
				setMountPath(MOUNT_PATH_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.PERSISTENT_DATA__SIZE_IN_GB:
				setSizeInGB(SIZE_IN_GB_EDEFAULT);
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
			case Kubernetes_metamodelPackage.PERSISTENT_DATA__MOUNT_PATH:
				return MOUNT_PATH_EDEFAULT == null ? mountPath != null : !MOUNT_PATH_EDEFAULT.equals(mountPath);
			case Kubernetes_metamodelPackage.PERSISTENT_DATA__SIZE_IN_GB:
				return sizeInGB != SIZE_IN_GB_EDEFAULT;
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
		result.append(" (mountPath: ");
		result.append(mountPath);
		result.append(", sizeInGB: ");
		result.append(sizeInGB);
		result.append(')');
		return result.toString();
	}

} //PersistentDataImpl
