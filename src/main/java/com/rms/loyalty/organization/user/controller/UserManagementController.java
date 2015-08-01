package com.rms.loyalty.organization.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.loyalty.organization.service.OrganizationService;
import com.rms.loyalty.organization.user.model.UserCredentails;
import com.rms.loyalty.organization.user.service.UserManagementService;

@Controller
@SessionAttributes
public class UserManagementController {
	@Resource
	private UserManagementService userManagementService;
	@Resource
	private OrganizationService organizationService;

	/**
	 * 
	 * @param model
	 * @param userCredentails
	 * @param attributes
	 * @return
	 * 
	 *         While loading add user this will call and load client details and
	 *         roles from database.
	 */
	@RequestMapping(value = "/manageUserAddUserM", method = RequestMethod.GET)
	public String manageUserAddUserM(
			Model model,
			@ModelAttribute("lmsUserCredentails") UserCredentails userCredentails,
			RedirectAttributes attributes) {
		model.addAttribute("organizationInfo",
				this.organizationService.getClientDetails());
		return "manageUserAddUserM";
	}

	/**
	 * 
	 * @param model
	 * @param userCredentails
	 * @param attributes
	 * @return This will call when you click submit button from client screen,
	 *         and load all the values into database
	 */
	@RequestMapping(value = "/submitUser",  method = RequestMethod.POST)
	public String submitUser(
			Model model,
			@ModelAttribute("lmsUserCredentails") UserCredentails userCredentails,
			RedirectAttributes attributes) {
		// attributes.addFlashAttribute("message",
		// "User has been saved successfully.");
		model.addAttribute("successMessage", "User has been saved successfully.");
		this.userManagementService.submitUser(userCredentails);
		// return "redirect:manageUserAddUserM";
		return "success";
	}

}
