package inheritance;

class A1{
	void test() {
		System.out.println("Executin test()....");
	}
}

class B1 extends A{
	void disp() {
		System.out.println("Executing disp().....");
	}
}

class C1 extends B{
	void play() {
		System.out.println("Executing play().....");
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.test();
		System.out.println("---------------");
		B1 b1=new B1();
		b1.test();
		b1.disp();
		System.out.println("---------------");
		C1 c1=new C1();
		c1.test();
		c1.disp();
		c1.play();
	}
}
