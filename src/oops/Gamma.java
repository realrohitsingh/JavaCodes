package oops;

public class Gamma {
	int a;
	{
		a=100;
	}
	{
		a=200;
	}
	{
		a=300;
	}
	public static void main(String[] args) {
		Gamma g = new Gamma();
		System.out.println(g.a);
	}
}
