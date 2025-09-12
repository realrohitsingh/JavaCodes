package methodoverloading;

class Flipkart{
	void payment() {
		System.out.println("Cash on Delivery");
	}
	void payment(long l) {
		System.out.println("Cred or Debit Card");
	}
	void payment(String s) {
		System.out.println("UPI Payment");
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Flipkart fp=new Flipkart();
		fp.payment();
		fp.payment(1234567890);
		fp.payment("09876@yescred");
	}
}
