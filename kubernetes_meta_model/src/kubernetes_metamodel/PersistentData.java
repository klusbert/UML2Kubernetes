/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.PersistentData#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link kubernetes_metamodel.PersistentData#getSizeInGB <em>Size In GB</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getPersistentData()
 * @model
 * @generated
 */
public interface PersistentData extends EObject {
	/**
	 * Returns the value of the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Path</em>' attribute.
	 * @see #setMountPath(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getPersistentData_MountPath()
	 * @model
	 * @generated
	 */
	String getMountPath();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.PersistentData#getMountPath <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Path</em>' attribute.
	 * @see #getMountPath()
	 * @generated
	 */
	void setMountPath(String value);

	/**
	 * Returns the value of the '<em><b>Size In GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In GB</em>' attribute.
	 * @see #setSizeInGB(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getPersistentData_SizeInGB()
	 * @model
	 * @generated
	 */
	int getSizeInGB();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.PersistentData#getSizeInGB <em>Size In GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In GB</em>' attribute.
	 * @see #getSizeInGB()
	 * @generated
	 */
	void setSizeInGB(int value);

} // PersistentData
