package com.rms.framework.dao;

import java.util.List;

import com.rms.framework.model.ClientPreConfiguredData;

public interface ClientPreConfiguredDao   extends GenericDao<ClientPreConfiguredData, Long> {

	List<ClientPreConfiguredData> getClientPreConfiguredData();

}
