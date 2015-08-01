package com.rms.loyalty.startup.dao;

import java.util.List;

import com.rms.framework.model.Country;
import com.rms.loyalty.dao.GenericDao;

public interface RMStartupDao extends GenericDao<Country, Long> {

	List<Country> getCountries();

	List<Country> getStates(String[] countryArray);

	List<Country> getCities(String[] citiesArray);

	List<String> getData(String string);

}
