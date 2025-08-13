package arrayojava;

public class Program8 {
		public static void main(String[] args) {
			int [] val= {13,10,15,18,16,17};
			int sum=0;
			for(int i = 0; i<val.length; i++) {
				if(val[i]%2==0) {
					sum=sum+val[i];
				}
			}
			System.out.println("sum of even number is : " + sum);
		}
}
