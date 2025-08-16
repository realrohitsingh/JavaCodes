package arrayojava;

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int [] arr = new int[size];
		int large = arr[0];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("=============");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=large) {
				large=arr[i];
			}
		}
		System.out.println("Array Largest : "+large);
		scn.close();
	}
}