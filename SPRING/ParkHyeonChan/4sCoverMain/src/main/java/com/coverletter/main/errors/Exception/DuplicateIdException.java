package com.coverletter.main.errors.Exception;

import com.coverletter.main.errors.ErrorCode;

public class DuplicateIdException extends Exception {
	private String msg = "아이디가 중복 됩니다.";
	private String errorCode;
	public DuplicateIdException() {
		super();
		this.errorCode = ErrorCode.DuplicatedIdFound.getErrorCode();
	}
	public DuplicateIdException(String msg) {
		this();
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	
	
}
