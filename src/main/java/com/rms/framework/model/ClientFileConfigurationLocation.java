package com.rms.framework.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*@Entity
@Table(name = "client_file_configuration_location")*/
public class ClientFileConfigurationLocation {

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
	
	private ClientNotifications clientNotifications = null;
	
	/*@OneToOne
	@PrimaryKeyJoinColumn*/
	private ClientFileConfigurationLocation clientFileConfigurationLocation;
	
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
	public ClientFileConfigurationLocation getClientFileConfigurationLocation() {
		return clientFileConfigurationLocation;
	}
	public void setClientFileConfigurationLocation(
			ClientFileConfigurationLocation clientFileConfigurationLocation) {
		this.clientFileConfigurationLocation = clientFileConfigurationLocation;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_notifications_id")
	public ClientNotifications getClientNotifications() {
		return clientNotifications;
	}
	public void setClientNotifications(ClientNotifications clientNotifications) {
		this.clientNotifications = clientNotifications;
	}
	
	
}
