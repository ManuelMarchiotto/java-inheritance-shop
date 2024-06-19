package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	private static final boolean True = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Scanner object	
		Scanner scanner = new Scanner(System.in); 
		
		String userProdName;
		String userProdInfo;
		int userProdPrice;
		int userProdIva;
		
		
		 
		
//	    System.out.println("Enter the product name");
//	    userProdName = scanner.nextLine();
//	    System.out.println("Enter the product detils");
//	    userProdInfo = scanner.nextLine();
//	    System.out.println("Enter the product Price");
//	    userProdPrice = scanner.nextInt();
//	    System.out.println("Enter the product IVA");
//	    userProdIva = scanner.nextInt();
//
//		Prodotto userProd = new Prodotto(userProdName, userProdInfo, userProdPrice, userProdIva);
//		System.out.println("--------------------------------------");
//		System.out.println(userProd.getProductName());
//		System.out.println(userProd.getProductDescription());
//		System.out.println(userProd.getPrice());
//		System.out.println(userProd.vatPriceAndCurrency());
//		System.out.println(userProd.fullName());
//		System.out.println("--------------------------------------");
		
		
		
		Smartphone userCell = new Smartphone("IPhone", "Mela", 1000, 22, 11);
		System.out.println("--------------------------------------");
		System.out.println(userCell.getProductName());
		System.out.println(userCell.getProductDescription());
		System.out.println(userCell.getPrice());
		System.out.println(userCell.vatPriceAndCurrency());
		System.out.println(userCell.fullName());
		System.out.println(userCell.getIMECode());
		System.out.println("--------------------------------------");
		
		
		TV userTV = new TV("Samsung", "SG", 1000, 22, True);
		System.out.println("--------------------------------------");
		System.out.println(userTV.getProductName());
		System.out.println(userTV.getProductDescription());
		System.out.println(userTV.getPrice());
		System.out.println(userTV.vatPriceAndCurrency());
		System.out.println(userTV.fullName());
		System.out.println(userTV.getSmartTV());
		System.out.println("--------------------------------------");
		
		Headphones userHeadphones = new Headphones("Samsung", "SG", 1000, 22, false);
		System.out.println("--------------------------------------");
		System.out.println(userHeadphones.getProductName());
		System.out.println(userHeadphones.getProductDescription());
		System.out.println(userHeadphones.getPrice());
		System.out.println(userHeadphones.vatPriceAndCurrency());
		System.out.println(userHeadphones.fullName());
		System.out.println(userHeadphones.getWireless());
		System.out.println("--------------------------------------");
		
	}
}
