/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Kubernetes_metamodelFactoryImpl extends EFactoryImpl implements Kubernetes_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kubernetes_metamodelFactory init() {
		try {
			Kubernetes_metamodelFactory theKubernetes_metamodelFactory = (Kubernetes_metamodelFactory)EPackage.Registry.INSTANCE.getEFactory(Kubernetes_metamodelPackage.eNS_URI);
			if (theKubernetes_metamodelFactory != null) {
				return theKubernetes_metamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Kubernetes_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kubernetes_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Kubernetes_metamodelPackage.INFRASTRUCTURE: return createInfrastructure();
			case Kubernetes_metamodelPackage.DEPLOYMENT: return createDeployment();
			case Kubernetes_metamodelPackage.ENVIROMENT_VARIABLES: return createEnviromentVariables();
			case Kubernetes_metamodelPackage.SERVICE: return createService();
			case Kubernetes_metamodelPackage.PERSISTENT_DATA: return createPersistentData();
			case Kubernetes_metamodelPackage.INGRESS: return createIngress();
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT: return createSecurityContext();
			case Kubernetes_metamodelPackage.RESOURCE_ALLOCATION: return createResourceAllocation();
			case Kubernetes_metamodelPackage.CAPABILITIES: return createCapabilities();
			case Kubernetes_metamodelPackage.PORT: return createPort();
			case Kubernetes_metamodelPackage.MYSQL_DUMP: return createMysqlDump();
			case Kubernetes_metamodelPackage.CONFIG_MAP: return createConfigMap();
			case Kubernetes_metamodelPackage.CONFIG_MAP_DEPENDENCY: return createConfigMapDependency();
			case Kubernetes_metamodelPackage.SECRETS: return createSecrets();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Kubernetes_metamodelPackage.ACCESSIBILITY_TYPE:
				return createAccessibilityTypeFromString(eDataType, initialValue);
			case Kubernetes_metamodelPackage.PROTOCOL:
				return createProtocolFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Kubernetes_metamodelPackage.ACCESSIBILITY_TYPE:
				return convertAccessibilityTypeToString(eDataType, instanceValue);
			case Kubernetes_metamodelPackage.PROTOCOL:
				return convertProtocolToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnviromentVariables createEnviromentVariables() {
		EnviromentVariablesImpl enviromentVariables = new EnviromentVariablesImpl();
		return enviromentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentData createPersistentData() {
		PersistentDataImpl persistentData = new PersistentDataImpl();
		return persistentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingress createIngress() {
		IngressImpl ingress = new IngressImpl();
		return ingress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityContext createSecurityContext() {
		SecurityContextImpl securityContext = new SecurityContextImpl();
		return securityContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAllocation createResourceAllocation() {
		ResourceAllocationImpl resourceAllocation = new ResourceAllocationImpl();
		return resourceAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilities createCapabilities() {
		CapabilitiesImpl capabilities = new CapabilitiesImpl();
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MysqlDump createMysqlDump() {
		MysqlDumpImpl mysqlDump = new MysqlDumpImpl();
		return mysqlDump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigMap createConfigMap() {
		ConfigMapImpl configMap = new ConfigMapImpl();
		return configMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigMapDependency createConfigMapDependency() {
		ConfigMapDependencyImpl configMapDependency = new ConfigMapDependencyImpl();
		return configMapDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secrets createSecrets() {
		SecretsImpl secrets = new SecretsImpl();
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessibilityType createAccessibilityTypeFromString(EDataType eDataType, String initialValue) {
		AccessibilityType result = AccessibilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kubernetes_metamodelPackage getKubernetes_metamodelPackage() {
		return (Kubernetes_metamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Kubernetes_metamodelPackage getPackage() {
		return Kubernetes_metamodelPackage.eINSTANCE;
	}

} //Kubernetes_metamodelFactoryImpl
