package widening;

public class Program3 {
	public static void main(String[] args) {
		double p=4.5;
		int q=(int)p;
		System.out.println(q); // double---->int
		
		int x=65;
		char z=(char)x;
		System.out.println(z); // int ---->char
		
		float i=3.7F;
		long l=(long)i;
		System.out.println(l); // float --->long
	}
}
