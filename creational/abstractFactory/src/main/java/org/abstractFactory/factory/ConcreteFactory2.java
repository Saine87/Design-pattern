package org.abstractFactory.factory;

import org.abstractFactory.product.AbstractProduct;
import org.abstractFactory.product.ConcreteProduct2;

public class ConcreteFactory2 extends AbstractFactory{
	
	private final AbstractProduct p;
	
	/**
	 * CreateFactory constructor. It instantiates a new concrete product.
	 */
	public ConcreteFactory2(){
		p = new ConcreteProduct2();
		
	}

	/**
	 * gets a concrete product
	 * 
	 * @return	Concrete product
	 */
	@Override
	public AbstractProduct getProduct() {
		// TODO Auto-generated method stub
		return p;
	}

	
	/**
	 * 
	 * @return	name of the factory
	 */
	@Override
	public String getName() {
		return AbstractFactory.factory2;
	}

}
