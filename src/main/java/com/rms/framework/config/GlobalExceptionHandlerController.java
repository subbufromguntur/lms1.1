package com.rms.framework.config;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerController {
	private final Logger logger = Logger.getLogger(this.getClass());
	@ExceptionHandler(Exception.class)
	  public void handleError(HttpServletRequest req, Exception exception) {
		logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
	
	  @ExceptionHandler({SQLException.class,DataAccessException.class})
	  public String databaseError() {
	    // Nothing to do.  Returns the logical view name of an error page, passed to
	    // the view-resolver(s) in usual way.
	    // Note that the exception is _not_ available to this view (it is not added to
	    // the model) but see "Extending ExceptionHandlerExceptionResolver" below.
		  logger.info("============================================================================dddddddddddd=================================================================================");
	    return "databaseError";
	  }
	  
	  @ResponseStatus(value=HttpStatus.CONFLICT, reason="Data integrity violation")  // 409
	  @ExceptionHandler(DataIntegrityViolationException.class)
	  public void conflict() {
		  System.out.println("============333333=================================================================================================================================================");
	  }
	  
	  @ResponseStatus(value=HttpStatus.NOT_FOUND, reason="IOException occured")
	    @ExceptionHandler(IOException.class)
	    public void handleIOException(){
		  logger.info("=============================================================================================================================================================");
	    }
	  
}