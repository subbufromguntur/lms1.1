package com.rms.loyalty.organization.user.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rolepermissionmapping")
/*
 * This class is generated from the entity 'RolePermissionMapping' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class RolePermissionMapping {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="roleid", nullable=false)
	private long roleId;
	
	@Column(name="permissioncode", nullable=false)
	private long permissionCode;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<Permission> permission;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<Role> role;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public RolePermissionMapping() {
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
	public RolePermissionMapping(long roleId, long permissionCode) {
		super();
		this.roleId = roleId;
		this.permissionCode = permissionCode;
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
	 * Returns the value of property 'roleId'.
	 */
	public long getRoleId() {
		return roleId;
	}
	
	/**
	 * Sets the value of property 'roleId'.
	 */
	public void setRoleId(long newValue) {
		this.roleId = newValue;
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
	 * Returns the value of property 'permission'.
	 */
	public List<Permission> getPermission() {
		if (permission == null) {
			permission = new ArrayList<Permission>(1);
		}
		return permission;
	}
	
	/**
	 * Sets the value of property 'permission'.
	 */
	public void setPermission(List<Permission> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'permission' must not be null.");
		}
		this.permission = newValue;
	}
	
	/**
	 * Returns the value of property 'role'.
	 */
	public List<Role> getRole() {
		if (role == null) {
			role = new ArrayList<Role>(1);
		}
		return role;
	}
	
	/**
	 * Sets the value of property 'role'.
	 */
	public void setRole(List<Role> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'role' must not be null.");
		}
		this.role = newValue;
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
		RolePermissionMapping other = (RolePermissionMapping) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("RolePermissionMapping-");
		result.append(getId());
		result.append(" [");
		result.append("roleId = ");
		result.append(getRoleId());
		result.append(", ");
		result.append("permissionCode = ");
		result.append(getPermissionCode());
		result.append("]");
		return result.toString();
	}
}
