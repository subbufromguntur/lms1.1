package com.rms.framework.dao.impl;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.framework.dao.AccountManagementAdminDao;
import com.rms.framework.model.LoginBean;

@Component(value="accountManagementAdminDao")
@Transactional
@Service
public class AccountManagementAdminDaoImpl extends
GenericDaoHibernateImpl<LoginBean, Long> implements AccountManagementAdminDao{

	/**
	* Logger to log the messages
	*/
	private final Logger logger = Logger.getLogger(this.getClass());
	
	public LoginBean checkCredentials(LoginBean loginBean) {

		try {
			String query = "from LoginBean where userName = "+"'"+loginBean.getUserName()+"' and password = "+"'"+loginBean.getPassword()+"'";
			Query query2 = this.getSessionProvider().getSession().createQuery(query);
			
			if(!query2.list().isEmpty())
			return (LoginBean) query2.list().get(0);
		} catch(DataAccessException e) {
			this.logger.debug(e.getMessage());
		}
		return loginBean;
	
	}

	public LoginBean changePassword(LoginBean loginBean) {
		this.updateEntity(loginBean);
		return new LoginBean();
	}

	public void saveLoginDetails(LoginBean loginBean) {
		this.insertEntity(loginBean);
	}
}
