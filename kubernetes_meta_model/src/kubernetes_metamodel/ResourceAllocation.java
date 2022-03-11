/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.ResourceAllocation#getCpuLimit <em>Cpu Limit</em>}</li>
 *   <li>{@link kubernetes_metamodel.ResourceAllocation#getCpuRequest <em>Cpu Request</em>}</li>
 *   <li>{@link kubernetes_metamodel.ResourceAllocation#getMemoryLimit <em>Memory Limit</em>}</li>
 *   <li>{@link kubernetes_metamodel.ResourceAllocation#getMemoryRequest <em>Memory Request</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getResourceAllocation()
 * @model
 * @generated
 */
public interface ResourceAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpu Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Limit</em>' attribute.
	 * @see #setCpuLimit(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getResourceAllocation_CpuLimit()
	 * @model
	 * @generated
	 */
	String getCpuLimit();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ResourceAllocation#getCpuLimit <em>Cpu Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Limit</em>' attribute.
	 * @see #getCpuLimit()
	 * @generated
	 */
	void setCpuLimit(String value);

	/**
	 * Returns the value of the '<em><b>Cpu Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Request</em>' attribute.
	 * @see #setCpuRequest(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getResourceAllocation_CpuRequest()
	 * @model
	 * @generated
	 */
	String getCpuRequest();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ResourceAllocation#getCpuRequest <em>Cpu Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Request</em>' attribute.
	 * @see #getCpuRequest()
	 * @generated
	 */
	void setCpuRequest(String value);

	/**
	 * Returns the value of the '<em><b>Memory Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Limit</em>' attribute.
	 * @see #setMemoryLimit(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getResourceAllocation_MemoryLimit()
	 * @model
	 * @generated
	 */
	String getMemoryLimit();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ResourceAllocation#getMemoryLimit <em>Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Limit</em>' attribute.
	 * @see #getMemoryLimit()
	 * @generated
	 */
	void setMemoryLimit(String value);

	/**
	 * Returns the value of the '<em><b>Memory Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Request</em>' attribute.
	 * @see #setMemoryRequest(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getResourceAllocation_MemoryRequest()
	 * @model
	 * @generated
	 */
	String getMemoryRequest();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ResourceAllocation#getMemoryRequest <em>Memory Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Request</em>' attribute.
	 * @see #getMemoryRequest()
	 * @generated
	 */
	void setMemoryRequest(String value);

} // ResourceAllocation
