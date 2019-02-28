package org.diary.entity;

import java.io.Serializable;

/**
 * @author Twenty
 * @CreateDate 2019年2月27日
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userAccountName;
	private String userPassword;
	private String userType;
	private String userCreateDate;

	/**
	 * 
	 * @author Twenty
	 * @CreateDate 2019年2月28日
	 */
	public User() {
		super();
	}

	/**
	 * 
	 * @param userId
	 * @param userAccountName
	 * @param userPassword
	 * @param userType
	 * @param userCreateDate
	 * @author Twenty
	 * @CreateDate 2019年2月28日
	 */
	public User(String userId, String userAccountName, String userPassword, String userType, String userCreateDate) {
		super();
		this.userId = userId;
		this.userAccountName = userAccountName;
		this.userPassword = userPassword;
		this.userType = userType;
		this.userCreateDate = userCreateDate;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userAccountName
	 */
	public String getUserAccountName() {
		return userAccountName;
	}

	/**
	 * @param userAccountName the userAccountName to set
	 */
	public void setUserAccountName(String userAccountName) {
		this.userAccountName = userAccountName;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the userCreateDate
	 */
	public String getUserCreateDate() {
		return userCreateDate;
	}

	/**
	 * @param userCreateDate the userCreateDate to set
	 */
	public void setUserCreateDate(String userCreateDate) {
		this.userCreateDate = userCreateDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 * 
	 * @author Twenty
	 * 
	 * @CreateDate 2019年2月28日
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userAccountName=" + userAccountName + ", userPassword=" + userPassword
				+ ", userType=" + userType + ", userCreateDate=" + userCreateDate + "]";
	}

}
