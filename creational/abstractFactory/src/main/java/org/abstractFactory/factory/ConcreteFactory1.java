package org.abstractFactory.factory;

import org.abstractFactory.product.AbstractProduct;
import org.abstractFactory.product.ConcreteProduct1;

public class ConcreteFactory1 extends AbstractFactory {
	
	private AbstractProduct p;
	
	
	/**
	 * CreateFactory constructor. It instantiates a new concrete product.
	 */
	public ConcreteFactory1(){
		p = new ConcreteProduct1();
	}

	
	
	/**
	 * gets a concrete product
	 * 
	 * @return	Concrete product
	 */
	@Override
	public AbstractProduct getProduct() {
		return p;
	}


	/**
	 * @return 	Name of the factory
	 */
	@Override
	public String getName() {
		return AbstractFactory.factory1;
	}

}
