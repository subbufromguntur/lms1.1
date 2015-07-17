/**
 * 
 */
package com.rms.framework.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.framework.beans.ClientBean;
import com.rms.framework.dao.RoleManagementAdminDao;
import com.rms.framework.model.LoginBean;
import com.rms.framework.service.AccountManagementAdminService;
import com.rms.framework.service.LMSFormLoadService;

@Controller
public class HomeController {
	
	/**
	 * logger to log the messages
	 */
	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private LMSFormLoadService lmsFormLoadService;
	@Resource
	public RoleManagementAdminDao roleManagementAdminDaoImpl;
	@Resource
	private AccountManagementAdminService accountManagementAdminService;

	/**
	 * @return
	 */
	@RequestMapping("/index")
	public String getHomePage(Model model,@ModelAttribute("loginBean") LoginBean loginBean, BindingResult errors, RedirectAttributes attributes) {
		return "home";
	}

	@RequestMapping(value = "/homePage")
	public String homePage() {
		return "homePage";
	}
	
	@RequestMapping(value = "/manageRolesAddRoleM")
	public String manageRolesAddRoleM(Model model) {
		//model.addAttribute("roles",
				//this.accountManagementAdminService.getRolesData());
		return "manageRolesAddRoleM";
	}
	
	@RequestMapping(value = "/getCountryValues")
	public @ResponseBody String getStates(Model model,
			@RequestParam("stateIndicator") String stateIndicator,
			@ModelAttribute("clientBean") ClientBean clientBean) {
		String stateData = this.lmsFormLoadService.getStates(stateIndicator != null? stateIndicator.split(","): null);
		return stateData;
	}
	
	@RequestMapping(value = "/getCities")
	public @ResponseBody String getCities(Model model,
			@RequestParam("citiIndicator") String citiIndicator,
			@ModelAttribute("clientBean") ClientBean clientBean) {
		String cityData = this.lmsFormLoadService.getCities(citiIndicator != null? citiIndicator.split(","): null);
		return cityData;
	}
	
	
	
}
