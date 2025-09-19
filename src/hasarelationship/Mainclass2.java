package hasarelationship;

class Alpha {
	void play() {
		System.out.println("Executing Play().....");
	}
}

class Beta {
	Alpha a;

	Beta(Alpha a) {
		this.a = a;
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Alpha a = new Alpha();
		Beta b = new Beta(a);
		b.a.play();
	}
}
