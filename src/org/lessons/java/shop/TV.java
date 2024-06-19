package org.lessons.java.shop;

public class TV extends Prodotto{
	private boolean smartTV;
	
	public TV(String productName, String productDescription, int productPrice, int vat , boolean smartTV) {
		super(productName, productDescription, productPrice, vat);
		
		this.smartTV = smartTV;
	}
	
	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	public boolean getSmartTV() {
		return smartTV;
	}
	
}
