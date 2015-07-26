package com.rms.loyalty.product.model;

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
@Table(name = "categorycatalogueinfo")
/*
 * This class is generated from the entity 'CategoryCatalogueInfo' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class CategoryCatalogueInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="categoryid", nullable=false)
	private long categoryId;
	
	@Column(name="cataloguename", nullable=false)
	private String catalogueName;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<BinRange> binRange;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public CategoryCatalogueInfo() {
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
	public CategoryCatalogueInfo(long categoryId, String catalogueName, String description) {
		super();
		if (catalogueName == null) {
			throw new IllegalArgumentException("'catalogueName' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		this.categoryId = categoryId;
		this.catalogueName = catalogueName;
		this.description = description;
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
	 * Returns the value of property 'categoryId'.
	 */
	public long getCategoryId() {
		return categoryId;
	}
	
	/**
	 * Sets the value of property 'categoryId'.
	 */
	public void setCategoryId(long newValue) {
		this.categoryId = newValue;
	}
	
	/**
	 * Returns the value of property 'catalogueName'.
	 */
	public String getCatalogueName() {
		return catalogueName;
	}
	
	/**
	 * Sets the value of property 'catalogueName'.
	 */
	public void setCatalogueName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'catalogueName' must not be null.");
		}
		this.catalogueName = newValue;
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
	 * Returns the value of property 'binRange'.
	 */
	public List<BinRange> getBinRange() {
		if (binRange == null) {
			binRange = new ArrayList<BinRange>(1);
		}
		return binRange;
	}
	
	/**
	 * Sets the value of property 'binRange'.
	 */
	public void setBinRange(List<BinRange> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'binRange' must not be null.");
		}
		this.binRange = newValue;
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
		CategoryCatalogueInfo other = (CategoryCatalogueInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("CategoryCatalogueInfo-");
		result.append(getId());
		result.append(" [");
		result.append("categoryId = ");
		result.append(getCategoryId());
		result.append(", ");
		result.append("catalogueName = ");
		result.append(getCatalogueName());
		result.append(", ");
		result.append("description = ");
		result.append(getDescription());
		result.append("]");
		return result.toString();
	}
}
