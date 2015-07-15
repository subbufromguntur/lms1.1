package com.lms.accountmanagement.dao;

import java.util.List;

import com.lms.accountmanagement.dto.ClientPreConfiguredData;

public interface ClientPreConfiguredDao   extends GenericDao<ClientPreConfiguredData, Long> {

	List<ClientPreConfiguredData> getClientPreConfiguredData();

}
