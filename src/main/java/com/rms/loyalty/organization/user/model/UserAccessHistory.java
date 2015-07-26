package com.rms.loyalty.organization.user.model;

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
@Table(name = "useraccesshistory")
/*
 * This class is generated from the entity 'UserAccessHistory' defined in the HEDL
 * model.
 * 
 * Note: Any change made to this class will be overridden.
 */
public class UserAccessHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="userid", nullable=false)
	private long userId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="signindatetime", nullable=false)
	private Date signinDatetime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="signoutdatetime", nullable=false)
	private Date signoutDatetime;
	
	@Column(name="userip", nullable=false)
	private String userIp;
	
	@Column(name="useragent", nullable=false)
	private String userAgent;
	
	@Column(name="gpslat", nullable=false)
	private double gpsLat;
	
	@Column(name="gpslon", nullable=false)
	private double gpsLon;
	
	@Column(name="gpsaccuracy", nullable=false)
	private double gpsAccuracy;
	
	/**
	 * <p>
	 * Default constructor. Only used by JPA.
	 * </p>
	 * <p>
	 * This constructor is marked as deprecated because it must never be used directly.
	 * </p>
	 */
	@Deprecated
	public UserAccessHistory() {
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
	public UserAccessHistory(long userId, Date signinDatetime, Date signoutDatetime, String userIp, String userAgent, double gpsLat, double gpsLon, double gpsAccuracy) {
		super();
		if (signinDatetime == null) {
			throw new IllegalArgumentException("'signinDatetime' must not be null.");
		}
		if (signoutDatetime == null) {
			throw new IllegalArgumentException("'signoutDatetime' must not be null.");
		}
		if (userIp == null) {
			throw new IllegalArgumentException("'userIp' must not be null.");
		}
		if (userAgent == null) {
			throw new IllegalArgumentException("'userAgent' must not be null.");
		}
		this.userId = userId;
		this.signinDatetime = signinDatetime;
		this.signoutDatetime = signoutDatetime;
		this.userIp = userIp;
		this.userAgent = userAgent;
		this.gpsLat = gpsLat;
		this.gpsLon = gpsLon;
		this.gpsAccuracy = gpsAccuracy;
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
	 * Returns the value of property 'userId'.
	 */
	public long getUserId() {
		return userId;
	}
	
	/**
	 * Sets the value of property 'userId'.
	 */
	public void setUserId(long newValue) {
		this.userId = newValue;
	}
	
	/**
	 * Returns the value of property 'signinDatetime'.
	 */
	public Date getSigninDatetime() {
		return signinDatetime;
	}
	
	/**
	 * Sets the value of property 'signinDatetime'.
	 */
	public void setSigninDatetime(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'signinDatetime' must not be null.");
		}
		this.signinDatetime = newValue;
	}
	
	/**
	 * Returns the value of property 'signoutDatetime'.
	 */
	public Date getSignoutDatetime() {
		return signoutDatetime;
	}
	
	/**
	 * Sets the value of property 'signoutDatetime'.
	 */
	public void setSignoutDatetime(Date newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'signoutDatetime' must not be null.");
		}
		this.signoutDatetime = newValue;
	}
	
	/**
	 * Returns the value of property 'userIp'.
	 */
	public String getUserIp() {
		return userIp;
	}
	
	/**
	 * Sets the value of property 'userIp'.
	 */
	public void setUserIp(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'userIp' must not be null.");
		}
		this.userIp = newValue;
	}
	
	/**
	 * Returns the value of property 'userAgent'.
	 */
	public String getUserAgent() {
		return userAgent;
	}
	
	/**
	 * Sets the value of property 'userAgent'.
	 */
	public void setUserAgent(String newValue) {
		if (newValue == null) {
			throw new IllegalArgumentException("'userAgent' must not be null.");
		}
		this.userAgent = newValue;
	}
	
	/**
	 * Returns the value of property 'gpsLat'.
	 */
	public double getGpsLat() {
		return gpsLat;
	}
	
	/**
	 * Sets the value of property 'gpsLat'.
	 */
	public void setGpsLat(double newValue) {
		this.gpsLat = newValue;
	}
	
	/**
	 * Returns the value of property 'gpsLon'.
	 */
	public double getGpsLon() {
		return gpsLon;
	}
	
	/**
	 * Sets the value of property 'gpsLon'.
	 */
	public void setGpsLon(double newValue) {
		this.gpsLon = newValue;
	}
	
	/**
	 * Returns the value of property 'gpsAccuracy'.
	 */
	public double getGpsAccuracy() {
		return gpsAccuracy;
	}
	
	/**
	 * Sets the value of property 'gpsAccuracy'.
	 */
	public void setGpsAccuracy(double newValue) {
		this.gpsAccuracy = newValue;
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
		UserAccessHistory other = (UserAccessHistory) obj;
		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("UserAccessHistory-");
		result.append(getId());
		result.append(" [");
		result.append("userId = ");
		result.append(getUserId());
		result.append(", ");
		result.append("signinDatetime = ");
		result.append(getSigninDatetime());
		result.append(", ");
		result.append("signoutDatetime = ");
		result.append(getSignoutDatetime());
		result.append(", ");
		result.append("userIp = ");
		result.append(getUserIp());
		result.append(", ");
		result.append("userAgent = ");
		result.append(getUserAgent());
		result.append(", ");
		result.append("gpsLat = ");
		result.append(getGpsLat());
		result.append(", ");
		result.append("gpsLon = ");
		result.append(getGpsLon());
		result.append(", ");
		result.append("gpsAccuracy = ");
		result.append(getGpsAccuracy());
		result.append("]");
		return result.toString();
	}
}
