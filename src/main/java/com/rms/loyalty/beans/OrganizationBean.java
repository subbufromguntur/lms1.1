package com.rms.loyalty.beans;

import java.util.Date;
import java.util.List;

public class OrganizationBean {
	private String clientName;
	private String parent;
	private String type;
	private Date creationDate;
	private Date lastModifiedDate;
	private String category;
	private String region;
	private String status;
	private String timeZone;
	private String description;
	private OrganizationConfigurationDetailsBean organizationConfigurationDetailsBean = null;
	private List<OrganizationGlAccountBean> organizationGlAccountBean = null;

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public OrganizationConfigurationDetailsBean getOrganizationConfigurationDetailsBean() {
		return organizationConfigurationDetailsBean;
	}

	public void setOrganizationConfigurationDetailsBean(
			OrganizationConfigurationDetailsBean organizationConfigurationDetailsBean) {
		this.organizationConfigurationDetailsBean = organizationConfigurationDetailsBean;
	}

	public List<OrganizationGlAccountBean> getOrganizationGlAccountBean() {
		return organizationGlAccountBean;
	}

	public void setOrganizationGlAccountBean(
			List<OrganizationGlAccountBean> organizationGlAccountBean) {
		this.organizationGlAccountBean = organizationGlAccountBean;
	}

}
