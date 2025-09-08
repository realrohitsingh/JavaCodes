package inheritance;

class Whatsapp1{
	void message() {
		System.out.println("Message");
	}
}

class Whatsapp2 extends Whatsapp1{
	void call() {
		System.out.println("Call");
	}
}

class Whatsapp3 extends Whatsapp2{
	void status() {
		System.out.println("Starts");
	}
}

public class CodeReuablity2 {
	public static void main(String[] args) {
		Whatsapp3 obj=new Whatsapp3();
		obj.message();
		obj.call();
		obj.status();
	}
}
