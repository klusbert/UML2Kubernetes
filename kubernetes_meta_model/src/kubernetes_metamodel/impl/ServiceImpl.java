/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.AccessibilityType;
import kubernetes_metamodel.Kubernetes_metamodelPackage;
import kubernetes_metamodel.Protocol;
import kubernetes_metamodel.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.ServiceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ServiceImpl#isPublicAccess <em>Public Access</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ServiceImpl#getAccessibilityType <em>Accessibility Type</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ServiceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ServiceImpl#isMultipleEndpoints <em>Multiple Endpoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublicAccess() <em>Public Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublicAccess() <em>Public Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean publicAccess = PUBLIC_ACCESS_EDEFAULT;

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
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_EDEFAULT = Protocol.TCP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultipleEndpoints() <em>Multiple Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleEndpoints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_ENDPOINTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleEndpoints() <em>Multiple Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleEndpoints()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleEndpoints = MULTIPLE_ENDPOINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SERVICE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublicAccess() {
		return publicAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicAccess(boolean newPublicAccess) {
		boolean oldPublicAccess = publicAccess;
		publicAccess = newPublicAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SERVICE__PUBLIC_ACCESS, oldPublicAccess, publicAccess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SERVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SERVICE__ACCESSIBILITY_TYPE, oldAccessibilityType, accessibilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Protocol newProtocol) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SERVICE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SERVICE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleEndpoints() {
		return multipleEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleEndpoints(boolean newMultipleEndpoints) {
		boolean oldMultipleEndpoints = multipleEndpoints;
		multipleEndpoints = newMultipleEndpoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SERVICE__MULTIPLE_ENDPOINTS, oldMultipleEndpoints, multipleEndpoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.SERVICE__PORT:
				return getPort();
			case Kubernetes_metamodelPackage.SERVICE__PUBLIC_ACCESS:
				return isPublicAccess();
			case Kubernetes_metamodelPackage.SERVICE__NAME:
				return getName();
			case Kubernetes_metamodelPackage.SERVICE__ACCESSIBILITY_TYPE:
				return getAccessibilityType();
			case Kubernetes_metamodelPackage.SERVICE__PROTOCOL:
				return getProtocol();
			case Kubernetes_metamodelPackage.SERVICE__ID:
				return getId();
			case Kubernetes_metamodelPackage.SERVICE__MULTIPLE_ENDPOINTS:
				return isMultipleEndpoints();
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
			case Kubernetes_metamodelPackage.SERVICE__PORT:
				setPort((Integer)newValue);
				return;
			case Kubernetes_metamodelPackage.SERVICE__PUBLIC_ACCESS:
				setPublicAccess((Boolean)newValue);
				return;
			case Kubernetes_metamodelPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.SERVICE__ACCESSIBILITY_TYPE:
				setAccessibilityType((AccessibilityType)newValue);
				return;
			case Kubernetes_metamodelPackage.SERVICE__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case Kubernetes_metamodelPackage.SERVICE__ID:
				setId((Integer)newValue);
				return;
			case Kubernetes_metamodelPackage.SERVICE__MULTIPLE_ENDPOINTS:
				setMultipleEndpoints((Boolean)newValue);
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
			case Kubernetes_metamodelPackage.SERVICE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SERVICE__PUBLIC_ACCESS:
				setPublicAccess(PUBLIC_ACCESS_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SERVICE__ACCESSIBILITY_TYPE:
				setAccessibilityType(ACCESSIBILITY_TYPE_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SERVICE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SERVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SERVICE__MULTIPLE_ENDPOINTS:
				setMultipleEndpoints(MULTIPLE_ENDPOINTS_EDEFAULT);
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
			case Kubernetes_metamodelPackage.SERVICE__PORT:
				return port != PORT_EDEFAULT;
			case Kubernetes_metamodelPackage.SERVICE__PUBLIC_ACCESS:
				return publicAccess != PUBLIC_ACCESS_EDEFAULT;
			case Kubernetes_metamodelPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Kubernetes_metamodelPackage.SERVICE__ACCESSIBILITY_TYPE:
				return accessibilityType != ACCESSIBILITY_TYPE_EDEFAULT;
			case Kubernetes_metamodelPackage.SERVICE__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case Kubernetes_metamodelPackage.SERVICE__ID:
				return id != ID_EDEFAULT;
			case Kubernetes_metamodelPackage.SERVICE__MULTIPLE_ENDPOINTS:
				return multipleEndpoints != MULTIPLE_ENDPOINTS_EDEFAULT;
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
		result.append(" (port: ");
		result.append(port);
		result.append(", publicAccess: ");
		result.append(publicAccess);
		result.append(", name: ");
		result.append(name);
		result.append(", accessibilityType: ");
		result.append(accessibilityType);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", id: ");
		result.append(id);
		result.append(", multipleEndpoints: ");
		result.append(multipleEndpoints);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
