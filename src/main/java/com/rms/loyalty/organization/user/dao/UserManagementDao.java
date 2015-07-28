package com.rms.loyalty.organization.user.dao;

import com.rms.loyalty.dao.GenericDao;
import com.rms.loyalty.organization.user.model.UserCredentails;

public interface UserManagementDao  extends GenericDao<UserCredentails, Long> {

	void submitUser(UserCredentails userCredentails);

	UserCredentails checkCredentials(UserCredentails userCredentails);

	UserCredentails updateUser(UserCredentails loginBean);

	void updateBadTryCount(UserCredentails loginBean);
	
}
