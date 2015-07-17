package com.rms.framework.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rms.framework.dao.AccountManagementAdminDao;
import com.rms.framework.dao.RoleManagementAdminDao;
import com.rms.framework.model.LoginBean;
import com.rms.framework.service.AccountManagementAdminService;

@Service
@Transactional
public class AccountManagementAdminServiceImpl implements AccountManagementAdminService{

	@Resource
	public AccountManagementAdminDao accountManagementAdminDaoImpl;
	@Resource
	public RoleManagementAdminDao roleManagementAdminDaoImpl;
	
	
	
	public LoginBean checkCredentials(LoginBean loginBean) {
		return this.accountManagementAdminDaoImpl.checkCredentials(loginBean);
	}


	public LoginBean changePassword(LoginBean loginBean) {
		loginBean.setIndicator("99");
		loginBean.setPassword(loginBean.getChangedPassword());
		return this.accountManagementAdminDaoImpl.changePassword(loginBean);
	}


	public void saveLoginDetails(LoginBean loginBean) {
		loginBean = prepareLoginBean(new LoginBean());
		this.accountManagementAdminDaoImpl.saveLoginDetails(loginBean);		
	}


	private LoginBean prepareLoginBean(LoginBean loginBean) {
		loginBean.setIndicator("9");
		loginBean.setUserName("reward360");
		loginBean.setPassword("reward360");
		
		return loginBean;
	}
	
}
