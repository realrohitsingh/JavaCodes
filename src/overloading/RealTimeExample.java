package overloading;

class Amazon{
	Amazon(){
		System.out.println("Shopping");
	}
	Amazon(double d){
		System.out.println("Shopping");
		System.out.println("Amazon Music");
		System.out.println("Prime Video");
	}
}

public class RealTimeExample {
	public static void main(String[] args) {
		Amazon a1=new Amazon();
		System.out.println("-------------------");
		Amazon a2=new Amazon(1499.00);
	}
}
