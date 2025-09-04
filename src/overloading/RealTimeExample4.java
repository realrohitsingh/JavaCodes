package overloading;

class Iphone{
	Iphone(int a){
		System.out.println("Iphone");
	}
	Iphone(double d){
		System.out.println("Iphone Pro");
	}
	Iphone(String s){
		System.out.println("Iphone Pro Max");
	}
}

public class RealTimeExample4 {
	public static void main(String[] args) {
		Iphone ip1=new Iphone(10);
		Iphone ip2=new Iphone(10.2);
		Iphone ip3=new Iphone("10");
		
	}
}
