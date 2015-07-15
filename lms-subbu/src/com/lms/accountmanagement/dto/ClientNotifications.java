package com.lms.accountmanagement.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/*@Entity
@Table(name = "client_notifications")*/
public class ClientNotifications {
	@Id
	@GeneratedValue
	@Column(name = "client_notifications_id")
	private Long id;
	@Column(name = "notification_id")
	private String notificationId;
	@Column(name = "event_id")
	private String eventId;
	@Column(name = "description")
	private String description;
	@Column(name = "status")
	private String status;
	
	/*@OneToOne
	@PrimaryKeyJoinColumn*/
	
	private ClientGlAccountDto clientGlAccountDto;
	
	
	/*@OneToOne(cascade = CascadeType.ALL, mappedBy="clientFileConfigurationLocation")
	@LazyCollection(LazyCollectionOption.FALSE)
	@PrimaryKeyJoinColumn*/
	private ClientFileConfigurationLocation clientFileConfigurationLocation = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
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
    @JoinColumn(name = "client_gl_account_id")
	public ClientGlAccountDto getClientGlAccount() {
		return clientGlAccountDto;
	}

	public void setClientGlAccount(ClientGlAccountDto clientGlAccountDto) {
		this.clientGlAccountDto = clientGlAccountDto;
	}

		
}
