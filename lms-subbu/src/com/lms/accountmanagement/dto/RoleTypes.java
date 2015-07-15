package com.lms.accountmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "permissions_manage_roles")
public class RoleTypes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_type_id")
	private Long id;
	
	@Column(name = "permissions_manage_roles")
	private String typeOfRoles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeOfRoles() {
		return typeOfRoles;
	}

	public void setTypeOfRoles(String typeOfRoles) {
		this.typeOfRoles = typeOfRoles;
	}
	
	
}
