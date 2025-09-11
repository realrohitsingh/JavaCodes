package instanceOf;

public class Mainclass3 {
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		Flipkart.deliverProduct(mob);
		System.out.println("---------------");
		Television tv=new Television();
		Flipkart.deliverProduct(tv);
		System.out.println("---------------");
		Refrigerator ref=new Refrigerator();
		Flipkart.deliverProduct(ref);
	}
}
