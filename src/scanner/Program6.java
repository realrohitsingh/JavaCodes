package scanner;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Character");
		int num = scn.nextInt();
		if(num>='0' && num<='9') {
			System.out.println(num+" Char is Numeric");
		}
		else {
			System.out.println(num+" Char is not numeric");
		}
		scn.close();
	}
}
