package com.lms.accountmanagement.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lms.accountmanagement.beans.ClientBean;
import com.lms.accountmanagement.beans.ClientConfigurationDetailsBean;
import com.lms.accountmanagement.beans.ClientGlAccountBean;
import com.lms.accountmanagement.constants.AccountManagementAdminConstants;
import com.lms.accountmanagement.dao.AccountManagementAdminDao;
import com.lms.accountmanagement.dao.ManageClientDao;
import com.lms.accountmanagement.dao.RoleManagementAdminDao;
import com.lms.accountmanagement.dto.AccountTypes;
import com.lms.accountmanagement.dto.BatchTypes;
import com.lms.accountmanagement.dto.ClientConfigurationDetailsDto;
import com.lms.accountmanagement.dto.ClientDto;
import com.lms.accountmanagement.dto.ClientGlAccountDto;
import com.lms.accountmanagement.dto.ClientTypes;
import com.lms.accountmanagement.dto.LoginBean;
import com.lms.accountmanagement.dto.ProgramTypes;
import com.lms.accountmanagement.dto.RoleTypes;
import com.lms.accountmanagement.dto.Roles;
import com.lms.accountmanagement.dto.UserTypes;
import com.lms.accountmanagement.service.AccountManagementAdminService;
import com.lms.accountmanagement.util.TestUtils;

@Service
@Transactional
public class AccountManagementAdminServiceImpl implements AccountManagementAdminService{

	@Resource
	public AccountManagementAdminDao accountManagementAdminDaoImpl;
	@Resource
	public RoleManagementAdminDao roleManagementAdminDaoImpl;
	@Resource
	public ManageClientDao manageClientDao;
	
	
	public LoginBean checkCredentials(LoginBean loginBean) {
		return this.accountManagementAdminDaoImpl.checkCredentials(loginBean);
	}


	public LoginBean changePassword(LoginBean loginBean) {
		loginBean.setIndicator("99");
		loginBean.setPassword(loginBean.getChangedPassword());
		return this.accountManagementAdminDaoImpl.changePassword(loginBean);
	}


	public void saveLoginDetails(LoginBean loginBean) {
		loginBean = prepareLoginBean(new LoginBean());
		this.accountManagementAdminDaoImpl.saveLoginDetails(loginBean);		
	}


	private LoginBean prepareLoginBean(LoginBean loginBean) {
		loginBean.setIndicator("9");
		loginBean.setUserName("8971343222");
		loginBean.setPassword("8971343222");
		
		return loginBean;
	}


