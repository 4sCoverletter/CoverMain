package com.coverletter.main.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.coverletter.main.errors.Exception.DuplicateIdException;

@RestControllerAdvice(basePackages = {"com.coverletter.main.controller"})
public class APIControllerAdvice {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handlerRequestArgumentException(MethodArgumentNotValidException e) {
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		return new ResponseEntity<>(ErrorResponse.of(e.getBindingResult(), httpStatus, ErrorCode.EmptyPropFound), httpStatus);
	}
	
	@ExceptionHandler(DuplicateIdException.class)
	public ResponseEntity<ErrorResponse> handlerDuplicateIdException(DuplicateIdException e) {
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		return new ResponseEntity<>(ErrorResponse.of(e.getMsg(), httpStatus, ErrorCode.DuplicatedIdFound), httpStatus);
	}
}
