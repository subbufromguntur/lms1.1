package com.lms.accountmanagement.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "client_gl_account")
public class ClientGlAccountDto {
	@Id
	@GeneratedValue
	@Column(name = "client_gl_account_id")
	private Long id;
	
	@Column(name = "account_id")
	private String accountId;
	@Column(name = "account_type")
	private String accountType;
	@Column(name = "account_number")
	private String accountNumber;
	@Column(name = "description")
	private String description;
	@Column(name = "status")
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
	private ClientDto clientDto;
	
	
	/*@OneToOne(cascade = CascadeType.ALL, mappedBy="clientNotifications")
	@LazyCollection(LazyCollectionOption.FALSE)
	@PrimaryKeyJoinColumn
	private ClientNotifications clientNotifications = null;*/


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public ClientDto getClientDto() {
		return clientDto;
	}


	public void setClientDto(ClientDto clientDto) {
		this.clientDto = clientDto;
	}


}
