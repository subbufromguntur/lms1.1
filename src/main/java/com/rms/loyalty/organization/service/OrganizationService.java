package com.rms.loyalty.organization.service;

import java.util.List;

import com.rms.loyalty.beans.ClientBean;
import com.rms.loyalty.organization.model.OrganizationInfo;

public interface OrganizationService {

	void submitClient(ClientBean clientBean);

	List<OrganizationInfo> getClientDetails();
}
