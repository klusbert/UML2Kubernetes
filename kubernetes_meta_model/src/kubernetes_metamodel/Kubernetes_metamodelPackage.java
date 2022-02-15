/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__NAME_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__API_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Enviroment Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ENVIROMENT_VARIABLES = 3;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 4;

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
	 * Returns the meta object for class '{@link kubernetes_metamodel.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see kubernetes_metamodel.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link kubernetes_metamodel.Infrastructure#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see kubernetes_metamodel.Infrastructure#getNameSpace()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_NameSpace();

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
	 * Returns the meta object for the reference list '{@link kubernetes_metamodel.Deployment#getEnviromentVariables <em>Enviroment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enviroment Variables</em>'.
	 * @see kubernetes_metamodel.Deployment#getEnviromentVariables()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_EnviromentVariables();

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
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__NAME_SPACE = eINSTANCE.getInfrastructure_NameSpace();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__API_VERSION = eINSTANCE.getInfrastructure_ApiVersion();

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
		 * The meta object literal for the '<em><b>Enviroment Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__ENVIROMENT_VARIABLES = eINSTANCE.getDeployment_EnviromentVariables();

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

	}

} //Kubernetes_metamodelPackage
