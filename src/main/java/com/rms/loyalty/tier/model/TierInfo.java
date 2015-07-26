package com.rms.loyalty.tier.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tierinfo")
/*
 * This class is generated from the entity 'TierInfo' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class TierInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="transactiontypeid", nullable=false)
	private long transactionTypeId;
	
	@Column(name="productid", nullable=false)
	private long productId;
	
	@Column(name="programid", nullable=false)
	private long programId;
	
	@Column(name="organizationid", nullable=false)
	private long organizationId;
	
	@Column(name="createdby", nullable=false)
	private long createdBy;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="tierdetail", nullable=false)
	private TierDetail tierDetail;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public TierInfo() {
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
	public TierInfo(long transactionTypeId, long productId, long programId, long organizationId, long createdBy, int status, TierDetail tierDetail) {
		super();
		if (tierDetail == null) {
			throw new IllegalArgumentException("'tierDetail' must not be null.");
		}
		this.transactionTypeId = transactionTypeId;
		this.productId = productId;
		this.programId = programId;
		this.organizationId = organizationId;
		this.createdBy = createdBy;
		this.status = status;
		this.tierDetail = tierDetail;
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
	 * Returns the value of property 'organizationId'.
	 */
	public long getOrganizationId() {
		return organizationId;
	}
	
	/**
	 * Sets the value of property 'organizationId'.
	 */
	public void setOrganizationId(long newValue) {
		this.organizationId = newValue;
	}
	
	/**
	 * Returns the value of property 'createdBy'.
	 */
	public long getCreatedBy() {
		return createdBy;
	}
	
	/**
	 * Sets the value of property 'createdBy'.
	 */
	public void setCreatedBy(long newValue) {
		this.createdBy = newValue;
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
	 * Returns the value of property 'tierDetail'.
	 */
	public TierDetail getTierDetail() {
		return tierDetail;
	}
	
	/**
	 * Sets the value of property 'tierDetail'.
	 */
	public void setTierDetail(TierDetail newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'tierDetail' must not be null.");
		}
		this.tierDetail = newValue;
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
		TierInfo other = (TierInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("TierInfo-");
		result.append(getId());
		result.append(" [");
		result.append("transactionTypeId = ");
		result.append(getTransactionTypeId());
		result.append(", ");
		result.append("productId = ");
		result.append(getProductId());
		result.append(", ");
		result.append("programId = ");
		result.append(getProgramId());
		result.append(", ");
		result.append("organizationId = ");
		result.append(getOrganizationId());
		result.append(", ");
		result.append("createdBy = ");
		result.append(getCreatedBy());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
