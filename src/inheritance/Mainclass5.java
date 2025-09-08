package inheritance;

class X{
	void test() {
		System.out.println("Executing test()....");
	}
}

class Y extends X{
	void disp() {
		System.out.println("Executing disp");
	}
}

class Z extends X{
	void play() {
		System.out.println("Executing play().....");
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		X x1=new X();
		x1.test();
		System.out.println("---------------");
		Y y1=new Y();
		y1.test();
		y1.disp();
		System.out.println("---------------");
		Z z1=new Z();
		z1.test();
		z1.play();
	}
}
