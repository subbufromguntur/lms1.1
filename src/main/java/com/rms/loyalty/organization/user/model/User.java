package com.rms.loyalty.organization.user.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user")
/*
 * This class is generated from the entity 'User' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="userid", nullable=false)
	private long userId;
	
	@Column(name="nickname", nullable=false)
	private String nickName;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="organizationid", nullable=false)
	private long organizationId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="retiredate", nullable=false)
	private Date retireDate;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@Column(name="parentid", nullable=false)
	private long parentId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="accessedon", nullable=false)
	private Date accessedOn;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updatedon", nullable=false)
	private Date updatedOn;
	
	@Column(name="badaccess", nullable=false)
	private int badAccess;
	
	@Column(name="reusedpassword", nullable=false)
	private String reusedPassword;
	
	@Column(name="maxreuse", nullable=false)
	private int maxReuse;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="userdetail", nullable=false)
	private UserDetail userDetail;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public User() {
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
	public User(long userId, String nickName, String password, long organizationId, Date retireDate, int status, long parentId, Date accessedOn, Date updatedOn, int badAccess, String reusedPassword, int maxReuse, UserDetail userDetail) {
		super();
		if (nickName == null) {
			throw new IllegalArgumentException("'nickName' must not be null.");
		}
		if (password == null) {
			throw new IllegalArgumentException("'password' must not be null.");
		}
		if (retireDate == null) {
			throw new IllegalArgumentException("'retireDate' must not be null.");
		}
		if (accessedOn == null) {
			throw new IllegalArgumentException("'accessedOn' must not be null.");
		}
		if (updatedOn == null) {
			throw new IllegalArgumentException("'updatedOn' must not be null.");
		}
		if (reusedPassword == null) {
			throw new IllegalArgumentException("'reusedPassword' must not be null.");
		}
		if (userDetail == null) {
			throw new IllegalArgumentException("'userDetail' must not be null.");
		}
		this.userId = userId;
		this.nickName = nickName;
		this.password = password;
		this.organizationId = organizationId;
		this.retireDate = retireDate;
		this.status = status;
		this.parentId = parentId;
		this.accessedOn = accessedOn;
		this.updatedOn = updatedOn;
		this.badAccess = badAccess;
		this.reusedPassword = reusedPassword;
		this.maxReuse = maxReuse;
		this.userDetail = userDetail;
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
	 * Returns the value of property 'nickName'.
	 */
	public String getNickName() {
		return nickName;
	}
	
	/**
	 * Sets the value of property 'nickName'.
	 */
	public void setNickName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'nickName' must not be null.");
		}
		this.nickName = newValue;
	}
	
	/**
	 * Returns the value of property 'password'.
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the value of property 'password'.
	 */
	public void setPassword(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'password' must not be null.");
		}
		this.password = newValue;
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
	 * Returns the value of property 'retireDate'.
	 */
	public Date getRetireDate() {
		return retireDate;
	}
	
	/**
	 * Sets the value of property 'retireDate'.
	 */
	public void setRetireDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'retireDate' must not be null.");
		}
		this.retireDate = newValue;
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
	 * Returns the value of property 'parentId'.
	 */
	public long getParentId() {
		return parentId;
	}
	
	/**
	 * Sets the value of property 'parentId'.
	 */
	public void setParentId(long newValue) {
		this.parentId = newValue;
	}
	
	/**
	 * Returns the value of property 'accessedOn'.
	 */
	public Date getAccessedOn() {
		return accessedOn;
	}
	
	/**
	 * Sets the value of property 'accessedOn'.
	 */
	public void setAccessedOn(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'accessedOn' must not be null.");
		}
		this.accessedOn = newValue;
	}
	
	/**
	 * Returns the value of property 'updatedOn'.
	 */
	public Date getUpdatedOn() {
		return updatedOn;
	}
	
	/**
	 * Sets the value of property 'updatedOn'.
	 */
	public void setUpdatedOn(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'updatedOn' must not be null.");
		}
		this.updatedOn = newValue;
	}
	
	/**
	 * Returns the value of property 'badAccess'.
	 */
	public int getBadAccess() {
		return badAccess;
	}
	
	/**
	 * Sets the value of property 'badAccess'.
	 */
	public void setBadAccess(int newValue) {
		this.badAccess = newValue;
	}
	
	/**
	 * Returns the value of property 'reusedPassword'.
	 */
	public String getReusedPassword() {
		return reusedPassword;
	}
	
	/**
	 * Sets the value of property 'reusedPassword'.
	 */
	public void setReusedPassword(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'reusedPassword' must not be null.");
		}
		this.reusedPassword = newValue;
	}
	
	/**
	 * Returns the value of property 'maxReuse'.
	 */
	public int getMaxReuse() {
		return maxReuse;
	}
	
	/**
	 * Sets the value of property 'maxReuse'.
	 */
	public void setMaxReuse(int newValue) {
		this.maxReuse = newValue;
	}
	
	/**
	 * Returns the value of property 'userDetail'.
	 */
	public UserDetail getUserDetail() {
		return userDetail;
	}
	
	/**
	 * Sets the value of property 'userDetail'.
	 */
	public void setUserDetail(UserDetail newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'userDetail' must not be null.");
		}
		this.userDetail = newValue;
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
		User other = (User) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("User-");
		result.append(getId());
		result.append(" [");
		result.append("userId = ");
		result.append(getUserId());
		result.append(", ");
		result.append("nickName = ");
		result.append(getNickName());
		result.append(", ");
		result.append("password = ");
		result.append(getPassword());
		result.append(", ");
		result.append("organizationId = ");
		result.append(getOrganizationId());
		result.append(", ");
		result.append("retireDate = ");
		result.append(getRetireDate());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append(", ");
		result.append("parentId = ");
		result.append(getParentId());
		result.append(", ");
		result.append("accessedOn = ");
		result.append(getAccessedOn());
		result.append(", ");
		result.append("updatedOn = ");
		result.append(getUpdatedOn());
		result.append(", ");
		result.append("badAccess = ");
		result.append(getBadAccess());
		result.append(", ");
		result.append("reusedPassword = ");
		result.append(getReusedPassword());
		result.append(", ");
		result.append("maxReuse = ");
		result.append(getMaxReuse());
		result.append("]");
		return result.toString();
	}
}
