/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.Deployment#getImage <em>Image</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getPort <em>Port</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getEnviromentVariables <em>Enviroment Variables</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getService <em>Service</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getDataPersistent <em>Data Persistent</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getIngress <em>Ingress</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getSecurityContext <em>Security Context</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getResourceAllocation <em>Resource Allocation</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getCommand <em>Command</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getArgs <em>Args</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getMemoryMount <em>Memory Mount</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getAdditionalPorts <em>Additional Ports</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getId <em>Id</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getConfigMapDependencies <em>Config Map Dependencies</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getVolumeMounts <em>Volume Mounts</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Replicas()
	 * @model
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Enviroment Variables</b></em>' containment reference list.
	 * The list contents are of type {@link kubernetes_metamodel.EnviromentVariables}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enviroment Variables</em>' containment reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_EnviromentVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnviromentVariables> getEnviromentVariables();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Service)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Service()
	 * @model containment="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Data Persistent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Persistent</em>' reference.
	 * @see #setDataPersistent(PersistentData)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_DataPersistent()
	 * @model
	 * @generated
	 */
	PersistentData getDataPersistent();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getDataPersistent <em>Data Persistent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Persistent</em>' reference.
	 * @see #getDataPersistent()
	 * @generated
	 */
	void setDataPersistent(PersistentData value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Ingress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingress</em>' reference.
	 * @see #setIngress(Ingress)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Ingress()
	 * @model
	 * @generated
	 */
	Ingress getIngress();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getIngress <em>Ingress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingress</em>' reference.
	 * @see #getIngress()
	 * @generated
	 */
	void setIngress(Ingress value);

	/**
	 * Returns the value of the '<em><b>Security Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Context</em>' reference.
	 * @see #setSecurityContext(SecurityContext)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_SecurityContext()
	 * @model
	 * @generated
	 */
	SecurityContext getSecurityContext();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getSecurityContext <em>Security Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Context</em>' reference.
	 * @see #getSecurityContext()
	 * @generated
	 */
	void setSecurityContext(SecurityContext value);

	/**
	 * Returns the value of the '<em><b>Resource Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Allocation</em>' reference.
	 * @see #setResourceAllocation(ResourceAllocation)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_ResourceAllocation()
	 * @model
	 * @generated
	 */
	ResourceAllocation getResourceAllocation();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getResourceAllocation <em>Resource Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Allocation</em>' reference.
	 * @see #getResourceAllocation()
	 * @generated
	 */
	void setResourceAllocation(ResourceAllocation value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Args()
	 * @model
	 * @generated
	 */
	EList<String> getArgs();

	/**
	 * Returns the value of the '<em><b>Memory Mount</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Mount</em>' attribute.
	 * @see #setMemoryMount(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_MemoryMount()
	 * @model default=""
	 * @generated
	 */
	String getMemoryMount();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getMemoryMount <em>Memory Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Mount</em>' attribute.
	 * @see #getMemoryMount()
	 * @generated
	 */
	void setMemoryMount(String value);

	/**
	 * Returns the value of the '<em><b>Additional Ports</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Ports</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_AdditionalPorts()
	 * @model
	 * @generated
	 */
	EList<Port> getAdditionalPorts();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Config Map Dependencies</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.ConfigMapDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Map Dependencies</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_ConfigMapDependencies()
	 * @model
	 * @generated
	 */
	EList<ConfigMapDependency> getConfigMapDependencies();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Volumes()
	 * @model
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Volume Mounts</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.VolumeMount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Mounts</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_VolumeMounts()
	 * @model
	 * @generated
	 */
	EList<VolumeMount> getVolumeMounts();

} // Deployment
