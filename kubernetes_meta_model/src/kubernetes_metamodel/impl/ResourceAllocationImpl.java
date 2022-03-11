/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.Kubernetes_metamodelPackage;
import kubernetes_metamodel.ResourceAllocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.ResourceAllocationImpl#getCpuLimit <em>Cpu Limit</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ResourceAllocationImpl#getCpuRequest <em>Cpu Request</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ResourceAllocationImpl#getMemoryLimit <em>Memory Limit</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ResourceAllocationImpl#getMemoryRequest <em>Memory Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAllocationImpl extends MinimalEObjectImpl.Container implements ResourceAllocation {
	/**
	 * The default value of the '{@link #getCpuLimit() <em>Cpu Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuLimit() <em>Cpu Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuLimit()
	 * @generated
	 * @ordered
	 */
	protected String cpuLimit = CPU_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuRequest() <em>Cpu Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuRequest()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuRequest() <em>Cpu Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuRequest()
	 * @generated
	 * @ordered
	 */
	protected String cpuRequest = CPU_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryLimit() <em>Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryLimit() <em>Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected String memoryLimit = MEMORY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryRequest() <em>Memory Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryRequest()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryRequest() <em>Memory Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryRequest()
	 * @generated
	 * @ordered
	 */
	protected String memoryRequest = MEMORY_REQUEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.RESOURCE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpuLimit() {
		return cpuLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuLimit(String newCpuLimit) {
		String oldCpuLimit = cpuLimit;
		cpuLimit = newCpuLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_LIMIT, oldCpuLimit, cpuLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpuRequest() {
		return cpuRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuRequest(String newCpuRequest) {
		String oldCpuRequest = cpuRequest;
		cpuRequest = newCpuRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_REQUEST, oldCpuRequest, cpuRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemoryLimit() {
		return memoryLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryLimit(String newMemoryLimit) {
		String oldMemoryLimit = memoryLimit;
		memoryLimit = newMemoryLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_LIMIT, oldMemoryLimit, memoryLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemoryRequest() {
		return memoryRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryRequest(String newMemoryRequest) {
		String oldMemoryRequest = memoryRequest;
		memoryRequest = newMemoryRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_REQUEST, oldMemoryRequest, memoryRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_LIMIT:
				return getCpuLimit();
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_REQUEST:
				return getCpuRequest();
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_LIMIT:
				return getMemoryLimit();
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_REQUEST:
				return getMemoryRequest();
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
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_LIMIT:
				setCpuLimit((String)newValue);
				return;
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_REQUEST:
				setCpuRequest((String)newValue);
				return;
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_LIMIT:
				setMemoryLimit((String)newValue);
				return;
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_REQUEST:
				setMemoryRequest((String)newValue);
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
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_LIMIT:
				setCpuLimit(CPU_LIMIT_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_REQUEST:
				setCpuRequest(CPU_REQUEST_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_LIMIT:
				setMemoryLimit(MEMORY_LIMIT_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_REQUEST:
				setMemoryRequest(MEMORY_REQUEST_EDEFAULT);
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
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_LIMIT:
				return CPU_LIMIT_EDEFAULT == null ? cpuLimit != null : !CPU_LIMIT_EDEFAULT.equals(cpuLimit);
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__CPU_REQUEST:
				return CPU_REQUEST_EDEFAULT == null ? cpuRequest != null : !CPU_REQUEST_EDEFAULT.equals(cpuRequest);
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_LIMIT:
				return MEMORY_LIMIT_EDEFAULT == null ? memoryLimit != null : !MEMORY_LIMIT_EDEFAULT.equals(memoryLimit);
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION__MEMORY_REQUEST:
				return MEMORY_REQUEST_EDEFAULT == null ? memoryRequest != null : !MEMORY_REQUEST_EDEFAULT.equals(memoryRequest);
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
		result.append(" (cpuLimit: ");
		result.append(cpuLimit);
		result.append(", cpuRequest: ");
		result.append(cpuRequest);
		result.append(", memoryLimit: ");
		result.append(memoryLimit);
		result.append(", memoryRequest: ");
		result.append(memoryRequest);
		result.append(')');
		return result.toString();
	}

} //ResourceAllocationImpl
