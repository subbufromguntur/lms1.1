package com.lms.accountmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "permissions_batch_process")
public class BatchTypes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "batchaccount_type_id")
	private Long id;
	
	@Column(name = "permissions_batch_process")
	private String batchType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBatchType() {
		return batchType;
	}

	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}
	
	
}
