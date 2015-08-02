package com.rms.framework.config;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.loyalty.constant.RMSConstant;
import com.rms.loyalty.organization.user.model.UserCredentails;
import com.rms.loyalty.utility.RMSPropertiesUtil;

@ControllerAdvice
public class GlobalExceptionHandlerController {
	private final Logger logger = Logger.getLogger(this.getClass());
	RMSPropertiesUtil rmsPropertiesUtil = new RMSPropertiesUtil();
	
	@ExceptionHandler(Exception.class)
	  public String handleError(Model model,
				@ModelAttribute("lmsUserCredentails") UserCredentails userCredentails,
				RedirectAttributes attributes, HttpServletRequest req, Exception exception) {
		logger.info(exception.getMessage());
		model.addAttribute("errorMessage",exception.getCause().getMessage());
		return "error";
	}
	
	  @ExceptionHandler({SQLException.class,DataAccessException.class})
	  public String databaseError(Model model,
				@ModelAttribute("lmsUserCredentails") UserCredentails userCredentails,
				RedirectAttributes attributes, HttpServletRequest req, Exception exception) {
			logger.info(exception.getMessage());
			model.addAttribute("errorMessage",exception.getCause().getMessage());
			return "error";
		}
	  
	  @ResponseStatus(value=HttpStatus.CONFLICT, reason="Data integrity violation")  // 409
	  @ExceptionHandler(DataIntegrityViolationException.class)
	  public String conflict(Model model,
				@ModelAttribute("lmsUserCredentails") UserCredentails userCredentails,
				RedirectAttributes attributes, HttpServletRequest req, Exception exception) {
			logger.info(exception.getMessage());
			model.addAttribute("errorMessage",exception.getCause().getMessage());
			return "error";
		}
	  
	  @ResponseStatus(value=HttpStatus.NOT_FOUND, reason="IOException occured")
	    @ExceptionHandler(IOException.class)
	    public String handleIOException(Model model,
				@ModelAttribute("lmsUserCredentails") UserCredentails userCredentails,
				RedirectAttributes attributes, HttpServletRequest req, Exception exception){
			logger.info(exception.getMessage());
			model.addAttribute("errorMessage",exception.getCause().getMessage());
			return "error";
		}
	  
}