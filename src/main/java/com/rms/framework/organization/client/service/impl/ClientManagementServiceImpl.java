package com.rms.framework.organization.client.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rms.framework.beans.ClientBean;
import com.rms.framework.beans.ClientConfigurationDetailsBean;
import com.rms.framework.beans.ClientGlAccountBean;
import com.rms.framework.dao.LmsRolesDao;
import com.rms.framework.model.Client;
import com.rms.framework.model.ClientConfigurationDetails;
import com.rms.framework.model.ClientGlAccount;
import com.rms.framework.model.LmsRoles;
import com.rms.framework.organization.client.dao.ClientManagementDao;
import com.rms.framework.organization.client.service.ClientManagementService;
@Service
@Transactional
public class ClientManagementServiceImpl implements ClientManagementService{
	@Resource
	private ClientManagementDao clientManagementDao;
	@Resource
	private LmsRolesDao lmsRolesDao;

	public ClientManagementDao getClientManagementDao() {
		return clientManagementDao;
	}

	public void setClientManagementDao(ClientManagementDao clientManagementDao) {
		this.clientManagementDao = clientManagementDao;
	}

	public void submitClient(ClientBean clientBean) {
		this.clientManagementDao.submitClient(convertClientBean(clientBean));
	}


	private Client convertClientBean(ClientBean clientBean) {
		Client client = new Client();
		client.setCategory(clientBean.getCategory());
		client.setClientName(clientBean.getClientName());
		client.setCreationDate(new Date());
		client.setDescription(clientBean.getDescription());
		client.setLastModifiedDate(new Date());
		client.setParent(clientBean.getParent());
		client.setRegion(clientBean.getTimeZone());
		client.setStatus("In Progress");
		client.setTimeZone(clientBean.getTimeZone());
		client.setType(clientBean.getType());
		
		ClientConfigurationDetailsBean clientConfigurationDetailsBean = clientBean.getClientConfigurationDetailsBean();
		ClientConfigurationDetails clientConfigurationDetails = new ClientConfigurationDetails();
		clientConfigurationDetails.setAddressLine1(clientConfigurationDetailsBean.getAddressLine1());
		clientConfigurationDetails.setAddressLine2(clientConfigurationDetailsBean.getAddressLine2());
		clientConfigurationDetails.setCity(clientConfigurationDetailsBean.getCity());
		clientConfigurationDetails.setCountry(clientConfigurationDetailsBean.getCountry());
		clientConfigurationDetails.setPhone1(clientConfigurationDetailsBean.getPhone1());
		clientConfigurationDetails.setPhone2(clientConfigurationDetailsBean.getPhone2());
		clientConfigurationDetails.setState(clientConfigurationDetailsBean.getState());
		client.setClientConfigurationDetails(clientConfigurationDetails);
		client.setClientConfigurationDetails(clientConfigurationDetails);
		clientConfigurationDetails.setClientDto(client);
		
		List<ClientGlAccountBean> clientGlAccountBeanList = clientBean.getClientGlAccountBean();
		List<ClientGlAccount> clientGlAccountDtoList = new ArrayList<ClientGlAccount>();
		
		for(ClientGlAccountBean clientGlAccountBean : clientGlAccountBeanList){
			ClientGlAccount clientGlAccount = new ClientGlAccount();
			clientGlAccount.setAccountId(clientGlAccountBean.getAccountId());
			clientGlAccount.setAccountNumber(clientGlAccountBean.getAccountNumber());
			clientGlAccount.setAccountType(clientGlAccountBean.getAccountType());
			clientGlAccount.setDescription("");
			clientGlAccount.setStatus("In Progress");
			
			clientGlAccountDtoList.add(clientGlAccount);
		}
		
		client.setClientGlAccount(clientGlAccountDtoList);
		clientGlAccountDtoList.get(0).setClientDto(client);
		return client;
	}

	public List<Client> getClientDetails() {
		return this.clientManagementDao.getClientDetails();
	}

	public List<LmsRoles> getRoles() {
		return this.lmsRolesDao.getRoles();
	}
	
	
}
