/**
 */
package kubernetes_metamodel.impl;

import java.util.Collection;

import kubernetes_metamodel.Capabilities;
import kubernetes_metamodel.Kubernetes_metamodelPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.CapabilitiesImpl#getDrop <em>Drop</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.CapabilitiesImpl#getAdd <em>Add</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilitiesImpl extends MinimalEObjectImpl.Container implements Capabilities {
	/**
	 * The cached value of the '{@link #getDrop() <em>Drop</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected EList<String> drop;

	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected EList<String> add;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.CAPABILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDrop() {
		if (drop == null) {
			drop = new EDataTypeUniqueEList<String>(String.class, this, Kubernetes_metamodelPackage.CAPABILITIES__DROP);
		}
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAdd() {
		if (add == null) {
			add = new EDataTypeUniqueEList<String>(String.class, this, Kubernetes_metamodelPackage.CAPABILITIES__ADD);
		}
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.CAPABILITIES__DROP:
				return getDrop();
			case Kubernetes_metamodelPackage.CAPABILITIES__ADD:
				return getAdd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.CAPABILITIES__DROP:
				getDrop().clear();
				getDrop().addAll((Collection<? extends String>)newValue);
				return;
			case Kubernetes_metamodelPackage.CAPABILITIES__ADD:
				getAdd().clear();
				getAdd().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.CAPABILITIES__DROP:
				getDrop().clear();
				return;
			case Kubernetes_metamodelPackage.CAPABILITIES__ADD:
				getAdd().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.CAPABILITIES__DROP:
				return drop != null && !drop.isEmpty();
			case Kubernetes_metamodelPackage.CAPABILITIES__ADD:
				return add != null && !add.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (drop: ");
		result.append(drop);
		result.append(", add: ");
		result.append(add);
		result.append(')');
		return result.toString();
	}

} //CapabilitiesImpl
