package com.rms.framework.service;

import com.rms.framework.organization.user.model.LmsUserCredentails;


public interface AccountManagementAdminService {
	public LmsUserCredentails checkCredentials(LmsUserCredentails lmsUserCredentails);
	public LmsUserCredentails changePassword(LmsUserCredentails loginBean);
	public void saveLoginDetails();
	public void updateBadTryCount(LmsUserCredentails bean);
}
