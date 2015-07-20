package com.rms.framework.service.impl;

import java.util.Date;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rms.framework.dao.RoleManagementAdminDao;
import com.rms.framework.organization.client.dao.ClientManagementDao;
import com.rms.framework.organization.user.dao.UserManagementDao;
import com.rms.framework.organization.user.model.LmsUserCredentails;
import com.rms.framework.organization.user.model.LmsUserPermission;
import com.rms.framework.organization.user.model.LmsUserProfile;
import com.rms.framework.service.AccountManagementAdminService;

@Service
@Transactional
public class AccountManagementAdminServiceImpl implements AccountManagementAdminService{

	@Resource
	public RoleManagementAdminDao roleManagementAdminDaoImpl;
	@Resource
	private ClientManagementDao clientManagementDao;
	@Resource
	public UserManagementDao userManagementDao;
	
	
	
	public LmsUserCredentails checkCredentials(LmsUserCredentails lmsUserCredentails) {
		return this.userManagementDao.checkCredentials(lmsUserCredentails);
	}
	
	public LmsUserCredentails changePassword(LmsUserCredentails loginBean) {
		loginBean.setAllowedRecentUsedPasswordCount(1);
		loginBean.setBadTryCount(0);
		loginBean.setPassword(loginBean.getChangedPassword());
		return this.userManagementDao.updateUser(loginBean);
	}


	public void saveLoginDetails() {
		this.userManagementDao.submitUser(prepareLoginBean());
	}

	private LmsUserCredentails prepareLoginBean() {
		LmsUserCredentails lmsUserCredentails = new LmsUserCredentails();
		LmsUserProfile lmsUserProfile = new LmsUserProfile();
		LmsUserPermission lmsUserPermission = new LmsUserPermission();
		
		lmsUserCredentails.setAllowedRecentUsedPasswordCount(0);
		lmsUserCredentails.setBadTryCount(0);
		lmsUserCredentails.setCheckerComments("Created Directly For Admin");
		lmsUserCredentails.setClientId("Admin");
		lmsUserCredentails.setCreationDatetime(new Date());
		lmsUserCredentails.setDescription("Created Directly For Admin");
		lmsUserCredentails.setLastAccessedDatetime(new Date());
		lmsUserCredentails.setLastModifiedDatetime(new Date());
		lmsUserCredentails.setLastPasswordsUsed("reward360");
		//lmsUserCredentails.setLmsUserPermission(lmsUserPermission123);
		//lmsUserCredentails.setLmsUserProfile(lmsUserProfile1234);
		lmsUserCredentails.setMackerComments("Created Directly For Admin");
		//lmsUserCredentails.setParentId(parentId);
		lmsUserCredentails.setPassword("reward360");
		lmsUserCredentails.setStatus("Progress");
		lmsUserCredentails.setUserName("reward360");
		
		
		
		
		lmsUserCredentails.setLmsUserProfile(lmsUserProfile);
		lmsUserCredentails.setLmsUserPermission(lmsUserPermission);
		
		
		return lmsUserCredentails;
	}

	public void updateBadTryCount(LmsUserCredentails loginBean) {
		this.userManagementDao.updateBadTryCount(loginBean);
	
	}
}
