package com.rms.framework.organization.user.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "lms_user_credentails")
public class LmsUserCredentails {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long id;
	
	@Column(name="client_id", nullable = false)
	private String clientId;
	
	@Column(name="username", nullable = false)
	private String userName;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="creation_datetime", nullable = false)
	private Date creationDatetime = new Date();
	
	@Column(name="last_modified_datetime", nullable = false)
	private Date lastModifiedDatetime = new Date();
	
	@Column(name="last_accessed_datetime", nullable = false)
	private Date lastAccessedDatetime = new Date();
	
	@Column(name="bad_try_count")
	private int badTryCount;
	
	@Column(name="last_passwords_used")
	private String lastPasswordsUsed;
	
	@Column(name="allowed_recent_used_password_count")
	private int allowedRecentUsedPasswordCount;
	
	@Column(name="parent_id")
	private int parentId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="macker_comments")
	private String mackerComments;
	
	@Column(name="checker_comments")
	private String checkerComments;
	
	@Column(name="description")
	private String description;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private LmsUserProfile lmsUserProfile = null;
	
	@OneToOne(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private LmsUserPermission lmsUserPermission = null;
	
	@Transient
	private String changedPassword = null;
	@Transient
	private String indicator = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreationDatetime() {
		return creationDatetime;
	}

	public void setCreationDatetime(Date creationDatetime) {
		this.creationDatetime = creationDatetime;
	}

	public Date getLastModifiedDatetime() {
		return lastModifiedDatetime;
	}

	public void setLastModifiedDatetime(Date lastModifiedDatetime) {
		this.lastModifiedDatetime = lastModifiedDatetime;
	}

	public Date getLastAccessedDatetime() {
		return lastAccessedDatetime;
	}

	public void setLastAccessedDatetime(Date lastAccessedDatetime) {
		this.lastAccessedDatetime = lastAccessedDatetime;
	}

	public int getBadTryCount() {
		return badTryCount;
	}

	public void setBadTryCount(int badTryCount) {
		this.badTryCount = badTryCount;
	}

	public String getLastPasswordsUsed() {
		return lastPasswordsUsed;
	}

	public void setLastPasswordsUsed(String lastPasswordsUsed) {
		this.lastPasswordsUsed = lastPasswordsUsed;
	}

	public int getAllowedRecentUsedPasswordCount() {
		return allowedRecentUsedPasswordCount;
	}

	public void setAllowedRecentUsedPasswordCount(int allowedRecentUsedPasswordCount) {
		this.allowedRecentUsedPasswordCount = allowedRecentUsedPasswordCount;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMackerComments() {
		return mackerComments;
	}

	public void setMackerComments(String mackerComments) {
		this.mackerComments = mackerComments;
	}

	public String getCheckerComments() {
		return checkerComments;
	}

	public void setCheckerComments(String checkerComments) {
		this.checkerComments = checkerComments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LmsUserProfile getLmsUserProfile() {
		return lmsUserProfile;
	}

	public void setLmsUserProfile(LmsUserProfile lmsUserProfile) {
		this.lmsUserProfile = lmsUserProfile;
	}

	public LmsUserPermission getLmsUserPermission() {
		return lmsUserPermission;
	}

	public void setLmsUserPermission(LmsUserPermission lmsUserPermission) {
		this.lmsUserPermission = lmsUserPermission;
	}

	public String getChangedPassword() {
		return changedPassword;
	}

	public void setChangedPassword(String changedPassword) {
		this.changedPassword = changedPassword;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	
}
