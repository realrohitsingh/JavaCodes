package methodoverriding;

class Mother {
	void marriage() {
		System.out.println("Arranged Marriage");
	}
}

class Gundi extends Mother {
	@Override
	void marriage() {
		System.out.println("Love Marriage");
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		Mother m = new Mother();
		m.marriage();
		Gundi g = new Gundi();
		g.marriage();
		Mother ref = new Gundi();
		ref.marriage();
	}
}
