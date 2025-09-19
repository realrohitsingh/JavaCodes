package hasarelationship;

class Printer {
	void print(String arg) {
		System.out.println(arg);
	}

	void print(int arg) {
		System.out.println(arg);
	}

	void print(double arg) {
		System.out.println(arg);
	}
}

class Computer {
	static Printer out = new Printer();
}

public class Mainclass7 {
	public static void main(String[] args) {
		Computer.out.print("ABC");
		Computer.out.print(10);
		Computer.out.print(4.5);
	}
}
