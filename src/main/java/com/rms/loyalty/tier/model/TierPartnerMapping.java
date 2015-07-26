package com.rms.loyalty.tier.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tierpartnermapping")
/*
 * This class is generated from the entity 'TierPartnerMapping' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class TierPartnerMapping {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="tierid", nullable=false)
	private long tierId;
	
	@Column(name="partnerid", nullable=false)
	private long partnerId;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public TierPartnerMapping() {
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
	public TierPartnerMapping(long tierId, long partnerId) {
		super();
		this.tierId = tierId;
		this.partnerId = partnerId;
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
	 * Returns the value of property 'tierId'.
	 */
	public long getTierId() {
		return tierId;
	}
	
	/**
	 * Sets the value of property 'tierId'.
	 */
	public void setTierId(long newValue) {
		this.tierId = newValue;
	}
	
	/**
	 * Returns the value of property 'partnerId'.
	 */
	public long getPartnerId() {
		return partnerId;
	}
	
	/**
	 * Sets the value of property 'partnerId'.
	 */
	public void setPartnerId(long newValue) {
		this.partnerId = newValue;
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
		TierPartnerMapping other = (TierPartnerMapping) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("TierPartnerMapping-");
		result.append(getId());
		result.append(" [");
		result.append("tierId = ");
		result.append(getTierId());
		result.append(", ");
		result.append("partnerId = ");
		result.append(getPartnerId());
		result.append("]");
		return result.toString();
	}
}
