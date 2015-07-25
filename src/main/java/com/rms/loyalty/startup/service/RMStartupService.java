package com.rms.loyalty.startup.service;

import java.util.List;

import com.rms.framework.model.Country;
import com.rms.loyalty.beans.ClientPreConfiguredData;

public interface RMStartupService {

	List<Country> getCountries();

	String getCities(String[] strings);

	String getStates(String[] strings);

	ClientPreConfiguredData getClientPreConfiguredData();

	List<String> getData(String query);

}
