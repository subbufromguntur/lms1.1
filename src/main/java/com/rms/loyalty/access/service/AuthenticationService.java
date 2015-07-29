package com.rms.loyalty.access.service;

import com.rms.loyalty.exception.FetchException;
import com.rms.loyalty.organization.user.model.UserCredentails;


public interface AuthenticationService {
	public UserCredentails checkCredentials(UserCredentails userCredentails) throws FetchException;
	public UserCredentails changePassword(UserCredentails loginBean) throws FetchException;
	public void saveLoginDetails() throws FetchException;
	public void updateBadTryCount(UserCredentails bean) throws FetchException;
	public Object getManageRoles() throws FetchException;
}
