package com.rms.framework.organization.user.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.framework.dao.impl.GenericDaoHibernateImpl;
import com.rms.framework.organization.user.dao.UserManagementDao;
import com.rms.framework.organization.user.model.LmsUserCredentails;

@Component(value="userManagementDao")
@Transactional
@Service
public class UserManagementDaoImpl  extends
GenericDaoHibernateImpl<LmsUserCredentails, Long> implements UserManagementDao{

	public void submitUser(LmsUserCredentails lmsUserCredentails) {
		this.insertEntity(lmsUserCredentails);
	}

}
