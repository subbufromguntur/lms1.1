package com.lms.accountmanagement.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lms.accountmanagement.dao.ClientPreConfiguredDao;
import com.lms.accountmanagement.dto.ClientPreConfiguredData;

@Component(value="clientPreConfiguredDao")
@Transactional
@Service
public class ClientPreConfiguredDaoImpl extends
GenericDaoHibernateImpl<ClientPreConfiguredData, Long> implements ClientPreConfiguredDao{

	/**
	* Logger to log the messages
	*/
	private final Logger logger = Logger.getLogger(this.getClass());
	
	public List<ClientPreConfiguredData> getClientPreConfiguredData() {
		try {
			return this.getListByQuery("from ClientPreConfiguredData");
		} catch (DataAccessException e) {
			logger.info(e.getMessage());
		}
		return null;
	}

}
