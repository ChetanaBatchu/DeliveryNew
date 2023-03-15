package com.deliveryservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = DeliveryNotFoundException.class)
	public ResponseEntity<String> deliveryNotFound(DeliveryNotFoundException e) {
		return new ResponseEntity<>("Delivery Not Found", HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = DeliveryAlreadyExistsException.class)
	public ResponseEntity<String> deliveryAlreadyExists( DeliveryAlreadyExistsException e) {
		return new ResponseEntity<>(" Delivery Already Exists", HttpStatus.NOT_FOUND);
}
}
