package runtimepolymorphism;

public class Mainclass2 {
	public static void main(String[] args) {
		DebitCard dc = new DebitCard();
		Shop.payment(dc);
		System.out.println("-------------");
		CreditCard cc = new CreditCard();
		Shop.payment(cc);
	}
}
