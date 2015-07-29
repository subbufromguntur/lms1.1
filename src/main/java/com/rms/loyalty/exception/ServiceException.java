/**
 * 
 */
package com.rms.loyalty.exception;

/**
 * @author RSM
 * @version 1.0
 * 
 */
public class ServiceException extends ApplicationException {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ServiceException() {
	}

	/**
	 * @param message
	 */
	public ServiceException(String message) {
		super(message);
	}

	/**
	 * @param throwable
	 */
	public ServiceException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * @param message
	 * @param throwable
	 */
	public ServiceException(String message, Throwable throwable) {
		super(message, throwable);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}