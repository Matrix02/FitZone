package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)

public class RunTimeExceptionMsg extends RuntimeException{
	
	public RunTimeExceptionMsg(String exceptionMsg) {
		super(exceptionMsg);
	}

}
