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
 *   <li>{@link kubernetes_metamodel.Deployment#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getDataPersistent <em>Data Persistent</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link kubernetes_metamodel.Deployment#getIngress <em>Ingress</em>}</li>
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
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Service()
	 * @model
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Deployment#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

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

} // Deployment
