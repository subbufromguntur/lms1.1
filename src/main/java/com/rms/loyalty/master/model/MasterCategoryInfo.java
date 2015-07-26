package com.rms.loyalty.master.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mastercategoryinfo")
/*
 * This class is generated from the entity 'MasterCategoryInfo' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class MasterCategoryInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="parentid", nullable=false)
	private long parentId;
	
	@Column(name="categoryname", nullable=false)
	private String categoryName;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="status", nullable=false)
	private int status;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public MasterCategoryInfo() {
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
	public MasterCategoryInfo(long parentId, String categoryName, String description, int status) {
		super();
		if (categoryName == null) {
			throw new IllegalArgumentException("'categoryName' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		this.parentId = parentId;
		this.categoryName = categoryName;
		this.description = description;
		this.status = status;
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
	 * Returns the value of property 'parentId'.
	 */
	public long getParentId() {
		return parentId;
	}
	
	/**
	 * Sets the value of property 'parentId'.
	 */
	public void setParentId(long newValue) {
		this.parentId = newValue;
	}
	
	/**
	 * Returns the value of property 'categoryName'.
	 */
	public String getCategoryName() {
		return categoryName;
	}
	
	/**
	 * Sets the value of property 'categoryName'.
	 */
	public void setCategoryName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'categoryName' must not be null.");
		}
		this.categoryName = newValue;
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
		MasterCategoryInfo other = (MasterCategoryInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("MasterCategoryInfo-");
		result.append(getId());
		result.append(" [");
		result.append("parentId = ");
		result.append(getParentId());
		result.append(", ");
		result.append("categoryName = ");
		result.append(getCategoryName());
		result.append(", ");
		result.append("description = ");
		result.append(getDescription());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
