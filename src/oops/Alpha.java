package oops;

public class Alpha {
	static int num;
	static {
		num = 10;
	}
	static {
		num = 20;
	}
	static {
		num = 30;
	}

	public static void main(String[] args) {
		System.out.println(Alpha.num);
	}
}
