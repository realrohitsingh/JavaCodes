package arrayojava;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Create one Array");
		int size = scn.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter your array values");
		for(int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("=================");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
