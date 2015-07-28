package com.rms.loyalty.organization.model;

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
public class OrganizationNotification {
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
	
	private OrganizationGLAccount organizationGLAccount;
	
	
	/*@OneToOne(cascade = CascadeType.ALL, mappedBy="organizationFileConfigLocation")
	@LazyCollection(LazyCollectionOption.FALSE)
	@PrimaryKeyJoinColumn*/
	private OrganizationFileConfigLocation organizationFileConfigLocation = null;

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

	public OrganizationFileConfigLocation getClientFileConfigurationLocation() {
		return organizationFileConfigLocation;
	}

	public void setClientFileConfigurationLocation(
			OrganizationFileConfigLocation organizationFileConfigLocation) {
		this.organizationFileConfigLocation = organizationFileConfigLocation;
	}

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_gl_account_id")
	public OrganizationGLAccount getClientGlAccount() {
		return organizationGLAccount;
	}

	public void setClientGlAccount(OrganizationGLAccount organizationGLAccount) {
		this.organizationGLAccount = organizationGLAccount;
	}

		
}
