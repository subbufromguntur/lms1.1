package com.rms.framework.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rms.framework.beans.GeometricBean;
import com.rms.framework.dao.ClientPreConfiguredDao;
import com.rms.framework.dao.LMSFormLoadDao;
import com.rms.framework.model.ClientPreConfiguredData;
import com.rms.framework.model.Country;
import com.rms.framework.service.LMSFormLoadService;

@Service
@Transactional
public class LMSFormLoadServiceImpl implements LMSFormLoadService{

	@Resource
	public LMSFormLoadDao lmsFormLoadDao;
	@Resource 
	public ClientPreConfiguredDao clientPreConfiguredDao;

	public List<Country> getCountries() {
		return this.lmsFormLoadDao.getCountries();
	}

	public String getStates(String[] countryArray) {
		return getStateList(this.lmsFormLoadDao.getStates(countryArray));
	}

	private String getStateList(List<Country> statesList) {
		StringBuffer stateBuffer = new StringBuffer();
		stateBuffer.append("'<option value='-1'>--Select--</option>");
		List<String> states = new ArrayList<String>();
		for(Country country : statesList){
			stateBuffer.append("'<option value='"+country.getCountryName()+","+country.getId()+"'>"+country.getCountryName()+"</option>");
		}
		//geometricBean.setStates(states);
		return stateBuffer.toString();
	}

	public String getCities(String[] citiesArray) {
		return getCitiesList(this.lmsFormLoadDao.getCities(citiesArray));
	}

	private String getCitiesList(List<Country> citiesList) {
		StringBuffer citiesBuffer = new StringBuffer();
		citiesBuffer.append("'<option value='-1'>--Select--</option>");
		List<String> states = new ArrayList<String>();
		for(Country cities : citiesList){
			citiesBuffer.append("'<option value='"+cities.getCountryName()+","+cities.getId()+"'>"+cities.getCountryName()+"</option>");
		}
		return citiesBuffer.toString();
	}

	public List<ClientPreConfiguredData> getClientPreConfiguredData() {
		return this.clientPreConfiguredDao.getClientPreConfiguredData();
	}

	public List<String> gettimeZone() {
		return this.lmsFormLoadDao.getTimeZone();
	}

}
