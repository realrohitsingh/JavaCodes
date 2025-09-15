package methodoverriding;

class Whatsapp1 {
	void deliveryReport() {
		System.out.println("Sent");
	}
}

class Whatsapp2 extends Whatsapp1 {
	@Override
	void deliveryReport() {
		System.out.println("Sent,Delivered");
	}
}

class Whatsapp3 extends Whatsapp2 {
	@Override
	void deliveryReport() {
		System.out.println("Sent,Delivered,Seen");
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Whatsapp1 ref = new Whatsapp2();
		ref.deliveryReport();
	}
}
