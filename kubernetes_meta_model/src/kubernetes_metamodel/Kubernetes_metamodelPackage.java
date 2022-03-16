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
	 * The feature id for the '<em><b>Config Maps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__CONFIG_MAPS = 5;

	/**
	 * The feature id for the '<em><b>Objects Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__OBJECTS_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__SECRETS = 7;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Data Persistent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DATA_PERSISTENT = 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAMESPACE = 7;

	/**
	 * The feature id for the '<em><b>Ingress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__INGRESS = 8;

	/**
	 * The feature id for the '<em><b>Security Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SECURITY_CONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Resource Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__RESOURCE_ALLOCATION = 10;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__COMMAND = 11;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ARGS = 12;

	/**
	 * The feature id for the '<em><b>Memory Mount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__MEMORY_MOUNT = 13;

	/**
	 * The feature id for the '<em><b>Additional Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ADDITIONAL_PORTS = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ID = 15;

	/**
	 * The feature id for the '<em><b>Config Map Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__CONFIG_MAP_DEPENDENCIES = 16;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 17;

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
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = 5;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_DATA__ID = 2;

	/**
	 * The number of structural features of the '<em>Persistent Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_DATA_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link kubernetes_metamodel.impl.SecurityContextImpl <em>Security Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.SecurityContextImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getSecurityContext()
	 * @generated
	 */
	int SECURITY_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Run As Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT__RUN_AS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Run As User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT__RUN_AS_USER = 1;

	/**
	 * The feature id for the '<em><b>Run As Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT__RUN_AS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Fs Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT__FS_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Read Only Root Filesystem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT__READ_ONLY_ROOT_FILESYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT__CAPABILITIES = 5;

	/**
	 * The number of structural features of the '<em>Security Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Security Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.ResourceAllocationImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getResourceAllocation()
	 * @generated
	 */
	int RESOURCE_ALLOCATION = 7;

	/**
	 * The feature id for the '<em><b>Cpu Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION__CPU_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Cpu Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION__CPU_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Memory Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION__MEMORY_LIMIT = 2;

	/**
	 * The feature id for the '<em><b>Memory Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION__MEMORY_REQUEST = 3;

	/**
	 * The number of structural features of the '<em>Resource Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.CapabilitiesImpl <em>Capabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.CapabilitiesImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getCapabilities()
	 * @generated
	 */
	int CAPABILITIES = 8;

	/**
	 * The feature id for the '<em><b>Drop</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__DROP = 0;

	/**
	 * The feature id for the '<em><b>Add</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__ADD = 1;

	/**
	 * The number of structural features of the '<em>Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.PortImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 9;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.MysqlDumpImpl <em>Mysql Dump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.MysqlDumpImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getMysqlDump()
	 * @generated
	 */
	int MYSQL_DUMP = 10;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL_DUMP__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL_DUMP__NAME = 1;

	/**
	 * The number of structural features of the '<em>Mysql Dump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL_DUMP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mysql Dump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYSQL_DUMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.ConfigMapImpl <em>Config Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.ConfigMapImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getConfigMap()
	 * @generated
	 */
	int CONFIG_MAP = 11;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__ID = 2;

	/**
	 * The number of structural features of the '<em>Config Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Config Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.ConfigMapDependencyImpl <em>Config Map Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.ConfigMapDependencyImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getConfigMapDependency()
	 * @generated
	 */
	int CONFIG_MAP_DEPENDENCY = 12;

	/**
	 * The feature id for the '<em><b>Env Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_DEPENDENCY__ENV_NAME = 0;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_DEPENDENCY__KEY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Config Map Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME = 2;

	/**
	 * The number of structural features of the '<em>Config Map Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_DEPENDENCY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Config Map Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.impl.SecretsImpl <em>Secrets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.impl.SecretsImpl
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getSecrets()
	 * @generated
	 */
	int SECRETS = 13;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS__DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS__ID = 2;

	/**
	 * The number of structural features of the '<em>Secrets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Secrets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kubernetes_metamodel.AccessibilityType <em>Accessibility Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.AccessibilityType
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getAccessibilityType()
	 * @generated
	 */
	int ACCESSIBILITY_TYPE = 14;


	/**
	 * The meta object id for the '{@link kubernetes_metamodel.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kubernetes_metamodel.Protocol
	 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 15;


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
	 * Returns the meta object for the reference list '{@link kubernetes_metamodel.Infrastructure#getConfigMaps <em>Config Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Maps</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getConfigMaps()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_ConfigMaps();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Infrastructure#getObjectsCount <em>Objects Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects Count</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getObjectsCount()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_ObjectsCount();

	/**
	 * Returns the meta object for the containment reference list '{@link kubernetes_metamodel.Infrastructure#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secrets</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getSecrets()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Secrets();

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
	 * Returns the meta object for the containment reference '{@link kubernetes_metamodel.Deployment#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see kubernetes_metamodel.Deployment#getService()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Service();

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
	 * Returns the meta object for the reference '{@link kubernetes_metamodel.Deployment#getSecurityContext <em>Security Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Context</em>'.
	 * @see kubernetes_metamodel.Deployment#getSecurityContext()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_SecurityContext();

	/**
	 * Returns the meta object for the reference '{@link kubernetes_metamodel.Deployment#getResourceAllocation <em>Resource Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Allocation</em>'.
	 * @see kubernetes_metamodel.Deployment#getResourceAllocation()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ResourceAllocation();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see kubernetes_metamodel.Deployment#getCommand()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Command();

	/**
	 * Returns the meta object for the attribute list '{@link kubernetes_metamodel.Deployment#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see kubernetes_metamodel.Deployment#getArgs()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Args();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getMemoryMount <em>Memory Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Mount</em>'.
	 * @see kubernetes_metamodel.Deployment#getMemoryMount()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_MemoryMount();

	/**
	 * Returns the meta object for the reference list '{@link kubernetes_metamodel.Deployment#getAdditionalPorts <em>Additional Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Ports</em>'.
	 * @see kubernetes_metamodel.Deployment#getAdditionalPorts()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_AdditionalPorts();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Deployment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kubernetes_metamodel.Deployment#getId()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link kubernetes_metamodel.Deployment#getConfigMapDependencies <em>Config Map Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Map Dependencies</em>'.
	 * @see kubernetes_metamodel.Deployment#getConfigMapDependencies()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ConfigMapDependencies();

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
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Service#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see kubernetes_metamodel.Service#getProtocol()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kubernetes_metamodel.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

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
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.PersistentData#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kubernetes_metamodel.PersistentData#getId()
	 * @see #getPersistentData()
	 * @generated
	 */
	EAttribute getPersistentData_Id();

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
	 * Returns the meta object for class '{@link kubernetes_metamodel.SecurityContext <em>Security Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Context</em>'.
	 * @see kubernetes_metamodel.SecurityContext
	 * @generated
	 */
	EClass getSecurityContext();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.SecurityContext#isRunAsRoot <em>Run As Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run As Root</em>'.
	 * @see kubernetes_metamodel.SecurityContext#isRunAsRoot()
	 * @see #getSecurityContext()
	 * @generated
	 */
	EAttribute getSecurityContext_RunAsRoot();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.SecurityContext#getRunAsUser <em>Run As User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run As User</em>'.
	 * @see kubernetes_metamodel.SecurityContext#getRunAsUser()
	 * @see #getSecurityContext()
	 * @generated
	 */
	EAttribute getSecurityContext_RunAsUser();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.SecurityContext#getRunAsGroup <em>Run As Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run As Group</em>'.
	 * @see kubernetes_metamodel.SecurityContext#getRunAsGroup()
	 * @see #getSecurityContext()
	 * @generated
	 */
	EAttribute getSecurityContext_RunAsGroup();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.SecurityContext#getFsGroup <em>Fs Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fs Group</em>'.
	 * @see kubernetes_metamodel.SecurityContext#getFsGroup()
	 * @see #getSecurityContext()
	 * @generated
	 */
	EAttribute getSecurityContext_FsGroup();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.SecurityContext#isReadOnlyRootFilesystem <em>Read Only Root Filesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only Root Filesystem</em>'.
	 * @see kubernetes_metamodel.SecurityContext#isReadOnlyRootFilesystem()
	 * @see #getSecurityContext()
	 * @generated
	 */
	EAttribute getSecurityContext_ReadOnlyRootFilesystem();

	/**
	 * Returns the meta object for the reference '{@link kubernetes_metamodel.SecurityContext#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capabilities</em>'.
	 * @see kubernetes_metamodel.SecurityContext#getCapabilities()
	 * @see #getSecurityContext()
	 * @generated
	 */
	EReference getSecurityContext_Capabilities();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.ResourceAllocation <em>Resource Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Allocation</em>'.
	 * @see kubernetes_metamodel.ResourceAllocation
	 * @generated
	 */
	EClass getResourceAllocation();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ResourceAllocation#getCpuLimit <em>Cpu Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Limit</em>'.
	 * @see kubernetes_metamodel.ResourceAllocation#getCpuLimit()
	 * @see #getResourceAllocation()
	 * @generated
	 */
	EAttribute getResourceAllocation_CpuLimit();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ResourceAllocation#getCpuRequest <em>Cpu Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Request</em>'.
	 * @see kubernetes_metamodel.ResourceAllocation#getCpuRequest()
	 * @see #getResourceAllocation()
	 * @generated
	 */
	EAttribute getResourceAllocation_CpuRequest();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ResourceAllocation#getMemoryLimit <em>Memory Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Limit</em>'.
	 * @see kubernetes_metamodel.ResourceAllocation#getMemoryLimit()
	 * @see #getResourceAllocation()
	 * @generated
	 */
	EAttribute getResourceAllocation_MemoryLimit();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ResourceAllocation#getMemoryRequest <em>Memory Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Request</em>'.
	 * @see kubernetes_metamodel.ResourceAllocation#getMemoryRequest()
	 * @see #getResourceAllocation()
	 * @generated
	 */
	EAttribute getResourceAllocation_MemoryRequest();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.Capabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities</em>'.
	 * @see kubernetes_metamodel.Capabilities
	 * @generated
	 */
	EClass getCapabilities();

	/**
	 * Returns the meta object for the attribute list '{@link kubernetes_metamodel.Capabilities#getDrop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Drop</em>'.
	 * @see kubernetes_metamodel.Capabilities#getDrop()
	 * @see #getCapabilities()
	 * @generated
	 */
	EAttribute getCapabilities_Drop();

	/**
	 * Returns the meta object for the attribute list '{@link kubernetes_metamodel.Capabilities#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Add</em>'.
	 * @see kubernetes_metamodel.Capabilities#getAdd()
	 * @see #getCapabilities()
	 * @generated
	 */
	EAttribute getCapabilities_Add();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see kubernetes_metamodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Port#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see kubernetes_metamodel.Port#getNumber()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Number();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kubernetes_metamodel.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.MysqlDump <em>Mysql Dump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mysql Dump</em>'.
	 * @see kubernetes_metamodel.MysqlDump
	 * @generated
	 */
	EClass getMysqlDump();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.MysqlDump#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see kubernetes_metamodel.MysqlDump#getContent()
	 * @see #getMysqlDump()
	 * @generated
	 */
	EAttribute getMysqlDump_Content();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.MysqlDump#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kubernetes_metamodel.MysqlDump#getName()
	 * @see #getMysqlDump()
	 * @generated
	 */
	EAttribute getMysqlDump_Name();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.ConfigMap <em>Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Map</em>'.
	 * @see kubernetes_metamodel.ConfigMap
	 * @generated
	 */
	EClass getConfigMap();

	/**
	 * Returns the meta object for the reference list '{@link kubernetes_metamodel.ConfigMap#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see kubernetes_metamodel.ConfigMap#getData()
	 * @see #getConfigMap()
	 * @generated
	 */
	EReference getConfigMap_Data();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ConfigMap#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kubernetes_metamodel.ConfigMap#getName()
	 * @see #getConfigMap()
	 * @generated
	 */
	EAttribute getConfigMap_Name();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ConfigMap#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kubernetes_metamodel.ConfigMap#getId()
	 * @see #getConfigMap()
	 * @generated
	 */
	EAttribute getConfigMap_Id();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.ConfigMapDependency <em>Config Map Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Map Dependency</em>'.
	 * @see kubernetes_metamodel.ConfigMapDependency
	 * @generated
	 */
	EClass getConfigMapDependency();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ConfigMapDependency#getEnvName <em>Env Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Name</em>'.
	 * @see kubernetes_metamodel.ConfigMapDependency#getEnvName()
	 * @see #getConfigMapDependency()
	 * @generated
	 */
	EAttribute getConfigMapDependency_EnvName();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ConfigMapDependency#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name</em>'.
	 * @see kubernetes_metamodel.ConfigMapDependency#getKeyName()
	 * @see #getConfigMapDependency()
	 * @generated
	 */
	EAttribute getConfigMapDependency_KeyName();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.ConfigMapDependency#getConfigMapName <em>Config Map Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Map Name</em>'.
	 * @see kubernetes_metamodel.ConfigMapDependency#getConfigMapName()
	 * @see #getConfigMapDependency()
	 * @generated
	 */
	EAttribute getConfigMapDependency_ConfigMapName();

	/**
	 * Returns the meta object for class '{@link kubernetes_metamodel.Secrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secrets</em>'.
	 * @see kubernetes_metamodel.Secrets
	 * @generated
	 */
	EClass getSecrets();

	/**
	 * Returns the meta object for the containment reference list '{@link kubernetes_metamodel.Secrets#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see kubernetes_metamodel.Secrets#getData()
	 * @see #getSecrets()
	 * @generated
	 */
	EReference getSecrets_Data();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Secrets#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kubernetes_metamodel.Secrets#getName()
	 * @see #getSecrets()
	 * @generated
	 */
	EAttribute getSecrets_Name();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Secrets#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kubernetes_metamodel.Secrets#getId()
	 * @see #getSecrets()
	 * @generated
	 */
	EAttribute getSecrets_Id();

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
	 * Returns the meta object for enum '{@link kubernetes_metamodel.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see kubernetes_metamodel.Protocol
	 * @generated
	 */
	EEnum getProtocol();

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
		 * The meta object literal for the '<em><b>Config Maps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__CONFIG_MAPS = eINSTANCE.getInfrastructure_ConfigMaps();

		/**
		 * The meta object literal for the '<em><b>Objects Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__OBJECTS_COUNT = eINSTANCE.getInfrastructure_ObjectsCount();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__SECRETS = eINSTANCE.getInfrastructure_Secrets();

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
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SERVICE = eINSTANCE.getDeployment_Service();

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
		 * The meta object literal for the '<em><b>Security Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SECURITY_CONTEXT = eINSTANCE.getDeployment_SecurityContext();

		/**
		 * The meta object literal for the '<em><b>Resource Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__RESOURCE_ALLOCATION = eINSTANCE.getDeployment_ResourceAllocation();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__COMMAND = eINSTANCE.getDeployment_Command();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__ARGS = eINSTANCE.getDeployment_Args();

		/**
		 * The meta object literal for the '<em><b>Memory Mount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__MEMORY_MOUNT = eINSTANCE.getDeployment_MemoryMount();

		/**
		 * The meta object literal for the '<em><b>Additional Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__ADDITIONAL_PORTS = eINSTANCE.getDeployment_AdditionalPorts();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__ID = eINSTANCE.getDeployment_Id();

		/**
		 * The meta object literal for the '<em><b>Config Map Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__CONFIG_MAP_DEPENDENCIES = eINSTANCE.getDeployment_ConfigMapDependencies();

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
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PROTOCOL = eINSTANCE.getService_Protocol();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_DATA__ID = eINSTANCE.getPersistentData_Id();

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
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.SecurityContextImpl <em>Security Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.SecurityContextImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getSecurityContext()
		 * @generated
		 */
		EClass SECURITY_CONTEXT = eINSTANCE.getSecurityContext();

		/**
		 * The meta object literal for the '<em><b>Run As Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTEXT__RUN_AS_ROOT = eINSTANCE.getSecurityContext_RunAsRoot();

		/**
		 * The meta object literal for the '<em><b>Run As User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTEXT__RUN_AS_USER = eINSTANCE.getSecurityContext_RunAsUser();

		/**
		 * The meta object literal for the '<em><b>Run As Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTEXT__RUN_AS_GROUP = eINSTANCE.getSecurityContext_RunAsGroup();

		/**
		 * The meta object literal for the '<em><b>Fs Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTEXT__FS_GROUP = eINSTANCE.getSecurityContext_FsGroup();

		/**
		 * The meta object literal for the '<em><b>Read Only Root Filesystem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTEXT__READ_ONLY_ROOT_FILESYSTEM = eINSTANCE.getSecurityContext_ReadOnlyRootFilesystem();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTEXT__CAPABILITIES = eINSTANCE.getSecurityContext_Capabilities();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.ResourceAllocationImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getResourceAllocation()
		 * @generated
		 */
		EClass RESOURCE_ALLOCATION = eINSTANCE.getResourceAllocation();

		/**
		 * The meta object literal for the '<em><b>Cpu Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ALLOCATION__CPU_LIMIT = eINSTANCE.getResourceAllocation_CpuLimit();

		/**
		 * The meta object literal for the '<em><b>Cpu Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ALLOCATION__CPU_REQUEST = eINSTANCE.getResourceAllocation_CpuRequest();

		/**
		 * The meta object literal for the '<em><b>Memory Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ALLOCATION__MEMORY_LIMIT = eINSTANCE.getResourceAllocation_MemoryLimit();

		/**
		 * The meta object literal for the '<em><b>Memory Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ALLOCATION__MEMORY_REQUEST = eINSTANCE.getResourceAllocation_MemoryRequest();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.CapabilitiesImpl <em>Capabilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.CapabilitiesImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getCapabilities()
		 * @generated
		 */
		EClass CAPABILITIES = eINSTANCE.getCapabilities();

		/**
		 * The meta object literal for the '<em><b>Drop</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITIES__DROP = eINSTANCE.getCapabilities_Drop();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITIES__ADD = eINSTANCE.getCapabilities_Add();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.PortImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NUMBER = eINSTANCE.getPort_Number();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.MysqlDumpImpl <em>Mysql Dump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.MysqlDumpImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getMysqlDump()
		 * @generated
		 */
		EClass MYSQL_DUMP = eINSTANCE.getMysqlDump();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MYSQL_DUMP__CONTENT = eINSTANCE.getMysqlDump_Content();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MYSQL_DUMP__NAME = eINSTANCE.getMysqlDump_Name();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.ConfigMapImpl <em>Config Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.ConfigMapImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getConfigMap()
		 * @generated
		 */
		EClass CONFIG_MAP = eINSTANCE.getConfigMap();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_MAP__DATA = eINSTANCE.getConfigMap_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_MAP__NAME = eINSTANCE.getConfigMap_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_MAP__ID = eINSTANCE.getConfigMap_Id();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.ConfigMapDependencyImpl <em>Config Map Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.ConfigMapDependencyImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getConfigMapDependency()
		 * @generated
		 */
		EClass CONFIG_MAP_DEPENDENCY = eINSTANCE.getConfigMapDependency();

		/**
		 * The meta object literal for the '<em><b>Env Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_MAP_DEPENDENCY__ENV_NAME = eINSTANCE.getConfigMapDependency_EnvName();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_MAP_DEPENDENCY__KEY_NAME = eINSTANCE.getConfigMapDependency_KeyName();

		/**
		 * The meta object literal for the '<em><b>Config Map Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_MAP_DEPENDENCY__CONFIG_MAP_NAME = eINSTANCE.getConfigMapDependency_ConfigMapName();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.impl.SecretsImpl <em>Secrets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.impl.SecretsImpl
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getSecrets()
		 * @generated
		 */
		EClass SECRETS = eINSTANCE.getSecrets();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRETS__DATA = eINSTANCE.getSecrets_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS__NAME = eINSTANCE.getSecrets_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS__ID = eINSTANCE.getSecrets_Id();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.AccessibilityType <em>Accessibility Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.AccessibilityType
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getAccessibilityType()
		 * @generated
		 */
		EEnum ACCESSIBILITY_TYPE = eINSTANCE.getAccessibilityType();

		/**
		 * The meta object literal for the '{@link kubernetes_metamodel.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kubernetes_metamodel.Protocol
		 * @see kubernetes_metamodel.impl.Kubernetes_metamodelPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

	}

} //Kubernetes_metamodelPackage
