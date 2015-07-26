package com.rms.loyalty.program.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "programfeeslabinfo")
/**
 * A ProgramFeeSlabInfo is someone who creates offers. This comment is also
 * included in the generated entity class.
 */
/*
 * This class is generated from the entity 'ProgramFeeSlabInfo' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class ProgramFeeSlabInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="feeid", nullable=false)
	private long feeId;
	
	@Column(name="slabfeename", nullable=false)
	private String slabFeeName;
	
	@Column(name="feemode", nullable=false)
	private int feeMode;
	
	@Column(name="txnamountfrom", nullable=false)
	private long txnAmountFrom;
	
	@Column(name="txnamountto", nullable=false)
	private long txnAmountTo;
	
	@Column(name="programfeeslab", nullable=false)
	private long programFeeSlab;
	
	@Column(name="slabfeevalue", nullable=false)
	private long slabFeeValue;
	
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
	public ProgramFeeSlabInfo() {
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
	public ProgramFeeSlabInfo(long feeId, String slabFeeName, int feeMode, long txnAmountFrom, long txnAmountTo, long programFeeSlab, long slabFeeValue, String description, int status) {
		super();
		if (slabFeeName == null) {
			throw new IllegalArgumentException("'slabFeeName' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		this.feeId = feeId;
		this.slabFeeName = slabFeeName;
		this.feeMode = feeMode;
		this.txnAmountFrom = txnAmountFrom;
		this.txnAmountTo = txnAmountTo;
		this.programFeeSlab = programFeeSlab;
		this.slabFeeValue = slabFeeValue;
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
	 * Returns the value of property 'feeId'.
	 */
	public long getFeeId() {
		return feeId;
	}
	
	/**
	 * Sets the value of property 'feeId'.
	 */
	public void setFeeId(long newValue) {
		this.feeId = newValue;
	}
	
	/**
	 * Returns the value of property 'slabFeeName'.
	 */
	public String getSlabFeeName() {
		return slabFeeName;
	}
	
	/**
	 * Sets the value of property 'slabFeeName'.
	 */
	public void setSlabFeeName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'slabFeeName' must not be null.");
		}
		this.slabFeeName = newValue;
	}
	
	/**
	 * Returns the value of property 'feeMode'.
	 */
	public int getFeeMode() {
		return feeMode;
	}
	
	/**
	 * Sets the value of property 'feeMode'.
	 */
	public void setFeeMode(int newValue) {
		this.feeMode = newValue;
	}
	
	/**
	 * Returns the value of property 'txnAmountFrom'.
	 */
	public long getTxnAmountFrom() {
		return txnAmountFrom;
	}
	
	/**
	 * Sets the value of property 'txnAmountFrom'.
	 */
	public void setTxnAmountFrom(long newValue) {
		this.txnAmountFrom = newValue;
	}
	
	/**
	 * Returns the value of property 'txnAmountTo'.
	 */
	public long getTxnAmountTo() {
		return txnAmountTo;
	}
	
	/**
	 * Sets the value of property 'txnAmountTo'.
	 */
	public void setTxnAmountTo(long newValue) {
		this.txnAmountTo = newValue;
	}
	
	/**
	 * Returns the value of property 'programFeeSlab'.
	 */
	public long getProgramFeeSlab() {
		return programFeeSlab;
	}
	
	/**
	 * Sets the value of property 'programFeeSlab'.
	 */
	public void setProgramFeeSlab(long newValue) {
		this.programFeeSlab = newValue;
	}
	
	/**
	 * Returns the value of property 'slabFeeValue'.
	 */
	public long getSlabFeeValue() {
		return slabFeeValue;
	}
	
	/**
	 * Sets the value of property 'slabFeeValue'.
	 */
	public void setSlabFeeValue(long newValue) {
		this.slabFeeValue = newValue;
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
		ProgramFeeSlabInfo other = (ProgramFeeSlabInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("ProgramFeeSlabInfo-");
		result.append(getId());
		result.append(" [");
		result.append("feeId = ");
		result.append(getFeeId());
		result.append(", ");
		result.append("slabFeeName = ");
		result.append(getSlabFeeName());
		result.append(", ");
		result.append("feeMode = ");
		result.append(getFeeMode());
		result.append(", ");
		result.append("txnAmountFrom = ");
		result.append(getTxnAmountFrom());
		result.append(", ");
		result.append("txnAmountTo = ");
		result.append(getTxnAmountTo());
		result.append(", ");
		result.append("programFeeSlab = ");
		result.append(getProgramFeeSlab());
		result.append(", ");
		result.append("slabFeeValue = ");
		result.append(getSlabFeeValue());
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
