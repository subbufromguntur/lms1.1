/**
 * 
 */
package com.rms.loyalty.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.loyalty.access.service.AuthenticationService;
import com.rms.loyalty.beans.OrganizationBean;
import com.rms.loyalty.constant.RMSConstant;
import com.rms.loyalty.exception.FetchException;
import com.rms.loyalty.organization.user.model.UserCredentails;
import com.rms.loyalty.startup.service.RMStartupService;
import com.rms.loyalty.utility.RMSPropertiesUtil;

@Controller
public class HomeController {

	/**
	 * logger to log the messages
	 */
	private final Logger logger = Logger.getLogger(this.getClass());

	@Resource
	private RMStartupService rmsStartupService;
	@Resource
	private AuthenticationService authenticationService;
	RMSPropertiesUtil rmsPropertiesUtil = new RMSPropertiesUtil();

	/**
	 * @return
	 */
	@RequestMapping("/index")
	public String getHomePage(Model model,
			@ModelAttribute("lmsUserCredentails") UserCredentails loginBean,
			BindingResult errors, RedirectAttributes attributes) {
		return "home";
	}

	@RequestMapping("/logout")
	public String logout(Model model,
			@ModelAttribute("lmsUserCredentails") UserCredentails loginBean,
			BindingResult errors, RedirectAttributes attributes) {
		model.addAttribute("successMessage",
				rmsPropertiesUtil.getMessage(RMSConstant.LOGOUT_MESSAGE));
		return "logout";
	}

	@RequestMapping(value = "/homePage")
	public String homePage() {
		return "homePage";
	}
	
	@RequestMapping(value = "/backButtonPressed", method = RequestMethod.POST)
	public String backButtonPressed(){
		System.out.println("====================================================================");
		return "logout";
	}
	
	@RequestMapping(value = "/homePage" , params = "Logout")
	public String logout(Model model) {
		model.addAttribute("successMessage",
				rmsPropertiesUtil.getMessage(RMSConstant.LOGOUT_MESSAGE));
		return "logout";
	}

	@RequestMapping(value = "/manageRolesAddRoleM")
	public String manageRolesAddRoleM(Model model) throws FetchException {
		model.addAttribute("roles", this.authenticationService.getManageRoles());
		return "manageRolesAddRoleM";
	}

	@RequestMapping(value = "/manageAddProgramM")
	public String manageAddProgramM(Model model) throws FetchException {
		model.addAttribute("roles", this.authenticationService.getManageRoles());
		return "manageAddProgramM";
	}

	@RequestMapping(value = "/getCountryValues")
	public @ResponseBody String getStates(Model model,
			@RequestParam("stateIndicator") String stateIndicator,
			@ModelAttribute("clientBean") OrganizationBean organizationBean) {
		String stateData = this.rmsStartupService
				.getStates(stateIndicator != null ? stateIndicator.split(",")
						: null);
		return stateData;
	}

	@RequestMapping(value = "/getCities")
	public @ResponseBody String getCities(Model model,
			@RequestParam("citiIndicator") String citiIndicator,
			@ModelAttribute("clientBean") OrganizationBean organizationBean) {
		String cityData = this.rmsStartupService
				.getCities(citiIndicator != null ? citiIndicator.split(",")
						: null);
		return cityData;
	}

}
