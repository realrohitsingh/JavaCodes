package arrayojava;

public class Program9 {
	public static void main(String[] args) {
		int [] val= {13,10,15,18,16,17};
		int sum = 0;
		for(int i=0; i<val.length; i++) {
			sum=sum+val[i];
		}
		int average = sum/val.length;
		System.out.println("Array Average is : "+average);
	}
}
