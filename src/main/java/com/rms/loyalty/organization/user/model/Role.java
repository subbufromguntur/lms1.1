package com.rms.loyalty.organization.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
/*
 * This class is generated from the entity 'Role' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="roleconstant", nullable=false)
	private String roleConstant;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public Role() {
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
	public Role(String description, String roleConstant) {
		super();
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		if (roleConstant == null) {
			throw new IllegalArgumentException("'roleConstant' must not be null.");
		}
		this.description = description;
		this.roleConstant = roleConstant;
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
	 * Returns the value of property 'roleConstant'.
	 */
	public String getRoleConstant() {
		return roleConstant;
	}
	
	/**
	 * Sets the value of property 'roleConstant'.
	 */
	public void setRoleConstant(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'roleConstant' must not be null.");
		}
		this.roleConstant = newValue;
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
		Role other = (Role) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Role-");
		result.append(getId());
		result.append(" [");
		result.append("description = ");
		result.append(getDescription());
		result.append(", ");
		result.append("roleConstant = ");
		result.append(getRoleConstant());
		result.append("]");
		return result.toString();
	}
}
