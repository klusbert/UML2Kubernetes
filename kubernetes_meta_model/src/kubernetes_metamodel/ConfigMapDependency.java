/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Map Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.ConfigMapDependency#getEnvName <em>Env Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMapDependency#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMapDependency#getConfigMapName <em>Config Map Name</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMapDependency()
 * @model
 * @generated
 */
public interface ConfigMapDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Env Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Name</em>' attribute.
	 * @see #setEnvName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMapDependency_EnvName()
	 * @model
	 * @generated
	 */
	String getEnvName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMapDependency#getEnvName <em>Env Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Name</em>' attribute.
	 * @see #getEnvName()
	 * @generated
	 */
	void setEnvName(String value);

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute.
	 * @see #setKeyName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMapDependency_KeyName()
	 * @model
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMapDependency#getKeyName <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Config Map Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Map Name</em>' attribute.
	 * @see #setConfigMapName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMapDependency_ConfigMapName()
	 * @model
	 * @generated
	 */
	String getConfigMapName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMapDependency#getConfigMapName <em>Config Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Map Name</em>' attribute.
	 * @see #getConfigMapName()
	 * @generated
	 */
	void setConfigMapName(String value);

} // ConfigMapDependency
