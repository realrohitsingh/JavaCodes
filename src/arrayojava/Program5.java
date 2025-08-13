package arrayojava;

public class Program5 {
	public static void main(String[] args) {
		int [] arr = {12,17,19,24,28,37,47};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
