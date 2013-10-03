package org.abstractFactory.product;

public class ConcreteProduct1 extends AbstractProduct {

	private final  String name = "Product1";

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
