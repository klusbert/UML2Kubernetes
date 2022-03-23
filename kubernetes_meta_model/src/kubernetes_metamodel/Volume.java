/**
 */
package kubernetes_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.Volume#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.Volume#getType <em>Type</em>}</li>
 *   <li>{@link kubernetes_metamodel.Volume#getClaimName <em>Claim Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.Volume#getConfigMapName <em>Config Map Name</em>}</li>
 * </ul>
 *
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolume_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Volume#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link kubernetes_metamodel.VolumeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see kubernetes_metamodel.VolumeType
	 * @see #setType(VolumeType)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolume_Type()
	 * @model
	 * @generated
	 */
	VolumeType getType();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Volume#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see kubernetes_metamodel.VolumeType
	 * @see #getType()
	 * @generated
	 */
	void setType(VolumeType value);

	/**
	 * Returns the value of the '<em><b>Claim Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Name</em>' attribute.
	 * @see #setClaimName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolume_ClaimName()
	 * @model
	 * @generated
	 */
	String getClaimName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Volume#getClaimName <em>Claim Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Name</em>' attribute.
	 * @see #getClaimName()
	 * @generated
	 */
	void setClaimName(String value);

	/**
	 * Returns the value of the '<em><b>Config Map Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Map Name</em>' attribute.
	 * @see #setConfigMapName(String)
	 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolume_ConfigMapName()
	 * @model
	 * @generated
	 */
	String getConfigMapName();

	/**
	 * Sets the value of the '{@link kubernetes_metamodel.Volume#getConfigMapName <em>Config Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Map Name</em>' attribute.
	 * @see #getConfigMapName()
	 * @generated
	 */
	void setConfigMapName(String value);

} // Volume
