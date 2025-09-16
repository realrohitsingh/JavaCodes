package polymorphism;

class Flipkart {
	void payment() {
		System.out.println("C.O.D");
	}

	void payment(long card) {
		System.out.println("CARD : 10% Discount");
	}

	void payment(String upi) {
		System.out.println("UPI : 50% Cashback");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Flipkart obj = new Flipkart();
		obj.payment();
		obj.payment(1234123412341234L);
		obj.payment("GPAY");
	}
}
