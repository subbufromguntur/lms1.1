package com.rms.framework.organization.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.framework.organization.client.service.ClientManagementService;
import com.rms.framework.organization.user.model.LmsUserCredentails;
import com.rms.framework.organization.user.service.UserManagementService;

@Controller
@SessionAttributes
public class UserManagementController {
	@Resource
	private UserManagementService userManagementService;
	@Resource
	private ClientManagementService clientManagementService;
	
	@RequestMapping(value = "/manageUserAddUserM", method = RequestMethod.GET)
	public String manageUserAddUserM(Model model,
			@ModelAttribute("lmsUserCredentails") LmsUserCredentails lmsUserCredentails,
			RedirectAttributes attributes) {
		model.addAttribute("client", this.clientManagementService.getClientDetails());
		model.addAttribute("roles", this.clientManagementService.getRoles());
		return "manageUserAddUserM";
	}
	
	@RequestMapping(value = "/submitUser")
	public String submitUser(Model model,
			@ModelAttribute("lmsUserCredentails") LmsUserCredentails lmsUserCredentails,
			RedirectAttributes attributes) {
		attributes.addFlashAttribute("message", "User has been saved successfully.");
		this.userManagementService.submitUser(lmsUserCredentails);
		return "redirect:manageUserAddUserM";
	}
	
}
