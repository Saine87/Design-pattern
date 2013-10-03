package org.builder.builder;


public class ConcreteBuilderA extends AbstractBuilder {

	public void buildA() {
		super.prod.buildA("ConcreteBuilderA builds part A");	
	}

	public void buildB() {
		super.prod.buildB("ConcreteBuilderA builds part B");	
	}

}
