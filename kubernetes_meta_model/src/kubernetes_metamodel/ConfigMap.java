/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.ConfigMap#getData <em>Data</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMap#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMap#getId <em>Id</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMap#getIsSecret <em>Is Secret</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMap#getFileName <em>File Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMap#isPipeText <em>Pipe Text</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMap()
 * @model
 * @generated
 */
public interface ConfigMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.EnviromentVariables}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMap_Data()
	 * @model
	 * @generated
	 */
	EList<EnviromentVariables> getData();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMap_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMap#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMap_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMap#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Is Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Secret</em>' attribute.
	 * @see #setIsSecret(Boolean)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMap_IsSecret()
	 * @model
	 * @generated
	 */
	Boolean getIsSecret();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMap#getIsSecret <em>Is Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Secret</em>' attribute.
	 * @see #getIsSecret()
	 * @generated
	 */
	void setIsSecret(Boolean value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMap_FileName()
	 * @model default=""
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMap#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Pipe Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipe Text</em>' attribute.
	 * @see #setPipeText(boolean)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMap_PipeText()
	 * @model
	 * @generated
	 */
	boolean isPipeText();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMap#isPipeText <em>Pipe Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipe Text</em>' attribute.
	 * @see #isPipeText()
	 * @generated
	 */
	void setPipeText(boolean value);

} // ConfigMap
