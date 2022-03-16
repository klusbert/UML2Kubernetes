/**
 */
package kubernetes_metamodel.util;

import kubernetes_metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage
 * @generated
 */
public class Kubernetes_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Kubernetes_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kubernetes_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Kubernetes_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kubernetes_metamodelSwitch<Adapter> modelSwitch =
		new Kubernetes_metamodelSwitch<Adapter>() {
			@Override
			public Adapter caseInfrastructure(Infrastructure object) {
				return createInfrastructureAdapter();
			}
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseEnviromentVariables(EnviromentVariables object) {
				return createEnviromentVariablesAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter casePersistentData(PersistentData object) {
				return createPersistentDataAdapter();
			}
			@Override
			public Adapter caseIngress(Ingress object) {
				return createIngressAdapter();
			}
			@Override
			public Adapter caseSecurityContext(SecurityContext object) {
				return createSecurityContextAdapter();
			}
			@Override
			public Adapter caseResourceAllocation(ResourceAllocation object) {
				return createResourceAllocationAdapter();
			}
			@Override
			public Adapter caseCapabilities(Capabilities object) {
				return createCapabilitiesAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseMysqlDump(MysqlDump object) {
				return createMysqlDumpAdapter();
			}
			@Override
			public Adapter caseConfigMap(ConfigMap object) {
				return createConfigMapAdapter();
			}
			@Override
			public Adapter caseConfigMapDependency(ConfigMapDependency object) {
				return createConfigMapDependencyAdapter();
			}
			@Override
			public Adapter caseSecrets(Secrets object) {
				return createSecretsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.Infrastructure
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.EnviromentVariables <em>Enviroment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.EnviromentVariables
	 * @generated
	 */
	public Adapter createEnviromentVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.PersistentData <em>Persistent Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.PersistentData
	 * @generated
	 */
	public Adapter createPersistentDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.Ingress <em>Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.Ingress
	 * @generated
	 */
	public Adapter createIngressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.SecurityContext <em>Security Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.SecurityContext
	 * @generated
	 */
	public Adapter createSecurityContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.ResourceAllocation <em>Resource Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.ResourceAllocation
	 * @generated
	 */
	public Adapter createResourceAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.Capabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.Capabilities
	 * @generated
	 */
	public Adapter createCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.MysqlDump <em>Mysql Dump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.MysqlDump
	 * @generated
	 */
	public Adapter createMysqlDumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.ConfigMap <em>Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.ConfigMap
	 * @generated
	 */
	public Adapter createConfigMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.ConfigMapDependency <em>Config Map Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.ConfigMapDependency
	 * @generated
	 */
	public Adapter createConfigMapDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kubernetes_metamodel.Secrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kubernetes_metamodel.Secrets
	 * @generated
	 */
	public Adapter createSecretsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Kubernetes_metamodelAdapterFactory
