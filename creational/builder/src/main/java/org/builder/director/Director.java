package org.builder.director;

import org.builder.builder.AbstractBuilder;
import org.builder.product.AbstractProduct;

public class Director {

	AbstractBuilder builder;
	
	public void setBuilder(AbstractBuilder builder) {
		this.builder = builder;	
	}

	public void constructProduct() {
		builder.buildA();
		builder.buildB();		
	}

	public AbstractProduct getProduct() {
		return builder.getProduct();
	}

}
