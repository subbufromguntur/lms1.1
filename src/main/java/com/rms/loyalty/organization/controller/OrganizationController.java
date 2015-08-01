package com.rms.loyalty.organization.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.framework.model.Country;
import com.rms.loyalty.beans.OrganizationBean;
import com.rms.loyalty.beans.OrganizationGlAccountBean;
import com.rms.loyalty.beans.OrganizationDataLoader;
import com.rms.loyalty.constant.RMSConstant;
import com.rms.loyalty.organization.service.OrganizationService;
import com.rms.loyalty.startup.service.RMStartupService;
import com.rms.loyalty.utility.RMSPropertiesUtil;

@Controller
@SessionAttributes
public class OrganizationController {

	@Resource
	private OrganizationService organizationService;
	@Resource
	private RMStartupService rmsStartupService;
	RMSPropertiesUtil rmsPropertiesUtil = new RMSPropertiesUtil();
	/**
	 * 
	 * @param model
	 * @param organizationBean
	 * @return This will call addclient page on load
	 */
	@RequestMapping(value = "/manageClientAddClientM", method = RequestMethod.GET)
	public String manageClientAddClientM(Model model,
			@ModelAttribute("organizationBean") OrganizationBean organizationBean,
			RedirectAttributes attributes) {
		List<Country> countryList = this.rmsStartupService.getCountries();
		List<String> timeZoneList = this.rmsStartupService
				.getData("select zone_name from zone");
		OrganizationDataLoader clientPreConfiguredDataList = this.rmsStartupService
				.getClientPreConfiguredData();

		model.addAttribute("countryList", countryList);
		model.addAttribute("timeZone", timeZoneList);
		model.addAttribute("programData", clientPreConfiguredDataList);
		model.addAttribute("organizationBean", organizationBean);

		attributes.addFlashAttribute("countryList", countryList);
		attributes.addFlashAttribute("timeZone", timeZoneList);
		attributes.addFlashAttribute("clientPreConfiguredDataList",
				clientPreConfiguredDataList);
		attributes.addFlashAttribute("organizationBean", organizationBean);
		return "manageClientAddClientM";
	}

	/**
	 * 
	 * @param model
	 * @param organizationBean
	 * @param attributes
	 * @return which click on add client gl account this will call
	 */
	@RequestMapping(value = "/addClientGlAccount", method = RequestMethod.POST)
	public String addClientGlAccount(Model model,
			@ModelAttribute("organizationBean") OrganizationBean organizationBean,
			RedirectAttributes attributes, HttpServletRequest req) {

		/*
		 * List<Country> countryList = this.rmsStartupService.getCountries();
		 * List<String> timeZoneList = this.rmsStartupService.gettimeZone();
		 * List<OrganizationDataLoader> clientPreConfiguredDataList =
		 * this.rmsStartupService.getClientPreConfiguredData();
		 */

		List<OrganizationGlAccountBean> clientGlAccountBeanList = organizationBean
				.getOrganizationGlAccountBean();
		OrganizationGlAccountBean organizationGlAccountBean = new OrganizationGlAccountBean();
		clientGlAccountBeanList.add(organizationGlAccountBean);
		organizationGlAccountBean.setAccountId(req.getParameter("accountId"));
		organizationGlAccountBean.setAccountNumber(req.getParameter("accountNumber"));
		organizationGlAccountBean.setAccountType(req.getParameter("accountType"));
		organizationBean.setOrganizationGlAccountBean(clientGlAccountBeanList);
		String country = req.getParameter("organizationConfigurationDetailsBean.country");
		String state = req.getParameter("organizationConfigurationDetailsBean.state");
		String city = req.getParameter("organizationConfigurationDetailsBean.city");
		
		attributes.addFlashAttribute("organizationBean", organizationBean);
		attributes.addFlashAttribute("selectedCountryValue", country != null
				&& country.indexOf(",") > 0 ? country.split(",")[0] : "");
		attributes.addFlashAttribute(
				"selectedStateValue", state != null
						&& state.indexOf(",") > 0 ? state.split(",")[0] : "");
		attributes.addFlashAttribute(
				"selectedCitiValue", city != null
						&& city.indexOf(",") > 0 ? city.split(",")[0] : "");
		attributes.addFlashAttribute("parent1", organizationBean.getParent());
		attributes.addFlashAttribute("type1", organizationBean.getType());
		attributes.addFlashAttribute("category1", organizationBean.getCategory());
		attributes.addFlashAttribute("timeZoneVal1", organizationBean.getTimeZone());
		return "redirect:manageClientAddClientM";
	}

	/**
	 * 
	 * @param model
	 * @param organizationBean
	 * @return This method is used to save all values from addclient.jsp to
	 *         database and return same page with initial values like country
	 *         etc..
	 */
	@RequestMapping(value = "/submitClient", method = RequestMethod.POST)
	public String submitClient(Model model,
			@ModelAttribute("organizationBean") OrganizationBean organizationBean,
			RedirectAttributes attributes) {
		// attributes.addFlashAttribute("message",
		// "OrganizationInfo has been saved successfully.");
		model.addAttribute("successMessage",
				rmsPropertiesUtil.getMessage(RMSConstant.SAVED_MSG));
		this.organizationService.submitClient(organizationBean);
		// return "redirect:manageClientAddClientM";
		return "success";
	}
}
