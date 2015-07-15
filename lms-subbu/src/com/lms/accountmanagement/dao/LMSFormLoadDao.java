package com.lms.accountmanagement.dao;

import java.util.List;

import com.lms.accountmanagement.dto.Country;

public interface LMSFormLoadDao extends GenericDao<Country, Long> {

	List<Country> getCountries();

	List<Country> getStates(String[] countryArray);

	List<Country> getCities(String[] citiesArray);
	
	List<String> getTimeZone();
}
