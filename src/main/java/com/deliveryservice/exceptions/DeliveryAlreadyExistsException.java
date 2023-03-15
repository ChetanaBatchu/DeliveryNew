package com.deliveryservice.exceptions;

public class DeliveryAlreadyExistsException extends Exception{
	private static final long serialVersionUID = 1L;

	public DeliveryAlreadyExistsException(String message) {
		super(message);
	}

	public DeliveryAlreadyExistsException() {}


}
