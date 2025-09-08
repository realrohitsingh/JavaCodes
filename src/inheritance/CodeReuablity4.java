package inheritance;

class SwiggyV1{
	void foodDelivery() {
		System.out.println("Food Deliver Only");
	}
}
class SwiggyV2 extends SwiggyV1{
	void groceryDelivery() {
		System.out.println("Grocery Also Delivery");
	}
}
public class CodeReuablity4 {
	public static void main(String[] args) {
		SwiggyV2 s1=new SwiggyV2();
		s1.groceryDelivery();
		s1.foodDelivery();
	}
}
