package methodoverriding;

class Father {
	void motorCycle() {
		System.out.println("Normal");
	}
}

class Gunda extends Father {
	@Override
	void motorCycle() {
		System.out.println("AbNormal");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Father ref = new Gunda();
		ref.motorCycle(); // UPCASTING
	}
}
