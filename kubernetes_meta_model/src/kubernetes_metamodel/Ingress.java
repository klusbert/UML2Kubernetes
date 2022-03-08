/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.Ingress#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getIngress()
 * @model
 * @generated
 */
public interface Ingress extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getIngress_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Ingress#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Ingress
