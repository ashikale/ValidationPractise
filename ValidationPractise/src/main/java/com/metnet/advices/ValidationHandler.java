package com.metnet.advices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.metnet.model.ValidationObject;

@RestControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		
		List<ValidationObject> validList = new ArrayList<>();
		ex.getBindingResult().getFieldErrors().stream().forEach(error->{
			ValidationObject vobject= ValidationObject.builder().messgase(error.getDefaultMessage())
					                                             .statusCode(status.value())
					                                             .time(new Date())
					                                             .build();
			
			validList.add(vobject);
			
		});
		
		return ResponseEntity.badRequest().body(validList);
	}

}
