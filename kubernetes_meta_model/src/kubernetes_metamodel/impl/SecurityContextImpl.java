/**
 */
package kubernetes_metamodel.impl;

import kubernetes_metamodel.Capabilities;
import kubernetes_metamodel.Kubernetes_metamodelPackage;
import kubernetes_metamodel.SecurityContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.SecurityContextImpl#isRunAsRoot <em>Run As Root</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.SecurityContextImpl#getRunAsUser <em>Run As User</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.SecurityContextImpl#getRunAsGroup <em>Run As Group</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.SecurityContextImpl#getFsGroup <em>Fs Group</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.SecurityContextImpl#isReadOnlyRootFilesystem <em>Read Only Root Filesystem</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.SecurityContextImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityContextImpl extends MinimalEObjectImpl.Container implements SecurityContext {
	/**
	 * The default value of the '{@link #isRunAsRoot() <em>Run As Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunAsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUN_AS_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunAsRoot() <em>Run As Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunAsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean runAsRoot = RUN_AS_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunAsUser() <em>Run As User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAsUser()
	 * @generated
	 * @ordered
	 */
	protected static final int RUN_AS_USER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRunAsUser() <em>Run As User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAsUser()
	 * @generated
	 * @ordered
	 */
	protected int runAsUser = RUN_AS_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunAsGroup() <em>Run As Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAsGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int RUN_AS_GROUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRunAsGroup() <em>Run As Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAsGroup()
	 * @generated
	 * @ordered
	 */
	protected int runAsGroup = RUN_AS_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFsGroup() <em>Fs Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int FS_GROUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFsGroup() <em>Fs Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsGroup()
	 * @generated
	 * @ordered
	 */
	protected int fsGroup = FS_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnlyRootFilesystem() <em>Read Only Root Filesystem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnlyRootFilesystem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_ROOT_FILESYSTEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnlyRootFilesystem() <em>Read Only Root Filesystem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnlyRootFilesystem()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnlyRootFilesystem = READ_ONLY_ROOT_FILESYSTEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected Capabilities capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.SECURITY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunAsRoot() {
		return runAsRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAsRoot(boolean newRunAsRoot) {
		boolean oldRunAsRoot = runAsRoot;
		runAsRoot = newRunAsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_ROOT, oldRunAsRoot, runAsRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRunAsUser() {
		return runAsUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAsUser(int newRunAsUser) {
		int oldRunAsUser = runAsUser;
		runAsUser = newRunAsUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_USER, oldRunAsUser, runAsUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRunAsGroup() {
		return runAsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAsGroup(int newRunAsGroup) {
		int oldRunAsGroup = runAsGroup;
		runAsGroup = newRunAsGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_GROUP, oldRunAsGroup, runAsGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFsGroup() {
		return fsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFsGroup(int newFsGroup) {
		int oldFsGroup = fsGroup;
		fsGroup = newFsGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SECURITY_CONTEXT__FS_GROUP, oldFsGroup, fsGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnlyRootFilesystem() {
		return readOnlyRootFilesystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnlyRootFilesystem(boolean newReadOnlyRootFilesystem) {
		boolean oldReadOnlyRootFilesystem = readOnlyRootFilesystem;
		readOnlyRootFilesystem = newReadOnlyRootFilesystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SECURITY_CONTEXT__READ_ONLY_ROOT_FILESYSTEM, oldReadOnlyRootFilesystem, readOnlyRootFilesystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilities getCapabilities() {
		if (capabilities != null && capabilities.eIsProxy()) {
			InternalEObject oldCapabilities = (InternalEObject)capabilities;
			capabilities = (Capabilities)eResolveProxy(oldCapabilities);
			if (capabilities != oldCapabilities) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kubernetes_metamodelPackage.SECURITY_CONTEXT__CAPABILITIES, oldCapabilities, capabilities));
			}
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilities basicGetCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(Capabilities newCapabilities) {
		Capabilities oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.SECURITY_CONTEXT__CAPABILITIES, oldCapabilities, capabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_ROOT:
				return isRunAsRoot();
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_USER:
				return getRunAsUser();
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_GROUP:
				return getRunAsGroup();
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__FS_GROUP:
				return getFsGroup();
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__READ_ONLY_ROOT_FILESYSTEM:
				return isReadOnlyRootFilesystem();
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__CAPABILITIES:
				if (resolve) return getCapabilities();
				return basicGetCapabilities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_ROOT:
				setRunAsRoot((Boolean)newValue);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_USER:
				setRunAsUser((Integer)newValue);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_GROUP:
				setRunAsGroup((Integer)newValue);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__FS_GROUP:
				setFsGroup((Integer)newValue);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__READ_ONLY_ROOT_FILESYSTEM:
				setReadOnlyRootFilesystem((Boolean)newValue);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__CAPABILITIES:
				setCapabilities((Capabilities)newValue);
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
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_ROOT:
				setRunAsRoot(RUN_AS_ROOT_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_USER:
				setRunAsUser(RUN_AS_USER_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_GROUP:
				setRunAsGroup(RUN_AS_GROUP_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__FS_GROUP:
				setFsGroup(FS_GROUP_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__READ_ONLY_ROOT_FILESYSTEM:
				setReadOnlyRootFilesystem(READ_ONLY_ROOT_FILESYSTEM_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__CAPABILITIES:
				setCapabilities((Capabilities)null);
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
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_ROOT:
				return runAsRoot != RUN_AS_ROOT_EDEFAULT;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_USER:
				return runAsUser != RUN_AS_USER_EDEFAULT;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__RUN_AS_GROUP:
				return runAsGroup != RUN_AS_GROUP_EDEFAULT;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__FS_GROUP:
				return fsGroup != FS_GROUP_EDEFAULT;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__READ_ONLY_ROOT_FILESYSTEM:
				return readOnlyRootFilesystem != READ_ONLY_ROOT_FILESYSTEM_EDEFAULT;
			case Kubernetes_metamodelPackage.SECURITY_CONTEXT__CAPABILITIES:
				return capabilities != null;
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
		result.append(" (runAsRoot: ");
		result.append(runAsRoot);
		result.append(", runAsUser: ");
		result.append(runAsUser);
		result.append(", runAsGroup: ");
		result.append(runAsGroup);
		result.append(", fsGroup: ");
		result.append(fsGroup);
		result.append(", readOnlyRootFilesystem: ");
		result.append(readOnlyRootFilesystem);
		result.append(')');
		return result.toString();
	}

} //SecurityContextImpl
