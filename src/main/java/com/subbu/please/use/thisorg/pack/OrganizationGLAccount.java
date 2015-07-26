package com.subbu.please.use.thisorg.pack;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rms.loyalty.master.model.MasterGLAccountType;

@Entity
@Table(name = "organizationglaccount")
/**
 * A OrganizationGLAccount is someone who creates offers. This comment is also
 * included in the generated entity class.
 */
/*
 * This class is generated from the entity 'OrganizationGLAccount' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class OrganizationGLAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="organizationid", nullable=false)
	private long organizationId;
	
	@Column(name="accounttypeid", nullable=false)
	private long accountTypeId;
	
	@Column(name="organizationparentid", nullable=false)
	private long organizationParentId;
	
	@Column(name="accountnumber", nullable=false)
	private String accountNumber;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="masterglaccounttype", nullable=false)
	private MasterGLAccountType masterGLAccountType;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public OrganizationGLAccount() {
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
	public OrganizationGLAccount(long organizationId, long accountTypeId, long organizationParentId, String accountNumber, String description, int status, MasterGLAccountType masterGLAccountType) {
		super();
		if (accountNumber == null) {
			throw new IllegalArgumentException("'accountNumber' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		if (masterGLAccountType == null) {
			throw new IllegalArgumentException("'masterGLAccountType' must not be null.");
		}
		this.organizationId = organizationId;
		this.accountTypeId = accountTypeId;
		this.organizationParentId = organizationParentId;
		this.accountNumber = accountNumber;
		this.description = description;
		this.status = status;
		this.masterGLAccountType = masterGLAccountType;
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
	 * Returns the value of property 'accountTypeId'.
	 */
	public long getAccountTypeId() {
		return accountTypeId;
	}
	
	/**
	 * Sets the value of property 'accountTypeId'.
	 */
	public void setAccountTypeId(long newValue) {
		this.accountTypeId = newValue;
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
	 * Returns the value of property 'accountNumber'.
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * Sets the value of property 'accountNumber'.
	 */
	public void setAccountNumber(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'accountNumber' must not be null.");
		}
		this.accountNumber = newValue;
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
	
	/**
	 * Returns the value of property 'masterGLAccountType'.
	 */
	public MasterGLAccountType getMasterGLAccountType() {
		return masterGLAccountType;
	}
	
	/**
	 * Sets the value of property 'masterGLAccountType'.
	 */
	public void setMasterGLAccountType(MasterGLAccountType newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'masterGLAccountType' must not be null.");
		}
		this.masterGLAccountType = newValue;
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
		OrganizationGLAccount other = (OrganizationGLAccount) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("OrganizationGLAccount-");
		result.append(getId());
		result.append(" [");
		result.append("organizationId = ");
		result.append(getOrganizationId());
		result.append(", ");
		result.append("accountTypeId = ");
		result.append(getAccountTypeId());
		result.append(", ");
		result.append("organizationParentId = ");
		result.append(getOrganizationParentId());
		result.append(", ");
		result.append("accountNumber = ");
		result.append(getAccountNumber());
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
