package com.rms.framework.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.framework.authentication.LoginValidator;
import com.rms.framework.constants.AccountManagementAdminConstants;
import com.rms.framework.model.LoginBean;
import com.rms.framework.service.AccountManagementAdminService;


@Controller
@SessionAttributes
public class AccountManagementAdminController {
	@Resource
	private AccountManagementAdminService accountManagementAdminService;
	
	
	/**
	 * 
	 * Logger
	 * 
	 */
	private final Logger logger = Logger.getLogger(this.getClass());

	@SuppressWarnings("null")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String getURLTestPage(Model model,
			@ModelAttribute("loginBean") LoginBean loginBean,
			BindingResult errors, RedirectAttributes attributes, HttpServletRequest req)
			throws ServiceException {
		attributes.addFlashAttribute("loginBean", loginBean);
		LoginBean bean = accountManagementAdminService.checkCredentials(loginBean);
		
		loginBean = bean;
		if (bean != null) {
			model.addAttribute("loginId", bean.getLoginId());
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("userName", bean.getUserName());
			httpSession.setAttribute("password", bean.getPassword());
		}
		
		
		if (bean == null && bean.getUserName().isEmpty()) {
			model.addAttribute("errorMessage",
					AccountManagementAdminConstants.NO_USER_FOUND);
			
			return "home";
		
		} else if (bean != null && bean.getIndicator() != null && bean.getIndicator().trim().equals("9")) {
			return "changePasswordFrom";
		} else if (bean != null && bean.getIndicator()!= null && bean.getIndicator().trim().equals("99")) {
			//model.addAttribute("roles",
					//this.accountManagementAdminService.getRolesData());
			return "homePage";
		}else{
			model.addAttribute("errorMessage",
					AccountManagementAdminConstants.USER_NOT_FOUND);
			return "home";
		}

	}

	@RequestMapping(value = "/userNamePasswordChanged", method = RequestMethod.POST)
	public String saveUserNamePasswordChanged(Model model,
			@ModelAttribute("loginBean") LoginBean loginBean,
			BindingResult errors, RedirectAttributes attributes, HttpServletRequest req)
			throws ServiceException {
		HttpSession httpSession = req.getSession();
		String userName = httpSession.getAttribute("userName").toString();
		String password = httpSession.getAttribute("password").toString();
		if(!userName.equals(loginBean.getUserName())){
			model.addAttribute("errorMessage",
					AccountManagementAdminConstants.USERNAME_CHANGED);
			loginBean.setUserName(userName);
			return "changePasswordFrom";
		}
		
		if(!password.equals(loginBean.getPassword())){
			model.addAttribute("errorMessage",
					AccountManagementAdminConstants.PASSWORD_CHANGED);
			loginBean.setPassword(password);
			return "changePasswordFrom";
		}
		
		LoginBean bean = this.accountManagementAdminService.changePassword(loginBean);
		LoginValidator loginValidator = new LoginValidator();
		loginValidator.validate(bean, errors);

		if (errors.hasErrors()) {
			loginBean = null;
			return "home";
		}
		return "changePasswordFrom";
	}
	
	@RequestMapping(value = "/saveLoginDetails", method = RequestMethod.GET)
	public String saveLoginDetails(
			Model model,
			@ModelAttribute("loginBean") LoginBean loginBean,
			BindingResult errors, RedirectAttributes attributes) {
		this.accountManagementAdminService.saveLoginDetails(loginBean);
		return "home";
	}
	
	@RequestMapping(value = "/saveRoleDetails", method = RequestMethod.GET)
	public String saveRoleDetails(@ModelAttribute("loginBean") LoginBean loginBean, 
			@RequestParam("path") String rolesFilePath) {
		//this.accountManagementAdminService.saveRoleDetails(rolesFilePath);
		return "home";
	}
	@RequestMapping(value = "/submitRolesRequest", method = RequestMethod.POST)
	public String submitRolesRequest(Model model, HttpServletRequest req) {
		//model.addAttribute("roles",
				//this.accountManagementAdminService.getRolesData());
		return "homePage";
	}
	
}
