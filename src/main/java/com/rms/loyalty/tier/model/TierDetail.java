package com.rms.loyalty.tier.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tierdetail")
/*
 * This class is generated from the entity 'TierDetail' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class TierDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="tierid", nullable=false)
	private long tierId;
	
	@Column(name="tiername", nullable=false)
	private String tierName;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="startdate", nullable=false)
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="enddate", nullable=false)
	private Date endDate;
	
	@Column(name="timezone", nullable=false)
	private String timezone;
	
	@Column(name="country", nullable=false)
	private String country;
	
	@Column(name="state", nullable=false)
	private String state;
	
	@Column(name="city", nullable=false)
	private String city;
	
	@Column(name="creatorcomment", nullable=false)
	private String creatorComment;
	
	@Column(name="approvercomment", nullable=false)
	private String approverComment;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public TierDetail() {
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
	public TierDetail(long tierId, String tierName, String description, Date startDate, Date endDate, String timezone, String country, String state, String city, String creatorComment, String approverComment) {
		super();
		if (tierName == null) {
			throw new IllegalArgumentException("'tierName' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		if (startDate == null) {
			throw new IllegalArgumentException("'startDate' must not be null.");
		}
		if (endDate == null) {
			throw new IllegalArgumentException("'endDate' must not be null.");
		}
		if (timezone == null) {
			throw new IllegalArgumentException("'timezone' must not be null.");
		}
		if (country == null) {
			throw new IllegalArgumentException("'country' must not be null.");
		}
		if (state == null) {
			throw new IllegalArgumentException("'state' must not be null.");
		}
		if (city == null) {
			throw new IllegalArgumentException("'city' must not be null.");
		}
		if (creatorComment == null) {
			throw new IllegalArgumentException("'creatorComment' must not be null.");
		}
		if (approverComment == null) {
			throw new IllegalArgumentException("'approverComment' must not be null.");
		}
		this.tierId = tierId;
		this.tierName = tierName;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.timezone = timezone;
		this.country = country;
		this.state = state;
		this.city = city;
		this.creatorComment = creatorComment;
		this.approverComment = approverComment;
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
	 * Returns the value of property 'tierName'.
	 */
	public String getTierName() {
		return tierName;
	}
	
	/**
	 * Sets the value of property 'tierName'.
	 */
	public void setTierName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'tierName' must not be null.");
		}
		this.tierName = newValue;
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
	 * Returns the value of property 'startDate'.
	 */
	public Date getStartDate() {
		return startDate;
	}
	
	/**
	 * Sets the value of property 'startDate'.
	 */
	public void setStartDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'startDate' must not be null.");
		}
		this.startDate = newValue;
	}
	
	/**
	 * Returns the value of property 'endDate'.
	 */
	public Date getEndDate() {
		return endDate;
	}
	
	/**
	 * Sets the value of property 'endDate'.
	 */
	public void setEndDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'endDate' must not be null.");
		}
		this.endDate = newValue;
	}
	
	/**
	 * Returns the value of property 'timezone'.
	 */
	public String getTimezone() {
		return timezone;
	}
	
	/**
	 * Sets the value of property 'timezone'.
	 */
	public void setTimezone(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'timezone' must not be null.");
		}
		this.timezone = newValue;
	}
	
	/**
	 * Returns the value of property 'country'.
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Sets the value of property 'country'.
	 */
	public void setCountry(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'country' must not be null.");
		}
		this.country = newValue;
	}
	
	/**
	 * Returns the value of property 'state'.
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the value of property 'state'.
	 */
	public void setState(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'state' must not be null.");
		}
		this.state = newValue;
	}
	
	/**
	 * Returns the value of property 'city'.
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the value of property 'city'.
	 */
	public void setCity(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'city' must not be null.");
		}
		this.city = newValue;
	}
	
	/**
	 * Returns the value of property 'creatorComment'.
	 */
	public String getCreatorComment() {
		return creatorComment;
	}
	
	/**
	 * Sets the value of property 'creatorComment'.
	 */
	public void setCreatorComment(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'creatorComment' must not be null.");
		}
		this.creatorComment = newValue;
	}
	
	/**
	 * Returns the value of property 'approverComment'.
	 */
	public String getApproverComment() {
		return approverComment;
	}
	
	/**
	 * Sets the value of property 'approverComment'.
	 */
	public void setApproverComment(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'approverComment' must not be null.");
		}
		this.approverComment = newValue;
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
		TierDetail other = (TierDetail) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("TierDetail-");
		result.append(getId());
		result.append(" [");
		result.append("tierId = ");
		result.append(getTierId());
		result.append(", ");
		result.append("tierName = ");
		result.append(getTierName());
		result.append(", ");
		result.append("description = ");
		result.append(getDescription());
		result.append(", ");
		result.append("startDate = ");
		result.append(getStartDate());
		result.append(", ");
		result.append("endDate = ");
		result.append(getEndDate());
		result.append(", ");
		result.append("timezone = ");
		result.append(getTimezone());
		result.append(", ");
		result.append("country = ");
		result.append(getCountry());
		result.append(", ");
		result.append("state = ");
		result.append(getState());
		result.append(", ");
		result.append("city = ");
		result.append(getCity());
		result.append(", ");
		result.append("creatorComment = ");
		result.append(getCreatorComment());
		result.append(", ");
		result.append("approverComment = ");
		result.append(getApproverComment());
		result.append("]");
		return result.toString();
	}
}
