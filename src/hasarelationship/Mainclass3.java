package hasarelationship;

class Engine {
	void power() {
		System.out.println("Executing Power()....");
	}
}

class Driver {
	void drive() {
		System.out.println("Executing Driver()....");
	}
}

class Car {
	Engine eng = new Engine(); // Car Has-A Engine : Composition
	Driver dr;

	Car(Driver dr) {
		this.dr = dr;
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		Driver dr = new Driver();
		Car c = new Car(dr);
		c.eng.power();
		c.dr.drive();
	}
}
