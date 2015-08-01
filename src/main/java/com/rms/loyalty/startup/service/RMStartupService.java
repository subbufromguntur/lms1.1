package com.rms.loyalty.startup.service;

import java.util.List;

import com.rms.framework.model.Country;
import com.rms.loyalty.beans.OrganizationDataLoader;

public interface RMStartupService {

	List<Country> getCountries();

	String getCities(String[] strings);

	String getStates(String[] strings);

	OrganizationDataLoader getClientPreConfiguredData();

	List<String> getData(String query);

}
