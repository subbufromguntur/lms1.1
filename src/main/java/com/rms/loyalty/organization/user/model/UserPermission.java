package com.rms.loyalty.organization.user.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lms_user_permission")
public class UserPermission {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long id;
	
	@Column(name="user_group_id")
	private int userGroupId;
	
	@Column(name="user_permission_list")
	private String userPermissionList;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
	private UserCredentails userCredentails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getUserPermissionList() {
		return userPermissionList;
	}

	public void setUserPermissionList(String userPermissionList) {
		this.userPermissionList = userPermissionList;
	}

	public UserCredentails getLmsUserCredentails() {
		return userCredentails;
	}

	public void setLmsUserCredentails(UserCredentails userCredentails) {
		this.userCredentails = userCredentails;
	}
	
	
}
