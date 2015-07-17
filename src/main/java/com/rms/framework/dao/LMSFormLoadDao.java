package com.rms.framework.dao;

import java.util.List;

import com.rms.framework.model.Country;

public interface LMSFormLoadDao extends GenericDao<Country, Long> {

	List<Country> getCountries();

	List<Country> getStates(String[] countryArray);

	List<Country> getCities(String[] citiesArray);
	
	List<String> getTimeZone();
}
