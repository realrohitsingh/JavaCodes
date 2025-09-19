package runtimepolymorphism;

public class CreditCard extends Card {
	@Override
	void Swipe() {
		System.out.println("Due Increases");
	}
}
