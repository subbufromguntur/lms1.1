package com.lms.accountmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "login")
public class LoginBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "login_id")
	private Long loginId;
	
	@Column(name="username", nullable=false)
	private String userName;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="indicator", nullable=false)
	private String indicator;
	
	/*@OneToMany
	@PrimaryKeyJoinColumn
	private List<ChurchDetails> churchDetails;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private FamilyDetails familyDetails;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private MemberDetails memberDetails;*/
	
	@Transient
	private String changedPassword;

	public LoginBean(){
		
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Long getLoginId() {
		return loginId;
	}
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}
	
	public String getChangedPassword() {
		return changedPassword;
	}
	public void setChangedPassword(String changedPassword) {
		this.changedPassword = changedPassword;
	}
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	
	
}
