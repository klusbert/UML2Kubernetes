/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage
 * @generated
 */
public interface Kubernetes_metamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Kubernetes_metamodelFactory eINSTANCE = kubernetes_metamodel.impl.Kubernetes_metamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure</em>'.
	 * @generated
	 */
	Infrastructure createInfrastructure();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Enviroment Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enviroment Variables</em>'.
	 * @generated
	 */
	EnviromentVariables createEnviromentVariables();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Persistent Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistent Data</em>'.
	 * @generated
	 */
	PersistentData createPersistentData();

	/**
	 * Returns a new object of class '<em>Ingress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingress</em>'.
	 * @generated
	 */
	Ingress createIngress();

	/**
	 * Returns a new object of class '<em>Security Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Context</em>'.
	 * @generated
	 */
	SecurityContext createSecurityContext();

	/**
	 * Returns a new object of class '<em>Resource Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Allocation</em>'.
	 * @generated
	 */
	ResourceAllocation createResourceAllocation();

	/**
	 * Returns a new object of class '<em>Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capabilities</em>'.
	 * @generated
	 */
	Capabilities createCapabilities();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Kubernetes_metamodelPackage getKubernetes_metamodelPackage();

} //Kubernetes_metamodelFactory
