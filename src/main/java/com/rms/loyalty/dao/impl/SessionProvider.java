/**
 * 
 */
package com.rms.loyalty.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This class provides the current working session to the calling class for
 * persist and access operations using hibernate
 * 
 * @author RSM
 * @version 1.0
 * 
 */
public class SessionProvider {

	/**
	 * Session factory to get the current session
	 */
	@Autowired
	public
	SessionFactory sessionfactory;

	/**
	 * @return current session
	 */
	public Session getSession() {
		return this.sessionfactory.getCurrentSession();
	}

}