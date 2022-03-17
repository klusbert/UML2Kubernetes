/**
 */
package kubernetes_metamodel.impl;

import java.util.Collection;
import kubernetes_metamodel.ConfigMapDependency;
import kubernetes_metamodel.Dependency;
import kubernetes_metamodel.Kubernetes_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Map Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapDependencyImpl#getConfigMapName <em>Config Map Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapDependencyImpl#isIsSecret <em>Is Secret</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapDependencyImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigMapDependencyImpl extends MinimalEObjectImpl.Container implements ConfigMapDependency {
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
	 * The default value of the '{@link #isIsSecret() <em>Is Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSecret()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SECRET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSecret() <em>Is Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSecret()
	 * @generated
	 * @ordered
	 */
	protected boolean isSecret = IS_SECRET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependency;

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
	public boolean isIsSecret() {
		return isSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSecret(boolean newIsSecret) {
		boolean oldIsSecret = isSecret;
		isSecret = newIsSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__IS_SECRET, oldIsSecret, isSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectResolvingEList<Dependency>(Dependency.class, this, Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME:
				return getConfigMapName();
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__IS_SECRET:
				return isIsSecret();
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__DEPENDENCY:
				return getDependency();
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
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME:
				setConfigMapName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__IS_SECRET:
				setIsSecret((Boolean)newValue);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends Dependency>)newValue);
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
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME:
				setConfigMapName(CONFIG_MAP_NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__IS_SECRET:
				setIsSecret(IS_SECRET_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__DEPENDENCY:
				getDependency().clear();
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
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME:
				return CONFIG_MAP_NAME_EDEFAULT == null ? configMapName != null : !CONFIG_MAP_NAME_EDEFAULT.equals(configMapName);
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__IS_SECRET:
				return isSecret != IS_SECRET_EDEFAULT;
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
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
		result.append(" (configMapName: ");
		result.append(configMapName);
		result.append(", isSecret: ");
		result.append(isSecret);
		result.append(')');
		return result.toString();
	}

} //ConfigMapDependencyImpl
