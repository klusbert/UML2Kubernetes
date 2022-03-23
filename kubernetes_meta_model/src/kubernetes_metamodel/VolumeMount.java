/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Mount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.VolumeMount#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.VolumeMount#getMountPath <em>Mount Path</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolumeMount()
 * @model
 * @generated
 */
public interface VolumeMount extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolumeMount_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.VolumeMount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Path</em>' attribute.
	 * @see #setMountPath(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolumeMount_MountPath()
	 * @model
	 * @generated
	 */
	String getMountPath();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.VolumeMount#getMountPath <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Path</em>' attribute.
	 * @see #getMountPath()
	 * @generated
	 */
	void setMountPath(String value);

} // VolumeMount
