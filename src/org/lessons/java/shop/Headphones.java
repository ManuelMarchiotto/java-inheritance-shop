package org.lessons.java.shop;

public class Headphones extends Prodotto{
	private boolean wireless;
	
	public Headphones(String productName, String productDescription, int productPrice, int vat, boolean wireless) {
		super(productName, productDescription, productPrice, vat);
		
		this.wireless = wireless;
	}
	
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	public boolean getWireless() {
		return wireless;
	}
	
}
