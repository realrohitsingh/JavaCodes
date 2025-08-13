package arrayojava;

public class Program12 {
	public static void main(String[] args) {
		int [] arr = {17,24,20,27,5,14};
		int small = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("Array Smallest : "+small);
	}
}
