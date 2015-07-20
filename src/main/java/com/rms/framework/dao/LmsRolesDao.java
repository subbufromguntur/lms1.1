package com.rms.framework.dao;

import java.util.List;

import com.rms.framework.model.LmsRoles;

public interface LmsRolesDao  extends GenericDao<LmsRoles, Long> {

	List<LmsRoles> getRoles();

}
