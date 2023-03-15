package com.deliveryservice.exceptions;

public class DeliveryNotFoundException  extends Exception{
	private static final long serialVersionUID = 1L;

	public DeliveryNotFoundException(String message) {
		super(message);
	}

	public DeliveryNotFoundException() {}


}
