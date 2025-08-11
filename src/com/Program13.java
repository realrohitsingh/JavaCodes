package com;

public class Program13 {
	static boolean help() {
		return true;
	}
	static char disc() {
		return 'A';
	}
	public static void main(String[] args) {
		char ch=disc();
		System.out.println("returned value : "+ch);
		System.out.println("returned value : "+help());
	}
}
