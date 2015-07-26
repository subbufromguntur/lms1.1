package com.subbu.please.use.thisorg.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organizationphone")
/**
 * A OrganizationPhone is someone who creates offers. This comment is also
 * included in the generated entity class.
 */
/*
 * This class is generated from the entity 'OrganizationPhone' defined in the HEDL
 * model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class OrganizationPhone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="organizationid", nullable=false)
	private long organizationId;
	
	@Column(name="countrycode", nullable=false)
	private int countryCode;
	
	@Column(name="areacode", nullable=false)
	private String areaCode;
	
	@Column(name="phonenumber", nullable=false)
	private String phoneNumber;
	
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
	public OrganizationPhone() {
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
	public OrganizationPhone(long organizationId, int countryCode, String areaCode, String phoneNumber, int status, boolean isPrimary) {
		super();
		if (areaCode == null) {
			throw new IllegalArgumentException("'areaCode' must not be null.");
		}
		if (phoneNumber == null) {
			throw new IllegalArgumentException("'phoneNumber' must not be null.");
		}
		this.organizationId = organizationId;
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
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
	 * Returns the value of property 'organizationId'.
	 */
	public long getOrganizationId() {
		return organizationId;
	}
	
	/**
	 * Sets the value of property 'organizationId'.
	 */
	public void setOrganizationId(long newValue) {
		this.organizationId = newValue;
	}
	
	/**
	 * Returns the value of property 'countryCode'.
	 */
	public int getCountryCode() {
		return countryCode;
	}
	
	/**
	 * Sets the value of property 'countryCode'.
	 */
	public void setCountryCode(int newValue) {
		this.countryCode = newValue;
	}
	
	/**
	 * Returns the value of property 'areaCode'.
	 */
	public String getAreaCode() {
		return areaCode;
	}
	
	/**
	 * Sets the value of property 'areaCode'.
	 */
	public void setAreaCode(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'areaCode' must not be null.");
		}
		this.areaCode = newValue;
	}
	
	/**
	 * Returns the value of property 'phoneNumber'.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Sets the value of property 'phoneNumber'.
	 */
	public void setPhoneNumber(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'phoneNumber' must not be null.");
		}
		this.phoneNumber = newValue;
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
		OrganizationPhone other = (OrganizationPhone) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("OrganizationPhone-");
		result.append(getId());
		result.append(" [");
		result.append("organizationId = ");
		result.append(getOrganizationId());
		result.append(", ");
		result.append("countryCode = ");
		result.append(getCountryCode());
		result.append(", ");
		result.append("areaCode = ");
		result.append(getAreaCode());
		result.append(", ");
		result.append("phoneNumber = ");
		result.append(getPhoneNumber());
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
