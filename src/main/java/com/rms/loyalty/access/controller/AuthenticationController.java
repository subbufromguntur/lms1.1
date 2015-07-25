package com.rms.loyalty.access.controller;

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
import com.rms.loyalty.access.service.AuthenticationService;
import com.rms.loyalty.constant.RMSConstant;
import com.rms.loyalty.organization.user.model.UserCredentails;
import com.rms.loyalty.utility.RMSPropertiesUtil;


@Controller
@SessionAttributes
public class AuthenticationController {
	private final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource
	private AuthenticationService authenticationService;

	@SuppressWarnings("null")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String getURLTestPage(Model model,
			@ModelAttribute("lmsUserCredentails") UserCredentails loginBean,
			BindingResult errors, RedirectAttributes attributes,
			HttpServletRequest req) throws ServiceException {
		attributes.addFlashAttribute("loginBean", loginBean);
		UserCredentails bean = authenticationService
				.checkCredentials(loginBean);
		if (bean != null) {
			if (bean.getPassword().equals(loginBean.getPassword())) {
				HttpSession httpSession = req.getSession();
				httpSession.setAttribute("userName", bean.getUserName());
				httpSession.setAttribute("password", bean.getPassword());
				httpSession.setAttribute("loginBean", bean);

				if (bean.getAllowedRecentUsedPasswordCount() == 0) {
					return "access/changePasswordFrom";
				} else if (bean.getAllowedRecentUsedPasswordCount() > 0) {
					if (bean.getBadTryCount() > 3) {
						model.addAttribute("errorMessage",
								RMSPropertiesUtil.getProperty(RMSConstant.LOCKED_USER));
						return "access/login";
					}
					loginBean.setBadTryCount(0);
					this.authenticationService.updateBadTryCount(bean);
					return "redirect:manageClientAddClientM";
				}
			} else if (!bean.getPassword().equals(loginBean.getPassword())) {
				if (bean.getBadTryCount() > 3) {
					System.out.println(":::::::::::::::::::((((((((2222222222222((((((((((((((((())))))))))))))))))))))))))))):::::::::::::::::");
					model.addAttribute("errorMessage",
							RMSPropertiesUtil.getProperty(RMSConstant.LOCKED_USER));
					return "access/login";
				}
				model.addAttribute("errorMessage",
						RMSPropertiesUtil.getProperty(RMSConstant.INVALID_PASSWORD));
				bean.setBadTryCount(bean.getBadTryCount()+1);
				this.authenticationService.updateBadTryCount(bean);
				return "access/login";
			}
		} else {
			System.out.println(":::::::::::::::::::((((((((((((((((((((((((())))))))))))))))))))))))))))):::::::::::::::::");
			model.addAttribute("errorMessage",
					RMSPropertiesUtil.getProperty(RMSConstant.NO_USER_FOUND));
			return "access/login";
		}
		return null;
	}

	@RequestMapping(value = "/userNamePasswordChanged", method = RequestMethod.POST)
	public String saveUserNamePasswordChanged(Model model,
			@ModelAttribute("lmsUserCredentails") UserCredentails loginBean,
			BindingResult errors, RedirectAttributes attributes,
			HttpServletRequest req) throws ServiceException {

		HttpSession httpSession = req.getSession();
		String userName = httpSession.getAttribute("userName").toString();
		String password = httpSession.getAttribute("password").toString();
		if (loginBean.getUserName().isEmpty()
				|| loginBean.getUserName() == null) {
			model.addAttribute("errorMessage",
					RMSPropertiesUtil.getProperty(RMSConstant.USERNAME_CHANGED));
			return "access/changePasswordFrom";
		}

		if (loginBean.getPassword().isEmpty()
				|| loginBean.getPassword() == null) {
			model.addAttribute("errorMessage",
					RMSPropertiesUtil.getProperty(RMSConstant.PASSWORD_CHANGED));
			return "access/changePasswordFrom";
		}

		UserCredentails sesstionloginBean = (UserCredentails) httpSession
				.getAttribute("loginBean");
		sesstionloginBean.setChangedPassword(loginBean.getChangedPassword());

		UserCredentails bean = this.authenticationService
				.changePassword(sesstionloginBean);
		model.addAttribute("successMessage",
				RMSPropertiesUtil.getProperty(RMSConstant.PASSWORD_CHANGED));
		LoginValidator loginValidator = new LoginValidator();
		loginValidator.validate(bean, errors);

		if (errors.hasErrors()) {
			loginBean = null;
			return "access/login";
		}
		httpSession.removeAttribute("loginBean");
		httpSession.removeAttribute("password");
		httpSession.removeAttribute("username");
		return "access/changePasswordFrom";
	}

	@RequestMapping(value = "/saveLoginDetails", method = RequestMethod.GET)
	public String saveLoginDetails(Model model, 
			@ModelAttribute("lmsUserCredentails") UserCredentails loginBean,
			BindingResult errors, RedirectAttributes attributes) {
		this.authenticationService.saveLoginDetails();
		return "access/login";
	}

	@RequestMapping(value = "/saveRoleDetails", method = RequestMethod.GET)
	public String saveRoleDetails(@RequestParam("path") String rolesFilePath) {
		// this.accountManagementAdminService.saveRoleDetails(rolesFilePath);
		return "access/login";
	}

	@RequestMapping(value = "/submitRolesRequest", method = RequestMethod.POST)
	public String submitRolesRequest(Model model, HttpServletRequest req) {
		// model.addAttribute("roles",
		// this.accountManagementAdminService.getRolesData());
		return "homePage";
	}

}
