package com.lms.accountmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permissions_manage_client")
public class ClientTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "manage_client_id")
	private Long id;
	
	@Column(name = "permissions_manage_client")
	private String typeOfClient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeOfClient() {
		return typeOfClient;
	}

	public void setTypeOfClient(String typeOfClient) {
		this.typeOfClient = typeOfClient;
	}
	
	
}
