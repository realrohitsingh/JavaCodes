package arrayojava;

public class program7 {
	public static void main(String[] args) {
		int [] arr = {17,18,45,7};
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.println("Array Sum is : " +sum);
	}
}
