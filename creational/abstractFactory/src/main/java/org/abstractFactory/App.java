package org.abstractFactory;

import org.abstractFactory.exception.MyException;
import org.abstractFactory.factory.AbstractFactory;
import org.abstractFactory.product.AbstractProduct;


public class App {
	
    public static void main( String[] args ) throws MyException{
    	
    	AbstractFactory factory1 = AbstractFactory.getInstance(AbstractFactory.factory1);
    	AbstractProduct product1 = factory1.getProduct();
    	System.out.println("Factory " + AbstractFactory.factory1 + " instantiates product " + product1.getName());
    	
    	AbstractFactory factory2 = AbstractFactory.getInstance(AbstractFactory.factory2);
    	AbstractProduct product2 = factory2.getProduct();
    	System.out.println("Factory " + AbstractFactory.factory2 + " instantiates product " + product2.getName());
    	
        // AbstractFactory factory3 = AbstractFactory.getInstance("XXXXXXXX"); throw Exception 

        
    }
    
}
