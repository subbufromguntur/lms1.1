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

@Entity
@Table(name = "organization_configuration_details")
public class OrganizationDetail {
	@Id
	@GeneratedValue
	@Column(name = "organization_configuration_details_id")
	private Long id;
	@Column(name = "phone_1")
	private String phone1;
	@Column(name = "phone_2")
	private String phone2;
	@Column(name = "address_line_1")
	private String addressLine1;
	@Column(name = "address_line_2")
	private String addressLine2;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "organization_id")
	private OrganizationInfo organizationInfo;

	public OrganizationDetail() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public OrganizationInfo getClientBean() {
		return organizationInfo;
	}

	public void setClientBean(OrganizationInfo organizationInfo) {
		this.organizationInfo = organizationInfo;
	}

	public OrganizationInfo getClientDto() {
		return organizationInfo;
	}

	public void setClientDto(OrganizationInfo organizationInfo) {
		this.organizationInfo = organizationInfo;
	}

}
