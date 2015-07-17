package com.rms.framework.dao;

import com.rms.framework.model.LoginBean;

public interface AccountManagementAdminDao extends GenericDao<LoginBean, Long> {
	public LoginBean checkCredentials(LoginBean loginBean);

	public LoginBean changePassword(LoginBean loginBean);

	public void saveLoginDetails(LoginBean loginBean);
	

}
