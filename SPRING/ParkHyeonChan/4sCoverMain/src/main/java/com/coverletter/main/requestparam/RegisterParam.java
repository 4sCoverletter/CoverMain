package com.coverletter.main.requestparam;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonInclude;

@Repository
public class RegisterParam extends ParamObject {
	/*
	 * @NotNull validation시 NotNull 체크
	 * @JsonInclude "NON_EMPTY" JsackSon의 ObjectMapper를 사용해 serialize시 null, List의 isEmpty() true시 제외하고 serialize
	 */
	@NotNull(message = "이름을 입력하세요.")
	private String userName;
	@NotNull(message = "이메일을 입력하세요.")
	private String userEmail;
	@NotNull(message = "패스워드를 입력하세요.")
	private String userPassword;
	@NotNull(message = "패스워드 확인을 입력하세요.")
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
