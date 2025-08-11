package com;

public class Example4 {
	static boolean findPrimeNumber(int num) {
		int a = 1;
		int count = 0;
		while(a<=num/2) {
			if(num%a==0) {
				count++;
			}
			a++;
		}
		if(count==1) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			boolean isPrime=findPrimeNumber(i);
			if(isPrime==true) {
				System.err.println(i);
			}
		}
	}
}