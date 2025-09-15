package methodoverriding;

class Parent {
	void watchTV() {
		System.out.println("NEWS/SERIAL");
	}
}

class Child extends Parent {
	@Override
	void watchTV() {
		System.out.println("MOVIES/SERIES");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.watchTV();
		System.out.println("================");
		Child c = new Child();
		c.watchTV();
		Parent ref = new Child(); // UPCASTING
		ref.watchTV();
	}
}
