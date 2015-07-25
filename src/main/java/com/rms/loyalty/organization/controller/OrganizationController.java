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
import com.rms.loyalty.beans.ClientBean;
import com.rms.loyalty.beans.ClientGlAccountBean;
import com.rms.loyalty.beans.ClientPreConfiguredData;
import com.rms.loyalty.organization.service.OrganizationService;
import com.rms.loyalty.startup.service.RMStartupService;

@Controller
@SessionAttributes
public class OrganizationController {

	@Resource
	private OrganizationService organizationService;
	@Resource
	private RMStartupService rmsStartupService;
	
	/**
	 * 
	 * @param model
	 * @param clientBean
	 * @return
	 * This will call addclient page on load
	 */
	@RequestMapping(value = "/manageClientAddClientM", method = RequestMethod.GET)
	public String manageClientAddClientM(Model model,
			@ModelAttribute("clientBean") ClientBean clientBean,
			RedirectAttributes attributes) {
		List<Country> countryList = this.rmsStartupService.getCountries();
		List<String> timeZoneList = this.rmsStartupService.getData("select zone_name from zone");
		ClientPreConfiguredData clientPreConfiguredDataList = this.rmsStartupService.getClientPreConfiguredData();
		
		model.addAttribute("countryList", countryList);
		model.addAttribute("timeZone", timeZoneList);
		model.addAttribute("programData", clientPreConfiguredDataList);
		model.addAttribute("clientBean", clientBean);
		
		attributes.addFlashAttribute("countryList", countryList);
		attributes.addFlashAttribute("timeZone", timeZoneList);
		attributes.addFlashAttribute("clientPreConfiguredDataList", clientPreConfiguredDataList);
		attributes.addFlashAttribute("clientBean", clientBean);
		return "manageClientAddClientM";
	}
	
	/**
	 * 
	 * @param model
	 * @param clientBean
	 * @param attributes
	 * @return
	 * which click on add client gl account this will call
	 */
	@RequestMapping(value = "/addClientGlAccount", method = RequestMethod.POST)
	public String addClientGlAccount(Model model,
			@ModelAttribute("clientBean") ClientBean clientBean,
			RedirectAttributes attributes, HttpServletRequest req) {
		
		/*List<Country> countryList = this.rmsStartupService.getCountries();
		List<String> timeZoneList = this.rmsStartupService.gettimeZone();
		List<ClientPreConfiguredData> clientPreConfiguredDataList = this.rmsStartupService.getClientPreConfiguredData();*/
		
		List<ClientGlAccountBean> clientGlAccountBeanList = clientBean.getClientGlAccountBean();
		ClientGlAccountBean clientGlAccountBean = new ClientGlAccountBean();
		
		clientGlAccountBeanList.add(clientGlAccountBean);
		clientGlAccountBean.setAccountId(req.getParameter("accountId"));
		clientGlAccountBean.setAccountNumber(req.getParameter("accountNumber"));
		clientGlAccountBean.setAccountType(req.getParameter("accountType"));
		clientBean.setClientGlAccountBean(clientGlAccountBeanList);
		
		attributes.addFlashAttribute("clientBean", clientBean);
		attributes.addFlashAttribute("selectedCountryValue", req.getParameter("clientConfigurationDetailsBean.country").split(",")[0]);
		attributes.addFlashAttribute("selectedStateValue", req.getParameter("clientConfigurationDetailsBean.state").split(",")[0]);
		attributes.addFlashAttribute("selectedCitiValue", req.getParameter("clientConfigurationDetailsBean.city").split(",")[0]);
		attributes.addFlashAttribute("parent1", clientBean.getParent());
		attributes.addFlashAttribute("type1", clientBean.getType());
		attributes.addFlashAttribute("category1", clientBean.getCategory());
		attributes.addFlashAttribute("timeZoneVal1", clientBean.getTimeZone());
		System.out.println("============================= state val "+req.getParameter("clientConfigurationDetailsBean.state"));
		return "redirect:manageClientAddClientM";
	}
	
	/**
	 * 
	 * @param model
	 * @param clientBean
	 * @return
	 * This method is used to save all values from addclient.jsp to database
	 * and return same page with initial values like country etc..
	 */
	@RequestMapping(value = "/submitClient", method = RequestMethod.POST)
	public String submitClient(Model model,
			@ModelAttribute("clientBean") ClientBean clientBean,
			RedirectAttributes attributes) {
		//attributes.addFlashAttribute("message", "OrganizationInfo has been saved successfully.");
		model.addAttribute("message", "OrganizationInfo has been saved successfully.");
		this.organizationService.submitClient(clientBean);
		//return "redirect:manageClientAddClientM";
		return "success";
	}
}
