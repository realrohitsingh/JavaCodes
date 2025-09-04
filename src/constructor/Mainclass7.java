package constructor;

class Product{
	int pid;
	double price;
	double rating;
	Product(int pid, double price, double rating){
		this.pid=pid;
		this.price=price;
		this.rating=rating;
	}
}

public class Mainclass7 {
	public static void main(String[] args) {
		Product pr=new Product(1234,1200.0,4.5);
		System.out.println("PID = "+pr.pid);
		System.out.println("Price = "+pr.price);
		System.out.println("Rating = "+pr.rating);
	}
}
