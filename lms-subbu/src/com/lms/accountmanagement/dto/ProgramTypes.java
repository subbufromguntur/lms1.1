package com.lms.accountmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "permissions_manage_program")
public class ProgramTypes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "program_type_id")
	private Long id;
	
	@Column(name = "permissions_manage_program")
	private String programType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}
	
	
}
