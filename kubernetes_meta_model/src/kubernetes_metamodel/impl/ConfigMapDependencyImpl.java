/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.ConfigMapDependency;
import kubernetes_metamodel.Kubernetes_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Map Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapDependencyImpl#getEnvName <em>Env Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapDependencyImpl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapDependencyImpl#getConfigMapName <em>Config Map Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigMapDependencyImpl extends MinimalEObjectImpl.Container implements ConfigMapDependency {
	/**
	 * The default value of the '{@link #getEnvName() <em>Env Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvName() <em>Env Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvName()
	 * @generated
	 * @ordered
	 */
	protected String envName = ENV_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected String keyName = KEY_NAME_EDEFAULT;

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
	protected ConfigMapDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.CONFIG_MAP_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvName() {
		return envName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvName(String newEnvName) {
		String oldEnvName = envName;
		envName = newEnvName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__ENV_NAME, oldEnvName, envName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyName(String newKeyName) {
		String oldKeyName = keyName;
		keyName = newKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__KEY_NAME, oldKeyName, keyName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME, oldConfigMapName, configMapName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__ENV_NAME:
				return getEnvName();
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__KEY_NAME:
				return getKeyName();
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME:
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
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__ENV_NAME:
				setEnvName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__KEY_NAME:
				setKeyName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME:
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
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__ENV_NAME:
				setEnvName(ENV_NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__KEY_NAME:
				setKeyName(KEY_NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME:
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
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__ENV_NAME:
				return ENV_NAME_EDEFAULT == null ? envName != null : !ENV_NAME_EDEFAULT.equals(envName);
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__KEY_NAME:
				return KEY_NAME_EDEFAULT == null ? keyName != null : !KEY_NAME_EDEFAULT.equals(keyName);
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME:
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
		result.append(" (envName: ");
		result.append(envName);
		result.append(", keyName: ");
		result.append(keyName);
		result.append(", configMapName: ");
		result.append(configMapName);
		result.append(')');
		return result.toString();
	}

} //ConfigMapDependencyImpl
