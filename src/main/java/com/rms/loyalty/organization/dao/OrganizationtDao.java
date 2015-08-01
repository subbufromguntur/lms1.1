package com.rms.loyalty.organization.dao;

import java.util.List;

import com.rms.loyalty.dao.GenericDao;
import com.rms.loyalty.organization.model.OrganizationInfo;

public interface OrganizationtDao extends GenericDao<OrganizationInfo, Long> {

	void submitClient(OrganizationInfo convertClientBean);

	List<OrganizationInfo> getClientDetails();

}
