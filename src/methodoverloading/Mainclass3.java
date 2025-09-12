package methodoverloading;
// Sequence of Arguments
class Example {
	void eat(int a, String s) {
		System.out.println("Veg Food");
	}

	void eat(String s, int a) {
		System.out.println("Non-Veg Food");
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		Example ex = new Example();
		ex.eat(10, "abc");
		ex.eat("abc", 10);
	}
}
