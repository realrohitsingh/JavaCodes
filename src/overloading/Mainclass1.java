package overloading;

class City{
	City(int a){
		System.out.println("New York");
	}
	City(double b){
		System.out.println("Amsterdam");
	}
	City(String s){
		System.out.println("Paris");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		City c1=new City(100);
		City c2=new City(10.5);
		City c3=new City("ABC");
	}
}
