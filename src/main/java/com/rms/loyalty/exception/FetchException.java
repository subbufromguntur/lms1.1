/**
 * 
 */
package com.rms.loyalty.exception;

/**
 * @author RSM
 * @version 1.0
 * 
 */
public class FetchException extends DatabaseDaoException {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 5095020270181406044L;

	/**
	 * Default constructor
	 */
	public FetchException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public FetchException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FetchException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public FetchException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public FetchException(Throwable cause) {
		super(cause);
	}

}
