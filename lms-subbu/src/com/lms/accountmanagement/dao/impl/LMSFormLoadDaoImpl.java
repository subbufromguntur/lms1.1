package com.lms.accountmanagement.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lms.accountmanagement.dao.LMSFormLoadDao;
import com.lms.accountmanagement.dto.Country;

@Transactional
@Service
@Component
public class LMSFormLoadDaoImpl extends
GenericDaoHibernateImpl<Country, Long> implements LMSFormLoadDao{

	/**
	* Logger to log the messages
	*/
	private final Logger logger = Logger.getLogger(this.getClass());
	
	public List<Country> getCountries() {
		try {
			List<String> timeZone = getSessionProvider().sessionfactory.getCurrentSession().createSQLQuery("select zone_name from zone").list(); 
			return this.getListByQuery("from Country where locationType = 0");
		} catch (DataAccessException e) {
			logger.info(e.getMessage());
		}
		return null;
	
	}
	public List<String> getTimeZone() {
		try {
			return getSessionProvider().sessionfactory.getCurrentSession().createSQLQuery("select zone_name from zone").list(); 
		} catch (DataAccessException e) {
			logger.info(e.getMessage());
		}
		return null;
	
	}

	public List<Country> getStates(String[] countryArray) {

		try {
			return this.getListByQuery("from Country where locationType=1 and parent_id="+countryArray[1]);
		} catch (DataAccessException e) {
			logger.info(e.getMessage());
		}
		return null;
	
	
	}

	public List<Country> getCities(String[] citiesArray) {

		try {
			return this.getListByQuery("from Country where locationType=2 and parent_id="+citiesArray[1]);
		} catch (DataAccessException e) {
			logger.info(e.getMessage());
		}
		return null;
	}

	
	
}
