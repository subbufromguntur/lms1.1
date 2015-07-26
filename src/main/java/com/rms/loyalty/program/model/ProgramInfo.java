package com.rms.loyalty.program.model;

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

import com.rms.loyalty.tier.model.TierInfo;

@Entity
@Table(name = "programinfo")
/**
 * A ProgramInfo is someone who creates offers. This comment is also included in
 * the generated entity class.
 */
/*
 * This class is generated from the entity 'ProgramInfo' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class ProgramInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="organizationid", nullable=false)
	private long organizationId;
	
	@Column(name="programname", nullable=false)
	private String programName;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="programdetail", nullable=false)
	private ProgramDetail programDetail;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="programfeeinfo", nullable=false)
	private ProgramFeeInfo programFeeInfo;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<PartnerInfo> partnerInfo;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<TierInfo> tierInfo;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public ProgramInfo() {
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
	public ProgramInfo(long organizationId, String programName, int status, ProgramDetail programDetail, ProgramFeeInfo programFeeInfo) {
		super();
		if (programName == null) {
			throw new IllegalArgumentException("'programName' must not be null.");
		}
		if (programDetail == null) {
			throw new IllegalArgumentException("'programDetail' must not be null.");
		}
		if (programFeeInfo == null) {
			throw new IllegalArgumentException("'programFeeInfo' must not be null.");
		}
		this.organizationId = organizationId;
		this.programName = programName;
		this.status = status;
		this.programDetail = programDetail;
		this.programFeeInfo = programFeeInfo;
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
	 * Returns the value of property 'programName'.
	 */
	public String getProgramName() {
		return programName;
	}
	
	/**
	 * Sets the value of property 'programName'.
	 */
	public void setProgramName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'programName' must not be null.");
		}
		this.programName = newValue;
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
	 * Returns the value of property 'programDetail'.
	 */
	public ProgramDetail getProgramDetail() {
		return programDetail;
	}
	
	/**
	 * Sets the value of property 'programDetail'.
	 */
	public void setProgramDetail(ProgramDetail newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'programDetail' must not be null.");
		}
		this.programDetail = newValue;
	}
	
	/**
	 * Returns the value of property 'programFeeInfo'.
	 */
	public ProgramFeeInfo getProgramFeeInfo() {
		return programFeeInfo;
	}
	
	/**
	 * Sets the value of property 'programFeeInfo'.
	 */
	public void setProgramFeeInfo(ProgramFeeInfo newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'programFeeInfo' must not be null.");
		}
		this.programFeeInfo = newValue;
	}
	
	/**
	 * Returns the value of property 'partnerInfo'.
	 */
	public List<PartnerInfo> getPartnerInfo() {
		if (partnerInfo == null) {
			partnerInfo = new ArrayList<PartnerInfo>(1);
		}
		return partnerInfo;
	}
	
	/**
	 * Sets the value of property 'partnerInfo'.
	 */
	public void setPartnerInfo(List<PartnerInfo> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'partnerInfo' must not be null.");
		}
		this.partnerInfo = newValue;
	}
	
	/**
	 * Returns the value of property 'tierInfo'.
	 */
	public List<TierInfo> getTierInfo() {
		if (tierInfo == null) {
			tierInfo = new ArrayList<TierInfo>(1);
		}
		return tierInfo;
	}
	
	/**
	 * Sets the value of property 'tierInfo'.
	 */
	public void setTierInfo(List<TierInfo> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'tierInfo' must not be null.");
		}
		this.tierInfo = newValue;
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
		ProgramInfo other = (ProgramInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("ProgramInfo-");
		result.append(getId());
		result.append(" [");
		result.append("organizationId = ");
		result.append(getOrganizationId());
		result.append(", ");
		result.append("programName = ");
		result.append(getProgramName());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
