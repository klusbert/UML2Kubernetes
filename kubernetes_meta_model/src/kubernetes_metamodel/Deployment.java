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
	 * Returns the value of the '<em><b>Enviroment Variables</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.EnviromentVariables}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enviroment Variables</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDeployment_EnviromentVariables()
	 * @model
	 * @generated
	 */
	EList<EnviromentVariables> getEnviromentVariables();

} // Deployment
