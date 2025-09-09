package widening;

class Demo{
	void play(float val) {
		System.out.println("Value : "+val);
	}
}

public class Program2 {
	public static void main(String[] args) {
		Demo ref=new Demo();
		ref.play(4.5F);
		ref.play(10); // Auto Widening : int ---> float
		ref.play('a');// Auto widening : char ---> float
	}
}
