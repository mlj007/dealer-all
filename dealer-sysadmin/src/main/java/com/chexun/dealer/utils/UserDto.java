package com.chexun.dealer.utils;

import java.io.Serializable;

public class UserDto implements Serializable {
	private static final long serialVersionUID = -3009400352750660830L;
	private String userId;
	private String userName;
	private String email;
	private String phone;
	private String groupId;
	private String bbsUserId;
	
	public UserDto(){}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getBbsUserId() {
		return bbsUserId;
	}

	public void setBbsUserId(String bbsUserId) {
		this.bbsUserId = bbsUserId;
	}
}
