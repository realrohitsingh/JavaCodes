package contructerchaining;

class Hotel{
	Hotel(int a){
		System.out.println("Macdonald's");
	}
	Hotel(double d){
		this(10);
		System.out.println("Domino's");
	}
	Hotel(String s){
		this(4.5);
		System.out.println("KFC");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Hotel h1=new Hotel("ABC");		
	}

}
