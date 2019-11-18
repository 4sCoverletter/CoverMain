package com.coverletter.main.errors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

import lombok.Getter;

public class ErrorResponse {
	private String msg;
	private String status;
	private String code;
	private String description;
	
	private ErrorResponse(String msg, HttpStatus status, ErrorCode code) {
		this.status = status.toString();
		this.code = code.getErrorCode();
		this.description = code.getDescription();
		this.msg = msg;
	}
	
	public static ErrorResponse of(BindingResult res, HttpStatus status, ErrorCode code) {
		return new ErrorResponse(res.getAllErrors().get(0).getDefaultMessage(), status, code);
	}
	
	public static ErrorResponse of(String msg, HttpStatus status, ErrorCode code) {
		return new ErrorResponse(msg, status, code);
	}

	public String getMsg() {
		return msg;
	}

	public String getStatus() {
		return status;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
