package com.rms.loyalty.organization.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rms.loyalty.beans.OrganizationBean;
import com.rms.loyalty.beans.OrganizationConfigurationDetailsBean;
import com.rms.loyalty.beans.OrganizationGlAccountBean;
import com.rms.loyalty.organization.dao.OrganizationtDao;
import com.rms.loyalty.organization.model.OrganizationDetail;
import com.rms.loyalty.organization.model.OrganizationGLAccount;
import com.rms.loyalty.organization.model.OrganizationInfo;
import com.rms.loyalty.organization.service.OrganizationService;

@Service
@Transactional
public class OrganizationServiceImpl implements OrganizationService {
	@Resource
	private OrganizationtDao organizationtDao;

	public void submitClient(OrganizationBean organizationBean) {
		this.organizationtDao.submitClient(convertClientBean(organizationBean));
	}

	private OrganizationInfo convertClientBean(OrganizationBean organizationBean) {
		OrganizationInfo organizationInfo = new OrganizationInfo();
		organizationInfo.setCategory(organizationBean.getCategory());
		organizationInfo.setOrganizationName(organizationBean.getClientName());
		organizationInfo.setCreationDate(new Date());
		organizationInfo.setDescription(organizationBean.getDescription());
		organizationInfo.setLastModifiedDate(new Date());
		organizationInfo.setParent(organizationBean.getParent());
		organizationInfo.setRegion(organizationBean.getTimeZone());
		organizationInfo.setStatus("In Progress");
		organizationInfo.setTimeZone(organizationBean.getTimeZone());
		organizationInfo.setType(organizationBean.getType());

		OrganizationConfigurationDetailsBean organizationConfigurationDetailsBean = organizationBean
				.getOrganizationConfigurationDetailsBean();
		OrganizationDetail organizationDetail = new OrganizationDetail();
		organizationDetail.setAddressLine1(organizationConfigurationDetailsBean
				.getAddressLine1());
		organizationDetail.setAddressLine2(organizationConfigurationDetailsBean
				.getAddressLine2());
		organizationDetail
				.setCity(organizationConfigurationDetailsBean.getCity() != null ? organizationConfigurationDetailsBean
						.getCity().split(",")[0] : "");
		organizationDetail.setCountry(organizationConfigurationDetailsBean
				.getCountry() != null ? organizationConfigurationDetailsBean
				.getCountry().split(",")[0] : "");
		organizationDetail
				.setPhone1(organizationConfigurationDetailsBean.getPhone1());
		organizationDetail
				.setPhone2(organizationConfigurationDetailsBean.getPhone2());
		organizationDetail
				.setState(organizationConfigurationDetailsBean.getState() != null ? organizationConfigurationDetailsBean
						.getState().split(",")[0] : "");
		organizationInfo.setClientConfigurationDetails(organizationDetail);
		organizationInfo.setClientConfigurationDetails(organizationDetail);
		organizationDetail.setClientDto(organizationInfo);

		List<OrganizationGlAccountBean> clientGlAccountBeanList = organizationBean
				.getOrganizationGlAccountBean();
		List<OrganizationGLAccount> clientGlAccountDtoList = new ArrayList<OrganizationGLAccount>();

		for (OrganizationGlAccountBean organizationGlAccountBean : clientGlAccountBeanList) {
			OrganizationGLAccount organizationGLAccount = new OrganizationGLAccount();
			organizationGLAccount.setAccountId(organizationGlAccountBean
					.getAccountId());
			organizationGLAccount.setAccountNumber(organizationGlAccountBean
					.getAccountNumber());
			organizationGLAccount.setAccountType(organizationGlAccountBean
					.getAccountType());
			organizationGLAccount.setDescription(organizationGlAccountBean
					.getDescription());
			organizationGLAccount.setStatus("In Progress");
			organizationGLAccount.setClientDto(organizationInfo);

			clientGlAccountDtoList.add(organizationGLAccount);
		}

		organizationInfo.setClientGlAccount(clientGlAccountDtoList);
		clientGlAccountDtoList.get(0).setClientDto(organizationInfo);
		return organizationInfo;
	}

	public OrganizationtDao getOrganizationtDao() {
		return organizationtDao;
	}

	public void setOrganizationtDao(OrganizationtDao organizationtDao) {
		this.organizationtDao = organizationtDao;
	}

	public List<OrganizationInfo> getClientDetails() {
		return this.organizationtDao.getClientDetails();
	}
}
