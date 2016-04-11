package com.simple.calculator.operations.exception;

public class OperationNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public OperationNotFoundException(){
		super("Operation Not Found!");
	}
}
