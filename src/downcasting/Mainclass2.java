package downcasting;

class Alpha{
	void play() {
		System.out.println("Executing play().....");
	}
}

class Beta extends Alpha{
	void test() {
		System.out.println("Executing test().....");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		System.out.println("Execuitng Super Class");
		System.out.println(" ");
		Alpha a=new Beta();
		a.play();
		Beta b=(Beta)a; //DOWNCASTING : Alpha-->Beta
		System.out.println(" ");
		System.out.println("Execuitng Supperclass and Subclass");
		System.out.println(" ");
		b.play();
		b.test();
	}
}
