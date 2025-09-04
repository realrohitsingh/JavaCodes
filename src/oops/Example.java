package oops;

public class Example {
	int a;
	double b;
	char c;
	{
		a=10;
		b=1.5;
		c='Z';
	}
	public static void main(String[] args) {
		Example obj = new Example();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}
