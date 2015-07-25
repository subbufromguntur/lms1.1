package com.rms.loyalty.organization.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rms.loyalty.beans.ClientBean;
import com.rms.loyalty.beans.ClientConfigurationDetailsBean;
import com.rms.loyalty.beans.ClientGlAccountBean;
import com.rms.loyalty.organization.dao.OrganizationtDao;
import com.rms.loyalty.organization.model.OrganizationDetail;
import com.rms.loyalty.organization.model.OrganizationGLAccount;
import com.rms.loyalty.organization.model.OrganizationInfo;
import com.rms.loyalty.organization.service.OrganizationService;
@Service
@Transactional
public class OrganizationServiceImpl implements OrganizationService{
	@Resource
	private OrganizationtDao organizationtDao;
	public OrganizationtDao getClientManagementDao() {
		return organizationtDao;
	}

	public void setClientManagementDao(OrganizationtDao OrganizationtDao) {
		this.organizationtDao = OrganizationtDao;
	}

	public void submitClient(ClientBean clientBean) {
		this.organizationtDao.submitClient(convertClientBean(clientBean));
	}


	private OrganizationInfo convertClientBean(ClientBean clientBean) {
		OrganizationInfo organizationInfo = new OrganizationInfo();
		organizationInfo.setCategory(clientBean.getCategory());
		organizationInfo.setClientName(clientBean.getClientName());
		organizationInfo.setCreationDate(new Date());
		organizationInfo.setDescription(clientBean.getDescription());
		organizationInfo.setLastModifiedDate(new Date());
		organizationInfo.setParent(clientBean.getParent());
		organizationInfo.setRegion(clientBean.getTimeZone());
		organizationInfo.setStatus("In Progress");
		organizationInfo.setTimeZone(clientBean.getTimeZone());
		organizationInfo.setType(clientBean.getType());

		ClientConfigurationDetailsBean clientConfigurationDetailsBean = clientBean
				.getClientConfigurationDetailsBean();
		OrganizationDetail organizationDetail = new OrganizationDetail();
		organizationDetail
				.setAddressLine1(clientConfigurationDetailsBean
						.getAddressLine1());
		organizationDetail
				.setAddressLine2(clientConfigurationDetailsBean
						.getAddressLine2());
		organizationDetail.setCity(clientConfigurationDetailsBean
				.getCity() != null ? clientConfigurationDetailsBean.getCity()
				.split(",")[0] : "");
		organizationDetail.setCountry(clientConfigurationDetailsBean
				.getCountry() != null ? clientConfigurationDetailsBean
				.getCountry().split(",")[0] : "");
		organizationDetail.setPhone1(clientConfigurationDetailsBean
				.getPhone1());
		organizationDetail.setPhone2(clientConfigurationDetailsBean
				.getPhone2());
		organizationDetail.setState(clientConfigurationDetailsBean
				.getState() != null ? clientConfigurationDetailsBean.getState()
				.split(",")[0] : "");
		organizationInfo.setClientConfigurationDetails(organizationDetail);
		organizationInfo.setClientConfigurationDetails(organizationDetail);
		organizationDetail.setClientDto(organizationInfo);

		List<ClientGlAccountBean> clientGlAccountBeanList = clientBean
				.getClientGlAccountBean();
		List<OrganizationGLAccount> clientGlAccountDtoList = new ArrayList<OrganizationGLAccount>();

		for (ClientGlAccountBean clientGlAccountBean : clientGlAccountBeanList) {
			OrganizationGLAccount organizationGLAccount = new OrganizationGLAccount();
			organizationGLAccount.setAccountId(clientGlAccountBean.getAccountId());
			organizationGLAccount.setAccountNumber(clientGlAccountBean
					.getAccountNumber());
			organizationGLAccount
					.setAccountType(clientGlAccountBean.getAccountType());
			organizationGLAccount
					.setDescription(clientGlAccountBean.getDescription());
			organizationGLAccount.setStatus("In Progress");
			organizationGLAccount.setClientDto(organizationInfo);

			clientGlAccountDtoList.add(organizationGLAccount);
		}

		organizationInfo.setClientGlAccount(clientGlAccountDtoList);
		clientGlAccountDtoList.get(0).setClientDto(organizationInfo);
		return organizationInfo;
	}

	public List<OrganizationInfo> getClientDetails() {
		return this.organizationtDao.getClientDetails();
	}
}
