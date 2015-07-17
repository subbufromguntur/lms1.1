package com.rms.framework.organization.client.service;

import java.util.List;

import com.rms.framework.beans.ClientBean;
import com.rms.framework.model.Client;
import com.rms.framework.model.LmsRoles;

public interface ClientManagementService {

	void submitClient(ClientBean clientBean);

	List<Client> getClientDetails();

	List<LmsRoles> getRoles();

}
