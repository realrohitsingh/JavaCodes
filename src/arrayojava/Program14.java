package arrayojava;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int [] arr = new int[size];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("==============");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
