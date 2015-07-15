package com.lms.accountmanagement.dao;

import com.lms.accountmanagement.dto.ClientDto;

public interface ManageClientDao extends GenericDao<ClientDto, Long> {

	void submitClient(ClientDto clientDto);

}
