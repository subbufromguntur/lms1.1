package com.rms.framework.organization.client.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.framework.dao.impl.GenericDaoHibernateImpl;
import com.rms.framework.model.Client;
import com.rms.framework.organization.client.dao.ClientManagementDao;

@Component(value="clientManagementDao")
@Transactional
@Service
public class ClientManagementDaoImpl extends
GenericDaoHibernateImpl<Client, Long> implements ClientManagementDao{

	public void submitClient(Client client) {
		this.insertEntity(client);
	}

	public List<Client> getClientDetails() {
		return this.getListByQuery("from Client");
	}

}
