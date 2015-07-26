package com.rms.loyalty.organization.user.model;

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
@Table(name = "userdetail")
/*
 * This class is generated from the entity 'UserDetail' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class UserDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="userid", nullable=false)
	private long userId;
	
	@Column(name="firstname", nullable=false)
	private String firstName;
	
	@Column(name="lastname", nullable=false)
	private String lastName;
	
	@Column(name="middlename", nullable=false)
	private String middleName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createddate", nullable=false)
	private Date createdDate;
	
	@Column(name="creatorcomment", nullable=false)
	private String creatorComment;
	
	@Column(name="approvalcomment", nullable=false)
	private String approvalComment;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<Phone> phone;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<Address> address;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<UserAccessHistory> userAccessHistory;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<RolePermissionMapping> rolePermissionMapping;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<UserPermissionMapping> userPermissionMapping;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public UserDetail() {
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
	public UserDetail(long userId, String firstName, String lastName, String middleName, Date createdDate, String creatorComment, String approvalComment) {
		super();
		if (firstName == null) {
			throw new IllegalArgumentException("'firstName' must not be null.");
		}
		if (lastName == null) {
			throw new IllegalArgumentException("'lastName' must not be null.");
		}
		if (middleName == null) {
			throw new IllegalArgumentException("'middleName' must not be null.");
		}
		if (createdDate == null) {
			throw new IllegalArgumentException("'createdDate' must not be null.");
		}
		if (creatorComment == null) {
			throw new IllegalArgumentException("'creatorComment' must not be null.");
		}
		if (approvalComment == null) {
			throw new IllegalArgumentException("'approvalComment' must not be null.");
		}
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.createdDate = createdDate;
		this.creatorComment = creatorComment;
		this.approvalComment = approvalComment;
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
	 * Returns the value of property 'userId'.
	 */
	public long getUserId() {
		return userId;
	}
	
	/**
	 * Sets the value of property 'userId'.
	 */
	public void setUserId(long newValue) {
		this.userId = newValue;
	}
	
	/**
	 * Returns the value of property 'firstName'.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the value of property 'firstName'.
	 */
	public void setFirstName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'firstName' must not be null.");
		}
		this.firstName = newValue;
	}
	
	/**
	 * Returns the value of property 'lastName'.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the value of property 'lastName'.
	 */
	public void setLastName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'lastName' must not be null.");
		}
		this.lastName = newValue;
	}
	
	/**
	 * Returns the value of property 'middleName'.
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	/**
	 * Sets the value of property 'middleName'.
	 */
	public void setMiddleName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'middleName' must not be null.");
		}
		this.middleName = newValue;
	}
	
	/**
	 * Returns the value of property 'createdDate'.
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	
	/**
	 * Sets the value of property 'createdDate'.
	 */
	public void setCreatedDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'createdDate' must not be null.");
		}
		this.createdDate = newValue;
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
	 * Returns the value of property 'phone'.
	 */
	public List<Phone> getPhone() {
		if (phone == null) {
			phone = new ArrayList<Phone>(1);
		}
		return phone;
	}
	
	/**
	 * Sets the value of property 'phone'.
	 */
	public void setPhone(List<Phone> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'phone' must not be null.");
		}
		this.phone = newValue;
	}
	
	/**
	 * Returns the value of property 'address'.
	 */
	public List<Address> getAddress() {
		if (address == null) {
			address = new ArrayList<Address>(1);
		}
		return address;
	}
	
	/**
	 * Sets the value of property 'address'.
	 */
	public void setAddress(List<Address> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'address' must not be null.");
		}
		this.address = newValue;
	}
	
	/**
	 * Returns the value of property 'userAccessHistory'.
	 */
	public List<UserAccessHistory> getUserAccessHistory() {
		if (userAccessHistory == null) {
			userAccessHistory = new ArrayList<UserAccessHistory>(1);
		}
		return userAccessHistory;
	}
	
	/**
	 * Sets the value of property 'userAccessHistory'.
	 */
	public void setUserAccessHistory(List<UserAccessHistory> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'userAccessHistory' must not be null.");
		}
		this.userAccessHistory = newValue;
	}
	
	/**
	 * Returns the value of property 'rolePermissionMapping'.
	 */
	public List<RolePermissionMapping> getRolePermissionMapping() {
		if (rolePermissionMapping == null) {
			rolePermissionMapping = new ArrayList<RolePermissionMapping>(1);
		}
		return rolePermissionMapping;
	}
	
	/**
	 * Sets the value of property 'rolePermissionMapping'.
	 */
	public void setRolePermissionMapping(List<RolePermissionMapping> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'rolePermissionMapping' must not be null.");
		}
		this.rolePermissionMapping = newValue;
	}
	
	/**
	 * Returns the value of property 'userPermissionMapping'.
	 */
	public List<UserPermissionMapping> getUserPermissionMapping() {
		if (userPermissionMapping == null) {
			userPermissionMapping = new ArrayList<UserPermissionMapping>(1);
		}
		return userPermissionMapping;
	}
	
	/**
	 * Sets the value of property 'userPermissionMapping'.
	 */
	public void setUserPermissionMapping(List<UserPermissionMapping> newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'userPermissionMapping' must not be null.");
		}
		this.userPermissionMapping = newValue;
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
		UserDetail other = (UserDetail) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("UserDetail-");
		result.append(getId());
		result.append(" [");
		result.append("userId = ");
		result.append(getUserId());
		result.append(", ");
		result.append("firstName = ");
		result.append(getFirstName());
		result.append(", ");
		result.append("lastName = ");
		result.append(getLastName());
		result.append(", ");
		result.append("middleName = ");
		result.append(getMiddleName());
		result.append(", ");
		result.append("createdDate = ");
		result.append(getCreatedDate());
		result.append(", ");
		result.append("creatorComment = ");
		result.append(getCreatorComment());
		result.append(", ");
		result.append("approvalComment = ");
		result.append(getApprovalComment());
		result.append("]");
		return result.toString();
	}
}
