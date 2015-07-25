package com.rms.loyalty.organization.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "client_configuration_info")
public class OrganizationInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "client_id")
	private Long id;
	@Column(name="client_name")
	private String clientName;
	@Column(name="parent_id")
	private String parent;
	@Column(name="client_type")
	private String type;
	@Column(name="creation_date")
	private Date creationDate;
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	@Column(name="category")
	private String category;
	@Column(name="region")
	private String region;
	@Column(name="status")
	private String status;
	
	@Column(name="timezone")
	private String timeZone;
	@Column(name="description")
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private OrganizationDetail organizationDetail = null;
	
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<OrganizationGLAccount> organizationGLAccount = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public OrganizationDetail getClientConfigurationDetails() {
		return organizationDetail;
	}

	public void setClientConfigurationDetails(
			OrganizationDetail organizationDetail) {
		this.organizationDetail = organizationDetail;
	}

	public List<OrganizationGLAccount> getClientGlAccount() {
		return organizationGLAccount;
	}

	public void setClientGlAccount(List<OrganizationGLAccount> organizationGLAccount) {
		this.organizationGLAccount = organizationGLAccount;
	}
	
	

}