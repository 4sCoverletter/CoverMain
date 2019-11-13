package com.coverletter.main.parameter;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonInclude;

@Repository
public class RegisterParam extends ParamObject {
	@NotNull
	private String userName;
	@NotNull
	private String userEmail;
	@NotNull
	private String userPassword;
	@NotNull
	@JsonInclude(JsonInclude.Include.NON_NULL)
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
