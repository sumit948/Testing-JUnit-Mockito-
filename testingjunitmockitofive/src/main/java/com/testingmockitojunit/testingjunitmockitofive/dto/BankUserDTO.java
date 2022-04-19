package com.testingmockitojunit.testingjunitmockitofive.dto;

public class BankUserDTO {
	private Long userId;
	
	private String userName;
	
	private String userEmail;
	
	private Boolean isAvailable;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "BankUserDTO [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	
}
