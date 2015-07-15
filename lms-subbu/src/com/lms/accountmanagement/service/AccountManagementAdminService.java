package com.lms.accountmanagement.service;

import java.util.List;

import com.lms.accountmanagement.beans.ClientBean;
import com.lms.accountmanagement.dto.LoginBean;
import com.lms.accountmanagement.dto.Roles;


public interface AccountManagementAdminService {
	public LoginBean checkCredentials(LoginBean loginBean);
	public LoginBean changePassword(LoginBean loginBean);
	public void saveLoginDetails(LoginBean loginBean);
	public List<Roles> getRolesData();
	public void saveRoleDetails(String rolesFilePath);
	public void submitClient(ClientBean clientBean);
	
}
