/**
 */
package kubernetes_metamodel.impl;

import java.util.Collection;

import kubernetes_metamodel.Deployment;
import kubernetes_metamodel.EnviromentVariables;
import kubernetes_metamodel.Ingress;
import kubernetes_metamodel.Kubernetes_metamodelPackage;
import kubernetes_metamodel.PersistentData;
import kubernetes_metamodel.Port;
import kubernetes_metamodel.ResourceAllocation;
import kubernetes_metamodel.SecurityContext;
import kubernetes_metamodel.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getImage <em>Image</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getEnviromentVariables <em>Enviroment Variables</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getService <em>Service</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getDataPersistent <em>Data Persistent</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getIngress <em>Ingress</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getSecurityContext <em>Security Context</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getResourceAllocation <em>Resource Allocation</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getMemoryMount <em>Memory Mount</em>}</li>
 *   <li>{@link kubernetes_metamodel.impl.DeploymentImpl#getAdditionalPorts <em>Additional Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected int replicas = REPLICAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnviromentVariables() <em>Enviroment Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnviromentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EnviromentVariables> enviromentVariables;

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
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * The cached value of the '{@link #getDataPersistent() <em>Data Persistent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPersistent()
	 * @generated
	 * @ordered
	 */
	protected PersistentData dataPersistent;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIngress() <em>Ingress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngress()
	 * @generated
	 * @ordered
	 */
	protected Ingress ingress;

	/**
	 * The cached value of the '{@link #getSecurityContext() <em>Security Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityContext()
	 * @generated
	 * @ordered
	 */
	protected SecurityContext securityContext;

	/**
	 * The cached value of the '{@link #getResourceAllocation() <em>Resource Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAllocation()
	 * @generated
	 * @ordered
	 */
	protected ResourceAllocation resourceAllocation;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> args;

	/**
	 * The default value of the '{@link #getMemoryMount() <em>Memory Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMount()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_MOUNT_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getMemoryMount() <em>Memory Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMount()
	 * @generated
	 * @ordered
	 */
	protected String memoryMount = MEMORY_MOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdditionalPorts() <em>Additional Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> additionalPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kubernetes_metamodelPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicas() {
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicas(int newReplicas) {
		int oldReplicas = replicas;
		replicas = newReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__REPLICAS, oldReplicas, replicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnviromentVariables> getEnviromentVariables() {
		if (enviromentVariables == null) {
			enviromentVariables = new EObjectContainmentEList<EnviromentVariables>(EnviromentVariables.class, this, Kubernetes_metamodelPackage.DEPLOYMENT__ENVIROMENT_VARIABLES);
		}
		return enviromentVariables;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentData getDataPersistent() {
		if (dataPersistent != null && dataPersistent.eIsProxy()) {
			InternalEObject oldDataPersistent = (InternalEObject)dataPersistent;
			dataPersistent = (PersistentData)eResolveProxy(oldDataPersistent);
			if (dataPersistent != oldDataPersistent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kubernetes_metamodelPackage.DEPLOYMENT__DATA_PERSISTENT, oldDataPersistent, dataPersistent));
			}
		}
		return dataPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentData basicGetDataPersistent() {
		return dataPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPersistent(PersistentData newDataPersistent) {
		PersistentData oldDataPersistent = dataPersistent;
		dataPersistent = newDataPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__DATA_PERSISTENT, oldDataPersistent, dataPersistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingress getIngress() {
		if (ingress != null && ingress.eIsProxy()) {
			InternalEObject oldIngress = (InternalEObject)ingress;
			ingress = (Ingress)eResolveProxy(oldIngress);
			if (ingress != oldIngress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kubernetes_metamodelPackage.DEPLOYMENT__INGRESS, oldIngress, ingress));
			}
		}
		return ingress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingress basicGetIngress() {
		return ingress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIngress(Ingress newIngress) {
		Ingress oldIngress = ingress;
		ingress = newIngress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__INGRESS, oldIngress, ingress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityContext getSecurityContext() {
		if (securityContext != null && securityContext.eIsProxy()) {
			InternalEObject oldSecurityContext = (InternalEObject)securityContext;
			securityContext = (SecurityContext)eResolveProxy(oldSecurityContext);
			if (securityContext != oldSecurityContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kubernetes_metamodelPackage.DEPLOYMENT__SECURITY_CONTEXT, oldSecurityContext, securityContext));
			}
		}
		return securityContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityContext basicGetSecurityContext() {
		return securityContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityContext(SecurityContext newSecurityContext) {
		SecurityContext oldSecurityContext = securityContext;
		securityContext = newSecurityContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__SECURITY_CONTEXT, oldSecurityContext, securityContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAllocation getResourceAllocation() {
		if (resourceAllocation != null && resourceAllocation.eIsProxy()) {
			InternalEObject oldResourceAllocation = (InternalEObject)resourceAllocation;
			resourceAllocation = (ResourceAllocation)eResolveProxy(oldResourceAllocation);
			if (resourceAllocation != oldResourceAllocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kubernetes_metamodelPackage.DEPLOYMENT__RESOURCE_ALLOCATION, oldResourceAllocation, resourceAllocation));
			}
		}
		return resourceAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAllocation basicGetResourceAllocation() {
		return resourceAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAllocation(ResourceAllocation newResourceAllocation) {
		ResourceAllocation oldResourceAllocation = resourceAllocation;
		resourceAllocation = newResourceAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__RESOURCE_ALLOCATION, oldResourceAllocation, resourceAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArgs() {
		if (args == null) {
			args = new EDataTypeUniqueEList<String>(String.class, this, Kubernetes_metamodelPackage.DEPLOYMENT__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemoryMount() {
		return memoryMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMount(String newMemoryMount) {
		String oldMemoryMount = memoryMount;
		memoryMount = newMemoryMount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kubernetes_metamodelPackage.DEPLOYMENT__MEMORY_MOUNT, oldMemoryMount, memoryMount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getAdditionalPorts() {
		if (additionalPorts == null) {
			additionalPorts = new EObjectResolvingEList<Port>(Port.class, this, Kubernetes_metamodelPackage.DEPLOYMENT__ADDITIONAL_PORTS);
		}
		return additionalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.DEPLOYMENT__ENVIROMENT_VARIABLES:
				return ((InternalEList<?>)getEnviromentVariables()).basicRemove(otherEnd, msgs);
			case Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE:
				return basicSetService(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kubernetes_metamodelPackage.DEPLOYMENT__IMAGE:
				return getImage();
			case Kubernetes_metamodelPackage.DEPLOYMENT__PORT:
				return getPort();
			case Kubernetes_metamodelPackage.DEPLOYMENT__REPLICAS:
				return getReplicas();
			case Kubernetes_metamodelPackage.DEPLOYMENT__ENVIROMENT_VARIABLES:
				return getEnviromentVariables();
			case Kubernetes_metamodelPackage.DEPLOYMENT__NAME:
				return getName();
			case Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE:
				return getService();
			case Kubernetes_metamodelPackage.DEPLOYMENT__DATA_PERSISTENT:
				if (resolve) return getDataPersistent();
				return basicGetDataPersistent();
			case Kubernetes_metamodelPackage.DEPLOYMENT__NAMESPACE:
				return getNamespace();
			case Kubernetes_metamodelPackage.DEPLOYMENT__INGRESS:
				if (resolve) return getIngress();
				return basicGetIngress();
			case Kubernetes_metamodelPackage.DEPLOYMENT__SECURITY_CONTEXT:
				if (resolve) return getSecurityContext();
				return basicGetSecurityContext();
			case Kubernetes_metamodelPackage.DEPLOYMENT__RESOURCE_ALLOCATION:
				if (resolve) return getResourceAllocation();
				return basicGetResourceAllocation();
			case Kubernetes_metamodelPackage.DEPLOYMENT__COMMAND:
				return getCommand();
			case Kubernetes_metamodelPackage.DEPLOYMENT__ARGS:
				return getArgs();
			case Kubernetes_metamodelPackage.DEPLOYMENT__MEMORY_MOUNT:
				return getMemoryMount();
			case Kubernetes_metamodelPackage.DEPLOYMENT__ADDITIONAL_PORTS:
				return getAdditionalPorts();
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
			case Kubernetes_metamodelPackage.DEPLOYMENT__IMAGE:
				setImage((String)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__PORT:
				setPort((Integer)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__REPLICAS:
				setReplicas((Integer)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__ENVIROMENT_VARIABLES:
				getEnviromentVariables().clear();
				getEnviromentVariables().addAll((Collection<? extends EnviromentVariables>)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__NAME:
				setName((String)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE:
				setService((Service)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__DATA_PERSISTENT:
				setDataPersistent((PersistentData)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__INGRESS:
				setIngress((Ingress)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__SECURITY_CONTEXT:
				setSecurityContext((SecurityContext)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__RESOURCE_ALLOCATION:
				setResourceAllocation((ResourceAllocation)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__COMMAND:
				setCommand((String)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends String>)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__MEMORY_MOUNT:
				setMemoryMount((String)newValue);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__ADDITIONAL_PORTS:
				getAdditionalPorts().clear();
				getAdditionalPorts().addAll((Collection<? extends Port>)newValue);
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
			case Kubernetes_metamodelPackage.DEPLOYMENT__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__ENVIROMENT_VARIABLES:
				getEnviromentVariables().clear();
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE:
				setService((Service)null);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__DATA_PERSISTENT:
				setDataPersistent((PersistentData)null);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__INGRESS:
				setIngress((Ingress)null);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__SECURITY_CONTEXT:
				setSecurityContext((SecurityContext)null);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__RESOURCE_ALLOCATION:
				setResourceAllocation((ResourceAllocation)null);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__ARGS:
				getArgs().clear();
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__MEMORY_MOUNT:
				setMemoryMount(MEMORY_MOUNT_EDEFAULT);
				return;
			case Kubernetes_metamodelPackage.DEPLOYMENT__ADDITIONAL_PORTS:
				getAdditionalPorts().clear();
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
			case Kubernetes_metamodelPackage.DEPLOYMENT__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case Kubernetes_metamodelPackage.DEPLOYMENT__PORT:
				return port != PORT_EDEFAULT;
			case Kubernetes_metamodelPackage.DEPLOYMENT__REPLICAS:
				return replicas != REPLICAS_EDEFAULT;
			case Kubernetes_metamodelPackage.DEPLOYMENT__ENVIROMENT_VARIABLES:
				return enviromentVariables != null && !enviromentVariables.isEmpty();
			case Kubernetes_metamodelPackage.DEPLOYMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Kubernetes_metamodelPackage.DEPLOYMENT__SERVICE:
				return service != null;
			case Kubernetes_metamodelPackage.DEPLOYMENT__DATA_PERSISTENT:
				return dataPersistent != null;
			case Kubernetes_metamodelPackage.DEPLOYMENT__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case Kubernetes_metamodelPackage.DEPLOYMENT__INGRESS:
				return ingress != null;
			case Kubernetes_metamodelPackage.DEPLOYMENT__SECURITY_CONTEXT:
				return securityContext != null;
			case Kubernetes_metamodelPackage.DEPLOYMENT__RESOURCE_ALLOCATION:
				return resourceAllocation != null;
			case Kubernetes_metamodelPackage.DEPLOYMENT__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case Kubernetes_metamodelPackage.DEPLOYMENT__ARGS:
				return args != null && !args.isEmpty();
			case Kubernetes_metamodelPackage.DEPLOYMENT__MEMORY_MOUNT:
				return MEMORY_MOUNT_EDEFAULT == null ? memoryMount != null : !MEMORY_MOUNT_EDEFAULT.equals(memoryMount);
			case Kubernetes_metamodelPackage.DEPLOYMENT__ADDITIONAL_PORTS:
				return additionalPorts != null && !additionalPorts.isEmpty();
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
		result.append(" (image: ");
		result.append(image);
		result.append(", port: ");
		result.append(port);
		result.append(", replicas: ");
		result.append(replicas);
		result.append(", name: ");
		result.append(name);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", command: ");
		result.append(command);
		result.append(", args: ");
		result.append(args);
		result.append(", memoryMount: ");
		result.append(memoryMount);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
