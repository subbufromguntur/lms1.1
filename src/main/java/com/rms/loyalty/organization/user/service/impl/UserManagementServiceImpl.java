package com.rms.loyalty.organization.user.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rms.loyalty.organization.user.dao.UserManagementDao;
import com.rms.loyalty.organization.user.model.UserCredentails;
import com.rms.loyalty.organization.user.service.UserManagementService;
@Service
@Transactional
public class UserManagementServiceImpl implements UserManagementService{
	@Resource
	public UserManagementDao userManagementDao;

	public void submitUser(UserCredentails userCredentails) {
		if(userCredentails.getAllowedRecentUsedPasswordCount() == 0){
			userCredentails.setPassword(userCredentails.getUserName());
		}
		this.userManagementDao.submitUser(userCredentails);
	}
}
