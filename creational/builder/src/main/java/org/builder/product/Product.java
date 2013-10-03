package org.builder.product;

public class Product implements AbstractProduct {
	
	private String ba;
	private String bb;

	public void buildA(String build) {
		this.setBa(build);
	}

	public void buildB(String build) {
		this.setBb(build);
	}

	public String getBa() {
		return ba;
	}

	public void setBa(String ba) {
		this.ba = ba;
	}

	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

}
