package com.rms.framework.organization.client.dao;

import java.util.List;

import com.rms.framework.dao.GenericDao;
import com.rms.framework.model.Client;

public interface ClientManagementDao   extends GenericDao<Client, Long> {

	void submitClient(Client convertClientBean);

	List<Client> getClientDetails();

}
