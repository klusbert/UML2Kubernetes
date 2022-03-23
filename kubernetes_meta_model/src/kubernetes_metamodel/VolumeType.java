/**
 */
package kubernetes_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Volume Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kubernetes_metamodel.Kubernetes_metamodelPackage#getVolumeType()
 * @model
 * @generated
 */
public enum VolumeType implements Enumerator {
	/**
	 * The '<em><b>Persistent Volume Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_VOLUME_CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	PERSISTENT_VOLUME_CLAIM(0, "persistentVolumeClaim", "persistentVolumeClaim"),

	/**
	 * The '<em><b>Config Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIG_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIG_MAP(1, "configMap", "configMap");

	/**
	 * The '<em><b>Persistent Volume Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_VOLUME_CLAIM
	 * @model name="persistentVolumeClaim"
	 * @generated
	 * @ordered
	 */
	public static final int PERSISTENT_VOLUME_CLAIM_VALUE = 0;

	/**
	 * The '<em><b>Config Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIG_MAP
	 * @model name="configMap"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIG_MAP_VALUE = 1;

	/**
	 * An array of all the '<em><b>Volume Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VolumeType[] VALUES_ARRAY =
		new VolumeType[] {
			PERSISTENT_VOLUME_CLAIM,
			CONFIG_MAP,
		};

	/**
	 * A public read-only list of all the '<em><b>Volume Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VolumeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Volume Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VolumeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VolumeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Volume Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VolumeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VolumeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Volume Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VolumeType get(int value) {
		switch (value) {
			case PERSISTENT_VOLUME_CLAIM_VALUE: return PERSISTENT_VOLUME_CLAIM;
			case CONFIG_MAP_VALUE: return CONFIG_MAP;
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
	private VolumeType(int value, String name, String literal) {
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
	
} //VolumeType
