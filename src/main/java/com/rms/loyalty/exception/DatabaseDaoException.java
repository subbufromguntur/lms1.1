package com.rms.loyalty.exception;

/**
 * @author RSM
 * @version 1.0
 */
public class DatabaseDaoException extends Exception {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 8187144050691235975L;

	/**
	 * Default constructor
	 */
	public DatabaseDaoException() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public DatabaseDaoException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DatabaseDaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public DatabaseDaoException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public DatabaseDaoException(Throwable arg0) {
		super(arg0);
	}
}
