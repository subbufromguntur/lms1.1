package com.rms.loyalty.program.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rms.loyalty.master.model.MasterPartnerType;

@Entity
@Table(name = "partnerinfo")
/**
 * A ProgramPartnerInfo is someone who creates offers. This comment is also
 * included in the generated entity class.
 */
/*
 * This class is generated from the entity 'PartnerInfo' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class PartnerInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="programid", nullable=false)
	private long programId;
	
	@Column(name="organizationid", nullable=false)
	private long organizationId;
	
	@Column(name="partnername", nullable=false)
	private String partnerName;
	
	@Column(name="partnertypeid", nullable=false)
	private int partnerTypeId;
	
	@Column(name="partnermccid", nullable=false)
	private long partnerMCCId;
	
	@Column(name="partnermerchantinfoid", nullable=false)
	private String partnerMerchantInfoId;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="masterpartnertype", nullable=false)
	private MasterPartnerType masterPartnerType;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public PartnerInfo() {
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
	public PartnerInfo(long programId, long organizationId, String partnerName, int partnerTypeId, long partnerMCCId, String partnerMerchantInfoId, int status, MasterPartnerType masterPartnerType) {
		super();
		if (partnerName == null) {
			throw new IllegalArgumentException("'partnerName' must not be null.");
		}
		if (partnerMerchantInfoId == null) {
			throw new IllegalArgumentException("'partnerMerchantInfoId' must not be null.");
		}
		if (masterPartnerType == null) {
			throw new IllegalArgumentException("'masterPartnerType' must not be null.");
		}
		this.programId = programId;
		this.organizationId = organizationId;
		this.partnerName = partnerName;
		this.partnerTypeId = partnerTypeId;
		this.partnerMCCId = partnerMCCId;
		this.partnerMerchantInfoId = partnerMerchantInfoId;
		this.status = status;
		this.masterPartnerType = masterPartnerType;
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
	 * Returns the value of property 'partnerName'.
	 */
	public String getPartnerName() {
		return partnerName;
	}
	
	/**
	 * Sets the value of property 'partnerName'.
	 */
	public void setPartnerName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'partnerName' must not be null.");
		}
		this.partnerName = newValue;
	}
	
	/**
	 * Returns the value of property 'partnerTypeId'.
	 */
	public int getPartnerTypeId() {
		return partnerTypeId;
	}
	
	/**
	 * Sets the value of property 'partnerTypeId'.
	 */
	public void setPartnerTypeId(int newValue) {
		this.partnerTypeId = newValue;
	}
	
	/**
	 * Returns the value of property 'partnerMCCId'.
	 */
	public long getPartnerMCCId() {
		return partnerMCCId;
	}
	
	/**
	 * Sets the value of property 'partnerMCCId'.
	 */
	public void setPartnerMCCId(long newValue) {
		this.partnerMCCId = newValue;
	}
	
	/**
	 * Returns the value of property 'partnerMerchantInfoId'.
	 */
	public String getPartnerMerchantInfoId() {
		return partnerMerchantInfoId;
	}
	
	/**
	 * Sets the value of property 'partnerMerchantInfoId'.
	 */
	public void setPartnerMerchantInfoId(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'partnerMerchantInfoId' must not be null.");
		}
		this.partnerMerchantInfoId = newValue;
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
	 * Returns the value of property 'masterPartnerType'.
	 */
	public MasterPartnerType getMasterPartnerType() {
		return masterPartnerType;
	}
	
	/**
	 * Sets the value of property 'masterPartnerType'.
	 */
	public void setMasterPartnerType(MasterPartnerType newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'masterPartnerType' must not be null.");
		}
		this.masterPartnerType = newValue;
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
		PartnerInfo other = (PartnerInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("PartnerInfo-");
		result.append(getId());
		result.append(" [");
		result.append("programId = ");
		result.append(getProgramId());
		result.append(", ");
		result.append("organizationId = ");
		result.append(getOrganizationId());
		result.append(", ");
		result.append("partnerName = ");
		result.append(getPartnerName());
		result.append(", ");
		result.append("partnerTypeId = ");
		result.append(getPartnerTypeId());
		result.append(", ");
		result.append("partnerMCCId = ");
		result.append(getPartnerMCCId());
		result.append(", ");
		result.append("partnerMerchantInfoId = ");
		result.append(getPartnerMerchantInfoId());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
