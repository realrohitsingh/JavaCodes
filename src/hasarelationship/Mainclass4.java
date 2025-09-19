package hasarelationship;

class Camera {
	void photo() {
		System.out.println("Clicked a Photo");
	}
}

class SimCard {
	void services() {
		System.out.println("Calling and etc");
	}
}

class Mobile {
	Camera cam = new Camera();
	SimCard sim;

	Mobile(SimCard sim) {
		this.sim = sim;
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		SimCard airtel = new SimCard();
		SimCard jio = new SimCard();
		Mobile mob = new Mobile(jio);
		mob.cam.photo();
		mob.sim.services();
	}
}
