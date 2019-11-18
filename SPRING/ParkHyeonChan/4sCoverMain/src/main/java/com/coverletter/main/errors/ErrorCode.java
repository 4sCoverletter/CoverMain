package com.coverletter.main.errors;

public enum ErrorCode {
	EmptyPropFound("L01", "Property Must Not Be Empty"),
	DuplicatedIdFound("L02", "Duplicated Id");
	private String errorCode;
	private String description;
	
	private ErrorCode(String errorCode, String description) {
		this.errorCode = errorCode;
		this.description = description;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getDescription() {
		return description;
	}
	
	
}
