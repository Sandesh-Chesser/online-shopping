package com.sandesh.onlineshopping.exception;

public class CategoryNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	private String message;
	
	public CategoryNotFoundException() {
		this("Category not available");
	}

	public CategoryNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
