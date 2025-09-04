package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Bank {
	static void showAccountInfo(Account a) {
		if(a!=null) {
			System.out.println("Account Number : "+a.accountNumnber);
			System.out.println("Account Balance : "+a.accountBalance);
		}
	}
	static Account createAccount() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Account Number");
		long accountNumber=scn.nextLong();
		System.out.println("Enter Account Balance");
		double accountBalance=scn.nextDouble();
		Account a=new Account(accountNumber,accountBalance);
		return a;
	}
}
