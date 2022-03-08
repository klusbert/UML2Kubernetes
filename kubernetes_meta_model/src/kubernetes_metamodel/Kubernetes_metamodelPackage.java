/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kubernetes_metamodel.Kubernetes_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Kubernetes_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kubernetes_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kubernetesModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kubernetes_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Kubernetes_metamodelPackage eINSTANCE = kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.InfrastructureImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__API_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__DEPLOYMENTS = 3;

	/**
	 * The feature id for the '<em><b>Accessibility Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__ACCESSIBILITY_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.DeploymentImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PORT = 1;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__REPLICAS = 2;

	/**
	 * The feature id for the '<em><b>Enviroment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ENVIROMENT_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Data Persistent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DATA_PERSISTENT = 7;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAMESPACE = 8;

	/**
	 * The feature id for the '<em><b>Ingress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__INGRESS = 9;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.EnviromentVariablesImpl <em>Enviroment Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.EnviromentVariablesImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getEnviromentVariables()
	 * @generated
	 */
	int ENVIROMENT_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_VARIABLES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_VARIABLES__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enviroment Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_VARIABLES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enviroment Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_VARIABLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.ServiceImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORT = 0;

	/**
	 * The feature id for the '<em><b>Public Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PUBLIC_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Accessibility Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ACCESSIBILITY_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.PersistentDataImpl <em>Persistent Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.PersistentDataImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getPersistentData()
	 * @generated
	 */
	int PERSISTENT_DATA = 4;

	/**
	 * The feature id for the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_DATA__MOUNT_PATH = 0;

	/**
	 * The feature id for the '<em><b>Size In GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_DATA__SIZE_IN_GB = 1;

	/**
	 * The number of structural features of the '<em>Persistent Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Persistent Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.IngressImpl <em>Ingress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.IngressImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getIngress()
	 * @generated
	 */
	int INGRESS = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__PATH = 0;

	/**
	 * The number of structural features of the '<em>Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.AccessibilityType <em>Accessibility Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.AccessibilityType
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getAccessibilityType()
	 * @generated
	 */
	int ACCESSIBILITY_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see kubernetes_metamodel.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Infrastructure#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getNamespace()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Infrastructure#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getApiVersion()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Infrastructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getName()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_Name();

	/**
	 * Returns the meta object for the reference list '{@link kubernetes_metamodel.Infrastructure#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployments</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getDeployments()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Deployments();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Infrastructure#getAccessibilityType <em>Accessibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessibility Type</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getAccessibilityType()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_AccessibilityType();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see kubernetes_metamodel.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see kubernetes_metamodel.Deployment#getImage()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Image();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see kubernetes_metamodel.Deployment#getPort()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Port();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see kubernetes_metamodel.Deployment#getReplicas()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Replicas();

	/**
	 * Returns the meta object for the containment reference list '{@link kubernetes_metamodel.Deployment#getEnviromentVariables <em>Enviroment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enviroment Variables</em>'.
	 * @see kubernetes_metamodel.Deployment#getEnviromentVariables()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_EnviromentVariables();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kubernetes_metamodel.Deployment#getName()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Name();

	/**
	 * Returns the meta object for the reference '{@link kubernetes_metamodel.Deployment#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see kubernetes_metamodel.Deployment#getService()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Service();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see kubernetes_metamodel.Deployment#getIdentifier()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Identifier();

	/**
	 * Returns the meta object for the reference '{@link kubernetes_metamodel.Deployment#getDataPersistent <em>Data Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Persistent</em>'.
	 * @see kubernetes_metamodel.Deployment#getDataPersistent()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_DataPersistent();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see kubernetes_metamodel.Deployment#getNamespace()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Namespace();

	/**
	 * Returns the meta object for the reference '{@link kubernetes_metamodel.Deployment#getIngress <em>Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ingress</em>'.
	 * @see kubernetes_metamodel.Deployment#getIngress()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Ingress();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.EnviromentVariables <em>Enviroment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enviroment Variables</em>'.
	 * @see kubernetes_metamodel.EnviromentVariables
	 * @generated
	 */
	EClass getEnviromentVariables();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.EnviromentVariables#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kubernetes_metamodel.EnviromentVariables#getName()
	 * @see #getEnviromentVariables()
	 * @generated
	 */
	EAttribute getEnviromentVariables_Name();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.EnviromentVariables#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kubernetes_metamodel.EnviromentVariables#getValue()
	 * @see #getEnviromentVariables()
	 * @generated
	 */
	EAttribute getEnviromentVariables_Value();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see kubernetes_metamodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Service#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see kubernetes_metamodel.Service#getPort()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Port();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Service#isPublicAccess <em>Public Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Access</em>'.
	 * @see kubernetes_metamodel.Service#isPublicAccess()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_PublicAccess();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kubernetes_metamodel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Service#getAccessibilityType <em>Accessibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessibility Type</em>'.
	 * @see kubernetes_metamodel.Service#getAccessibilityType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_AccessibilityType();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.PersistentData <em>Persistent Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistent Data</em>'.
	 * @see kubernetes_metamodel.PersistentData
	 * @generated
	 */
	EClass getPersistentData();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.PersistentData#getMountPath <em>Mount Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount Path</em>'.
	 * @see kubernetes_metamodel.PersistentData#getMountPath()
	 * @see #getPersistentData()
	 * @generated
	 */
	EAttribute getPersistentData_MountPath();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.PersistentData#getSizeInGB <em>Size In GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In GB</em>'.
	 * @see kubernetes_metamodel.PersistentData#getSizeInGB()
	 * @see #getPersistentData()
	 * @generated
	 */
	EAttribute getPersistentData_SizeInGB();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.Ingress <em>Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingress</em>'.
	 * @see kubernetes_metamodel.Ingress
	 * @generated
	 */
	EClass getIngress();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Ingress#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see kubernetes_metamodel.Ingress#getPath()
	 * @see #getIngress()
	 * @generated
	 */
	EAttribute getIngress_Path();

	/**
	 * Returns the meta object for enum '{@link kubernetes_metamodel.AccessibilityType <em>Accessibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accessibility Type</em>'.
	 * @see kubernetes_metamodel.AccessibilityType
	 * @generated
	 */
	EEnum getAccessibilityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Kubernetes_metamodelFactory getKubernetes_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.InfrastructureImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__NAMESPACE = eINSTANCE.getInfrastructure_Namespace();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__API_VERSION = eINSTANCE.getInfrastructure_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__NAME = eINSTANCE.getInfrastructure_Name();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__DEPLOYMENTS = eINSTANCE.getInfrastructure_Deployments();

		/**
		 * The meta object literal for the '<em><b>Accessibility Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__ACCESSIBILITY_TYPE = eINSTANCE.getInfrastructure_AccessibilityType();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.DeploymentImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__IMAGE = eINSTANCE.getDeployment_Image();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__PORT = eINSTANCE.getDeployment_Port();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__REPLICAS = eINSTANCE.getDeployment_Replicas();

		/**
		 * The meta object literal for the '<em><b>Enviroment Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__ENVIROMENT_VARIABLES = eINSTANCE.getDeployment_EnviromentVariables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SERVICE = eINSTANCE.getDeployment_Service();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__IDENTIFIER = eINSTANCE.getDeployment_Identifier();

		/**
		 * The meta object literal for the '<em><b>Data Persistent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__DATA_PERSISTENT = eINSTANCE.getDeployment_DataPersistent();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__NAMESPACE = eINSTANCE.getDeployment_Namespace();

		/**
		 * The meta object literal for the '<em><b>Ingress</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__INGRESS = eINSTANCE.getDeployment_Ingress();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.EnviromentVariablesImpl <em>Enviroment Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.EnviromentVariablesImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getEnviromentVariables()
		 * @generated
		 */
		EClass ENVIROMENT_VARIABLES = eINSTANCE.getEnviromentVariables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIROMENT_VARIABLES__NAME = eINSTANCE.getEnviromentVariables_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIROMENT_VARIABLES__VALUE = eINSTANCE.getEnviromentVariables_Value();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.ServiceImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PORT = eINSTANCE.getService_Port();

		/**
		 * The meta object literal for the '<em><b>Public Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PUBLIC_ACCESS = eINSTANCE.getService_PublicAccess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Accessibility Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ACCESSIBILITY_TYPE = eINSTANCE.getService_AccessibilityType();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.PersistentDataImpl <em>Persistent Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.PersistentDataImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getPersistentData()
		 * @generated
		 */
		EClass PERSISTENT_DATA = eINSTANCE.getPersistentData();

		/**
		 * The meta object literal for the '<em><b>Mount Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_DATA__MOUNT_PATH = eINSTANCE.getPersistentData_MountPath();

		/**
		 * The meta object literal for the '<em><b>Size In GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_DATA__SIZE_IN_GB = eINSTANCE.getPersistentData_SizeInGB();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.IngressImpl <em>Ingress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.IngressImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getIngress()
		 * @generated
		 */
		EClass INGRESS = eINSTANCE.getIngress();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS__PATH = eINSTANCE.getIngress_Path();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.AccessibilityType <em>Accessibility Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.AccessibilityType
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getAccessibilityType()
		 * @generated
		 */
		EEnum ACCESSIBILITY_TYPE = eINSTANCE.getAccessibilityType();

	}

} //Kubernetes_metamodelPackage
