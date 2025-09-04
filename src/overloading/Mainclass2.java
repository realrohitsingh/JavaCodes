package overloading;

class Biriyani{
	Biriyani(int a){
		System.out.println("Vegetable Biriyani");
	}
	Biriyani(int a,int b){
		System.out.println("Non-Veg Biriyani");
	}
	Biriyani(int a,int b,int c){
		System.out.println("Biriyani");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Biriyani b1=new Biriyani(10);
		Biriyani b2=new Biriyani(10,20);
		Biriyani b3=new Biriyani(10,20,30);
	}
}
