package com.rms.framework.organization.user.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rms.framework.organization.user.dao.UserManagementDao;
import com.rms.framework.organization.user.model.LmsUserCredentails;
import com.rms.framework.organization.user.service.UserManagementService;
@Service
@Transactional
public class UserManagementServiceImpl implements UserManagementService{
	@Resource
	public UserManagementDao userManagementDao;

	public void submitUser(LmsUserCredentails lmsUserCredentails) {
		this.userManagementDao.submitUser(lmsUserCredentails);
	}
}
