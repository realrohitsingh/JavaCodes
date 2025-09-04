package oops;

public class Delta {
	int a;
	{
		a=100;
	}
	public static void main(String[] args) {
		Delta ref=new Delta(); // Object calling
		System.out.println(ref.a);
	}
}
