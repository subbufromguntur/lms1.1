package com.lms.accountmanagement.service;

import java.util.List;

import com.lms.accountmanagement.beans.GeometricBean;
import com.lms.accountmanagement.dto.ClientPreConfiguredData;
import com.lms.accountmanagement.dto.Country;

public interface LMSFormLoadService {

	List<Country> getCountries();

	String getCities(String[] strings);

	String getStates(String[] strings);

	List<ClientPreConfiguredData> getClientPreConfiguredData();

	List<String> gettimeZone();

}
