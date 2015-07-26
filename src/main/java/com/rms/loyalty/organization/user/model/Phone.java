package com.rms.loyalty.organization.user.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "phone")
/*
 * This class is generated from the entity 'Phone' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class Phone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="userid", nullable=false)
	private long userId;
	
	@Column(name="countrycode", nullable=false)
	private int countryCode;
	
	@Column(name="areacode", nullable=false)
	private String areaCode;
	
	@Column(name="phonenumber", nullable=false)
	private String phoneNumber;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@Column(name="verifiedstatus", nullable=false)
	private int verifiedStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="verifedon", nullable=false)
	private Date verifedOn;
	
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
	public Phone() {
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
	public Phone(long userId, int countryCode, String areaCode, String phoneNumber, int status, int verifiedStatus, Date verifedOn, boolean isPrimary) {
		super();
		if (areaCode == null) {
			throw new IllegalArgumentException("'areaCode' must not be null.");
		}
		if (phoneNumber == null) {
			throw new IllegalArgumentException("'phoneNumber' must not be null.");
		}
		if (verifedOn == null) {
			throw new IllegalArgumentException("'verifedOn' must not be null.");
		}
		this.userId = userId;
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.verifiedStatus = verifiedStatus;
		this.verifedOn = verifedOn;
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
	 * Returns the value of property 'verifiedStatus'.
	 */
	public int getVerifiedStatus() {
		return verifiedStatus;
	}
	
	/**
	 * Sets the value of property 'verifiedStatus'.
	 */
	public void setVerifiedStatus(int newValue) {
		this.verifiedStatus = newValue;
	}
	
	/**
	 * Returns the value of property 'verifedOn'.
	 */
	public Date getVerifedOn() {
		return verifedOn;
	}
	
	/**
	 * Sets the value of property 'verifedOn'.
	 */
	public void setVerifedOn(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'verifedOn' must not be null.");
		}
		this.verifedOn = newValue;
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
		Phone other = (Phone) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Phone-");
		result.append(getId());
		result.append(" [");
		result.append("userId = ");
		result.append(getUserId());
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
		result.append("verifiedStatus = ");
		result.append(getVerifiedStatus());
		result.append(", ");
		result.append("verifedOn = ");
		result.append(getVerifedOn());
		result.append(", ");
		result.append("isPrimary = ");
		result.append(getIsPrimary());
		result.append("]");
		return result.toString();
	}
}
