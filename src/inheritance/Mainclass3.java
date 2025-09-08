package inheritance;

class A{
	void test() {
		System.out.println("Executin Test()....");
	}
}
class B extends A{
	void disp() {
		System.out.println("Executing disp()....");
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		A a1=new A();
		a1.test();
//		a1.disp(); Becaues it's inherited in unidirectional
		System.out.println("----------------");
		B b1=new B();
		b1.test();
		b1.disp();
	}
}
