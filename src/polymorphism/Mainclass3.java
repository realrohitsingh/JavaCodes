package polymorphism;

class Launcher {
	void open(int a) {
		System.out.println("Google Chrome");
	}

	void open(double d) {
		System.out.println("Mozilla Firefox");
	}

	void open(String s) {
		System.out.println("Microsoft Edge");
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		Launcher ref = new Launcher();
		ref.open(10);
		ref.open(1.0);
		ref.open("abc");
	}
}
