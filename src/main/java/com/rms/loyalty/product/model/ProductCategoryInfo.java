package com.rms.loyalty.product.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rms.loyalty.master.model.MasterCategoryInfo;

@Entity
@Table(name = "productcategoryinfo")
/*
 * This class is generated from the entity 'ProductCategoryInfo' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class ProductCategoryInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="productid", nullable=false)
	private long productId;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="catalogueinfo", nullable=false)
	private CategoryCatalogueInfo catalogueInfo;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="mastercategoryinfo", nullable=false)
	private MasterCategoryInfo masterCategoryInfo;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public ProductCategoryInfo() {
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
	public ProductCategoryInfo(long productId, int status, CategoryCatalogueInfo catalogueInfo, MasterCategoryInfo masterCategoryInfo) {
		super();
		if (catalogueInfo == null) {
			throw new IllegalArgumentException("'catalogueInfo' must not be null.");
		}
		if (masterCategoryInfo == null) {
			throw new IllegalArgumentException("'masterCategoryInfo' must not be null.");
		}
		this.productId = productId;
		this.status = status;
		this.catalogueInfo = catalogueInfo;
		this.masterCategoryInfo = masterCategoryInfo;
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
	 * Returns the value of property 'productId'.
	 */
	public long getProductId() {
		return productId;
	}
	
	/**
	 * Sets the value of property 'productId'.
	 */
	public void setProductId(long newValue) {
		this.productId = newValue;
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
	 * Returns the value of property 'catalogueInfo'.
	 */
	public CategoryCatalogueInfo getCatalogueInfo() {
		return catalogueInfo;
	}
	
	/**
	 * Sets the value of property 'catalogueInfo'.
	 */
	public void setCatalogueInfo(CategoryCatalogueInfo newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'catalogueInfo' must not be null.");
		}
		this.catalogueInfo = newValue;
	}
	
	/**
	 * Returns the value of property 'masterCategoryInfo'.
	 */
	public MasterCategoryInfo getMasterCategoryInfo() {
		return masterCategoryInfo;
	}
	
	/**
	 * Sets the value of property 'masterCategoryInfo'.
	 */
	public void setMasterCategoryInfo(MasterCategoryInfo newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'masterCategoryInfo' must not be null.");
		}
		this.masterCategoryInfo = newValue;
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
		ProductCategoryInfo other = (ProductCategoryInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("ProductCategoryInfo-");
		result.append(getId());
		result.append(" [");
		result.append("productId = ");
		result.append(getProductId());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
