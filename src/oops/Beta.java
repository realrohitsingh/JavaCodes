package oops;

public class Beta {
	static int val;
	static {
		System.out.println("Executing static block-1");
		val = 50;
	}
	static {
		System.out.println("Executing static block-2");
		val = 50;
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println(Beta.val);
		System.out.println("Program Ends");
	}
}
