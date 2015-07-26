package com.subbu.please.use.thisorg.pack;

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

import com.rms.loyalty.program.model.ProgramInfo;

@Entity
@Table(name = "organizationinfo")
/**
 * A Organization is someone who creates offers. This comment is also included in
 * the generated entity class.
 */
/*
 * This class is generated from the entity 'OrganizationInfo' defined in the HEDL
 * model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class OrganizationInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="organizationname", nullable=false)
	private String organizationName;
	
	@Column(name="organizationparentid", nullable=false)
	private long organizationParentId;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="organizationdetail", nullable=false)
	private OrganizationDetail organizationDetail;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<OrganizationGLAccount> glAccount;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<OrganizationNotification> organizationNotification;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<OrganizationFileConfigLocation> organizationFileConfigLocation;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<ProgramInfo> programInfo;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public OrganizationInfo() {
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
	public OrganizationInfo(String organizationName, long organizationParentId, int status, OrganizationDetail organizationDetail) {
		super();
		if (organizationName == null) {
			throw new IllegalArgumentException("'organizationName' must not be null.");
		}
		if (organizationDetail == null) {
			throw new IllegalArgumentException("'organizationDetail' must not be null.");
		}
		this.organizationName = organizationName;
		this.organizationParentId = organizationParentId;
		this.status = status;
		this.organizationDetail = organizationDetail;
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
	 * Returns the value of property 'organizationName'.
	 */
	public String getOrganizationName() {
		return organizationName;
	}
	
	/**
	 * Sets the value of property 'organizationName'.
	 */
	public void setOrganizationName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'organizationName' must not be null.");
		}
		this.organizationName = newValue;
	}
	
	/**
	 * Returns the value of property 'organizationParentId'.
	 */
	public long getOrganizationParentId() {
		return organizationParentId;
	}
	
	/**
	 * Sets the value of property 'organizationParentId'.
	 */
	public void setOrganizationParentId(long newValue) {
		this.organizationParentId = newValue;
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
	 * Returns the value of property 'organizationDetail'.
	 */
	public OrganizationDetail getOrganizationDetail() {
		return organizationDetail;
	}
	
	/**
	 * Sets the value of property 'organizationDetail'.
	 */
	public void setOrganizationDetail(OrganizationDetail newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'organizationDetail' must not be null.");
		}
		this.organizationDetail = newValue;
	}
	
	/**
	 * Returns the value of property 'glAccount'.
	 */
	public List<OrganizationGLAccount> getGlAccount() {
		if (glAccount == null) {
			glAccount = new ArrayList<OrganizationGLAccount>(1);
		}
		return glAccount;
	}
	
	/**
	 * Sets the value of property 'glAccount'.
	 */
	public void setGlAccount(List<OrganizationGLAccount> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'glAccount' must not be null.");
		}
		this.glAccount = newValue;
	}
	
	/**
	 * Returns the value of property 'organizationNotification'.
	 */
	public List<OrganizationNotification> getOrganizationNotification() {
		if (organizationNotification == null) {
			organizationNotification = new ArrayList<OrganizationNotification>(1);
		}
		return organizationNotification;
	}
	
	/**
	 * Sets the value of property 'organizationNotification'.
	 */
	public void setOrganizationNotification(List<OrganizationNotification> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'organizationNotification' must not be null.");
		}
		this.organizationNotification = newValue;
	}
	
	/**
	 * Returns the value of property 'organizationFileConfigLocation'.
	 */
	public List<OrganizationFileConfigLocation> getOrganizationFileConfigLocation() {
		if (organizationFileConfigLocation == null) {
			organizationFileConfigLocation = new ArrayList<OrganizationFileConfigLocation>(1);
		}
		return organizationFileConfigLocation;
	}
	
	/**
	 * Sets the value of property 'organizationFileConfigLocation'.
	 */
	public void setOrganizationFileConfigLocation(List<OrganizationFileConfigLocation> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'organizationFileConfigLocation' must not be null.");
		}
		this.organizationFileConfigLocation = newValue;
	}
	
	/**
	 * Returns the value of property 'programInfo'.
	 */
	public List<ProgramInfo> getProgramInfo() {
		if (programInfo == null) {
			programInfo = new ArrayList<ProgramInfo>(1);
		}
		return programInfo;
	}
	
	/**
	 * Sets the value of property 'programInfo'.
	 */
	public void setProgramInfo(List<ProgramInfo> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'programInfo' must not be null.");
		}
		this.programInfo = newValue;
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
		OrganizationInfo other = (OrganizationInfo) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("OrganizationInfo-");
		result.append(getId());
		result.append(" [");
		result.append("organizationName = ");
		result.append(getOrganizationName());
		result.append(", ");
		result.append("organizationParentId = ");
		result.append(getOrganizationParentId());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
