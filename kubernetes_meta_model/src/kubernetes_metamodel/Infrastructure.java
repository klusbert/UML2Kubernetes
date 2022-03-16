/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.Infrastructure#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link kubernetes_metamodel.Infrastructure#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link kubernetes_metamodel.Infrastructure#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.Infrastructure#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link kubernetes_metamodel.Infrastructure#getAccessibilityType <em>Accessibility Type</em>}</li>
 *   <li>{@link kubernetes_metamodel.Infrastructure#getConfigMaps <em>Config Maps</em>}</li>
 *   <li>{@link kubernetes_metamodel.Infrastructure#getObjectsCount <em>Objects Count</em>}</li>
 *   <li>{@link kubernetes_metamodel.Infrastructure#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure()
 * @model
 * @generated
 */
public interface Infrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Infrastructure#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see #setApiVersion(byte)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_ApiVersion()
	 * @model
	 * @generated
	 */
	byte getApiVersion();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Infrastructure#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(byte value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Kubernetes"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_Name()
	 * @model default="Kubernetes"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Infrastructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.Deployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_Deployments()
	 * @model
	 * @generated
	 */
	EList<Deployment> getDeployments();

	/**
	 * Returns the value of the '<em><b>Accessibility Type</b></em>' attribute.
	 * The literals are from the enumeration {@link kubernetes_metamodel.AccessibilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessibility Type</em>' attribute.
	 * @see kubernetes_metamodel.AccessibilityType
	 * @see #setAccessibilityType(AccessibilityType)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_AccessibilityType()
	 * @model
	 * @generated
	 */
	AccessibilityType getAccessibilityType();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Infrastructure#getAccessibilityType <em>Accessibility Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessibility Type</em>' attribute.
	 * @see kubernetes_metamodel.AccessibilityType
	 * @see #getAccessibilityType()
	 * @generated
	 */
	void setAccessibilityType(AccessibilityType value);

	/**
	 * Returns the value of the '<em><b>Config Maps</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.ConfigMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Maps</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_ConfigMaps()
	 * @model
	 * @generated
	 */
	EList<ConfigMap> getConfigMaps();

	/**
	 * Returns the value of the '<em><b>Objects Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects Count</em>' attribute.
	 * @see #setObjectsCount(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_ObjectsCount()
	 * @model default="0"
	 * @generated
	 */
	int getObjectsCount();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Infrastructure#getObjectsCount <em>Objects Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects Count</em>' attribute.
	 * @see #getObjectsCount()
	 * @generated
	 */
	void setObjectsCount(int value);

	/**
	 * Returns the value of the '<em><b>Random Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Password</em>' attribute.
	 * @see #setRandomPassword(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_RandomPassword()
	 * @model
	 * @generated
	 */

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link kubernetes_metamodel.Secrets}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getInfrastructure_Secrets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Secrets> getSecrets();

} // Infrastructure
