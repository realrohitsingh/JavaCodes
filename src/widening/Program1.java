package widening;

public class Program1 {
	public static void main(String[] args) {
		int a=10;
		double b=a;
		System.out.println(b);
		
		System.out.println("-------------");
		
		char c='A';
		int d=c;
		System.out.println(d);
		
		System.out.println("-------------");
		
		long e=456789L;
		float f=e;
		System.out.println(f);
	}
}
