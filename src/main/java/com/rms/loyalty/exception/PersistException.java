/**
 * 
 */
package com.rms.loyalty.exception;

/**
 * @author RSM
 * @version 1.0
 */
public class PersistException extends DatabaseDaoException {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -2698996641723081014L;

	/**
	 * Default constructor
	 */
	public PersistException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PersistException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PersistException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PersistException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PersistException(Throwable cause) {
		super(cause);
	}

}
