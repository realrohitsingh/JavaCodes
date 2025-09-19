package runtimepolymorphism;

public class DebitCard extends Card {
	@Override
	void Swipe() {
		System.out.println("Balance Reduces");
	}
}