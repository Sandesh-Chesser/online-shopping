package com.sandesh.onlineshopping.exception;

public class ProductNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	private String message;
	
	public ProductNotFoundException() {
		this("Product not available");
	}

	public ProductNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
