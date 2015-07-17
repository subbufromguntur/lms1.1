package com.rms.framework.service;

import com.rms.framework.model.LoginBean;


public interface AccountManagementAdminService {
	public LoginBean checkCredentials(LoginBean loginBean);
	public LoginBean changePassword(LoginBean loginBean);
	public void saveLoginDetails(LoginBean loginBean);
	
	
}
