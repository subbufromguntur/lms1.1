package com.rms.framework.service;

import java.util.List;

import com.rms.framework.beans.GeometricBean;
import com.rms.framework.model.ClientPreConfiguredData;
import com.rms.framework.model.Country;

public interface LMSFormLoadService {

	List<Country> getCountries();

	String getCities(String[] strings);

	String getStates(String[] strings);

	List<ClientPreConfiguredData> getClientPreConfiguredData();

	List<String> gettimeZone();

}
