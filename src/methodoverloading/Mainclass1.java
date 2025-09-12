package methodoverloading;
// Type of Arguments
class Demo{
	void play(int a) {
		System.out.println("BGMI");
	}
	void play(double d) {
		System.out.println("Valorant");
	}
	void play(String s) {
		System.out.println("Counter Strike");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Demo ref=new Demo();
		ref.play(10);
		ref.play(1.0);
		ref.play("abc");
	}
}
