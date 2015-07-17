package com.rms.framework.authentication;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rms.framework.model.LoginBean;

public class LoginValidator  implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(LoginBean.class);
	}

	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.testName.required", "Enter UserName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.url.required", "Enter Password");

		LoginBean testDto = (LoginBean) object;
		if(testDto != null) {
			errors.rejectValue("indicator", "error.indicator.required","Password Changed Successfully");
		}
		
	}
}
