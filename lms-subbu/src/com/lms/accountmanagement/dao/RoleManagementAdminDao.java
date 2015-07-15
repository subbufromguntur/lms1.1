package com.lms.accountmanagement.dao;

import java.util.List;

import com.lms.accountmanagement.dto.Roles;

public interface RoleManagementAdminDao extends GenericDao<Roles, Long> {
	public void saveRoleDetails(Roles roles);
	public List<Roles> getRolesData();
}
