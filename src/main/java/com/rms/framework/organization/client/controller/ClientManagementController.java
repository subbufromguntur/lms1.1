package com.rms.framework.organization.client.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.framework.beans.ClientBean;
import com.rms.framework.model.ClientPreConfiguredData;
import com.rms.framework.model.Country;
import com.rms.framework.organization.client.service.ClientManagementService;
import com.rms.framework.service.LMSFormLoadService;

@Controller
@SessionAttributes
public class ClientManagementController {

	@Resource
	private ClientManagementService clientManagementService;
	@Resource
	private LMSFormLoadService lmsFormLoadService;
	
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
		List<Country> countryList = this.lmsFormLoadService.getCountries();
		List<String> timeZoneList = this.lmsFormLoadService.gettimeZone();
		List<ClientPreConfiguredData> clientPreConfiguredDataList = this.lmsFormLoadService.getClientPreConfiguredData();
		
		model.addAttribute("countryList", countryList);
		model.addAttribute("timeZone", timeZoneList);
		model.addAttribute("clientPreConfiguredDataList", clientPreConfiguredDataList);
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
	 * @return
	 * This method is used to save all values from addclient.jsp to database
	 * and return same page with initial values like country etc..
	 */
	@RequestMapping(value = "/submitClient", method = RequestMethod.POST)
	public String submitClient(Model model,
			@ModelAttribute("clientBean") ClientBean clientBean,
			RedirectAttributes attributes) {
		//attributes.addFlashAttribute("message", "Client has been saved successfully.");
		model.addAttribute("message", "Client has been saved successfully.");
		this.clientManagementService.submitClient(clientBean);
		//return "redirect:manageClientAddClientM";
		return "success";
	}
}
