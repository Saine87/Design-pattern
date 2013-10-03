package org.abstractFactory;

import org.abstractFactory.exception.MyException;
import org.abstractFactory.factory.AbstractFactory;
import org.abstractFactory.product.AbstractProduct;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * test case Concrete Factory 1
     *
     * @throws Exception 
     */
	public void testConcreteFactory1() throws MyException{
		
		// Check correct instantiation of the factory
		AbstractFactory factory1 = AbstractFactory.getInstance(AbstractFactory.factory1);
		assertEquals(AbstractFactory.factory1, factory1.getName());
		assertNotSame(AbstractFactory.factory2, factory1.getName());
		
		// Check correct instantiation of product1 
		AbstractProduct product1 = factory1.getProduct();
		assertEquals(AbstractProduct.product1, product1.getName());
		assertNotSame(AbstractProduct.product2, product1.getName());

	}

	
    /**
     * test case Concrete Factory 2
     *
     * @throws Exception 
     */
	public void testConcreteFactory2() throws MyException{
		
		// Check correct instantiation of the factory
		AbstractFactory factory2 = AbstractFactory.getInstance(AbstractFactory.factory2);
		assertEquals(AbstractFactory.factory2, factory2.getName());
		assertNotSame(AbstractFactory.factory1, factory2.getName());
		
		// Check correct instantiation of product2 
		AbstractProduct product2 = factory2.getProduct();
		assertEquals(AbstractProduct.product2, product2.getName());
		assertNotSame(AbstractProduct.product1, product2.getName());

	}
	
	
	public void testException(){
		
		Exception ex = null;
				
		try {
			AbstractFactory.getInstance("None");
		} catch (Exception e) {
			ex = e;
		}
		
		assertTrue(ex instanceof  MyException);
		
	}
}
