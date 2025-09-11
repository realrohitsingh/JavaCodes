package instanceOf;

public class SoftwareEngineer {
	void meeting() {
		System.out.println("Software Engineer in Meeting");
	}
}

class Developer extends SoftwareEngineer {
	void coding() {
		System.out.println("Developer is Coding");
	}
}

class Tester extends SoftwareEngineer {
	void testing() {
		System.out.println("Tester is Testing");
	}
}
