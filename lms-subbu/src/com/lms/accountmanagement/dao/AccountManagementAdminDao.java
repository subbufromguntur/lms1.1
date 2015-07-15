package com.lms.accountmanagement.dao;

import com.lms.accountmanagement.dto.LoginBean;

public interface AccountManagementAdminDao  extends GenericDao<LoginBean, Long> {
	public LoginBean checkCredentials(LoginBean loginBean);

	public LoginBean changePassword(LoginBean loginBean);

	public void saveLoginDetails(LoginBean loginBean);
	

}
