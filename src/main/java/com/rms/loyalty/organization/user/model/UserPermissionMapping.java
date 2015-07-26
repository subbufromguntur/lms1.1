package com.rms.loyalty.organization.user.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userpermissionmapping")
/*
 * This class is generated from the entity 'UserPermissionMapping' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class UserPermissionMapping {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="userid", nullable=false)
	private long userId;
	
	@Column(name="permissioncode", nullable=false)
	private long permissionCode;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="user", nullable=false)
	private User user;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="permission", nullable=false)
	private Permission permission;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public UserPermissionMapping() {
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
	public UserPermissionMapping(long userId, long permissionCode, User user, Permission permission) {
		super();
		if (user == null) {
			throw new IllegalArgumentException("'user' must not be null.");
		}
		if (permission == null) {
			throw new IllegalArgumentException("'permission' must not be null.");
		}
		this.userId = userId;
		this.permissionCode = permissionCode;
		this.user = user;
		this.permission = permission;
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
	 * Returns the value of property 'permissionCode'.
	 */
	public long getPermissionCode() {
		return permissionCode;
	}
	
	/**
	 * Sets the value of property 'permissionCode'.
	 */
	public void setPermissionCode(long newValue) {
		this.permissionCode = newValue;
	}
	
	/**
	 * Returns the value of property 'user'.
	 */
	public User getUser() {
		return user;
	}
	
	/**
	 * Sets the value of property 'user'.
	 */
	public void setUser(User newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'user' must not be null.");
		}
		this.user = newValue;
	}
	
	/**
	 * Returns the value of property 'permission'.
	 */
	public Permission getPermission() {
		return permission;
	}
	
	/**
	 * Sets the value of property 'permission'.
	 */
	public void setPermission(Permission newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'permission' must not be null.");
		}
		this.permission = newValue;
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
		UserPermissionMapping other = (UserPermissionMapping) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("UserPermissionMapping-");
		result.append(getId());
		result.append(" [");
		result.append("userId = ");
		result.append(getUserId());
		result.append(", ");
		result.append("permissionCode = ");
		result.append(getPermissionCode());
		result.append("]");
		return result.toString();
	}
}
