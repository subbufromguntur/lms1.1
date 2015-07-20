package com.rms.framework.organization.user.dao.impl;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
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
	private final Logger logger = Logger.getLogger(this.getClass());
	public void submitUser(LmsUserCredentails lmsUserCredentails) {
		this.insertEntity(lmsUserCredentails);
	}

	public LmsUserCredentails checkCredentials(LmsUserCredentails lmsUserCredentails) {
		try {
			String query = "from LmsUserCredentails where userName = "+"'"+lmsUserCredentails.getUserName()+"'";
			Query query2 = this.getSessionProvider().getSession().createQuery(query);
			
			if(!query2.list().isEmpty())
			return (LmsUserCredentails) query2.list().get(0);
		} catch(DataAccessException e) {
			this.logger.debug(e.getMessage());
		}
		return null;
	
	
	}

	public LmsUserCredentails updateUser(LmsUserCredentails lmsUserCredentails) {
		this.updateEntity(lmsUserCredentails);
		return lmsUserCredentails;
	}

	public void updateBadTryCount(LmsUserCredentails loginBean) {
		this.updateEntity(loginBean);
	}

}
