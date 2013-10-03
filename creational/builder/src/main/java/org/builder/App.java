package org.builder;

import org.builder.builder.AbstractBuilder;
import org.builder.builder.ConcreteBuilderA;
import org.builder.builder.ConcreteBuilderB;
import org.builder.director.Director;
import org.builder.product.AbstractProduct;



public class App {
	
	
    public static void main( String[] args ){
    	
    	System.out.println("Director should use ConcreteBuilderA to build part A and B of Product object:");
    	start(new Director(), new ConcreteBuilderA());
    	System.out.println("\nDirector should use ConcreteBuilderB to build part A and B of Product object: ");
    	start(new Director(), new ConcreteBuilderB());	

    }
    
    public static void start(Director director, AbstractBuilder builder){
    	
    	director.setBuilder(builder);
    	director.constructProduct();
    	
    	System.out.println("   - " + director.getProduct().getBa());
    	System.out.println("   - " + director.getProduct().getBb());
    	
    }
    
    
}
