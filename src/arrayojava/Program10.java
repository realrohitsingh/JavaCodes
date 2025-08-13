package arrayojava;

public class Program10 {
	public static void main(String[] args) {
		double [] dArr = {5.11,5.10,5.11,5.7,5.8,5.6};
		double sum = 0;
		for(int i = 0; i<dArr.length; i++) {
			sum=sum+dArr[i];
		}
		double average=sum/dArr.length;
		System.out.println("Average Height : "+average);
	}
}