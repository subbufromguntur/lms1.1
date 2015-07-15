package com.lms.accountmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "role")
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private Long id;
	
	@Column(name = "role_name")
	private String roleName;
	
	@Column(name = "role_description")
	private String roleDescription;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.PERSIST)
	@Column(name = "permissions_manage_client")
	private List<ClientTypes> clientTypes = null;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.PERSIST)
	@Column(name = "permissions_manage_roles")
	private List<RoleTypes> roleTypes = null;
	
	@OneToMany(fetch=FetchType.EAGER , cascade = CascadeType.PERSIST)
	@Column(name = "permissions_manage_users")
	private List<UserTypes> userTypes = null;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.PERSIST)
	@Column(name = "permissions_manage_program")
	private List<ProgramTypes> programTypes = null;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.PERSIST)
	@Column(name = "permissions_manage_account")
	private List<AccountTypes> accountTypes = null;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.PERSIST)
	@Column(name = "permissions_batch_process")
	private List<BatchTypes> batchTypes = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public List<ClientTypes> getClientTypes() {
		return clientTypes;
	}

	public void setClientTypes(List<ClientTypes> clientTypes) {
		this.clientTypes = clientTypes;
	}

	public List<RoleTypes> getRoleTypes() {
		return roleTypes;
	}

	public void setRoleTypes(List<RoleTypes> roleTypes) {
		this.roleTypes = roleTypes;
	}

	public List<UserTypes> getUserTypes() {
		return userTypes;
	}

	public void setUserTypes(List<UserTypes> userTypes) {
		this.userTypes = userTypes;
	}

	public List<ProgramTypes> getProgramTypes() {
		return programTypes;
	}

	public void setProgramTypes(List<ProgramTypes> programTypes) {
		this.programTypes = programTypes;
	}

	public List<AccountTypes> getAccountTypes() {
		return accountTypes;
	}

	public void setAccountTypes(List<AccountTypes> accountTypes) {
		this.accountTypes = accountTypes;
	}

	public List<BatchTypes> getBatchTypes() {
		return batchTypes;
	}

	public void setBatchTypes(List<BatchTypes> batchTypes) {
		this.batchTypes = batchTypes;
	}

	
}
