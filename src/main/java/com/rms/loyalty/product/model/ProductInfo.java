package com.rms.loyalty.product.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productinfo")
/*
 * This class is generated from the entity 'ProductInfo' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class ProductInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="programid", nullable=false)
	private long programId;
	
	@Column(name="productname", nullable=false)
	private String productName;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="productdetail", nullable=false)
	private ProductDetail productDetail;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<ProductCategoryInfo> productCategoryInfo;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<ProductTransactionType> productTransactionType;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public ProductInfo() {
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
	public ProductInfo(long programId, String productName, int status, ProductDetail productDetail) {
		super();
		if (productName == null) {
			throw new IllegalArgumentException("'productName' must not be null.");
		}
		if (productDetail == null) {
			throw new IllegalArgumentException("'productDetail' must not be null.");
		}
		this.programId = programId;
		this.productName = productName;
		this.status = status;
		this.productDetail = productDetail;
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
	 * Returns the value of property 'programId'.
	 */
	public long getProgramId() {
		return programId;
	}
	
	/**
	 * Sets the value of property 'programId'.
	 */
	public void setProgramId(long newValue) {
		this.programId = newValue;
	}
	
	/**
	 * Returns the value of property 'productName'.
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Sets the value of property 'productName'.
	 */
	public void setProductName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'productName' must not be null.");
		}
		this.productName = newValue;
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
	 * Returns the value of property 'productDetail'.
	 */
	public ProductDetail getProductDetail() {
		return productDetail;
	}
	
	/**
	 * Sets the value of property 'productDetail'.
	 */
	public void setProductDetail(ProductDetail newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'productDetail' must not be null.");
		}
		this.productDetail = newValue;
	}
	
	/**
	 * Returns the value of property 'productCategoryInfo'.
	 */
	public List<ProductCategoryInfo> getProductCategoryInfo() {
		if (productCategoryInfo == null) {
			productCategoryInfo = new ArrayList<ProductCategoryInfo>(1);
		}
		return productCategoryInfo;
	}
	
	/**
	 * Sets the value of property 'productCategoryInfo'.
	 */
	public void setProductCategoryInfo(List<ProductCategoryInfo> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'productCategoryInfo' must not be null.");
		}
		this.productCategoryInfo = newValue;
	}
	
	/**
	 * Returns the value of property 'productTransactionType'.
	 */
	public List<ProductTransactionType> getProductTransactionType() {
		if (productTransactionType == null) {
			productTransactionType = new ArrayList<ProductTransactionType>(1);
		}
		return productTransactionType;
	}
	
	/**
	 * Sets the value of property 'productTransactionType'.
	 */
	public void setProductTransactionType(List<ProductTransactionType> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'productTransactionType' must not be null.");
		}
		this.productTransactionType = newValue;
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
		ProductInfo other = (ProductInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("ProductInfo-");
		result.append(getId());
		result.append(" [");
		result.append("programId = ");
		result.append(getProgramId());
		result.append(", ");
		result.append("productName = ");
		result.append(getProductName());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
