package overloading;

class Nexon{
	Nexon(int a){
		System.out.println("Nexon Petrol");
	}
	Nexon(double d){
		System.out.println("Nexon Diesel");
	}
	Nexon(String s){
		System.out.println("Nexon Electric");
	}
}

public class RealTimeExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nexon n1=new Nexon(10);
		Nexon n2=new Nexon(10.1);
		Nexon n3=new Nexon("10");
	}

}
