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
public class ApplicationException extends Exception {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ApplicationException() {

	}

	/**
	 * @param message
	 */
	public ApplicationException(String message) {
		super(message);

	}

	/**
	 * @param throwable
	 */
	public ApplicationException(Throwable throwable) {
		super(throwable);

	}

	/**
	 * @param message
	 * @param throwable
	 */
	public ApplicationException(String message, Throwable throwable) {
		super(message, throwable);

	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ApplicationException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message);
	}
}
