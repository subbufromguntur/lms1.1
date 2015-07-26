package com.subbu.please.use.thisorg.pack;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rms.loyalty.master.model.MasterCategoryRegion;
import com.rms.loyalty.master.model.MasterChannelType;

@Entity
@Table(name = "organizationdetail")
/**
 * A OrganizationDetail is someone who creates offers. This comment is also
 * included in the generated entity class.
 */
/*
 * This class is generated from the entity 'OrganizationDetail' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class OrganizationDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="organizationid", nullable=false)
	private long organizationId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creationdate", nullable=false)
	private Date creationDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastmodifieddate", nullable=false)
	private Date lastModifiedDate;
	
	@Column(name="region", nullable=false)
	private String region;
	
	@Column(name="timezone", nullable=false)
	private String timezone;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="approvalcomment", nullable=false)
	private String approvalComment;
	
	@Column(name="creatorcomment", nullable=false)
	private String creatorComment;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<OrganizationPhone> organizationPhone;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<OrganizationAddress> organizationAddress;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="masterchanneltype", nullable=false)
	private MasterChannelType masterChannelType;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="mastercategoryregion", nullable=false)
	private MasterCategoryRegion masterCategoryRegion;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public OrganizationDetail() {
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
	public OrganizationDetail(long organizationId, Date creationDate, Date lastModifiedDate, String region, String timezone, String description, String approvalComment, String creatorComment, MasterChannelType masterChannelType, MasterCategoryRegion masterCategoryRegion) {
		super();
		if (creationDate == null) {
			throw new IllegalArgumentException("'creationDate' must not be null.");
		}
		if (lastModifiedDate == null) {
			throw new IllegalArgumentException("'lastModifiedDate' must not be null.");
		}
		if (region == null) {
			throw new IllegalArgumentException("'region' must not be null.");
		}
		if (timezone == null) {
			throw new IllegalArgumentException("'timezone' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		if (approvalComment == null) {
			throw new IllegalArgumentException("'approvalComment' must not be null.");
		}
		if (creatorComment == null) {
			throw new IllegalArgumentException("'creatorComment' must not be null.");
		}
		if (masterChannelType == null) {
			throw new IllegalArgumentException("'masterChannelType' must not be null.");
		}
		if (masterCategoryRegion == null) {
			throw new IllegalArgumentException("'masterCategoryRegion' must not be null.");
		}
		this.organizationId = organizationId;
		this.creationDate = creationDate;
		this.lastModifiedDate = lastModifiedDate;
		this.region = region;
		this.timezone = timezone;
		this.description = description;
		this.approvalComment = approvalComment;
		this.creatorComment = creatorComment;
		this.masterChannelType = masterChannelType;
		this.masterCategoryRegion = masterCategoryRegion;
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
	 * Returns the value of property 'creationDate'.
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	
	/**
	 * Sets the value of property 'creationDate'.
	 */
	public void setCreationDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'creationDate' must not be null.");
		}
		this.creationDate = newValue;
	}
	
	/**
	 * Returns the value of property 'lastModifiedDate'.
	 */
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	
	/**
	 * Sets the value of property 'lastModifiedDate'.
	 */
	public void setLastModifiedDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'lastModifiedDate' must not be null.");
		}
		this.lastModifiedDate = newValue;
	}
	
	/**
	 * Returns the value of property 'region'.
	 */
	public String getRegion() {
		return region;
	}
	
	/**
	 * Sets the value of property 'region'.
	 */
	public void setRegion(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'region' must not be null.");
		}
		this.region = newValue;
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
	 * Returns the value of property 'approvalComment'.
	 */
	public String getApprovalComment() {
		return approvalComment;
	}
	
	/**
	 * Sets the value of property 'approvalComment'.
	 */
	public void setApprovalComment(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'approvalComment' must not be null.");
		}
		this.approvalComment = newValue;
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
	 * Returns the value of property 'organizationPhone'.
	 */
	public List<OrganizationPhone> getOrganizationPhone() {
		if (organizationPhone == null) {
			organizationPhone = new ArrayList<OrganizationPhone>(1);
		}
		return organizationPhone;
	}
	
	/**
	 * Sets the value of property 'organizationPhone'.
	 */
	public void setOrganizationPhone(List<OrganizationPhone> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'organizationPhone' must not be null.");
		}
		this.organizationPhone = newValue;
	}
	
	/**
	 * Returns the value of property 'organizationAddress'.
	 */
	public List<OrganizationAddress> getOrganizationAddress() {
		if (organizationAddress == null) {
			organizationAddress = new ArrayList<OrganizationAddress>(1);
		}
		return organizationAddress;
	}
	
	/**
	 * Sets the value of property 'organizationAddress'.
	 */
	public void setOrganizationAddress(List<OrganizationAddress> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'organizationAddress' must not be null.");
		}
		this.organizationAddress = newValue;
	}
	
	/**
	 * Returns the value of property 'masterChannelType'.
	 */
	public MasterChannelType getMasterChannelType() {
		return masterChannelType;
	}
	
	/**
	 * Sets the value of property 'masterChannelType'.
	 */
	public void setMasterChannelType(MasterChannelType newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'masterChannelType' must not be null.");
		}
		this.masterChannelType = newValue;
	}
	
	/**
	 * Returns the value of property 'masterCategoryRegion'.
	 */
	public MasterCategoryRegion getMasterCategoryRegion() {
		return masterCategoryRegion;
	}
	
	/**
	 * Sets the value of property 'masterCategoryRegion'.
	 */
	public void setMasterCategoryRegion(MasterCategoryRegion newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'masterCategoryRegion' must not be null.");
		}
		this.masterCategoryRegion = newValue;
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
		OrganizationDetail other = (OrganizationDetail) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("OrganizationDetail-");
		result.append(getId());
		result.append(" [");
		result.append("organizationId = ");
		result.append(getOrganizationId());
		result.append(", ");
		result.append("creationDate = ");
		result.append(getCreationDate());
		result.append(", ");
		result.append("lastModifiedDate = ");
		result.append(getLastModifiedDate());
		result.append(", ");
		result.append("region = ");
		result.append(getRegion());
		result.append(", ");
		result.append("timezone = ");
		result.append(getTimezone());
		result.append(", ");
		result.append("description = ");
		result.append(getDescription());
		result.append(", ");
		result.append("approvalComment = ");
		result.append(getApprovalComment());
		result.append(", ");
		result.append("creatorComment = ");
		result.append(getCreatorComment());
		result.append("]");
		return result.toString();
	}
}
