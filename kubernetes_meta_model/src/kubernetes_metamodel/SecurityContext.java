/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.SecurityContext#isRunAsRoot <em>Run As Root</em>}</li>
 *   <li>{@link kubernetes_metamodel.SecurityContext#getRunAsUser <em>Run As User</em>}</li>
 *   <li>{@link kubernetes_metamodel.SecurityContext#getRunAsGroup <em>Run As Group</em>}</li>
 *   <li>{@link kubernetes_metamodel.SecurityContext#getFsGroup <em>Fs Group</em>}</li>
 *   <li>{@link kubernetes_metamodel.SecurityContext#isReadOnlyRootFilesystem <em>Read Only Root Filesystem</em>}</li>
 *   <li>{@link kubernetes_metamodel.SecurityContext#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getSecurityContext()
 * @model
 * @generated
 */
public interface SecurityContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Run As Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run As Root</em>' attribute.
	 * @see #setRunAsRoot(boolean)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getSecurityContext_RunAsRoot()
	 * @model
	 * @generated
	 */
	boolean isRunAsRoot();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.SecurityContext#isRunAsRoot <em>Run As Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run As Root</em>' attribute.
	 * @see #isRunAsRoot()
	 * @generated
	 */
	void setRunAsRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Run As User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run As User</em>' attribute.
	 * @see #setRunAsUser(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getSecurityContext_RunAsUser()
	 * @model
	 * @generated
	 */
	int getRunAsUser();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.SecurityContext#getRunAsUser <em>Run As User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run As User</em>' attribute.
	 * @see #getRunAsUser()
	 * @generated
	 */
	void setRunAsUser(int value);

	/**
	 * Returns the value of the '<em><b>Run As Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run As Group</em>' attribute.
	 * @see #setRunAsGroup(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getSecurityContext_RunAsGroup()
	 * @model
	 * @generated
	 */
	int getRunAsGroup();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.SecurityContext#getRunAsGroup <em>Run As Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run As Group</em>' attribute.
	 * @see #getRunAsGroup()
	 * @generated
	 */
	void setRunAsGroup(int value);

	/**
	 * Returns the value of the '<em><b>Fs Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fs Group</em>' attribute.
	 * @see #setFsGroup(int)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getSecurityContext_FsGroup()
	 * @model
	 * @generated
	 */
	int getFsGroup();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.SecurityContext#getFsGroup <em>Fs Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fs Group</em>' attribute.
	 * @see #getFsGroup()
	 * @generated
	 */
	void setFsGroup(int value);

	/**
	 * Returns the value of the '<em><b>Read Only Root Filesystem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only Root Filesystem</em>' attribute.
	 * @see #setReadOnlyRootFilesystem(boolean)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getSecurityContext_ReadOnlyRootFilesystem()
	 * @model
	 * @generated
	 */
	boolean isReadOnlyRootFilesystem();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.SecurityContext#isReadOnlyRootFilesystem <em>Read Only Root Filesystem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only Root Filesystem</em>' attribute.
	 * @see #isReadOnlyRootFilesystem()
	 * @generated
	 */
	void setReadOnlyRootFilesystem(boolean value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference.
	 * @see #setCapabilities(Capabilities)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getSecurityContext_Capabilities()
	 * @model
	 * @generated
	 */
	Capabilities getCapabilities();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.SecurityContext#getCapabilities <em>Capabilities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(Capabilities value);

} // SecurityContext
