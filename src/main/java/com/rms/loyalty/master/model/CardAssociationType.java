package com.rms.loyalty.master.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cardassociationtype")
/*
 * This class is generated from the entity 'CardAssociationType' defined in the
 * HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class CardAssociationType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="description", nullable=false)
	private String description;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public CardAssociationType() {
		super();
	}
	
	/**
	 * <p>
	 * Constructor using all read-only and all non-nullable properties.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used
	 * directly. Rather, the respective create() method must be used instead.
	 * </p>
	 */
	@Deprecated
	public CardAssociationType(String name, String description) {
		super();
		if (name == null) {
			throw new IllegalArgumentException("'name' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		this.name = name;
		this.description = description;
	}
	
	/**
	 * Returns the automatically generated id that identifies this entity object.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * <p>
	 * The property 'id' is read-only.
	 * </p>
	 * <p>
	 * This setter is only provided for the JPA provider.
	 * </p>
	 * <p>
	 * It must not be used directly.
	 * </p>
	 */
	@Deprecated
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Returns the value of property 'name'.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the value of property 'name'.
	 */
	public void setName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'name' must not be null.");
		}
		this.name = newValue;
	}
	
	/**
	 * Returns the value of property 'description'.
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the value of property 'description'.
	 */
	public void setDescription(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		this.description = newValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = prime + getId();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CardAssociationType other = (CardAssociationType) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("CardAssociationType-");
		result.append(getId());
		result.append(" [");
		result.append("name = ");
		result.append(getName());
		result.append(", ");
		result.append("description = ");
		result.append(getDescription());
		result.append("]");
		return result.toString();
	}
}
