package com.rms.loyalty.organization.user.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rms_user_profile")
public class UserProfile {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "midlename")
	private String midlename;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "phone_no_1")
	private String phoneNo1;

	@Column(name = "phone_no_2")
	private String phoneNo2;

	@Column(name = "future_1")
	private String future1;

	@Column(name = "future_2")
	private String future2;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private UserCredentails userCredentails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMidlename() {
		return midlename;
	}

	public void setMidlename(String midlename) {
		this.midlename = midlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public String getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public String getFuture1() {
		return future1;
	}

	public void setFuture1(String future1) {
		this.future1 = future1;
	}

	public String getFuture2() {
		return future2;
	}

	public void setFuture2(String future2) {
		this.future2 = future2;
	}

	public UserCredentails getLmsUserCredentails() {
		return userCredentails;
	}

	public void setLmsUserCredentails(UserCredentails userCredentails) {
		this.userCredentails = userCredentails;
	}

}
