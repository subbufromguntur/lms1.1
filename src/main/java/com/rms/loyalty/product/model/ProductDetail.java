package com.rms.loyalty.product.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "productdetail")
/*
 * This class is generated from the entity 'ProductDetail' defined in the HEDL
 * model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class ProductDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="productid", nullable=false)
	private long productId;
	
	@Column(name="productname", nullable=false)
	private String productName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creationdate", nullable=false)
	private Date creationDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastmodifieddate", nullable=false)
	private Date lastModifiedDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="programstartdate", nullable=false)
	private Date programStartDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="programenddate", nullable=false)
	private Date programEndDate;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="approvalcomment", nullable=false)
	private String approvalComment;
	
	@Column(name="creatorcomment", nullable=false)
	private String creatorComment;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public ProductDetail() {
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
	public ProductDetail(long productId, String productName, Date creationDate, Date lastModifiedDate, Date programStartDate, Date programEndDate, String description, String approvalComment, String creatorComment) {
		super();
		if (productName == null) {
			throw new IllegalArgumentException("'productName' must not be null.");
		}
		if (creationDate == null) {
			throw new IllegalArgumentException("'creationDate' must not be null.");
		}
		if (lastModifiedDate == null) {
			throw new IllegalArgumentException("'lastModifiedDate' must not be null.");
		}
		if (programStartDate == null) {
			throw new IllegalArgumentException("'programStartDate' must not be null.");
		}
		if (programEndDate == null) {
			throw new IllegalArgumentException("'programEndDate' must not be null.");
		}
		if (description == null) {
			throw new IllegalArgumentException("'description' must not be null.");
		}
		if (approvalComment == null) {
			throw new IllegalArgumentException("'approvalComment' must not be null.");
		}
		if (creatorComment == null) {
			throw new IllegalArgumentException("'creatorComment' must not be null.");
		}
		this.productId = productId;
		this.productName = productName;
		this.creationDate = creationDate;
		this.lastModifiedDate = lastModifiedDate;
		this.programStartDate = programStartDate;
		this.programEndDate = programEndDate;
		this.description = description;
		this.approvalComment = approvalComment;
		this.creatorComment = creatorComment;
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
	 * Returns the value of property 'productId'.
	 */
	public long getProductId() {
		return productId;
	}
	
	/**
	 * Sets the value of property 'productId'.
	 */
	public void setProductId(long newValue) {
		this.productId = newValue;
	}
	
	/**
	 * Returns the value of property 'productName'.
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Sets the value of property 'productName'.
	 */
	public void setProductName(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'productName' must not be null.");
		}
		this.productName = newValue;
	}
	
	/**
	 * Returns the value of property 'creationDate'.
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	
	/**
	 * Sets the value of property 'creationDate'.
	 */
	public void setCreationDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'creationDate' must not be null.");
		}
		this.creationDate = newValue;
	}
	
	/**
	 * Returns the value of property 'lastModifiedDate'.
	 */
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	
	/**
	 * Sets the value of property 'lastModifiedDate'.
	 */
	public void setLastModifiedDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'lastModifiedDate' must not be null.");
		}
		this.lastModifiedDate = newValue;
	}
	
	/**
	 * Returns the value of property 'programStartDate'.
	 */
	public Date getProgramStartDate() {
		return programStartDate;
	}
	
	/**
	 * Sets the value of property 'programStartDate'.
	 */
	public void setProgramStartDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'programStartDate' must not be null.");
		}
		this.programStartDate = newValue;
	}
	
	/**
	 * Returns the value of property 'programEndDate'.
	 */
	public Date getProgramEndDate() {
		return programEndDate;
	}
	
	/**
	 * Sets the value of property 'programEndDate'.
	 */
	public void setProgramEndDate(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'programEndDate' must not be null.");
		}
		this.programEndDate = newValue;
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
	
	/**
	 * Returns the value of property 'approvalComment'.
	 */
	public String getApprovalComment() {
		return approvalComment;
	}
	
	/**
	 * Sets the value of property 'approvalComment'.
	 */
	public void setApprovalComment(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'approvalComment' must not be null.");
		}
		this.approvalComment = newValue;
	}
	
	/**
	 * Returns the value of property 'creatorComment'.
	 */
	public String getCreatorComment() {
		return creatorComment;
	}
	
	/**
	 * Sets the value of property 'creatorComment'.
	 */
	public void setCreatorComment(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'creatorComment' must not be null.");
		}
		this.creatorComment = newValue;
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
		ProductDetail other = (ProductDetail) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("ProductDetail-");
		result.append(getId());
		result.append(" [");
		result.append("productId = ");
		result.append(getProductId());
		result.append(", ");
		result.append("productName = ");
		result.append(getProductName());
		result.append(", ");
		result.append("creationDate = ");
		result.append(getCreationDate());
		result.append(", ");
		result.append("lastModifiedDate = ");
		result.append(getLastModifiedDate());
		result.append(", ");
		result.append("programStartDate = ");
		result.append(getProgramStartDate());
		result.append(", ");
		result.append("programEndDate = ");
		result.append(getProgramEndDate());
		result.append(", ");
		result.append("description = ");
		result.append(getDescription());
		result.append(", ");
		result.append("approvalComment = ");
		result.append(getApprovalComment());
		result.append(", ");
		result.append("creatorComment = ");
		result.append(getCreatorComment());
		result.append("]");
		return result.toString();
	}
}
