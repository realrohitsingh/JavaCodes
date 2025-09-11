package instanceOf;

public class Flipkart {
	static void deliverProduct(Product p) {
		if(p instanceof Mobile) {
			System.out.println("Delivering in 2 Wheeler");
		}
		else if(p instanceof Television) {
			System.out.println("Delivering in 3 Wheeler");
		}
		else if(p instanceof Refrigerator) {
			System.out.println("Delivering in 4 Wheeler");
		}
	}
}
