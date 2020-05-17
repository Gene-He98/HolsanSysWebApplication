package com.model;

import java.sql.Date;

public class User {
	private String userID;//手机号
	private String userName;//用户名
	private String userPass;//用户密码
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPass() {
		return userPass;
	}
	
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	@Override
	public String toString() {
		return "User [userID=" + userID 
				+ ", userName=" + userName + "]";
	}
}
