package oops;

public class Program1 {
	static int x;
	static double y;
	static char z;

	static {
		x = 18;
		y = 7.1;
		z = 'R';
	}

	public static void main(String[] args) {
		System.out.println(Program1.x);
		System.out.println(Program1.y);
		System.out.println(Program1.z);
	}
}
