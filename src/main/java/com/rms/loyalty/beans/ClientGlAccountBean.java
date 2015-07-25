package com.rms.loyalty.beans;


public class ClientGlAccountBean {
	private String accountId;
	private String accountType;
	private String accountNumber;
	private String description;
	private String status;
	private ClientNotificationsBean clientNotificationsBean = null;
	
	public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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


	public ClientNotificationsBean getClientNotificationsBean() {
		return clientNotificationsBean;
	}


	public void setClientNotificationsBean(
			ClientNotificationsBean clientNotificationsBean) {
		this.clientNotificationsBean = clientNotificationsBean;
	}
	
}
