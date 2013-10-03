package org.builder.product;

public interface AbstractProduct {
	
	public void buildA(String name);
	public void buildB(String name);
	
	public String getBa();
	public void setBa(String ba);
	public String getBb();
	public void setBb(String bb);

}
