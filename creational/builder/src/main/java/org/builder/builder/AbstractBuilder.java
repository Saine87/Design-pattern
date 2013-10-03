package org.builder.builder;

import org.builder.product.AbstractProduct;
import org.builder.product.Product;

public abstract class AbstractBuilder {
	
	AbstractProduct prod = new Product();
	
	public abstract void buildA();
	public abstract void buildB();
	
	public AbstractProduct getProduct(){
		return prod;
	}

}
