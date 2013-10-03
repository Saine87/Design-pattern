package org.abstractFactory.exception;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7952399365844213717L;

	public MyException(){
		super("Error: Invalid concrete factory. Please Enter a valid ConcreteFactory"); 
	}	

}
