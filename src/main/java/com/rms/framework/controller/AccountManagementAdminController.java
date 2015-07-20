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
import com.rms.framework.organization.user.model.LmsUserCredentails;
import com.rms.framework.service.AccountManagementAdminService;


@Controller
@SessionAttributes
public class AccountManagementAdminController {
	private final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource
	private AccountManagementAdminService accountManagementAdminService;

	@SuppressWarnings("null")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String getURLTestPage(Model model,
			@ModelAttribute("lmsUserCredentails") LmsUserCredentails loginBean,
			BindingResult errors, RedirectAttributes attributes,
			HttpServletRequest req) throws ServiceException {
		attributes.addFlashAttribute("loginBean", loginBean);
		LmsUserCredentails bean = accountManagementAdminService
				.checkCredentials(loginBean);
		if (bean != null) {
			if (bean.getPassword().equals(loginBean.getPassword())) {
				HttpSession httpSession = req.getSession();
				httpSession.setAttribute("userName", bean.getUserName());
				httpSession.setAttribute("password", bean.getPassword());
				httpSession.setAttribute("loginBean", bean);

				if (bean.getAllowedRecentUsedPasswordCount() == 0) {
					return "changePasswordFrom";
				} else if (bean.getAllowedRecentUsedPasswordCount() > 0) {
					if (bean.getBadTryCount() > 3) {
						model.addAttribute("errorMessage",
								AccountManagementAdminConstants.LOCKED_USER);
						return "home";
					}
					loginBean.setBadTryCount(0);
					this.accountManagementAdminService.updateBadTryCount(bean);
					return "redirect:manageClientAddClientM";
				}
			} else if (!bean.getPassword().equals(loginBean.getPassword())) {
				model.addAttribute("errorMessage",
						AccountManagementAdminConstants.INVALID_PASSWORD);
				loginBean.setBadTryCount(bean.getBadTryCount()+1);
				this.accountManagementAdminService.updateBadTryCount(bean);
				return "home";
			}
		} else {
			model.addAttribute("errorMessage",
					AccountManagementAdminConstants.NO_USER_FOUND);
			return "home";
		}
		return null;
	}

	@RequestMapping(value = "/userNamePasswordChanged", method = RequestMethod.POST)
	public String saveUserNamePasswordChanged(Model model,
			@ModelAttribute("lmsUserCredentails") LmsUserCredentails loginBean,
			BindingResult errors, RedirectAttributes attributes,
			HttpServletRequest req) throws ServiceException {

		HttpSession httpSession = req.getSession();
		String userName = httpSession.getAttribute("userName").toString();
		String password = httpSession.getAttribute("password").toString();
		if (loginBean.getUserName().isEmpty()
				|| loginBean.getUserName() == null) {
			model.addAttribute("errorMessage",
					AccountManagementAdminConstants.USERNAME_CHANGED);
			return "changePasswordFrom";
		}

		if (loginBean.getPassword().isEmpty()
				|| loginBean.getPassword() == null) {
			model.addAttribute("errorMessage",
					AccountManagementAdminConstants.PASSWORD_CHANGED);
			return "changePasswordFrom";
		}

		LmsUserCredentails sesstionloginBean = (LmsUserCredentails) httpSession
				.getAttribute("loginBean");
		sesstionloginBean.setChangedPassword(loginBean.getChangedPassword());

		LmsUserCredentails bean = this.accountManagementAdminService
				.changePassword(sesstionloginBean);
		LoginValidator loginValidator = new LoginValidator();
		loginValidator.validate(bean, errors);

		if (errors.hasErrors()) {
			loginBean = null;
			return "home";
		}
		httpSession.removeAttribute("loginBean");
		httpSession.removeAttribute("password");
		httpSession.removeAttribute("username");
		return "changePasswordFrom";
	}

	@RequestMapping(value = "/saveLoginDetails", method = RequestMethod.GET)
	public String saveLoginDetails(Model model, 
			@ModelAttribute("lmsUserCredentails") LmsUserCredentails loginBean,
			BindingResult errors, RedirectAttributes attributes) {
		this.accountManagementAdminService.saveLoginDetails();
		return "home";
	}

	@RequestMapping(value = "/saveRoleDetails", method = RequestMethod.GET)
	public String saveRoleDetails(@RequestParam("path") String rolesFilePath) {
		// this.accountManagementAdminService.saveRoleDetails(rolesFilePath);
		return "home";
	}

	@RequestMapping(value = "/submitRolesRequest", method = RequestMethod.POST)
	public String submitRolesRequest(Model model, HttpServletRequest req) {
		// model.addAttribute("roles",
		// this.accountManagementAdminService.getRolesData());
		return "homePage";
	}

}
