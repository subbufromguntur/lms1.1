package com.rms.loyalty.program.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "programfeeinfo")
/**
 * A ProgramFeeInfo is someone who creates offers. This comment is also included
 * in the generated entity class.
 */
/*
 * This class is generated from the entity 'ProgramFeeInfo' defined in the HEDL
 * model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class ProgramFeeInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="programid", nullable=false)
	private long programId;
	
	@Column(name="feevalue", nullable=false)
	private long feeValue;
	
	@Column(name="feemode", nullable=false)
	private int feeMode;
	
	@Column(name="mincapvalue", nullable=false)
	private long minCapValue;
	
	@Column(name="maxcapvalue", nullable=false)
	private long maxCapValue;
	
	@Column(name="feetypeid", nullable=false)
	private long feeTypeId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="feestartdate", nullable=false)
	private Date feeStartDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="feeenddate", nullable=false)
	private Date feeEndDate;
	
	@Column(name="feeslabid", nullable=false)
	private int feeSlabId;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<ProgramFeeSlabInfo> programFeeSlabInfo;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public ProgramFeeInfo() {
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
	public ProgramFeeInfo(long programId, long feeValue, int feeMode, long minCapValue, long maxCapValue, long feeTypeId, Date feeStartDate, Date feeEndDate, int feeSlabId, int status) {
		super();
		if (feeStartDate == null) {
			throw new IllegalArgumentException("'feeStartDate' must not be null.");
		}
		if (feeEndDate == null) {
			throw new IllegalArgumentException("'feeEndDate' must not be null.");
		}
		this.programId = programId;
		this.feeValue = feeValue;
		this.feeMode = feeMode;
		this.minCapValue = minCapValue;
		this.maxCapValue = maxCapValue;
		this.feeTypeId = feeTypeId;
		this.feeStartDate = feeStartDate;
		this.feeEndDate = feeEndDate;
		this.feeSlabId = feeSlabId;
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
	 * Returns the value of property 'feeValue'.
	 */
	public long getFeeValue() {
		return feeValue;
	}
	
	/**
	 * Sets the value of property 'feeValue'.
	 */
	public void setFeeValue(long newValue) {
		this.feeValue = newValue;
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
	 * Returns the value of property 'minCapValue'.
	 */
	public long getMinCapValue() {
		return minCapValue;
	}
	
	/**
	 * Sets the value of property 'minCapValue'.
	 */
	public void setMinCapValue(long newValue) {
		this.minCapValue = newValue;
	}
	
	/**
	 * Returns the value of property 'maxCapValue'.
	 */
	public long getMaxCapValue() {
		return maxCapValue;
	}
	
	/**
	 * Sets the value of property 'maxCapValue'.
	 */
	public void setMaxCapValue(long newValue) {
		this.maxCapValue = newValue;
	}
	
	/**
	 * Returns the value of property 'feeTypeId'.
	 */
	public long getFeeTypeId() {
		return feeTypeId;
	}
	
	/**
	 * Sets the value of property 'feeTypeId'.
	 */
	public void setFeeTypeId(long newValue) {
		this.feeTypeId = newValue;
	}
	
	/**
	 * Returns the value of property 'feeStartDate'.
	 */
	public Date getFeeStartDate() {
		return feeStartDate;
	}
	
	/**
	 * Sets the value of property 'feeStartDate'.
	 */
	public void setFeeStartDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'feeStartDate' must not be null.");
		}
		this.feeStartDate = newValue;
	}
	
	/**
	 * Returns the value of property 'feeEndDate'.
	 */
	public Date getFeeEndDate() {
		return feeEndDate;
	}
	
	/**
	 * Sets the value of property 'feeEndDate'.
	 */
	public void setFeeEndDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'feeEndDate' must not be null.");
		}
		this.feeEndDate = newValue;
	}
	
	/**
	 * Returns the value of property 'feeSlabId'.
	 */
	public int getFeeSlabId() {
		return feeSlabId;
	}
	
	/**
	 * Sets the value of property 'feeSlabId'.
	 */
	public void setFeeSlabId(int newValue) {
		this.feeSlabId = newValue;
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
	 * Returns the value of property 'programFeeSlabInfo'.
	 */
	public List<ProgramFeeSlabInfo> getProgramFeeSlabInfo() {
		if (programFeeSlabInfo == null) {
			programFeeSlabInfo = new ArrayList<ProgramFeeSlabInfo>(1);
		}
		return programFeeSlabInfo;
	}
	
	/**
	 * Sets the value of property 'programFeeSlabInfo'.
	 */
	public void setProgramFeeSlabInfo(List<ProgramFeeSlabInfo> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'programFeeSlabInfo' must not be null.");
		}
		this.programFeeSlabInfo = newValue;
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
		ProgramFeeInfo other = (ProgramFeeInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("ProgramFeeInfo-");
		result.append(getId());
		result.append(" [");
		result.append("programId = ");
		result.append(getProgramId());
		result.append(", ");
		result.append("feeValue = ");
		result.append(getFeeValue());
		result.append(", ");
		result.append("feeMode = ");
		result.append(getFeeMode());
		result.append(", ");
		result.append("minCapValue = ");
		result.append(getMinCapValue());
		result.append(", ");
		result.append("maxCapValue = ");
		result.append(getMaxCapValue());
		result.append(", ");
		result.append("feeTypeId = ");
		result.append(getFeeTypeId());
		result.append(", ");
		result.append("feeStartDate = ");
		result.append(getFeeStartDate());
		result.append(", ");
		result.append("feeEndDate = ");
		result.append(getFeeEndDate());
		result.append(", ");
		result.append("feeSlabId = ");
		result.append(getFeeSlabId());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
