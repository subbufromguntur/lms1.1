package com.rms.framework.dao.impl;

import java.util.List;

import com.rms.framework.dao.LmsRolesDao;
import com.rms.framework.model.LmsRoles;

public class LmsRolesDaoImpl  extends
GenericDaoHibernateImpl<LmsRoles, Long> implements LmsRolesDao{

	public List<LmsRoles> getRoles() {
		return this.getListByQuery("from LmsRoles");
	}


}
