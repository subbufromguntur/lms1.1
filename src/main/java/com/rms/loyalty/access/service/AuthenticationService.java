package com.rms.loyalty.access.service;

import com.rms.loyalty.organization.user.model.UserCredentails;


public interface AuthenticationService {
	public UserCredentails checkCredentials(UserCredentails userCredentails);
	public UserCredentails changePassword(UserCredentails loginBean);
	public void saveLoginDetails();
	public void updateBadTryCount(UserCredentails bean);
	public Object getManageRoles();
}
