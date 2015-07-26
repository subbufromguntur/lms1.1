package com.rms.loyalty.organization.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permission")
/*
 * This class is generated from the entity 'Permission' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class Permission {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="permissioncode", nullable=false)
	private String permissionCode;
	
	@Column(name="permissionconstant", nullable=false)
	private String permissionConstant;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="errorcode", nullable=false)
	private int errorCode;
	
	@Column(name="errordescription", nullable=false)
	private String errorDescription;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public Permission() {
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
	public Permission(String permissionCode, String permissionConstant, String description, int errorCode, String errorDescription) {
		super();
		if (permissionCode == null) {
			throw new IllegalArgumentException("'permissionCode' must not be null.");
		}
		if (permissionConstant == null) {
			throw new IllegalArgumentException("'permissionConstant' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		if (errorDescription == null) {
			throw new IllegalArgumentException("'errorDescription' must not be null.");
		}
		this.permissionCode = permissionCode;
		this.permissionConstant = permissionConstant;
		this.description = description;
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
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
	 * Returns the value of property 'permissionCode'.
	 */
	public String getPermissionCode() {
		return permissionCode;
	}
	
	/**
	 * Sets the value of property 'permissionCode'.
	 */
	public void setPermissionCode(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'permissionCode' must not be null.");
		}
		this.permissionCode = newValue;
	}
	
	/**
	 * Returns the value of property 'permissionConstant'.
	 */
	public String getPermissionConstant() {
		return permissionConstant;
	}
	
	/**
	 * Sets the value of property 'permissionConstant'.
	 */
	public void setPermissionConstant(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'permissionConstant' must not be null.");
		}
		this.permissionConstant = newValue;
	}
	
	/**
	 * Returns the value of property 'description'.
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the value of property 'description'.
	 */
	public void setDescription(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		this.description = newValue;
	}
	
	/**
	 * Returns the value of property 'errorCode'.
	 */
	public int getErrorCode() {
		return errorCode;
	}
	
	/**
	 * Sets the value of property 'errorCode'.
	 */
	public void setErrorCode(int newValue) {
		this.errorCode = newValue;
	}
	
	/**
	 * Returns the value of property 'errorDescription'.
	 */
	public String getErrorDescription() {
		return errorDescription;
	}
	
	/**
	 * Sets the value of property 'errorDescription'.
	 */
	public void setErrorDescription(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'errorDescription' must not be null.");
		}
		this.errorDescription = newValue;
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
		Permission other = (Permission) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Permission-");
		result.append(getId());
		result.append(" [");
		result.append("permissionCode = ");
		result.append(getPermissionCode());
		result.append(", ");
		result.append("permissionConstant = ");
		result.append(getPermissionConstant());
		result.append(", ");
		result.append("description = ");
		result.append(getDescription());
		result.append(", ");
		result.append("errorCode = ");
		result.append(getErrorCode());
		result.append(", ");
		result.append("errorDescription = ");
		result.append(getErrorDescription());
		result.append("]");
		return result.toString();
	}
}
