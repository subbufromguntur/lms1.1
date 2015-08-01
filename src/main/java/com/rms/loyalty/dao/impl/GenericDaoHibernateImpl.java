/**
 * 
 */
package com.rms.loyalty.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rms.loyalty.dao.GenericDao;

/**
 * This class contains the hibernate implementation of all generic data access
 * and persist operations
 * 
 * @author RSM
 * @version 1.0
 * 
 */
public class GenericDaoHibernateImpl<T, ID> implements GenericDao<T, ID> {

	/**
	 * Session provider to get the current session Injection of Session provider
	 */
	/*
	 * @Autowired private sessionfactory sessionfactory;
	 */
	@Autowired
	public SessionFactory sessionfactory;

	/**
	 * Method to save any object into the database
	 * 
	 * (non-Javadoc)
	 * 
	 */
	public void insertEntity(T entity) {
		this.sessionfactory.getCurrentSession().save(entity);
	}

	/**
	 * Method to delete an object from the database
	 * 
	 * (non-Javadoc)
	 * 
	 */
	public void deleteEntity(T entity) {
		this.sessionfactory.getCurrentSession().delete(entity);
	}

	/**
	 * Method to update an object in the database
	 * 
	 * (non-Javadoc)
	 * 
	 */

	public void updateEntity(T entity) {
		this.sessionfactory.getCurrentSession().update(entity);
	}

	/**
	 * Method to merge an object in the database
	 * 
	 * (non-Javadoc)
	 * 
	 */

	public void mergeEntity(T entity) {
		this.sessionfactory.getCurrentSession().merge(entity);
	}

	/**
	 * Method to get the list of objects from the database, using query
	 * 
	 * (non-Javadoc)
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> getListByQuery(String query) {
		Query finalQuery = this.sessionfactory.getCurrentSession().createQuery(
				query);
		return finalQuery.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see .lang.String)
	 */

	public T getEntityByQuery(String query) {
		Query finalQuery = this.sessionfactory.getCurrentSession().createQuery(
				query);
		@SuppressWarnings("unchecked")
		List<T> list = finalQuery.list();
		if (list != null) {
			return list.get(0);
		}
		return null;
	}

	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

}