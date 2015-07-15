package com.lms.accountmanagement.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lms.accountmanagement.dao.AccountManagementAdminDao;
import com.lms.accountmanagement.dao.RoleManagementAdminDao;
import com.lms.accountmanagement.dto.LoginBean;
import com.lms.accountmanagement.dto.RoleTypes;
import com.lms.accountmanagement.dto.Roles;


@Transactional
@Service
@Component
	public class RoleManagementAdminDaoImpl extends
	GenericDaoHibernateImpl<Roles, Long> implements RoleManagementAdminDao{
	
	/**
	* Logger to log the messages
	*/
	private final Logger logger = Logger.getLogger(this.getClass());

	
	public void saveRoleDetails(Roles roles) {
		this.insertEntity(roles);
	}

	
	public List<Roles> getRolesData() {
		try {
			List<Roles> rolesLisr = this.getListByQuery("from Roles");
			return rolesLisr;
		} catch (DataAccessException e) {
			logger.info(e.getMessage());
		}
		return null;
	}

}
