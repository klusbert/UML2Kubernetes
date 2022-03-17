/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.Dependency#getEnvName <em>Env Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.Dependency#getKeyName <em>Key Name</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Env Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Name</em>' attribute.
	 * @see #setEnvName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDependency_EnvName()
	 * @model
	 * @generated
	 */
	String getEnvName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Dependency#getEnvName <em>Env Name</em>}' attribute.
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
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getDependency_KeyName()
	 * @model
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Dependency#getKeyName <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

} // Dependency
