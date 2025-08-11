package com;

public class Program12 {
	static double play() {
		return 2.3;
	}
	public static void main(String[] args) {
		double d=play();
		System.out.println("Returned Value : "+d);
		
		System.out.println("Returned Value : "+play());
	}
}
