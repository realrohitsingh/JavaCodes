package searching;

public class Program1 {
	public static void main(String[] args) {
		int [] arr= {13,12,14,12,15,18,16};
		int value = 19;
		boolean flag = false;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == value) {
				System.out.println(value+" found at index "+i);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println(value+" Not Found");
		}
	}
}
