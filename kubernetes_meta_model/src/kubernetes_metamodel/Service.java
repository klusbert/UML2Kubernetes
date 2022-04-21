/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.Service#getPort <em>Port</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#isPublicAccess <em>Public Access</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#getAccessibilityType <em>Accessibility Type</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#getId <em>Id</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#isMultipleEndpoints <em>Multiple Endpoints</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#getIngress <em>Ingress</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#getDeploymentName <em>Deployment Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.Service#getDeploymentPort <em>Deployment Port</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Public Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Access</em>' attribute.
	 * @see #setPublicAccess(boolean)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_PublicAccess()
	 * @model
	 * @generated
	 */
	boolean isPublicAccess();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#isPublicAccess <em>Public Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Access</em>' attribute.
	 * @see #isPublicAccess()
	 * @generated
	 */
	void setPublicAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Accessibility Type</b></em>' attribute.
	 * The literals are from the enumeration {@link kubernetes_metamodel.AccessibilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessibility Type</em>' attribute.
	 * @see kubernetes_metamodel.AccessibilityType
	 * @see #setAccessibilityType(AccessibilityType)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_AccessibilityType()
	 * @model
	 * @generated
	 */
	AccessibilityType getAccessibilityType();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#getAccessibilityType <em>Accessibility Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessibility Type</em>' attribute.
	 * @see kubernetes_metamodel.AccessibilityType
	 * @see #getAccessibilityType()
	 * @generated
	 */
	void setAccessibilityType(AccessibilityType value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link kubernetes_metamodel.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see kubernetes_metamodel.Protocol
	 * @see #setProtocol(Protocol)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see kubernetes_metamodel.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Multiple Endpoints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Endpoints</em>' attribute.
	 * @see #setMultipleEndpoints(boolean)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_MultipleEndpoints()
	 * @model
	 * @generated
	 */
	boolean isMultipleEndpoints();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#isMultipleEndpoints <em>Multiple Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Endpoints</em>' attribute.
	 * @see #isMultipleEndpoints()
	 * @generated
	 */
	void setMultipleEndpoints(boolean value);

	/**
	 * Returns the value of the '<em><b>Ingress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingress</em>' reference.
	 * @see #setIngress(Ingress)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_Ingress()
	 * @model
	 * @generated
	 */
	Ingress getIngress();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#getIngress <em>Ingress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingress</em>' reference.
	 * @see #getIngress()
	 * @generated
	 */
	void setIngress(Ingress value);

	/**
	 * Returns the value of the '<em><b>Deployment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Name</em>' attribute.
	 * @see #setDeploymentName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_DeploymentName()
	 * @model
	 * @generated
	 */
	String getDeploymentName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#getDeploymentName <em>Deployment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Name</em>' attribute.
	 * @see #getDeploymentName()
	 * @generated
	 */
	void setDeploymentName(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Port</em>' attribute.
	 * @see #setDeploymentPort(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getService_DeploymentPort()
	 * @model
	 * @generated
	 */
	int getDeploymentPort();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Service#getDeploymentPort <em>Deployment Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Port</em>' attribute.
	 * @see #getDeploymentPort()
	 * @generated
	 */
	void setDeploymentPort(int value);

} // Service
