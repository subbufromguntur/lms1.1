package com.rms.loyalty.startup.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rms.framework.model.Country;
import com.rms.loyalty.beans.ClientPreConfiguredData;
import com.rms.loyalty.startup.dao.RMStartupDao;
import com.rms.loyalty.startup.service.RMStartupService;

@Service
@Transactional
public class RMSStartupServiceImpl implements RMStartupService{

	@Resource
	public RMStartupDao rmsStartupDao;

	public List<Country> getCountries() {
		return this.rmsStartupDao.getCountries();
	}

	public String getStates(String[] countryArray) {
		return getStateList(this.rmsStartupDao.getStates(countryArray));
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
		return getCitiesList(this.rmsStartupDao.getCities(citiesArray));
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

	public ClientPreConfiguredData getClientPreConfiguredData() {
		List<String> parent = this.rmsStartupDao.getData("select root_name from master_organization_root");
		List<String> type = this.rmsStartupDao.getData("select type_name from master_channel_type");
		List<String> category = this.rmsStartupDao.getData("select region_name from master_category_region");
		List<String> glAccountType = this.rmsStartupDao.getData("select type_name from master_gl_account_type");
		
		System.out.println("=============================::: "+parent);
		System.out.println("=============================::: "+type);
		System.out.println("=============================::: "+category);
		System.out.println("=============================::: "+glAccountType);
		ClientPreConfiguredData clientPreConfiguredData = new ClientPreConfiguredData();
		clientPreConfiguredData.setCategory(category);
		clientPreConfiguredData.setGlAccountType(glAccountType);
		clientPreConfiguredData.setType(type);
		clientPreConfiguredData.setParentList(parent);
		
		return clientPreConfiguredData;
	}

	public List<String> getData(String query) {
		return this.rmsStartupDao.getData(query);
	}
}
