package org.abstractFactory.factory;

import org.abstractFactory.exception.MyException;
import org.abstractFactory.product.AbstractProduct;

public abstract class AbstractFactory {
	
	public final static String factory1 = "ConcreteFactory1";
	public final static String factory2 = "ConcreteFactory2";
	
	
	/**
	 * getInstance Method return a concrete factory class based on the name of the factory
	 *  passed by the client. If the name doesn't exist an exception is thrown.
	 * 
	 * @param name	Concrete Factory name
	 * @return		Concrete Factory instance
	 * @throws Exception
	 */
	public static AbstractFactory getInstance(String name) throws MyException{
		
		switch(name){
			case AbstractFactory.factory1:
				return (new ConcreteFactory1());
			case AbstractFactory.factory2:
				return (new ConcreteFactory2());
			default:
				throw new MyException();	
		}
	}
	
	/**
	 * 
	 * @return Name of the factory
	 */
	public abstract String getName();
	
	
	/**
	 * getProduct is a method that must be overridden by AbastractFactory subclasses and must return the 
	 * product managed by the ConcreteFactory
	 * 
	 * @return a Product based on the Concrete Factory implementation
	 */
	public abstract AbstractProduct getProduct();

}
