package com;

public class Program9 {
	static void substraction(int c, int d) {
		int sum=c-d;
		System.out.println(c+" + "+d+" = "+sum);
	}
	static void addition(int a, int b) {
		int sum=a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	public static void main(String[] args) {
		addition(12, 13);
		substraction(31, 30);
	}
}
