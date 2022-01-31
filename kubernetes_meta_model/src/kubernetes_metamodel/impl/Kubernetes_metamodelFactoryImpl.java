/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.*;

import org.eclipse.emf.ecore.EClass;
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
