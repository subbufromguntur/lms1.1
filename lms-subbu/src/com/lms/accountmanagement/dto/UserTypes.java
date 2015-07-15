package com.lms.accountmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "permissions_manage_users")
public class UserTypes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_type_id")
	private Long id;
	
	@Column(name = "permissions_manage_users")
	private String typeOfUsers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeOfUsers() {
		return typeOfUsers;
	}

	public void setTypeOfUsers(String typeOfUsers) {
		this.typeOfUsers = typeOfUsers;
	}
	
	
}
