package com.rms.loyalty.organization.user.dao.impl;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.loyalty.dao.impl.GenericDaoHibernateImpl;
import com.rms.loyalty.exception.FetchException;
import com.rms.loyalty.organization.user.dao.UserManagementDao;
import com.rms.loyalty.organization.user.model.UserCredentails;

@Component(value="userManagementDao")
@Transactional
@Service
public class UserManagementDaoImpl  extends
		GenericDaoHibernateImpl<UserCredentails, Long> implements
		UserManagementDao {
	private final Logger logger = Logger.getLogger(this.getClass());

	public void submitUser(UserCredentails userCredentails) {
		this.insertEntity(userCredentails);
	}

	public UserCredentails checkCredentials(UserCredentails userCredentails)
			throws FetchException {
		try {
			String query = "from UserCredentails where userName = " + "'"
					+ userCredentails.getUserName() + "'";
			Query query2 = this.getSessionfactory().getCurrentSession()
					.createQuery(query);

			if (!query2.list().isEmpty())
				return (UserCredentails) query2.list().get(0);
		} catch (Exception e) {
			System.out.println("==============234567==========="+e.getMessage());
			this.logger.debug(e.getMessage());
			throw new FetchException(e.getMessage());
		}
		return null;
	}

	public UserCredentails updateUser(UserCredentails userCredentails)
			throws FetchException {
		try {
			this.updateEntity(userCredentails);
			return userCredentails;
		} catch (DataAccessException e) {
			this.logger.debug(e.getMessage());
			throw new FetchException(e.getMessage());
		}
	}

	public void updateBadTryCount(UserCredentails loginBean)
			throws FetchException {
		try {
			this.updateEntity(loginBean);
		} catch (DataAccessException e) {
			this.logger.debug(e.getMessage());
			throw new FetchException(e.getMessage());
		}
	}

}
