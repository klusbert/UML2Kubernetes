/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link kubernetes_metamodel.ConfigMapDependency#getConfigMapName <em>Config Map Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMapDependency#isIsSecret <em>Is Secret</em>}</li>
 *   <li>{@link kubernetes_metamodel.ConfigMapDependency#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMapDependency()
 * @model
 * @generated
 */
public interface ConfigMapDependency extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Is Secret</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Secret</em>' attribute.
	 * @see #setIsSecret(boolean)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMapDependency_IsSecret()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsSecret();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.ConfigMapDependency#isIsSecret <em>Is Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Secret</em>' attribute.
	 * @see #isIsSecret()
	 * @generated
	 */
	void setIsSecret(boolean value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' reference list.
	 * The list contents are of type {@link kubernetes_metamodel.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' reference list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getConfigMapDependency_Dependency()
	 * @model
	 * @generated
	 */
	EList<Dependency> getDependency();

} // ConfigMapDependency
