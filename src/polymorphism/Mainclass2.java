package polymorphism;

class Irctc {
	void search(int trainNo) {
		System.out.println("Train Details");
	}

	void search(String src, String dest) {
		System.out.println("Route Details");
	}

	void search(long pnr) {
		System.out.println("Ticket Details");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Irctc ref = new Irctc();
		ref.search(12235);
		ref.search("BLR", "JSR");
		ref.search(12345678123L);
	}
}
