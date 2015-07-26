package com.rms.loyalty.organization.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
/*
 * This class is generated from the entity 'Address' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="userid", nullable=false)
	private long userId;
	
	@Column(name="building", nullable=false)
	private String building;
	
	@Column(name="street", nullable=false)
	private String street;
	
	@Column(name="locality", nullable=false)
	private String locality;
	
	@Column(name="city", nullable=false)
	private String city;
	
	@Column(name="state", nullable=false)
	private String state;
	
	@Column(name="postalcode", nullable=false)
	private String postalCode;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@Column(name="isprimary", nullable=false)
	private boolean isPrimary;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public Address() {
		super();
	}
	
	/**
	 * <p>
	 * Constructor using all read-only and all non-nullable properties.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used
	 * directly. Rather, the respective create() method must be used instead.
	 * </p>
	 */
	@Deprecated
	public Address(long userId, String building, String street, String locality, String city, String state, String postalCode, int status, boolean isPrimary) {
		super();
		if (building == null) {
			throw new IllegalArgumentException("'building' must not be null.");
		}
		if (street == null) {
			throw new IllegalArgumentException("'street' must not be null.");
		}
		if (locality == null) {
			throw new IllegalArgumentException("'locality' must not be null.");
		}
		if (city == null) {
			throw new IllegalArgumentException("'city' must not be null.");
		}
		if (state == null) {
			throw new IllegalArgumentException("'state' must not be null.");
		}
		if (postalCode == null) {
			throw new IllegalArgumentException("'postalCode' must not be null.");
		}
		this.userId = userId;
		this.building = building;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.status = status;
		this.isPrimary = isPrimary;
	}
	
	/**
	 * Returns the automatically generated id that identifies this entity object.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * <p>
	 * The property 'id' is read-only.
	 * </p>
	 * <p>
	 * This setter is only provided for the JPA provider.
	 * </p>
	 * <p>
	 * It must not be used directly.
	 * </p>
	 */
	@Deprecated
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Returns the value of property 'userId'.
	 */
	public long getUserId() {
		return userId;
	}
	
	/**
	 * Sets the value of property 'userId'.
	 */
	public void setUserId(long newValue) {
		this.userId = newValue;
	}
	
	/**
	 * Returns the value of property 'building'.
	 */
	public String getBuilding() {
		return building;
	}
	
	/**
	 * Sets the value of property 'building'.
	 */
	public void setBuilding(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'building' must not be null.");
		}
		this.building = newValue;
	}
	
	/**
	 * Returns the value of property 'street'.
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * Sets the value of property 'street'.
	 */
	public void setStreet(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'street' must not be null.");
		}
		this.street = newValue;
	}
	
	/**
	 * Returns the value of property 'locality'.
	 */
	public String getLocality() {
		return locality;
	}
	
	/**
	 * Sets the value of property 'locality'.
	 */
	public void setLocality(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'locality' must not be null.");
		}
		this.locality = newValue;
	}
	
	/**
	 * Returns the value of property 'city'.
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the value of property 'city'.
	 */
	public void setCity(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'city' must not be null.");
		}
		this.city = newValue;
	}
	
	/**
	 * Returns the value of property 'state'.
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the value of property 'state'.
	 */
	public void setState(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'state' must not be null.");
		}
		this.state = newValue;
	}
	
	/**
	 * Returns the value of property 'postalCode'.
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * Sets the value of property 'postalCode'.
	 */
	public void setPostalCode(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'postalCode' must not be null.");
		}
		this.postalCode = newValue;
	}
	
	/**
	 * Returns the value of property 'status'.
	 */
	public int getStatus() {
		return status;
	}
	
	/**
	 * Sets the value of property 'status'.
	 */
	public void setStatus(int newValue) {
		this.status = newValue;
	}
	
	/**
	 * Returns the value of property 'isPrimary'.
	 */
	public boolean getIsPrimary() {
		return isPrimary;
	}
	
	/**
	 * Sets the value of property 'isPrimary'.
	 */
	public void setIsPrimary(boolean newValue) {
		this.isPrimary = newValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = prime + getId();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Address other = (Address) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Address-");
		result.append(getId());
		result.append(" [");
		result.append("userId = ");
		result.append(getUserId());
		result.append(", ");
		result.append("building = ");
		result.append(getBuilding());
		result.append(", ");
		result.append("street = ");
		result.append(getStreet());
		result.append(", ");
		result.append("locality = ");
		result.append(getLocality());
		result.append(", ");
		result.append("city = ");
		result.append(getCity());
		result.append(", ");
		result.append("state = ");
		result.append(getState());
		result.append(", ");
		result.append("postalCode = ");
		result.append(getPostalCode());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append(", ");
		result.append("isPrimary = ");
		result.append(getIsPrimary());
		result.append("]");
		return result.toString();
	}
}
