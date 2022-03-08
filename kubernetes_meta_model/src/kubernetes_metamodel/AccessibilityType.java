/**
 */
package kubernetes_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Accessibility Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getAccessibilityType()
 * @model
 * @generated
 */
public enum AccessibilityType implements Enumerator {
	/**
	 * The '<em><b>Node Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_PORT(0, "NodePort", "NodePort"),

	/**
	 * The '<em><b>Load Balancer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_BALANCER_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_BALANCER(1, "LoadBalancer", "LoadBalancer"),

	/**
	 * The '<em><b>Cluster IP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_IP_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_IP(2, "ClusterIP", "ClusterIP");

	/**
	 * The '<em><b>Node Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_PORT
	 * @model name="NodePort"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_PORT_VALUE = 0;

	/**
	 * The '<em><b>Load Balancer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_BALANCER
	 * @model name="LoadBalancer"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BALANCER_VALUE = 1;

	/**
	 * The '<em><b>Cluster IP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_IP
	 * @model name="ClusterIP"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_IP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Accessibility Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessibilityType[] VALUES_ARRAY =
		new AccessibilityType[] {
			NODE_PORT,
			LOAD_BALANCER,
			CLUSTER_IP,
		};

	/**
	 * A public read-only list of all the '<em><b>Accessibility Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessibilityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Accessibility Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessibilityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessibilityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Accessibility Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessibilityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessibilityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Accessibility Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessibilityType get(int value) {
		switch (value) {
			case NODE_PORT_VALUE: return NODE_PORT;
			case LOAD_BALANCER_VALUE: return LOAD_BALANCER;
			case CLUSTER_IP_VALUE: return CLUSTER_IP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AccessibilityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AccessibilityType
