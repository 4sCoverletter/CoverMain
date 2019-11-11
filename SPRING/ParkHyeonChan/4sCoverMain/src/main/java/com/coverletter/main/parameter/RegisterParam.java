package com.coverletter.main.parameter;

import org.springframework.stereotype.Repository;

@Repository
public class RegisterParam extends ParamObject {
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userPasswordRepeat;
	
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPasswordRepeat() {
		return userPasswordRepeat;
	}
	public void setUserPasswordRepeat(String userPasswordRepeat) {
		this.userPasswordRepeat = userPasswordRepeat;
	}
	
}
