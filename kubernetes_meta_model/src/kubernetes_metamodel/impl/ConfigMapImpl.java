/**
 */
package kubernetes_metamodel.impl;

import java.util.Collection;

import kubernetes_metamodel.ConfigMap;
import kubernetes_metamodel.EnviromentVariables;
import kubernetes_metamodel.Kubernetes_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapImpl#getData <em>Data</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapImpl#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapImpl#getId <em>Id</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapImpl#getIsSecret <em>Is Secret</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.ConfigMapImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigMapImpl extends MinimalEObjectImpl.Container implements ConfigMap {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<EnviromentVariables> data;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSecret() <em>Is Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSecret()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSecret() <em>Is Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSecret()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSecret = IS_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.CONFIG_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnviromentVariables> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<EnviromentVariables>(EnviromentVariables.class, this, Kubernetes_metamodelPackage.CONFIG_MAP__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.CONFIG_MAP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.CONFIG_MAP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSecret() {
		return isSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSecret(Boolean newIsSecret) {
		Boolean oldIsSecret = isSecret;
		isSecret = newIsSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.CONFIG_MAP__IS_SECRET, oldIsSecret, isSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.CONFIG_MAP__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.CONFIG_MAP__DATA:
				return getData();
			case Kubernetes_metamodelPackage.CONFIG_MAP__NAME:
				return getName();
			case Kubernetes_metamodelPackage.CONFIG_MAP__ID:
				return getId();
			case Kubernetes_metamodelPackage.CONFIG_MAP__IS_SECRET:
				return getIsSecret();
			case Kubernetes_metamodelPackage.CONFIG_MAP__FILE_NAME:
				return getFileName();
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
			case Kubernetes_metamodelPackage.CONFIG_MAP__DATA:
				getData().clear();
				getData().addAll((Collection<? extends EnviromentVariables>)newValue);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP__NAME:
				setName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP__ID:
				setId((Integer)newValue);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP__IS_SECRET:
				setIsSecret((Boolean)newValue);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP__FILE_NAME:
				setFileName((String)newValue);
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
			case Kubernetes_metamodelPackage.CONFIG_MAP__DATA:
				getData().clear();
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP__ID:
				setId(ID_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP__IS_SECRET:
				setIsSecret(IS_SECRET_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.CONFIG_MAP__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
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
			case Kubernetes_metamodelPackage.CONFIG_MAP__DATA:
				return data != null && !data.isEmpty();
			case Kubernetes_metamodelPackage.CONFIG_MAP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Kubernetes_metamodelPackage.CONFIG_MAP__ID:
				return id != ID_EDEFAULT;
			case Kubernetes_metamodelPackage.CONFIG_MAP__IS_SECRET:
				return IS_SECRET_EDEFAULT == null ? isSecret != null : !IS_SECRET_EDEFAULT.equals(isSecret);
			case Kubernetes_metamodelPackage.CONFIG_MAP__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", isSecret: ");
		result.append(isSecret);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //ConfigMapImpl
