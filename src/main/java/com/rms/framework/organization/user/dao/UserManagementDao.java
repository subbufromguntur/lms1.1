package com.rms.framework.organization.user.dao;

import com.rms.framework.dao.GenericDao;
import com.rms.framework.organization.user.model.LmsUserCredentails;

public interface UserManagementDao  extends GenericDao<LmsUserCredentails, Long> {

	void submitUser(LmsUserCredentails lmsUserCredentails);
	
}
