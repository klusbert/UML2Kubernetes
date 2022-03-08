/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.AccessibilityType;
import kubernetes_metamodel.Deployment;
import kubernetes_metamodel.EnviromentVariables;
import kubernetes_metamodel.Infrastructure;
import kubernetes_metamodel.Ingress;
import kubernetes_metamodel.Kubernetes_metamodelFactory;
import kubernetes_metamodel.Kubernetes_metamodelPackage;
import kubernetes_metamodel.PersistentData;
import kubernetes_metamodel.Service;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Kubernetes_metamodelPackageImpl extends EPackageImpl implements Kubernetes_metamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enviromentVariablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistentDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessibilityTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Kubernetes_metamodelPackageImpl() {
		super(eNS_URI, Kubernetes_metamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Kubernetes_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Kubernetes_metamodelPackage init() {
		if (isInited) return (Kubernetes_metamodelPackage)EPackage.Registry.INSTANCE.getEPackage(Kubernetes_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKubernetes_metamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Kubernetes_metamodelPackageImpl theKubernetes_metamodelPackage = registeredKubernetes_metamodelPackage instanceof Kubernetes_metamodelPackageImpl ? (Kubernetes_metamodelPackageImpl)registeredKubernetes_metamodelPackage : new Kubernetes_metamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theKubernetes_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theKubernetes_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKubernetes_metamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Kubernetes_metamodelPackage.eNS_URI, theKubernetes_metamodelPackage);
		return theKubernetes_metamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_Namespace() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_ApiVersion() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_Name() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Deployments() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_AccessibilityType() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Image() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Port() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Replicas() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_EnviromentVariables() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Name() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Service() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Identifier() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_DataPersistent() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Namespace() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Ingress() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnviromentVariables() {
		return enviromentVariablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnviromentVariables_Name() {
		return (EAttribute)enviromentVariablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnviromentVariables_Value() {
		return (EAttribute)enviromentVariablesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Port() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_PublicAccess() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_AccessibilityType() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistentData() {
		return persistentDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistentData_MountPath() {
		return (EAttribute)persistentDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistentData_SizeInGB() {
		return (EAttribute)persistentDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIngress() {
		return ingressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngress_Path() {
		return (EAttribute)ingressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessibilityType() {
		return accessibilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kubernetes_metamodelFactory getKubernetes_metamodelFactory() {
		return (Kubernetes_metamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__NAMESPACE);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__API_VERSION);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__NAME);
		createEReference(infrastructureEClass, INFRASTRUCTURE__DEPLOYMENTS);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__ACCESSIBILITY_TYPE);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__IMAGE);
		createEAttribute(deploymentEClass, DEPLOYMENT__PORT);
		createEAttribute(deploymentEClass, DEPLOYMENT__REPLICAS);
		createEReference(deploymentEClass, DEPLOYMENT__ENVIROMENT_VARIABLES);
		createEAttribute(deploymentEClass, DEPLOYMENT__NAME);
		createEReference(deploymentEClass, DEPLOYMENT__SERVICE);
		createEAttribute(deploymentEClass, DEPLOYMENT__IDENTIFIER);
		createEReference(deploymentEClass, DEPLOYMENT__DATA_PERSISTENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__NAMESPACE);
		createEReference(deploymentEClass, DEPLOYMENT__INGRESS);

		enviromentVariablesEClass = createEClass(ENVIROMENT_VARIABLES);
		createEAttribute(enviromentVariablesEClass, ENVIROMENT_VARIABLES__NAME);
		createEAttribute(enviromentVariablesEClass, ENVIROMENT_VARIABLES__VALUE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__PORT);
		createEAttribute(serviceEClass, SERVICE__PUBLIC_ACCESS);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEAttribute(serviceEClass, SERVICE__ACCESSIBILITY_TYPE);

		persistentDataEClass = createEClass(PERSISTENT_DATA);
		createEAttribute(persistentDataEClass, PERSISTENT_DATA__MOUNT_PATH);
		createEAttribute(persistentDataEClass, PERSISTENT_DATA__SIZE_IN_GB);

		ingressEClass = createEClass(INGRESS);
		createEAttribute(ingressEClass, INGRESS__PATH);

		// Create enums
		accessibilityTypeEEnum = createEEnum(ACCESSIBILITY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructure_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructure_ApiVersion(), ecorePackage.getEByte(), "apiVersion", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructure_Name(), ecorePackage.getEString(), "name", "Kubernetes", 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_Deployments(), this.getDeployment(), null, "deployments", null, 0, -1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructure_AccessibilityType(), this.getAccessibilityType(), "accessibilityType", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_Image(), ecorePackage.getEString(), "image", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Port(), ecorePackage.getEInt(), "port", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Replicas(), ecorePackage.getEInt(), "replicas", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_EnviromentVariables(), this.getEnviromentVariables(), null, "enviromentVariables", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Service(), this.getService(), null, "service", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_DataPersistent(), this.getPersistentData(), null, "dataPersistent", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Ingress(), this.getIngress(), null, "ingress", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enviromentVariablesEClass, EnviromentVariables.class, "EnviromentVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnviromentVariables_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnviromentVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnviromentVariables_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnviromentVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Port(), ecorePackage.getEInt(), "port", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_PublicAccess(), ecorePackage.getEBoolean(), "publicAccess", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_AccessibilityType(), this.getAccessibilityType(), "accessibilityType", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistentDataEClass, PersistentData.class, "PersistentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistentData_MountPath(), ecorePackage.getEString(), "mountPath", null, 0, 1, PersistentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistentData_SizeInGB(), ecorePackage.getEInt(), "sizeInGB", null, 0, 1, PersistentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingressEClass, Ingress.class, "Ingress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngress_Path(), ecorePackage.getEString(), "path", null, 0, 1, Ingress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessibilityTypeEEnum, AccessibilityType.class, "AccessibilityType");
		addEEnumLiteral(accessibilityTypeEEnum, AccessibilityType.NODE_PORT);
		addEEnumLiteral(accessibilityTypeEEnum, AccessibilityType.LOAD_BALANCER);
		addEEnumLiteral(accessibilityTypeEEnum, AccessibilityType.CLUSTER_IP);

		// Create resource
		createResource(eNS_URI);
	}

} //Kubernetes_metamodelPackageImpl
