package org.builder.builder;

public class ConcreteBuilderB extends AbstractBuilder{

	public void buildA() {
		super.prod.buildA("ConcreteBuilderB builds part A");	
	}

	public void buildB() {
		super.prod.buildB("ConcreteBuilderB builds part B");	
	}


}
