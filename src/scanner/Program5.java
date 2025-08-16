package scanner;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println(ch+" It is an alphabet");
		}
		else {
			System.out.println(ch+" Not an Alphabet");
		}
		scn.close();
	}
}
