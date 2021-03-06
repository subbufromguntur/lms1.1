package com.rms.loyalty.organization.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*@Entity
 @Table(name = "client_file_configuration_location")*/
public class OrganizationFileConfigLocation {

	@Id
	@GeneratedValue
	@Column(name = "client_file_configuration_location_id")
	private Long id;

	@Column(name = "file_location")
	private String fileLocation;
	@Column(name = "file_path")
	private String filePath;
	@Column(name = "description")
	private String description;
	@Column(name = "status")
	private String status;

	private OrganizationNotification organizationNotification = null;

	/*
	 * @OneToOne
	 * 
	 * @PrimaryKeyJoinColumn
	 */
	private OrganizationFileConfigLocation organizationFileConfigLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
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

	public OrganizationFileConfigLocation getClientFileConfigurationLocation() {
		return organizationFileConfigLocation;
	}

	public void setClientFileConfigurationLocation(
			OrganizationFileConfigLocation organizationFileConfigLocation) {
		this.organizationFileConfigLocation = organizationFileConfigLocation;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "client_notifications_id")
	public OrganizationNotification getClientNotifications() {
		return organizationNotification;
	}

	public void setClientNotifications(
			OrganizationNotification organizationNotification) {
		this.organizationNotification = organizationNotification;
	}

}
