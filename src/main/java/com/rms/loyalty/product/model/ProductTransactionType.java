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

import com.rms.loyalty.master.model.MasterTransactionType;

@Entity
@Table(name = "producttransactiontype")
/*
 * This class is generated from the entity 'ProductTransactionType' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class ProductTransactionType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="productid", nullable=false)
	private long productId;
	
	@Column(name="transactiontypeid", nullable=false)
	private long transactionTypeId;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<MasterTransactionType> masterTransactionType;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public ProductTransactionType() {
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
	public ProductTransactionType(long productId, long transactionTypeId) {
		super();
		this.productId = productId;
		this.transactionTypeId = transactionTypeId;
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
	 * Returns the value of property 'transactionTypeId'.
	 */
	public long getTransactionTypeId() {
		return transactionTypeId;
	}
	
	/**
	 * Sets the value of property 'transactionTypeId'.
	 */
	public void setTransactionTypeId(long newValue) {
		this.transactionTypeId = newValue;
	}
	
	/**
	 * Returns the value of property 'masterTransactionType'.
	 */
	public List<MasterTransactionType> getMasterTransactionType() {
		if (masterTransactionType == null) {
			masterTransactionType = new ArrayList<MasterTransactionType>(1);
		}
		return masterTransactionType;
	}
	
	/**
	 * Sets the value of property 'masterTransactionType'.
	 */
	public void setMasterTransactionType(List<MasterTransactionType> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'masterTransactionType' must not be null.");
		}
		this.masterTransactionType = newValue;
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
		ProductTransactionType other = (ProductTransactionType) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("ProductTransactionType-");
		result.append(getId());
		result.append(" [");
		result.append("productId = ");
		result.append(getProductId());
		result.append(", ");
		result.append("transactionTypeId = ");
		result.append(getTransactionTypeId());
		result.append("]");
		return result.toString();
	}
}
