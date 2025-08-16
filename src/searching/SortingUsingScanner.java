package searching;

import java.util.Scanner;

public class SortingUsingScanner {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int size = scn.nextInt();
		int[] arr = new int[size];
		System.out.println("==================");
		System.out.println("Enter " + size + " number:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println("==================");
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	}
}
