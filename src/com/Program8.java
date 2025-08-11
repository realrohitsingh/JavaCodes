package com;

public class Program8 {
	static void connect(boolean bool) {
		System.out.println("Value Received : "+bool);
	}
	static void verify(char ch) {
		System.out.println("Value : "+ch);
	}
	public static void main(String[] args) {
		verify('Z');
		connect(false);
	}

}
