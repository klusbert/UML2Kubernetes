/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.Capabilities#getDrop <em>Drop</em>}</li>
 *   <li>{@link kubernetes_metamodel.Capabilities#getAdd <em>Add</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getCapabilities()
 * @model
 * @generated
 */
public interface Capabilities extends EObject {
	/**
	 * Returns the value of the '<em><b>Drop</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop</em>' attribute list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getCapabilities_Drop()
	 * @model
	 * @generated
	 */
	EList<String> getDrop();

	/**
	 * Returns the value of the '<em><b>Add</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' attribute list.
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getCapabilities_Add()
	 * @model
	 * @generated
	 */
	EList<String> getAdd();

} // Capabilities
