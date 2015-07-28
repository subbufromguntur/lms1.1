package com.rms.loyalty.access.service.impl;

import java.util.Date;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.loyalty.access.service.AuthenticationService;
import com.rms.loyalty.organization.dao.OrganizationtDao;
import com.rms.loyalty.organization.user.dao.UserManagementDao;
import com.rms.loyalty.organization.user.model.UserCredentails;
import com.rms.loyalty.organization.user.model.UserPermission;
import com.rms.loyalty.organization.user.model.UserProfile;

@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService{
	@Resource
	private OrganizationtDao organizationtDao;
	@Resource
	public UserManagementDao userManagementDao;
	
	
	
	public UserCredentails checkCredentials(UserCredentails userCredentails) {
		return this.userManagementDao.checkCredentials(userCredentails);
	}
	
	public UserCredentails changePassword(UserCredentails loginBean) {
		loginBean.setAllowedRecentUsedPasswordCount(1);
		loginBean.setBadTryCount(0);
		loginBean.setPassword(loginBean.getChangedPassword());
		return this.userManagementDao.updateUser(loginBean);
	}


	public void saveLoginDetails() {
		this.userManagementDao.submitUser(prepareLoginBean());
	}

	private UserCredentails prepareLoginBean() {
		UserCredentails userCredentails = new UserCredentails();
		UserProfile userProfile = new UserProfile();
		UserPermission userPermission = new UserPermission();
		
		userCredentails.setAllowedRecentUsedPasswordCount(0);
		userCredentails.setBadTryCount(0);
		userCredentails.setCheckerComments("Created Directly For Admin");
		userCredentails.setClientId("Admin");
		userCredentails.setCreationDatetime(new Date());
		userCredentails.setDescription("Created Directly For Admin");
		userCredentails.setLastAccessedDatetime(new Date());
		userCredentails.setLastModifiedDatetime(new Date());
		userCredentails.setLastPasswordsUsed("reward360");
		//lmsUserCredentails.setLmsUserPermission(lmsUserPermission123);
		//lmsUserCredentails.setLmsUserProfile(lmsUserProfile1234);
		userCredentails.setMackerComments("Created Directly For Admin");
		//lmsUserCredentails.setParentId(parentId);
		userCredentails.setPassword("reward360");
		userCredentails.setStatus("Progress");
		userCredentails.setUserName("reward360");
		
		
		
		
		userCredentails.setLmsUserProfile(userProfile);
		userCredentails.setLmsUserPermission(userPermission);
		
		
		return userCredentails;
	}

	public void updateBadTryCount(UserCredentails loginBean) {
		this.userManagementDao.updateBadTryCount(loginBean);
	
	}

	public Object getManageRoles() {
		// TODO Auto-generated method stub
		return null;
	}
}
