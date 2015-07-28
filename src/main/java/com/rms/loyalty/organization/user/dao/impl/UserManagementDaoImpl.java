package com.rms.loyalty.organization.user.dao.impl;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.loyalty.dao.impl.GenericDaoHibernateImpl;
import com.rms.loyalty.organization.user.dao.UserManagementDao;
import com.rms.loyalty.organization.user.model.UserCredentails;

@Component(value="userManagementDao")
@Transactional
@Service
public class UserManagementDaoImpl  extends
GenericDaoHibernateImpl<UserCredentails, Long> implements UserManagementDao{
	private final Logger logger = Logger.getLogger(this.getClass());
	public void submitUser(UserCredentails userCredentails) {
		this.insertEntity(userCredentails);
	}

	public UserCredentails checkCredentials(UserCredentails userCredentails) {
		try {
			String query = "from UserCredentails where userName = "+"'"+userCredentails.getUserName()+"'";
			Query query2 = this.getSessionfactory().getCurrentSession().createQuery(query);
			
			if(!query2.list().isEmpty())
			return (UserCredentails) query2.list().get(0);
		} catch(DataAccessException e) {
			this.logger.debug(e.getMessage());
		}
		return null;
	
	
	}

	public UserCredentails updateUser(UserCredentails userCredentails) {
		this.updateEntity(userCredentails);
		return userCredentails;
	}

	public void updateBadTryCount(UserCredentails loginBean) {
		this.updateEntity(loginBean);
	}

}