	public void saveRoleDetails(String rolesFilePath) {
		Roles roles = prepareLoginBean(rolesFilePath);
	}

/**
 * 
 * @param expectedOutputPath
 * @return
 * This method will load all the roles from text file to database
 */
	private Roles prepareLoginBean(String expectedOutputPath) {
		List<String> expectedFile = null;
		List<ClientTypes> permissionsManageClient = null;
		List<RoleTypes> permissionsManageRoles = null;
		List<UserTypes> permissionsManageUsers = null;
		List<ProgramTypes> permissionsManageProgram = null;
		List<AccountTypes> permissionsManageAccount = null;
		List<BatchTypes> permissionsBatchProcess = null;

		Roles roles = null;
		try {
			expectedFile = TestUtils.readFromFile(new File(expectedOutputPath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] attributeNames = expectedFile.get(0).split("\t");
		expectedFile.remove(0);
		String[] expectedRolesAttributes = new String[attributeNames.length];
		for (String expected : expectedFile) {
			roles = new Roles();
			permissionsManageClient = new ArrayList<ClientTypes>();
			permissionsManageRoles = new ArrayList<RoleTypes>();
			permissionsManageUsers = new ArrayList<UserTypes>();
			permissionsManageProgram = new ArrayList<ProgramTypes>();
			permissionsManageAccount = new ArrayList<AccountTypes>();
			permissionsBatchProcess = new ArrayList<BatchTypes>();
			expectedRolesAttributes = expected.split("\t");
			int attributeCount = 0;

			for (String attribute : attributeNames) {
				if (!expectedRolesAttributes[attributeCount].isEmpty()) {
					if (AccountManagementAdminConstants.ROLE_NAME
							.equals(attribute)) {
						roles.setRoleName(expectedRolesAttributes[attributeCount]
								.trim());
						System.out
								.println(expectedRolesAttributes[attributeCount]
										.trim());
					} else if (AccountManagementAdminConstants.ROLE_DESC
							.equals(attribute)) {
						roles.setRoleDescription(expectedRolesAttributes[attributeCount]
								.trim());
						System.out
								.println(expectedRolesAttributes[attributeCount]
										.trim());
					} else if (AccountManagementAdminConstants.PER_MANAGE_CLIENT
							.equals(attribute)) {
						List<String> clientTypes = Arrays
								.asList(expectedRolesAttributes[attributeCount]
										.trim().split(","));
						for(String value : clientTypes){
							ClientTypes clientTypes1 = new ClientTypes();
							clientTypes1.setTypeOfClient(value);
							permissionsManageClient.add(clientTypes1);
						}
						System.out
								.println(expectedRolesAttributes[attributeCount]
										.trim());
					} else if (AccountManagementAdminConstants.PER_MANAGE_ROLES
							.equals(attribute)) {
						List<String> clientTypes = Arrays
								.asList(expectedRolesAttributes[attributeCount]
										.trim().split(","));
						for(String value : clientTypes){
							RoleTypes roleTypes = new RoleTypes();
							roleTypes.setTypeOfRoles(value);
							permissionsManageRoles.add(roleTypes);
						}
						System.out
								.println(expectedRolesAttributes[attributeCount]
										.trim());
					} else if (AccountManagementAdminConstants.PER_MANAGE_USERS
							.equals(attribute)) {
						List<String> clientTypes = Arrays
								.asList(expectedRolesAttributes[attributeCount]
										.trim().split(","));
						for(String value : clientTypes){
							UserTypes userTypes = new UserTypes();
							userTypes.setTypeOfUsers(value);
							permissionsManageUsers.add(userTypes);
						}
						System.out
								.println(expectedRolesAttributes[attributeCount]
										.trim());
					} else if (AccountManagementAdminConstants.PER_MANAGE_PROGRAM
							.equals(attribute)) {
						List<String> clientTypes = Arrays
								.asList(expectedRolesAttributes[attributeCount]
										.trim().split(","));
						for(String value : clientTypes){
							ProgramTypes programTypes = new ProgramTypes();
							programTypes.setProgramType(value);
							permissionsManageProgram.add(programTypes);
						}
						System.out
								.println(expectedRolesAttributes[attributeCount]
										.trim());
					} else if (AccountManagementAdminConstants.PER_MANAGE_ACCOUNT
							.equals(attribute)) {
						List<String> clientTypes = Arrays
								.asList(expectedRolesAttributes[attributeCount]
										.trim().split(","));
						for(String value : clientTypes){
							AccountTypes accountTypes = new AccountTypes();
							accountTypes.setAccountType(value);
							permissionsManageAccount.add(accountTypes);
						}
						System.out
								.println(expectedRolesAttributes[attributeCount]
										.trim());
					} else if (AccountManagementAdminConstants.PER_BATCH_PROCESS
							.equals(attribute)) {
						List<String> clientTypes = Arrays
								.asList(expectedRolesAttributes[attributeCount]
										.trim().split(","));
						for(String value : clientTypes){
							BatchTypes batchTypes = new BatchTypes();
							batchTypes.setBatchType(value);
							permissionsBatchProcess.add(batchTypes);
						}
						System.out
								.println(expectedRolesAttributes[attributeCount]
										.trim());
					}

				} else {
					System.out
							.println("Expected Header not found in expectedOutput.txt");
				}
				attributeCount++;
			}
			roles.setBatchTypes(permissionsBatchProcess);
			roles.setAccountTypes(permissionsManageAccount);
			roles.setClientTypes(permissionsManageClient);
			roles.setProgramTypes(permissionsManageProgram);
			roles.setRoleTypes(permissionsManageRoles);
			roles.setUserTypes(permissionsManageUsers);
			this.roleManagementAdminDaoImpl.saveRoleDetails(roles);
		}

		return null;
	}


	public List<Roles> getRolesData() {
		return roleManagementAdminDaoImpl.getRolesData();
	}


	public void submitClient(ClientBean clientBean) {
		this.manageClientDao.submitClient(convertClientBean(clientBean));
	}


	private ClientDto convertClientBean(ClientBean clientBean) {
		ClientDto clientDto = new ClientDto();
		clientDto.setCategory(clientBean.getCategory());
		clientDto.setClientName(clientBean.getClientName());
		clientDto.setCreationDate(new Date());
		clientDto.setDescription(clientBean.getDescription());
		clientDto.setLastModifiedDate(new Date());
		clientDto.setParent(clientBean.getParent());
		clientDto.setRegion(clientBean.getRegion());
		clientDto.setStatus(clientBean.getStatus());
		clientDto.setTimeZone(clientBean.getTimeZone());
		clientDto.setType(clientBean.getType());
		
		ClientConfigurationDetailsBean clientConfigurationDetailsBean = clientBean.getClientConfigurationDetailsBean();
		ClientConfigurationDetailsDto clientConfigurationDetailsDto = new ClientConfigurationDetailsDto();
		clientConfigurationDetailsDto.setAddressLine1(clientConfigurationDetailsBean.getAddressLine1());
		clientConfigurationDetailsDto.setAddressLine2(clientConfigurationDetailsBean.getAddressLine2());
		clientConfigurationDetailsDto.setCity(clientConfigurationDetailsBean.getCity());
		clientConfigurationDetailsDto.setCountry(clientConfigurationDetailsBean.getCountry());
		clientConfigurationDetailsDto.setPhone1(clientConfigurationDetailsBean.getPhone1());
		clientConfigurationDetailsDto.setPhone2(clientConfigurationDetailsBean.getPhone2());
		clientConfigurationDetailsDto.setState(clientConfigurationDetailsBean.getState());
		clientDto.setClientConfigurationDetailsDto(clientConfigurationDetailsDto);
		clientDto.setClientConfigurationDetailsDto(clientConfigurationDetailsDto);
		clientConfigurationDetailsDto.setClientDto(clientDto);
		
		List<ClientGlAccountBean> clientGlAccountBeanList = clientBean.getClientGlAccountBean();
		List<ClientGlAccountDto> clientGlAccountDtoList = new ArrayList<ClientGlAccountDto>();
		
		for(ClientGlAccountBean clientGlAccountBean : clientGlAccountBeanList){
			ClientGlAccountDto clientGlAccountDto = new ClientGlAccountDto();
			clientGlAccountDto.setAccountId(clientGlAccountBean.getAccountId());
			clientGlAccountDto.setAccountNumber(clientGlAccountBean.getAccountNumber());
			clientGlAccountDto.setAccountType(clientGlAccountBean.getAccountType());
			clientGlAccountDto.setDescription("");
			clientGlAccountDto.setStatus("In Progress");
			
			clientGlAccountDtoList.add(clientGlAccountDto);
		}
		
		clientDto.setClientGlAccountDto(clientGlAccountDtoList);
		clientGlAccountDtoList.get(0).setClientDto(clientDto);
		/*ClientDto clientDto = new ClientDto();
		ClientConfigurationDetailsDto clientConfigurationDetailsDto = new ClientConfigurationDetailsDto();
		
		ClientGlAccountDto clientGlAccountDto = new ClientGlAccountDto();
		clientGlAccountDto.setStatus("In Progress");
		clientDto.setClientName(clientBean.getClientName());
		clientDto.setCreationDate(new Date());
		clientDto.setClientConfigurationDetailsDto(clientConfigurationDetailsDto);
		clientDto.setClientGlAccountDto(clientBean.getClientGlAccountBean());
		clientConfigurationDetailsDto.setClientBean(clientDto);
		clientConfigurationDetailsDto.setClientGlAccountDto(clientGlAccountDto);
		clientConfigurationDetailsDto.setCountry("22222222");
		clientConfigurationDetailsDto.setAddressLine1("33333333");
		clientGlAccountDto.setClientDto(clientDto);*/
		
		return clientDto;
	}
}
