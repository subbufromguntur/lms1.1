package com.lms.accountmanagement.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lms.accountmanagement.dao.ManageClientDao;
import com.lms.accountmanagement.dto.ClientDto;

@Transactional
@Service
@Component
public class ManageClientDaoImpl extends
GenericDaoHibernateImpl<ClientDto, Long> implements ManageClientDao{

	public void submitClient(ClientDto clientDto) {
		this.insertEntity(clientDto);
	}

	
}
