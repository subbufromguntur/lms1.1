/** 
 * 
 *
 */
package com.rms.loyalty.exception;

/**
 * @author RSM
 * @version 1.0
 * 
 */
public class OriginationException extends ApplicationException {

	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = -8645000209687926830L;

	/**
	 * Default constructor
	 */
	public OriginationException() {
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public OriginationException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public OriginationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public OriginationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public OriginationException(Throwable cause) {
		super(cause);
	}

}
