package com.rms.loyalty.organization.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.loyalty.dao.impl.GenericDaoHibernateImpl;
import com.rms.loyalty.organization.dao.OrganizationtDao;
import com.rms.loyalty.organization.model.OrganizationInfo;

@Component(value = "organizationtDao")
@Transactional
@Service
public class OrganizationDaoImpl extends
		GenericDaoHibernateImpl<OrganizationInfo, Long> implements
		OrganizationtDao {

	@Override
	public void submitClient(OrganizationInfo organizationInfo) {
		this.insertEntity(organizationInfo);
	}

	@Override
	public List<OrganizationInfo> getClientDetails() {
		return this.getListByQuery("from OrganizationInfo");
	}

}
