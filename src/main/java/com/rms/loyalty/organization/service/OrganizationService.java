package com.rms.loyalty.organization.service;

import java.util.List;

import com.rms.loyalty.beans.OrganizationBean;
import com.rms.loyalty.organization.model.OrganizationInfo;

public interface OrganizationService {

	void submitClient(OrganizationBean organizationBean);

	List<OrganizationInfo> getClientDetails();
}
