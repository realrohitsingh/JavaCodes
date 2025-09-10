package downcasting;

class Delta{
	int x=100;
}
class Example extends Delta{
	int y=200;
}

public class Mainclass3 {
	public static void main(String[] args) {
		System.out.println("Execuitng Super Class");
		System.out.println(" ");
		Delta d=new Example();
		System.out.println(d.x);
		Example e=(Example)d;
		System.out.println(" ");
		System.out.println("Execuitng Supperclass and Subclass");
		System.out.println(" ");
		System.out.println(e.x);
		System.out.println(e.y);
		// Whenever we do downcasting --> upcasting is mandatory
	}
}
