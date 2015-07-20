package com.rms.framework.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.framework.dao.RoleManagementAdminDao;


@Transactional
@Service
@Component
	public class RoleManagementAdminDaoImpl extends
	GenericDaoHibernateImpl implements RoleManagementAdminDao{
	
}
