package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	protected int IMECode;
	
	public Smartphone(String productName, String productDescription, int productPrice, int vat , int IMECode) {
		super(productName, productDescription, productPrice, vat);
		
		this.IMECode = IMECode;
	}
	
	public void setIMECode(int IMECode) {
		this.IMECode = IMECode;
	}
	
	public int getIMECode() {
		return IMECode;
	}
		
}
