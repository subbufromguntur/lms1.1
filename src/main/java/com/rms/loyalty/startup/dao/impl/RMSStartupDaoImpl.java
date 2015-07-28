package com.rms.loyalty.startup.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.framework.model.Country;
import com.rms.loyalty.dao.impl.GenericDaoHibernateImpl;
import com.rms.loyalty.startup.dao.RMStartupDao;

@Transactional
@Service
@Component
public class RMSStartupDaoImpl extends
GenericDaoHibernateImpl<Country, Long> implements RMStartupDao{

	/**
	* Logger to log the messages
	*/
	private final Logger logger = Logger.getLogger(this.getClass());
	
	public List<Country> getCountries() {
		try {
			List<String> timeZone = this.getSessionfactory().getCurrentSession().createSQLQuery("select zone_name from zone").list(); 
			return this.getListByQuery("from Country where locationType = 0");
		} catch (DataAccessException e) {
			logger.info(e.getMessage());
		}
		return null;
	
	}
	public List<String> getData(String query) {
		try {
			return this.getSessionfactory().getCurrentSession().createSQLQuery(query).list(); 
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
