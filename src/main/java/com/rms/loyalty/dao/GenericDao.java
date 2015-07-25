/**
 * @author RSM
 */
package com.rms.loyalty.dao;

import java.util.List;

/**
 * This interface contains generic data access operations for all entities.
 * 
 * @author RSM
 * @version 1.0
 * 
 */
public interface GenericDao<T, ID> {

	/**
	 * 
	 * @param entity
	 *            to persist
	 */
	void insertEntity(T entity);

	/**
	 * 
	 * @param query
	 *            HQL
	 * @return collection of entities of type
	 */
	List<T> getListByQuery(String query);

	/**
	 * 
	 * @param entity
	 *            to delete
	 */
	void deleteEntity(T entity);

	/**
	 * 
	 * @param entity
	 *            to persist
	 */
	void updateEntity(T entity);

	/**
	 * 
	 * @param entity
	 *            to merge
	 */
	void mergeEntity(T entity);

	/**
	 * @param query
	 * @return T
	 */
	T getEntityByQuery(String query);
	
}
