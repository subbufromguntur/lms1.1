package com.rms.loyalty.product.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rms.loyalty.master.model.CardAssociationType;

@Entity
@Table(name = "binrange")
/*
 * This class is generated from the entity 'BinRange' defined in the HEDL model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class BinRange {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="startrange", nullable=false)
	private int startRange;
	
	@Column(name="endrange", nullable=false)
	private int endRange;
	
	@Column(name="cardassociationid", nullable=false)
	private int cardAssociationId;
	
	@Column(name="status", nullable=false)
	private int status;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="cardassociationtype", nullable=false)
	private CardAssociationType cardAssociationType;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public BinRange() {
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
	public BinRange(int startRange, int endRange, int cardAssociationId, int status, CardAssociationType cardAssociationType) {
		super();
		if (cardAssociationType == null) {
			throw new IllegalArgumentException("'cardAssociationType' must not be null.");
		}
		this.startRange = startRange;
		this.endRange = endRange;
		this.cardAssociationId = cardAssociationId;
		this.status = status;
		this.cardAssociationType = cardAssociationType;
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
	 * Returns the value of property 'startRange'.
	 */
	public int getStartRange() {
		return startRange;
	}
	
	/**
	 * Sets the value of property 'startRange'.
	 */
	public void setStartRange(int newValue) {
		this.startRange = newValue;
	}
	
	/**
	 * Returns the value of property 'endRange'.
	 */
	public int getEndRange() {
		return endRange;
	}
	
	/**
	 * Sets the value of property 'endRange'.
	 */
	public void setEndRange(int newValue) {
		this.endRange = newValue;
	}
	
	/**
	 * Returns the value of property 'cardAssociationId'.
	 */
	public int getCardAssociationId() {
		return cardAssociationId;
	}
	
	/**
	 * Sets the value of property 'cardAssociationId'.
	 */
	public void setCardAssociationId(int newValue) {
		this.cardAssociationId = newValue;
	}
	
	/**
	 * Returns the value of property 'status'.
	 */
	public int getStatus() {
		return status;
	}
	
	/**
	 * Sets the value of property 'status'.
	 */
	public void setStatus(int newValue) {
		this.status = newValue;
	}
	
	/**
	 * Returns the value of property 'cardAssociationType'.
	 */
	public CardAssociationType getCardAssociationType() {
		return cardAssociationType;
	}
	
	/**
	 * Sets the value of property 'cardAssociationType'.
	 */
	public void setCardAssociationType(CardAssociationType newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'cardAssociationType' must not be null.");
		}
		this.cardAssociationType = newValue;
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
		BinRange other = (BinRange) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("BinRange-");
		result.append(getId());
		result.append(" [");
		result.append("startRange = ");
		result.append(getStartRange());
		result.append(", ");
		result.append("endRange = ");
		result.append(getEndRange());
		result.append(", ");
		result.append("cardAssociationId = ");
		result.append(getCardAssociationId());
		result.append(", ");
		result.append("status = ");
		result.append(getStatus());
		result.append("]");
		return result.toString();
	}
}
