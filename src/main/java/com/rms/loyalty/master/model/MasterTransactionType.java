package com.rms.loyalty.master.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mastertransactiontype")
/*
 * This class is generated from the entity 'MasterTransactionType' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class MasterTransactionType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="transactiontypename", nullable=false)
	private String transactionTypeName;
	
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
	public MasterTransactionType() {
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
	public MasterTransactionType(String transactionTypeName, String description, int status) {
		super();
		if (transactionTypeName == null) {
			throw new IllegalArgumentException("'transactionTypeName' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		this.transactionTypeName = transactionTypeName;
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
	 * Returns the value of property 'transactionTypeName'.
	 */
	public String getTransactionTypeName() {
		return transactionTypeName;
	}
	
	/**
	 * Sets the value of property 'transactionTypeName'.
	 */
	public void setTransactionTypeName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'transactionTypeName' must not be null.");
		}
		this.transactionTypeName = newValue;
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
		MasterTransactionType other = (MasterTransactionType) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("MasterTransactionType-");
		result.append(getId());
		result.append(" [");
		result.append("transactionTypeName = ");
		result.append(getTransactionTypeName());
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
