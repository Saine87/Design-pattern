package org.abstractFactory.product;

public class ConcreteProduct2 extends AbstractProduct {
	
	private final String name = "Product2";

	/**
	 * gets product name
	 * 
	 * @return	Product name
	 * 
	 */
	@Override
	public String getName() {
		return this.name ;
	}


}
