package com.healthfreedom.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.healthfreedom.model.ResponseDto;

@ControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(value = {ApiRequestException.class})
	public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
		
		ResponseDto respDto = new ResponseDto();
		respDto.setResponseCode("111");
		respDto.setResponseDescription(e.getMessage());
		HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		
		ApiException apiException =  new ApiException(
				e.getMessage(), 
				e, 
				HttpStatus.BAD_REQUEST, 
				ZonedDateTime.now());
		
		return new ResponseEntity<>(apiException, badRequest);
		
	}
}
