package com.rms.framework.authentication;

import org.apache.log4j.Logger;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rms.loyalty.organization.user.model.UserCredentails;

public class LoginValidator implements Validator {
	private final Logger LOGGER = Logger.getLogger(this.getClass());

	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(UserCredentails.class);
	}

	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
				"error.testName.required", "Enter UserName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"error.url.required", "Enter Password");

		UserCredentails testDto = (UserCredentails) object;
		if (testDto != null) {
			errors.rejectValue("indicator", "error.indicator.required",
					"Password Changed Successfully");
		}

	}
}
