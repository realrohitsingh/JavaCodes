package constructor;

class Mainclass{
	int num;
	void play() {
		System.out.println("Executing Play()......");
	}
	Mainclass() {
		System.out.println("Executing Constructor");
		num=18;
	}
}
public class Delta{
	public static void main(String[] args) {
		Mainclass ref=new Mainclass();
		System.out.println(ref.num);
		ref.play();
	}
}