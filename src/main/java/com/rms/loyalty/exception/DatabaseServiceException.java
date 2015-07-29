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
public class DatabaseServiceException extends ServiceException {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = -3932027002112409067L;

	/**
	 * Default constructor
	 */
	public DatabaseServiceException() {
	}

	/**
	 * @param arg0
	 */
	public DatabaseServiceException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public DatabaseServiceException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DatabaseServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public DatabaseServiceException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
}
