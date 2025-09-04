package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Flipkart {
	static void showProductDetails(Product p) {
		if(p!=null) {
			System.out.println("Product id : "+p.pid);
			System.out.println("Prodcut price : "+p.price);
		}
	}
	static Product createProduct() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter ProductID");
		int pid=scn.nextInt();
		System.out.println("Enter Product Price");
		double price=scn.nextDouble();
		Product p=new Product(pid,price);
		return p;
	}
}
