/**
 */
package kubernetes_metamodel.impl;

import java.util.Collection;

import kubernetes_metamodel.AccessibilityType;
import kubernetes_metamodel.ConfigMap;
import kubernetes_metamodel.Deployment;
import kubernetes_metamodel.Infrastructure;
import kubernetes_metamodel.Kubernetes_metamodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.InfrastructureImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.InfrastructureImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.InfrastructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.InfrastructureImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.InfrastructureImpl#getAccessibilityType <em>Accessibility Type</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.InfrastructureImpl#getConfigMaps <em>Config Maps</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.InfrastructureImpl#getObjectsCount <em>Objects Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureImpl extends MinimalEObjectImpl.Container implements Infrastructure {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final byte API_VERSION_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected byte apiVersion = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Kubernetes";

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
	 * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployments;

	/**
	 * The default value of the '{@link #getAccessibilityType() <em>Accessibility Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibilityType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessibilityType ACCESSIBILITY_TYPE_EDEFAULT = AccessibilityType.NODE_PORT;

	/**
	 * The cached value of the '{@link #getAccessibilityType() <em>Accessibility Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibilityType()
	 * @generated
	 * @ordered
	 */
	protected AccessibilityType accessibilityType = ACCESSIBILITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigMaps() <em>Config Maps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigMap> configMaps;

	/**
	 * The default value of the '{@link #getObjectsCount() <em>Objects Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsCount()
	 * @generated
	 * @ordered
	 */
	protected static final int OBJECTS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getObjectsCount() <em>Objects Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsCount()
	 * @generated
	 * @ordered
	 */
	protected int objectsCount = OBJECTS_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.INFRASTRUCTURE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiVersion(byte newApiVersion) {
		byte oldApiVersion = apiVersion;
		apiVersion = newApiVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.INFRASTRUCTURE__API_VERSION, oldApiVersion, apiVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.INFRASTRUCTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployments() {
		if (deployments == null) {
			deployments = new EObjectResolvingEList<Deployment>(Deployment.class, this, Kubernetes_metamodelPackage.INFRASTRUCTURE__DEPLOYMENTS);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessibilityType getAccessibilityType() {
		return accessibilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessibilityType(AccessibilityType newAccessibilityType) {
		AccessibilityType oldAccessibilityType = accessibilityType;
		accessibilityType = newAccessibilityType == null ? ACCESSIBILITY_TYPE_EDEFAULT : newAccessibilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.INFRASTRUCTURE__ACCESSIBILITY_TYPE, oldAccessibilityType, accessibilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigMap> getConfigMaps() {
		if (configMaps == null) {
			configMaps = new EObjectResolvingEList<ConfigMap>(ConfigMap.class, this, Kubernetes_metamodelPackage.INFRASTRUCTURE__CONFIG_MAPS);
		}
		return configMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getObjectsCount() {
		return objectsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectsCount(int newObjectsCount) {
		int oldObjectsCount = objectsCount;
		objectsCount = newObjectsCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.INFRASTRUCTURE__OBJECTS_COUNT, oldObjectsCount, objectsCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRandomPassword() {
		 String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$";
	     Integer passwordLength = 20;
	     java.util.Random random = new  java.util.Random();

	     StringBuilder sb = new StringBuilder();

	     for (int i = 0; i < passwordLength; i++)
	     {
	        int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	     }

	     return sb.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String hej() {		
		return "asd";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__NAMESPACE:
				return getNamespace();
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__API_VERSION:
				return getApiVersion();
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__NAME:
				return getName();
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__DEPLOYMENTS:
				return getDeployments();
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__ACCESSIBILITY_TYPE:
				return getAccessibilityType();
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__CONFIG_MAPS:
				return getConfigMaps();
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__OBJECTS_COUNT:
				return getObjectsCount();
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
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__API_VERSION:
				setApiVersion((Byte)newValue);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__NAME:
				setName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__DEPLOYMENTS:
				getDeployments().clear();
				getDeployments().addAll((Collection<? extends Deployment>)newValue);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__ACCESSIBILITY_TYPE:
				setAccessibilityType((AccessibilityType)newValue);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__CONFIG_MAPS:
				getConfigMaps().clear();
				getConfigMaps().addAll((Collection<? extends ConfigMap>)newValue);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__OBJECTS_COUNT:
				setObjectsCount((Integer)newValue);
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
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__API_VERSION:
				setApiVersion(API_VERSION_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__DEPLOYMENTS:
				getDeployments().clear();
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__ACCESSIBILITY_TYPE:
				setAccessibilityType(ACCESSIBILITY_TYPE_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__CONFIG_MAPS:
				getConfigMaps().clear();
				return;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__OBJECTS_COUNT:
				setObjectsCount(OBJECTS_COUNT_EDEFAULT);
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
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__API_VERSION:
				return apiVersion != API_VERSION_EDEFAULT;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__DEPLOYMENTS:
				return deployments != null && !deployments.isEmpty();
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__ACCESSIBILITY_TYPE:
				return accessibilityType != ACCESSIBILITY_TYPE_EDEFAULT;
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__CONFIG_MAPS:
				return configMaps != null && !configMaps.isEmpty();
			case Kubernetes_metamodelPackage.INFRASTRUCTURE__OBJECTS_COUNT:
				return objectsCount != OBJECTS_COUNT_EDEFAULT;
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
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", apiVersion: ");
		result.append(apiVersion);
		result.append(", name: ");
		result.append(name);
		result.append(", accessibilityType: ");
		result.append(accessibilityType);
		result.append(", objectsCount: ");
		result.append(objectsCount);
		result.append(')');
		return result.toString();
	}

} //InfrastructureImpl
