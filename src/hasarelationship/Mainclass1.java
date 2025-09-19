package hasarelationship;

class Demo {
	void test() {
		System.out.println("Executing Test()......");
	}
}

class Sample {
	Demo d = new Demo();
}

public class Mainclass1 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.d.test();
	}
}
